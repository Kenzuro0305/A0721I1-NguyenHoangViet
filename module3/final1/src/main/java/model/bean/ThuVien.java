package model.bean;

public class ThuVien {
    private String maSach;
    private String tenSach;
    private String tacGia;
    private String moTa;
    private String maMuonSach;
    private boolean trangThai;
    private int ngayMuon;
    private int ngayTra;
    private int soLuong;

    public ThuVien(String maSach, String tenSach, String tacGia, String moTa, String soLuong) {
    }

    public ThuVien(String maSach, String tenSach, String moTa, int soLuong) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.moTa = moTa;
        this.soLuong = soLuong;
    }

    public ThuVien(String maSach, String tenSach, String tacGia, String moTa, String maMuonSach, boolean trangThai, int ngayMuon, int ngayTra, int soLuong) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.moTa = moTa;
        this.maMuonSach = maMuonSach;
        this.trangThai = trangThai;
        this.ngayMuon = ngayMuon;
        this.ngayTra = ngayTra;
        this.soLuong = soLuong;
    }

    public ThuVien(String maSach, String tenSach, String tacGia, String moTa, int soLuong) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.moTa = moTa;
        this.soLuong = soLuong;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getMaMuonSach() {
        return maMuonSach;
    }

    public void setMaMuonSach(String maMuonSach) {
        this.maMuonSach = maMuonSach;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public int getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(int ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    public int getNgayTra() {
        return ngayTra;
    }

    public void setNgayTra(int ngayTra) {
        this.ngayTra = ngayTra;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
}
