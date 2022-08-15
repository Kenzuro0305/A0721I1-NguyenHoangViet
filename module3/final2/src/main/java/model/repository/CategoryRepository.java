package model.repository;

import model.bean.Category;

import java.util.List;

public interface CategoryRepository {
    List<Category> selectFindAll();
    Category select_category_by_id(int id);
}
