package model.service;

import model.bean.Category;

import java.util.List;

public interface CategoryService {
    List<Category> selectFindAll();
    Category select_category_by_id(int id);
}
