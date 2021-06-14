public class SignUp{
    private int uId;
    private String uName;
    private String uPhone;
    private String uEmail;
    private String uPassword;

    public SignUp(int uId, String uName, String uPhone, String uEmail, String uPassword){
        super();
        this.uId = uId;
        this.uName = uName;
        this.uPhone = uPhone;
        this.uEmail = uEmail;
        this.uPassword = uPassword;
    }

    public int getUId(){
        return uId;
    }

    public void uId(int uId){
        this.uId = uId;
    }

    public String getUName(){
        return uName;
    }

    public void setUName(String uName){
        this.uName = uName;
    }

    public String getUPhone(){
        return uPhone;
    }

    public void setUPhone(String uPhone){
        this.uPhone = uPhone;
    }

    public String getUEmail(){
        return uEmail;
    }

    public void setUEmail(String uEmail){
        this.uEmail = uEmail;
    }

    public String getUPassword(){
        return uPassword;
    }

    public void setUPassword(String uPassword){
        this.uPassword = uPassword;
    }

    public SignUp( String uName, String uPhone, String uEmail, String uPassword){
        super();
        this.uName = uName;
        this.uPhone = uPhone;
        this.uEmail = uEmail;
        this.uPassword = uPassword;
    }

    public SignUp(){
        super();
    }

    public String toString(){
        return "SignUp [uId=" + uId + ", uName=" + uName + ", uPhone=" + uPhone + ", uEmail=" + uEmail + ", uPassword=" + uPassword +"]";
    }

   /* public void display(){
        System.out.println("ID: " + studentId);
        System.out.println("NAME: " + studentName);
        System.out.println("PHONE: " + studentPhone);
        System.out.println("CITY: " + studentCity);
    } */
}