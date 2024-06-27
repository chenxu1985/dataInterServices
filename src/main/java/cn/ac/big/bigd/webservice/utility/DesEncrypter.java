package cn.ac.big.bigd.webservice.utility;

import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import java.io.UnsupportedEncodingException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.KeySpec;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>Title: 使用DES加密数据</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright Fulong 2006</p>
 * <p>Company: Fulong</p>
 * @author <a href="mailto:project@fulong.com.cn">Project Group</a>
 * @version 1.0
 */
public class DesEncrypter {
    private static Map<String,Cipher> encryptCipherMap=new HashMap<String,Cipher>();
    private static Map<String,Cipher> decryptCipherMap=new HashMap<String,Cipher>();

    // 8-byte Salt
    byte[] salt = "bigdcgsa".getBytes();

    // Iteration count
    int iterationCount = 19;
    public static DesEncrypter getInstance(String passPhrase) {
        DesEncrypter desEncrypter = new DesEncrypter(passPhrase);
        return desEncrypter;
    }
    private DesEncrypter(String passPhrase) {
        init(passPhrase);
    }
    private void init(String passPhrase){
        try {
            // Create the key
            KeySpec keySpec = new PBEKeySpec(passPhrase.toCharArray(), salt,
                    iterationCount);
            SecretKey key = SecretKeyFactory.getInstance(
                    "PBEWithMD5AndDES").generateSecret(keySpec);
            AlgorithmParameterSpec paramSpec = new PBEParameterSpec(salt,
                    iterationCount);
            // Prepare the parameter to the ciphers

            if(encryptCipherMap.get(passPhrase)==null){
                Cipher ecipher = Cipher.getInstance(key.getAlgorithm());
                ecipher.init(Cipher.ENCRYPT_MODE, key, paramSpec);
                encryptCipherMap.put(passPhrase, ecipher);
            }
            if(decryptCipherMap.get(passPhrase)==null){
                Cipher dcipher = Cipher.getInstance(key.getAlgorithm());
                dcipher.init(Cipher.DECRYPT_MODE, key, paramSpec);
                decryptCipherMap.put(passPhrase, dcipher);
            }

        }catch (java.security.InvalidAlgorithmParameterException e) {
            e.printStackTrace();
        } catch (java.security.spec.InvalidKeySpecException e) {
            e.printStackTrace();
        } catch (javax.crypto.NoSuchPaddingException e) {
            e.printStackTrace();
        } catch (java.security.NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (java.security.InvalidKeyException e) {
            e.printStackTrace();
        }
    }

    /****
     * 加密
     * @param passPhrase
     * @param strToEncrypt
     * @return
     * String
     */
    public String encrypt(String passPhrase ,String strToEncrypt) {
        try {
            // Encode the string into bytes using utf-8
            byte[] utf8Str = strToEncrypt.getBytes("UTF8");
            // Encrypt
            byte[] enc = encryptCipherMap.get(passPhrase).doFinal(utf8Str);

            // Encode bytes to base64 to get a string
            return new sun.misc.BASE64Encoder().encode(enc);
        } catch (javax.crypto.BadPaddingException e) {
        } catch (IllegalBlockSizeException e) {
        } catch (UnsupportedEncodingException e) {
        }
        return null;
    }

    /****
     * 解密
     * @param passPhrase
     * @param strToDecrypt
     * @return
     * String
     */
    public String decrypt(String passPhrase,String strToDecrypt) {
        try {
            // Decode base64 to get bytes
            byte[] dec = new sun.misc.BASE64Decoder().decodeBuffer(strToDecrypt);

            // Decrypt
            byte[] utf8 = decryptCipherMap.get(passPhrase).doFinal(dec);

            // Decode using utf-8
            return new String(utf8, "UTF8");
        } catch (javax.crypto.BadPaddingException e) {
        } catch (IllegalBlockSizeException e) {
        } catch (UnsupportedEncodingException e) {
        } catch (java.io.IOException e) {
        }
        return null;
    }

    public static void main(String[] args) {
        DesEncrypter des = DesEncrypter.getInstance("ftp");
        String a = des.encrypt("ftp","gsa@big%2017!");
        System.out.println(a);
        System.out.println(des.decrypt("ftp",a));
    }
}
