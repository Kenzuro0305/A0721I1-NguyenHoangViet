package controller;

import model.service.CategoryService;
import model.service.Impl.CategoryServiceImpl;
import model.service.ProductService;
import model.service.Impl.ProductServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet", value = "/product")
public class ProductServlet extends HttpServlet {
    private ProductService productService = new ProductServiceImpl();
    private CategoryService categoryService = new CategoryServiceImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) action = "";
switch (action){
    case "create":
        showFormCreate(request,response);
        break;
    case "edit":
//        showFormEdit(request,response);
        break;
    case "delete":
        delete(request,response);
        break;
    default:
        showList(request,response);
        break;
}
    }

    private void delete(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        productService.deleteProduct(id);
        try {
            response.sendRedirect("/product");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    private void showFormEdit(HttpServletRequest request, HttpServletResponse response) {
//        RequestDispatcher requestDispatcher = request.getRequestDispatcher("benhvien/edit.jsp");
//        int id = Integer.parseInt(request.getParameter("id"));
//        BenhVien benhVien = productService.selectProduct(id);
//        request.setAttribute("benhNhan",benhVien);
//        try {
//            requestDispatcher.forward(request,response);
//        } catch (ServletException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    private void showFormCreate(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("product/create.jsp");
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showList(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("product/list.jsp");
        request.setAttribute("productList", productService.selectFindAll());
        request.setAttribute("categoryList", categoryService.selectFindAll());
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action == null)action="";
        switch (action){
            case "create":
//                insert(request,response);
                break;
            case "edit":
//                edit(request,response);
                break;
        }
    }

//    private void edit(HttpServletRequest request, HttpServletResponse response) {
//        RequestDispatcher requestDispatcher = request.getRequestDispatcher("benhvien/edit.jsp");
//        String tenBenhNhan = request.getParameter("name");
//        String ngayNhapVien = request.getParameter("ngayNhapVien");
//        String ngayRaVien = request.getParameter("ngayRaVien");
//        String lyDo = request.getParameter("liDo");
//        int id = Integer.parseInt(request.getParameter("id"));
//        BenhVien benhVien = new BenhVien(id,tenBenhNhan,ngayNhapVien,ngayRaVien,lyDo);
//        String mess = "Edit thanh cong";
//        List<String> strCheck = productService.updateBenhVien(benhVien);
//        for(String string : strCheck){
//            if(!string.equals("")){
//                mess="Them moi khong thanh cong";
//                break;
//            }
//        }
//        request.setAttribute("stringList",strCheck);
//        request.setAttribute("mess",mess);
//        request.setAttribute("benhNhan",benhVien);
//        try {
//            requestDispatcher.forward(request,response);
//        } catch (ServletException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

//    private void insert(HttpServletRequest request, HttpServletResponse response) {
//        RequestDispatcher requestDispatcher = request.getRequestDispatcher("benhvien/create.jsp");
//        String maBenhAn = request.getParameter("maBenhAn");
//        String maBenhNhan = request.getParameter("maBenhNhan");
//        String tenBenhNhan = request.getParameter("name");
//        String ngayNhapVien = request.getParameter("ngayNhapVien");
//        String ngayRaVien = request.getParameter("ngayRaVien");
//        String lyDo = request.getParameter("liDo");
//        Benh benhVien = new BenhVien(maBenhAn,maBenhNhan,tenBenhNhan,ngayNhapVien,ngayRaVien,lyDo);
//        String mess = "Them moi thanh cong";
//        List<String> strCheck = productService.insertBenhVien(benhVien);
//        for(String string : strCheck){
//            if(!string.equals("")){
//                mess="Them moi khong thanh cong";
//                break;
//            }
//        }
//        request.setAttribute("benhNhan",benhVien);
//        request.setAttribute("stringList",strCheck);
//        request.setAttribute("mess",mess);
//        try {
//            requestDispatcher.forward(request,response);
//        } catch (ServletException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
}
