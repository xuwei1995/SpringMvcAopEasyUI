<%--
  Created by IntelliJ IDEA.
  User: Xu Wei
  Date: 2018/3/5
  Time: 10:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <title>EasyUITest</title>
   <%-- <link href="<c:url value='/statics/css/util/datagrid2.css'/>">
    <link href="<c:url value='/statics/css/util/bootstrap-table.css'/>">
    <script type="text/javascript" src="<c:url value='/statics/js/util/jquery-1.12.3.js'/>"></script>
    <script type="text/javascript" src="<c:url value='/statics/js/util/jquery.easyui2.min.js'/>"></script>
    <script type="text/javascript" src="<c:url value='/statics/js/test/test.js'/>"></script>--%>
    <link rel="stylesheet" type="text/css" href="http://www.jeasyui.net/Public/js/easyui/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="http://www.jeasyui.net/Public/js/easyui/themes/icon.css">
    <script type="text/javascript" src="http://code.jquery.com/jquery-1.4.4.min.js"></script>
    <script type="text/javascript" src="http://www.jeasyui.net/Public/js/easyui/jquery.easyui.min.js"></script>

</head>
<body>
<table id="tt" class="easyui-datagrid" style="width:600px;height:250px"
       url="getUser"
       title="Load Data" iconCls="icon-save"
       rownumbers="true" pagination="true">
    <thead>
    <tr>
        <th field="userId" width="80">ID</th>
        <th field="userName" width="80">姓名</th>
        <th field="address" width="80" align="right">地址</th>
    </tr>
    </thead>
</table>
<button id="btn1">新增</button>
<button id="btn2">修改</button>
<button id="btn3">删除</button>
</body>
<script>

</script>
</html>
