package cn.ac.big.bigd.webservice.send;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Date;
import java.util.Properties;


/**
 * 
 * @author Qixuan.Chen
 */
public class SendEmail {
    
    public static final String HOST = "mail.cstnet.cn";
    public static final String PROTOCOL = "smtp";
    public static final int PORT = 465;
    public static final String FROM = "gsa-admin@big.ac.cn";//发件人的email
    public static final String PWD = "^Q^waj5!%BNpW@b5";//发件人密�?
    
    /**
     * 获取Session
     * @return
     */
    private static Session getSession() {
        Properties props = new Properties();
        props.put("mail.smtp.host", HOST);//设置服务器地址
        props.put("mail.store.protocol" , PROTOCOL);//设置协议
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.socketFactory.port", PORT);
        props.put("mail.smtp.port", PORT);
        props.put("mail.smtp.auth" , true);
        
        Authenticator authenticator = new Authenticator() {

            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(FROM, PWD);
            }
            
        };
        Session session = Session.getDefaultInstance(props , authenticator);
        
        return session;
    }
    
    public static void send(String toEmail ,String title, String content) {
        Session session = getSession();
        try {
            System.out.println("--send--"+content);
            // Instantiate a message
            Message msg = new MimeMessage(session);
 
            //Set message attributes
            msg.setFrom(new InternetAddress(FROM));
            InternetAddress[] address = {new InternetAddress(toEmail)};
            msg.setRecipients(Message.RecipientType.TO, address);
            msg.setSubject(title);
            msg.setSentDate(new Date());
            msg.setContent(content , "text/html;charset=utf-8");
 
            //Send the message
            Transport.send(msg);
        }
        catch (MessagingException mex) {
            mex.printStackTrace();
        }
    }

}
