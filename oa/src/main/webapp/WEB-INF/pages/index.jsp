<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<HTML>
<HEAD>
    <TITLE>ItcastOA</TITLE>
    <META HTTP-EQUIV="Content-Type" CONTENT="text/html; charset=utf-8"/>
</HEAD>

<FRAMESET ROWS="100,*,25" FRAMESPACING="0" BORDER="0" FRAMEBORDER="0">
    <FRAME noresize NAME="TopMenu" SRC="${pageContext.request.contextPath}/index/top" TARGET="contents" scrolling="no"/>
    <FRAMESET COLS="180,*" ID="resize">
        <FRAME noresize NAME="menu" SRC="${pageContext.request.contextPath}/index/left" TARGET="desktop"
               SCROLLING="yes"/>
        <FRAME noresize NAME="desktop" SRC="${pageContext.request.contextPath}/index/right" SCROLLING="yes"/>
    </FRAMESET>
    <FRAME noresize NAME="status_bar" SCROLLING="no" SRC="${pageContext.request.contextPath}/index/bottom"/>
</FRAMESET>
<NOFRAMES>
    <BODY></BODY>
</NOFRAMES>
</HTML>
