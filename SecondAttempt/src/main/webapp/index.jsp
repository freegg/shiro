<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <base href="<%=request.getContextPath()%>/" />
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>测试</title>
    <link href="styles/bootstrap.min.css" rel="stylesheet" type="text/css">
    <link href="styles/bootstrap-table.min.css" rel="stylesheet" type="text/css">
    <script type="text/javascript" src="scripts/sweetalert.min.js"></script>
    <link href="styles/sweetalert.css"   rel="stylesheet" type="text/css">
    <script type="text/javascript" src="scripts/jquery-1.12.0.min.js"></script>
    <script type="text/javascript" src="scripts/bootstrap.min.js"></script>
    <script type="text/javascript" src="scripts/bootstrap-table.min.js"></script>
</head>
<body>

</body>
<script type="text/javascript">
    var params=[];
    $("").ready(function(){
        $.get('tree', {}, function (text, status) { alert(text); });
    })
</script>
</html>