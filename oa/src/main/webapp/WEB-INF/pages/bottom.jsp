<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<HTML>
<HEAD>
    <TITLE>Bottom</TITLE>
    <META http-equiv="Content-Type" CONTENT="text/html; charset=utf-8"/>
    <LINK type="text/css" rel="stylesheet" HREF="${pageContext.request.contextPath}/style/blue/statusbar.css"/>
</HEAD>
<BODY STYLE="margin:0">

<DIV ID="StatusBar">
    <DIV ID="Online">
        在线人员：共 <SPAN CLASS="OnlineUser" ID="onlineUserNum"></SPAN> 人
        <SPAN CLASS="OnlineView"><A HREF="javascript:void(0)">[查看在线名单]</A></SPAN>
    </DIV>
    <DIV ID="Info">
        <A HREF="http://www.itcast.cn" title="牛耳教育首页" TARGET="_blank">牛耳教育首页</A> |
        <A HREF="http://bbs.itcast.cn" title="牛耳教育BBS" TARGET="_blank">牛耳教育BBS</A>
    </DIV>
    <DIV ID="DesktopText">
        <A HREF="javascript:void(0)"><IMG BORDER="0"
                                          SRC="${pageContext.request.contextPath}/style/images/top/text.gif"/>便笺</A>
        <SPAN id=TryoutInfo></SPAN>
        <SPAN ID="Version">
            <A HREF="javascript:void(0)">
            	<IMG BORDER="0" WIDTH="11" HEIGHT="11"
                     SRC="${pageContext.request.contextPath}/style/images/top/help.gif"/>
                <IMG BORDER="0" WIDTH="40" HEIGHT="11"
                     SRC="${pageContext.request.contextPath}/style/blue/images/top/version.gif"/>
            </A>
        </SPAN>
    </DIV>
</DIV>

</BODY>
</HTML>
