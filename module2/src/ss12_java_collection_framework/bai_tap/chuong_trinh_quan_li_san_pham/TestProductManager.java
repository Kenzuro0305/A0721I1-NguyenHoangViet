package ss12_java_collection_framework.bai_tap.chuong_trinh_quan_li_san_pham;

import java.util.Scanner;

public class TestProductManager {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("Chọn chức năng cần thực hiên" +
                    "\n1.Add" +
                    "\n2.Display" +
                    "\n3.Edit" +
                    "\n4.Delete" +
                    "\n5.Find" +
                    "\n6.Sort ascending" +
                    "\n7.Exit");
            int input = scanner.nextInt();
            switch (input) {
                case 1:
                    productManager.add();
                    break;
                case 2:
                    productManager.display();
                    break;
                case 3:
                    productManager.edit();
                    break;
                case 4:
                    productManager.delete();
                    break;
                case 5:
                    System.out.println(productManager.find());
                    break;
                case 6:
                    productManager.sort();
                    productManager.display();
                    break;
                case 7:
                    System.exit(0);
                default:
                    flag = false;
            }
        } while (flag);
    }
}
