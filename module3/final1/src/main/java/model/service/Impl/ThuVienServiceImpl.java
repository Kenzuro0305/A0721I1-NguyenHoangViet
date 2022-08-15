package model.service.Impl;

import model.bean.ThuVien;
import model.repository.ThuVienRepository;
import model.repository.Impl.ThuVienRepositoryImpl;
import model.service.ThuVienService;

import java.util.List;

public class ThuVienServiceImpl implements ThuVienService {
 ThuVienRepository thuVienRepository = new ThuVienRepositoryImpl();
    @Override
    public List<ThuVien> selectFindAll() {
        return thuVienRepository.selectFindAll();
    }

    @Override
    public ThuVien selectThuvien(String maSach) {
        return null;
    }

    @Override
    public List<String> updateThuvien(ThuVien thuVien) {
        return null;
    }

    @Override
    public boolean deleteThuVien(String maMuonSach) {
        return false;
    }

    @Override
    public List<String> insertThuVien(ThuVien thuVien) {
        return null;
    }

    @Override
    public List<ThuVien> search(String search) {
        return null;
    }
}
