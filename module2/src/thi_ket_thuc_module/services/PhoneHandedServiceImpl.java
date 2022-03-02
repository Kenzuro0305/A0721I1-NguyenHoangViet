package thi_ket_thuc_module.services;

import thi_ket_thuc_module.models.PhoneDomestic;
import thi_ket_thuc_module.models.PhoneHanded;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneHandedServiceImpl implements PhoneHandedService{
    static List<PhoneHanded> phoneHandedList = new ArrayList<>();
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
        System.out.println("Nhập quốc gia xách tay : ");
        String country = scanner.nextLine();
        System.out.println("Nhập trạng thái: ");
        String status = scanner.nextLine();

    }

    @Override
    public void delete() {

    }

    @Override
    public void display() {

    }

    @Override
    public void search() {

    }

    @Override
    public void exit() {

    }
}
