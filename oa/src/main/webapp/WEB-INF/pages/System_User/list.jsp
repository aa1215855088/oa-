<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../common/taglib.jsp" %>
<HTML>
<HEAD>
    <TITLE>用户列表</TITLE>
    <META HTTP-EQUIV="Content-Type" CONTENT="text/html; charset=utf-8"/>
    <SCRIPT LANGUAGE="javascript" SRC="${pageContext.request.contextPath}/script/jquery.js"></SCRIPT>
    <SCRIPT LANGUAGE="javascript" SRC="${pageContext.request.contextPath}/script/pageCommon.js"
            CHARSET="utf-8"></SCRIPT>
    <SCRIPT LANGUAGE="javascript" SRC="${pageContext.request.contextPath}/script/PageUtils.js" CHARSET="utf-8"></SCRIPT>
    <SCRIPT LANGUAGE="javascript" SRC="${pageContext.request.contextPath}/script/DemoData.js" CHARSET="utf-8"></SCRIPT>
    <SCRIPT LANGUAGE="javascript" SRC="${pageContext.request.contextPath}/script/DataShowManager.js"
            CHARSET="utf-8"></SCRIPT>
    <LINK TYPE="text/css" REL="stylesheet" HREF="${pageContext.request.contextPath}/style/blue/pageCommon.css"/>
    <SCRIPT TYPE="text/javascript">
    </SCRIPT>
</HEAD>
<BODY>

<DIV ID="Title_bar">
    <DIV ID="Title_bar_Head">
        <DIV ID="Title_Head"></DIV>
        <DIV ID="Title"><!--页面标题-->
            <IMG BORDER="0" WIDTH="13" HEIGHT="13"
                 SRC="${pageContext.request.contextPath}/style/images/title_arrow.gif"/> 用户管理
        </DIV>
        <DIV ID="Title_End"></DIV>
    </DIV>
</DIV>

<DIV ID="MainArea">
    <TABLE CELLSPACING="0" CELLPADDING="0" CLASS="TableStyle">

        <!-- 表头-->
        <THEAD>
        <TR ALIGN=center VALIGN=middle ID=TableTitle>
            <TD WIDTH="100">登录名</TD>
            <TD WIDTH="100">姓名</TD>
            <TD WIDTH="100">所属部门</TD>
            <TD WIDTH="200">岗位</TD>
            <TD>备注</TD>
            <TD>相关操作</TD>
        </TR>
        </THEAD>

        <!--显示数据列表-->
        <TBODY ID="TableData" CLASS="dataContainer" dataKey="userList">
        <c:forEach items="${oaUsers}" var="oauser">
            <tr CLASS="">
                <td>${oauser.loginName}&nbsp;</td>
                <td>${oauser.userName}&nbsp;</td>
                <td>${oauser.departmentId}&nbsp;</td>
                <td>${oauser.departmentId}&nbsp;</td>
                <td>${oauser.userRemark}&nbsp;</td>
                <td><A onClick="return delConfirm()" HREF="list.jsp">删除</A>
                    <A HREF="saveUI.html">修改</A>
                    <A HREF="#" onClick="return window.confirm('您确定要初始化密码吗？')">初始化密码</A>
                </td>
            </tr>
        </c:forEach>
        </TBODY>
    </TABLE>

    <!-- 其他功能超链接 -->
    <DIV ID="TableTail">
        <DIV ID="TableTail_inside">
            <A HREF="saveUI.html"><IMG SRC="${pageContext.request.contextPath}/style/images/createNew.png"/></A>
        </DIV>
    </DIV>
</DIV>

</BODY>
</HTML>
