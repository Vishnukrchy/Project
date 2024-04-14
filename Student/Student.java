package Student;


public class Student {
    public int id;
    public String name;
    public int rollNumber;
    public String location;
    public long mobileNo;
    public String instituteName;
    public double totalPercentage;

    public Student() {
        // Default constructor
    }

    public Student(int id, String name, int rollNumber, String location, long mobileNo, String instituteName, double totalPercentage) {
        this.id = id;
        this.name = name;
        this.rollNumber = rollNumber;
        this.location = location;
        this.mobileNo = mobileNo;
        this.instituteName = instituteName;
        this.totalPercentage = totalPercentage;
    }

    @Override
    public String toString() {
        return "Student [ID: " + id + ", Name: " + name + ", Roll Number: " + rollNumber +
                ", Location: " + location + ", Mobile No: " + mobileNo + ", Institute Name: " + instituteName +
                ", Total Percentage: " + totalPercentage + "]";
    }
    
}


