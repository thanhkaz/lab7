<%--
  Created by IntelliJ IDEA.
  User: aligh
  Date: 3/5/2024
  Time: 10:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css&quot;" rel="stylesheet">

</head>
<body>


<section class="container mt-5">
    <h1>TH�NG TIN PH�NG BAN</h1>
    <form class="row row-cols-lg-auto g-3 align-items-center search" method="post">
        <div class="col-12">
            <%--@declare id="inlineforminputgroupusername"--%><label class="visually-hidden" for="inlineFormInputGroupUsername">Department Name</label>
            <div class="input-group">
                <div class="input-group-text">Department Name</div>
                <input type="text" class="form-control" name="departmentName" value="${deptName}"
                       id="departmentName" placeholder="Department Name">
            </div>
        </div>
        <div class="col-12">
            <button type="submit" class="btn btn-primary">Search</button>
        </div>
    </form>
    <p style="color: red;">${errorString}</p>
    <p> ${sql}</p>
    <table class="table table-bordered">
        <thead style="background: #f1f1f1">
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Dept No</th>
            <th>Location</th>
            <th>Edit</th>
            <th>Delete</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${department}" var="department">
            <tr>
                <td>${department.getDeptId()}</td>
                <td>${department.getDeptName()}</td>
                <td>${department.getDeptNo()}</td>
                <td>${department.getLocation()}</td>
                <td><a href="productEdit?code=${department.getDeptId()}">Edit</a>
                </td>
                <td><a href="productDelete?code=${department.getDeptId()}">Delete</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

    <a href="productCreate">Create Product</a>
</section>

</body>
</html>
