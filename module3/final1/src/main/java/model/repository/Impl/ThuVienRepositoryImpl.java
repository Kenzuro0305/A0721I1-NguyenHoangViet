package model.repository.Impl;

import model.bean.ThuVien;
import model.repository.BaseRepository;
import model.repository.ThuVienRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ThuVienRepositoryImpl implements ThuVienRepository {
    private static final String SELECT_FIND_ALL = "SELECT * FROM SACH;";
    //private static final String DELETE_BY_ID = "DELETE FROM BENH_AN WHERE ID = ?";
    //private static final String INSERT_BENH_VIEN = "INSERT INTO BENH_AN(ma_benh_an,ma_benh_nhan,ten_benh_nhan,ngay_nhap_vien,ngay_ra_vien,ly_do) VALUES (?,?,?,?,?,?);";
    //private static final String SELECT_BY_ID ="SELECT * FROM SACH WHERE MA_SACH = ?";
    //private static final String EIDT = "UPDATE BENH_AN SET ten_benh_nhan=?,ngay_nhap_vien=?,ngay_ra_vien=?,ly_do=? WHERE ID = ?";
    private final BaseRepository baseRepository = new BaseRepository();
    @Override
    public List<ThuVien> selectFindAll() {
        List<ThuVien> thuVienList = new ArrayList<>();
        Connection connection = BaseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_FIND_ALL);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                String maSach = rs.getString("ma_sach");
                String tenSach = rs.getString("ten_sach");
                String moTa = rs.getString("mo_ta");
                int soLuong = rs.getInt("so_luong");
                ThuVien thuVien = new ThuVien(maSach,tenSach,moTa,soLuong);
                thuVienList.add(thuVien);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return thuVienList;
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
