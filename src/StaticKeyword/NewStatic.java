package StaticKeyword;

public class NewStatic {

    private static String collegeName;
    private String Student_name;
    private int stduentID;

    NewStatic(String Student_name, int stduentID) {
        this.stduentID = stduentID;
        this.Student_name = Student_name;
    }

    public void SetStudent_Name(String student_name) {


    }

    public String getStudent_name() {
        return Student_name;
    }

    public void setStduentID(int stduentID) {

    }

    public int getStduentID() {
        return stduentID;
    }

    public static String Collage()
    {
        return "ATM College";

    }
}

