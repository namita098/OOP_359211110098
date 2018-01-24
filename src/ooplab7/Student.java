package ooplab7;
//talking about Student?
    //1.student ID
    //2.Name
    //3.Address
    //4.Gender





public class Student {
    //properties of student
    private String id;
    private String Name;
    private String address;
    private String Gender;
    //Constructor เม็ดตอดที่มีชื่อเดียวกับคลาส
    //Default Constructor
    public Student (){}
    //Constructor  by own
    public Student (String id,String n,String a,String g){
        //assign data to properties
        this.id = id;
        this.Name = n;
        this.address = a;
        this.Gender = g;

    }//Student
    //getter and setter methodos


    @Override
    //@Overrideห้ามพิมพ์เอง
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", Name='" + Name + '\'' +
                ", address='" + address + '\'' +
                ", Gender='" + Gender + '\'' +
                '}';
    }//Alt+ins toString

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }
}//class
