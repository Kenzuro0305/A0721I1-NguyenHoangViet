package thi_ket_thuc_module.controller;

import thi_ket_thuc_module.models.PhoneDomestic;
import thi_ket_thuc_module.services.PhoneDomesticService;
import thi_ket_thuc_module.services.PhoneDomesticServiceImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        displayPhoneService();
    }
    public static void displayPhoneService() {
        PhoneDomesticServiceImpl phoneDomesticService = new PhoneDomesticServiceImpl();
        boolean check = true;
        while (check) {
            System.out.println("Chọc chức năng theo số (để tiếp tục):");
            System.out.println("1. Thêm mới ");
            System.out.println("2. Xóa");
            System.out.println("3. Xem danh sách điện thoại");
            System.out.println("4. Tìm kiếm");
            System.out.println("5. Thoát");
            Scanner scanner = new Scanner(System.in);

            switch (scanner.nextInt()) {
                case 1: {
                    phoneDomesticService.addNew();
                    break;
                }
                case 2: {
                    phoneDomesticService.delete();
                    break;
                }
                case 3: {
                    phoneDomesticService.display();
                    break;
                }
                case 4: {
                    phoneDomesticService.search();
                    break;
                }
                default:
                    check = false;

            }
        }
    }
}
