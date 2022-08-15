package model.service;

import model.bean.Product;

import java.util.List;

public interface ProductService {
    List<Product> selectFindAll();
    Product selectProduct(int id);
    boolean updateProduct(Product product);
    boolean deleteProduct(int id);
    List<String> insertProduct(Product product);
    List<Product> search(String search);
}
