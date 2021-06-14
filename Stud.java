public class Stud{
    private int studentId;
    private String studentName;
    private String studentPhone;
    private String studentCity;

    public Stud(int studentId, String studentName, String studentPhone, String studentCity){
        super();
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentPhone = studentPhone;
        this.studentCity = studentCity;
    }

    public int getStudentId(){
        return studentId;
    }

    public void setStudentId(int studentId){
        this.studentId = studentId;
    }

    public String getStudentName(){
        return studentName;
    }

    public void setStudentName(String studentName){
        this.studentName = studentName;
    }

    public String getStudentPhone(){
        return studentPhone;
    }

    public void setStudentPhone(String studentPhone){
        this.studentPhone = studentPhone;
    }

    public String getStudentCity(){
        return studentCity;
    }

    public void setStudentCity(String studentCity){
        this.studentCity = studentCity;
    }

    public Stud( String studentName, String studentPhone, String studentCity){
        super();
        this.studentName = studentName;
        this.studentPhone = studentPhone;
        this.studentCity = studentCity;
    }

    public Stud(){
        super();
    }

    public void display(){
        //System.out.println("ID: " + studentId);
        System.out.println("NAME: " + studentName);
        System.out.println("PHONE: " + studentPhone);
        System.out.println("CITY: " + studentCity);
    }
}