package ss12_java_collection_framework.bai_tap.chuong_trinh_quan_li_san_pham;

import java.util.Comparator;

public class CompareProduct implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
//        if (o1.getName().compareTo(o2.getName())==0) {
        return (int) (o1.getPrice() - o2.getPrice());
//        }
//        return o1.getName().compareTo(o2.getName());
    }
}
