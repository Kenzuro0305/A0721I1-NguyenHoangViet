package model.service.Impl;

import model.bean.Product;
import model.repository.ProductRepository;
import model.repository.Impl.ProductRepositoryImpl;
import model.service.ProductService;

import java.util.List;

public class ProductServiceImpl implements ProductService {
    private ProductRepository productRepository = new ProductRepositoryImpl();
    @Override
    public List<Product> selectFindAll() {
        return productRepository.selectFindAll();
    }

    @Override
    public Product selectProduct(int id) {
        return productRepository.selectProduct(id);
    }

    @Override
    public boolean updateProduct(Product product) {
        return productRepository.updateProduct(product);
    }

    @Override
    public boolean deleteProduct(int id) {
        return productRepository.deleteProduct(id);
    }

    @Override
    public List<String> insertProduct(Product product) {
        return null;
    }


    @Override
    public List<Product> search(String search) {
        return null;
    }
}
