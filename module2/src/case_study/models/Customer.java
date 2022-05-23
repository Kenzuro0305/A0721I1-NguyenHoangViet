package case_study.models;

public class Customer extends Person {
    private String customerType;

    public Customer() {
    }

    public Customer(int id, String name, int age, String sex, String idCard, String email, String customerType) {
        super(id, name, age, sex, idCard, email);
        this.customerType = customerType;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", birthday='" + birthday + '\'' +
                ", ma='" + ma + '\'' +
                '}';
    }
}
