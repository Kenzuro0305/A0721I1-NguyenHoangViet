package thi_ket_thuc_module.services;

import case_study.models.Employee;
import thi_ket_thuc_module.models.PhoneDomestic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneDomesticServiceImpl implements PhoneDomesticService{
    static List<PhoneDomestic> phoneDomesticList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    @Override
    public void addNew() {
        System.out.println("Nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập price: ");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập quantity: ");
        int quantity = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập nhà sản xuất: ");
        String producer = scanner.nextLine();
        System.out.println("Nhập thời gian bảo hành: ");
        int timeInsurance = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập phạm vi bảo hành: ");
        String coverageInsurance = scanner.nextLine();
    }

    @Override
    public void delete() {

    }

    @Override
    public void display() {
        for(PhoneDomestic phoneDomestic : phoneDomesticList){
            System.out.println(phoneDomestic.toString());
        }
    }

    @Override
    public void search() {

    }

    @Override
    public void exit() {

    }
}
