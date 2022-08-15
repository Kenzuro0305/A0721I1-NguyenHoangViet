package model.service.impl;

import model.bean.ClassCG;
import model.repository.IClassCGRepository;
import model.repository.impl.ClassCGRepository;
import model.service.IClassCGService;

import java.util.List;

public class ClassCGSerivce implements IClassCGService {
    private IClassCGRepository iClassCGRepository = new ClassCGRepository();
    @Override
    public List<ClassCG> selectFindAll() {
        return iClassCGRepository.selectFindAll();
    }

    @Override
    public ClassCG select_category_by_id(int id) {
        return iClassCGRepository.select_category_by_id(id);
    }
}
