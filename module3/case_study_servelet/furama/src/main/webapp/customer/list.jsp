<%--
  Created by IntelliJ IDEA.
  User: vietp
  Date: 06/06/2022
  Time: 20:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" href="../bootstrap-4.1.3-dist/css/bootstrap.min.css">

<html>
<head>
    <title>Title</title>
</head>
<body>
<div id="wrapper">
    <div id="header">
        <div class="container justify-content-between">
            <a href="">
                <img src="../assets/images/logo.png" alt="" class="logo">
            </a>
            <form class="search">
                <input type="text" placeholder="Bạn muốn tìm gì?">
                <button style="padding: 13px 13px"><i class="fas fa-search"></i></button>
            </form>
        </div>
        <div class="container">
            <nav>
                <ul id="main-menu" class="d-flex">
                    <li><a href="../index.jsp">Home</a></li>
                    <li><a href="/employees">Employee</a></li>
                    <li class="acc"><a style="color:#23282E;" href="">Customer</a></li>
                    <li><a href="/services">Service</a></li>
                    <li><a href="/contracts">Contract</a></li>
                    <%--                    <li><a href="">Video</a></li>--%>
                    <%--                    <li><a href="">Sự kiên</a></li>--%>
                    <%--                    <li><a href="">Liên hệ</a></li>--%>
                </ul>
            </nav>
        </div>

    </div>
    <!-- end header -->
    <div id="wp-featured-post">
        <%--        <table style="width: 1000px">--%>
        <%--            <tr>--%>
        <%--                <td style="text-align: left;width: 50%">danh sach</td>--%>
        <%--                <td style="text-align: right;width: 50%"> them moi</td>--%>
        <%--                <td></td>--%>
        <%--            </tr>--%>
        <%--        </table>--%>
        <div class="container justify-content-between">
            <div class="box featured-post">
                <div class="box-head">
                    <h3><a href="/customers">Danh sach</a></h3>
                </div>
            </div>
            <div class="box featured-post">
                <div class="box-head">
                    <form action="/customers" method="get">
                        <div class="input-group">
                            <input type="text" name="action" value="search" hidden>
                            <input type="search" name="search" class="form-control rounded" placeholder="Search by name" aria-label="Search" aria-describedby="search-addon" />
                            <button type="submit" class="btn btn-outline-primary" style="color:#000;background: red">search</button>
                        </div>
                    </form>
                </div>
            </div>
            <div class="box featured-post">
                <div class="box-head">
                    <a href="/customers?action=create" class="create" style="padding: 5px 10px;
                    background: #FF2C2B;
                    font-size: 20px;
                      color: white;
                    border-radius: 10px;" ><i class="fa-solid fa-plus"></i></a>
                </div>
            </div>

        </div>
        <div class="container">
            <div class=" pt-20" style="width: 100%; ">
                <table class="table table-striped table-bordered" style="width: 100%;" id="tableCustomer">
                    <thead>
                    <tr style="background-color: #FF2C2B;">
                        <th>Id</th>
                        <th>Code</th>
                        <th>Name</th>
                        <th>Birthday</th>
                        <th>Id Card</th>
                        <th>Gender</th>
                        <th>Phone</th>
                        <th>Email</th>
                        <th>Address</th>
                        <th>Type</th>
                        <th>Actions</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${customerList}" var="c">
                        <tr>
                            <td>${c.getCustomerId()}</td>
                            <td>${c.getCustomerCode()}</td>
                            <td>${c.getCustomerName()}</td>
                            <td>${c.getCustomerBirthday()}</td>
                            <td>${c.getCustomerIdCard()}</td>
                                <%--                            <td>${c.isCustomerGender()}</td>--%>
                            <c:if test="${c.isCustomerGender()}">
                                <td>Male</td>
                            </c:if>
                            <c:if test="${!c.isCustomerGender()}">
                                <td>Female</td>
                            </c:if>
                            <td>${c.getCustomerPhone()}</td>
                            <td>${c.getCustomerEmail()}</td>
                            <td>${c.getCustomerAddress()}</td>
                                <%--                            <td>${e.getPositionId()}</td>--%>
                            <c:forEach items="${customerTypeList}" var="t">
                                <c:if test="${t.getCustomerTypeId() == c.getCustomerTypeId()}">
                                    <td>${t.getCustomerTypeName()}</td>
                                </c:if>
                            </c:forEach>
                            <td>
                                <a class="btn btn-primary" href="/customers?action=edit&id=${c.getCustomerId()}"
                                   style="margin-bottom:10px "><i class="fa-solid fa-pen-to-square"></i></a>
                                <button type="button"
                                        onclick="getNameId('${c.getCustomerId()}','${c.getCustomerName()}')"
                                        class="btn btn-primary" data-toggle="modal"
                                        data-target="#exampleModal">
                                    <i class="fa-solid fa-trash"></i>
                                </button>
                            </td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</div>
<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
     aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Delete</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <form action="/customers" method="get">
                <div class="modal-body">
                    <input type="text" name="action" value="delete" hidden>
                    <span>Are you sure delete </span><span class="deleteName"></span>
                    <input type="text" class="deleteId" name="id">
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                    <button type="submit" class="btn btn-primary">Delete</button>
                </div>
            </form>
        </div>
    </div>
</div>
<script src="../jquery/jquery-3.5.1.min.js"></script>
<script src="../DataTables/DataTables-1.11.5/js/jquery.dataTables.min.js"></script>
<script src="../DataTables/DataTables-1.11.5/js/dataTables.bootstrap4.min.js"></script>
<script>
    $(document).ready(function () {
        $('#tableCustomer').dataTable({
            "dom": 'lrtip',
            "lengthChange": false,
            "pageLength": 5
        });
    });
    function getNameId(id, name) {
        document.querySelector(".deleteId").value = id;
        document.querySelector(".deleteName").innerText = name;
    }
</script>
<%--<c:redirect url="/customers"></c:redirect>--%>
</body>
</html>
