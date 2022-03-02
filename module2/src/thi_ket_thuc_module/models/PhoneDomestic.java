package thi_ket_thuc_module.models;

public class PhoneDomestic extends Phone{
    private int timeInsurance;
    private String coverageInsurance;
    public PhoneDomestic(int id, String name, int price, int quantity, String producer) {
        super(id, name, price, quantity, producer);
    }

    public PhoneDomestic(int id, String name, int price, int quantity, String producer, int timeInsurance, String coverageInsurance) {
        super(id, name, price, quantity, producer);
        this.timeInsurance = timeInsurance;
        this.coverageInsurance = coverageInsurance;
    }

    public int getTimeInsurance() {
        return timeInsurance;
    }

    public void setTimeInsurance(int timeInsurance) {
        this.timeInsurance = timeInsurance;
    }

    public String getCoverageInsurance() {
        return coverageInsurance;
    }

    public void setCoverageInsurance(String coverageInsurance) {
        this.coverageInsurance = coverageInsurance;
    }

}
