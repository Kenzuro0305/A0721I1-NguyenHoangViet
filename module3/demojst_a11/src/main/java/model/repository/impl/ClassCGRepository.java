package model.repository.impl;

import model.bean.ClassCG;
import model.repository.BaseRepository;
import model.repository.IClassCGRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClassCGRepository implements IClassCGRepository {
    private static final String SELECT_FIND_ALL = "SELECT * FROM khoa;";
    private static final String SELECT_CATEGORY_BY_ID = "SELECT * FROM khoa WHERE id_khoa = ?";
    @Override
    public List<ClassCG> selectFindAll() {
        List<ClassCG> classCGList = new ArrayList<>();
        Connection connection = BaseRepository.getConnect();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_FIND_ALL);
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){
                int id = rs.getInt("id_khoa");
                String name = rs.getString("name");
                ClassCG classCG = new ClassCG(id,name);
                classCGList.add(classCG);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return classCGList;
    }

    @Override
    public ClassCG select_category_by_id(int id) {
        Connection connection = BaseRepository.getConnect();
        ClassCG classCG = null;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_CATEGORY_BY_ID);
            preparedStatement.setInt(1,id);
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){
                String name = rs.getString("name");
                classCG = new ClassCG(id,name);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return classCG;
    }
}
