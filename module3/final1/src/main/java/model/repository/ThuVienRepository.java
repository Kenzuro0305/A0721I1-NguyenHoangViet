package model.repository;

import model.bean.ThuVien;

import java.util.List;

public interface ThuVienRepository {
    List<ThuVien> selectFindAll();
    ThuVien selectThuvien(String maSach);
    List<String> updateThuvien(ThuVien thuVien);
    boolean deleteThuVien(String maMuonSach);
    List<String> insertThuVien(ThuVien thuVien);
    List<ThuVien> search(String search);
}
