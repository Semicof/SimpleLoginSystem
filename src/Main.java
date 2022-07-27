public class Main {
    public static void main(String[] args) {
        IDnPassword ip=new IDnPassword();
        Login login=new Login(ip.getLoginInfo());
    }
}
