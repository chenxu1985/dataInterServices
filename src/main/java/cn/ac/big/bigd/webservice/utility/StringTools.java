package cn.ac.big.bigd.webservice.utility;

public class StringTools {
	
	private StringTools(){}
	public static String joinString(String s){
		String[] stringArray = s.split("_");
		String newString = "";
		for(String str:stringArray) {
		    if(str.equals("associated"))
		        break;
		    else if(str.equals("food"))
		        break;
            newString += str.replaceFirst(str.substring(0, 1), str.substring(0, 1).toUpperCase());
        }
		newString = newString.replaceFirst(newString.substring(0, 1), newString.substring(0, 1).toLowerCase());
		return newString;
	}
	
    public static String join(String sign,String[] strAry){
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<strAry.length;i++){
             if(i==(strAry.length-1)){
            	 
                 sb.append(strAry[i]);
             }else{
                 sb.append(strAry[i]).append(sign);
             }
        }
        
        return new String(sb);
    }	
}
