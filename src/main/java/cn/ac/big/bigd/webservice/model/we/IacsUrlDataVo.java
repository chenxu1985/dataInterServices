package cn.ac.big.bigd.webservice.model.we;

public class IacsUrlDataVo {
    String corpid;
    String corpsecret;
    String Get_Token_Url;
    String SendMessage_Url;

    public String getCorpid() {
        return corpid;
    }
    public void setCorpid(String corpid) {
        this.corpid = corpid;
    }
    public String getCorpsecret() {
        return corpsecret;
    }
    public void setCorpsecret(String corpsecret) {
        this.corpsecret = corpsecret;
    }
    public void setGet_Token_Url(String corpid,String corpsecret) {
        this.Get_Token_Url ="https://qyapi.weixin.qq.com/cgi-bin/gettoken?corpid="+corpid+"&corpsecret="+corpsecret;
    }
    public String getGet_Token_Url() {
        return Get_Token_Url;
    }
    public String getSendMessage_Url(){
        SendMessage_Url = "https://qyapi.weixin.qq.com/cgi-bin/message/send?access_token=";
        return SendMessage_Url;
    }
    public String getSendUserId_Url(){
        SendMessage_Url = "https://qyapi.weixin.qq.com/cgi-bin/user/getuserid?access_token=";
        return SendMessage_Url;
    }
}