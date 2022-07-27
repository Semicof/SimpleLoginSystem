import java.util.HashMap;

public class IDnPassword {
    HashMap<String,String> loginInfo=new HashMap<String,String>();
    IDnPassword()
    {
        loginInfo.put("cof","123456");
        loginInfo.put("ngu","123456");
        loginInfo.put("vl","123456");
        loginInfo.put("no","123456");
        loginInfo.put("ga","123456");
        loginInfo.put("vcl","123456");
        loginInfo.put("ra","123456");
    }

    protected HashMap getLoginInfo()
    {
        return loginInfo;
    }
}
