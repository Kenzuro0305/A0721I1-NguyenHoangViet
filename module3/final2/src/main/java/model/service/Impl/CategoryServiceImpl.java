package model.service.Impl;

import model.bean.Category;
import model.repository.CategoryRepository;
import model.repository.Impl.CategoryRepositoryImpl;
import model.service.CategoryService;

import java.util.List;

public class CategoryServiceImpl implements CategoryService {
    private CategoryRepository categoryRepository = new CategoryRepositoryImpl();
    @Override
    public List<Category> selectFindAll() {
        return categoryRepository.selectFindAll();
    }

    @Override
    public Category select_category_by_id(int id) {
        return categoryRepository.select_category_by_id(id);
    }
}
