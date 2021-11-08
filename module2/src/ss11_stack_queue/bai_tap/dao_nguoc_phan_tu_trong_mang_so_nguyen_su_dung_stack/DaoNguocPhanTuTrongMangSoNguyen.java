package ss11_stack_queue.bai_tap.dao_nguoc_phan_tu_trong_mang_so_nguyen_su_dung_stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class DaoNguocPhanTuTrongMangSoNguyen {
    public static void main(String[] args) {
        Stack<Character> wStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập 1 chuỗi bất kì");
        String mWork = scanner.nextLine();
        System.out.println("Chuỗi nhập vào là: "+mWork);
    }
}
