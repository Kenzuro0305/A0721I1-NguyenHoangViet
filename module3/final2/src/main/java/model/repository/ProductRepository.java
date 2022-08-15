package model.repository;

import model.bean.Product;

import java.util.List;

public interface ProductRepository {
    List<Product> selectFindAll();
    Product selectProduct(int id);
    boolean updateProduct(Product product);
    boolean deleteProduct(int id);
    boolean insertProduct(Product product);
    List<Product> search(String search);
}
