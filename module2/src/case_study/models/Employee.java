package case_study.models;

public class Employee extends Person {
    private String level;
    private String position;
    private int salary;

    public Employee(int id, String name, int age, String sex, String idCard, String email, String level, String position) {
    }
    public Employee(int id,
                    String name,
                    int age,
                    String sex,
                    String idCard,
                    String email,
                    String level,
                    String position,
                    int salary){
        super(id, name, age, sex, idCard, email);
        this.level = level;
        this.position = position;
        this.salary = salary;

    }

    public Employee(String level, String position, int salary) {
        this.level = level;
        this.position = position;
        this.salary = salary;
    }
}
