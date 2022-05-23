package case_study.models;

public class Employee extends Person {
    protected String level;
    protected String position;
    protected int salary;
    protected String email;

    public Employee() {
    }

    public Employee(int id, String name, int age, String address, String birthday, String ma, String level, String position, int salary) {
        super(id, name, age, address, birthday, ma);
        this.level = level;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                ", email='" + email + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", birthday='" + birthday + '\'' +
                ", ma='" + ma + '\'' +
                '}';
    }
}
