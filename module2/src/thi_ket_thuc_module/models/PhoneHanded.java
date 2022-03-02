package thi_ket_thuc_module.models;

public class PhoneHanded extends Phone{
    private String country;
    private String status;
    public PhoneHanded(int id, String name, int price, int quantity, String producer) {
        super(id, name, price, quantity, producer);
    }

    public PhoneHanded(int id, String name, int price, int quantity, String producer, String country, String status) {
        super(id, name, price, quantity, producer);
        this.country = country;
        this.status = status;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
