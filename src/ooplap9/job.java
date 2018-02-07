package ooplap9;

public class job {
    private String position;
    private String Salary;

    public job(String position, String salary) {
        this.position = position;
        Salary = salary;
    }

    //constructor
    public job(String brand, String color, String model, Engine engine) {
        this.position = brand;
        this.Salary = color;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSalary() {
        return Salary;
    }

    public void setSalary(String salary) {
        Salary = salary;
    }

    @Override
    public String toString() {
        return "job{" +
                "position='" + position + '\'' +
                ", Salary='" + Salary + '\'' +
                '}';
    }
}
