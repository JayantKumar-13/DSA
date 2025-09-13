public class Access_modifiers {
    public static void main(String[] args) {
        Bank_account myacc = new Bank_account();
        myacc.username = "JayantKumar";
        //myacc.password = "Nagpur";            // this will give error because passsword is defined in private
        myacc.setpass("Nagpur");
    }
}
class Bank_account{
    public String username;
    private String password;
    public  void setpass(String pwd){
        password = pwd;                          // this is correct
    }
}