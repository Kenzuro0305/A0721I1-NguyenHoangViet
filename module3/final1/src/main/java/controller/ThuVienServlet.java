package controller;

import model.bean.BenhVien;
import model.service.ThuVienService;
import model.service.Impl.ThuVienServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "BenhVienServlet", value = "/thuvien")
public class ThuVienServlet extends HttpServlet {
    private ThuVienService thuVienService = new ThuVienServiceImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) action = "";
switch (action){
    case "create":
        break;
    case "edit":
        break;
    case "delete":
    default:
        showList(request,response);
        break;
}
    }



    private void showList(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("thuvien/list.jsp");
        request.setAttribute("thuVienList", thuVienService.selectFindAll());
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
                break;
            case "edit":
                edit(request,response);
                break;
        }
    }

    private void edit(HttpServletRequest request, HttpServletResponse response) {
    }
}
