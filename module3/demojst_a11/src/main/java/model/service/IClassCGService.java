package model.service;

import model.bean.ClassCG;

import java.util.List;
import java.util.Locale;

public interface IClassCGService {
    List<ClassCG> selectFindAll();
    ClassCG select_category_by_id(int id);
}
