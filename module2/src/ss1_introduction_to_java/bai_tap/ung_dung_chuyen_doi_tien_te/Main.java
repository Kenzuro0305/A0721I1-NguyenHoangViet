package ss1_introduction_to_java.bai_tap.ung_dung_chuyen_doi_tien_te;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double vnd = 23000;
        double usd;
        System.out.print("Nhập số tiền USD: ");
        usd = sc.nextDouble();
        double quyDoi = usd * 23000;
        System.out.print("Số tiền VND sau khi chuyển đồi: " + quyDoi);
    }
}
