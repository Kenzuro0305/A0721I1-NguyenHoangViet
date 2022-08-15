package model.repository;

import model.bean.ClassCG;

import java.util.List;

public interface IClassCGRepository {
    List<ClassCG> selectFindAll();
    ClassCG select_category_by_id(int id);
}
