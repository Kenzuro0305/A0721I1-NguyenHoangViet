package model.repository.Impl;

import model.bean.Category;
import model.repository.BaseRepository;
import model.repository.CategoryRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CategoryRepositoryImpl implements CategoryRepository {
    private static final String SELECT_FIND_ALL = "SELECT * FROM category;";
    private static final String SELECT_CATEGORY_BY_ID = "SELECT * FROM category WHERE category_id = ?";
    @Override
    public List<Category> selectFindAll() {
        List<Category> categoryList = new ArrayList<>();
        Connection connection = BaseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_FIND_ALL);
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){
                int id = rs.getInt("category_id");
                String name = rs.getString("category_name");
                Category category = new Category(id,name);
                categoryList.add(category);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return categoryList;
    }

    @Override
    public Category select_category_by_id(int id) {
        Connection connection = BaseRepository.getConnection();
        Category category = null;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_CATEGORY_BY_ID);
            preparedStatement.setInt(1,id);
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){
                String name = rs.getString("category_name");
                category = new Category(id,name);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return category;
    }
}

