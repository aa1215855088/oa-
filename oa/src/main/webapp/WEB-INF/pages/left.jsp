<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>导航菜单</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <script language="JavaScript" src="${pageContext.request.contextPath}/script/menu.js"></script>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/style/blue/menu.css"/>
    <script type="text/javascript">
        var basePath = "";
        var SubImg = basePath + '${pageContext.request.contextPath}/style/images/MenuIcon/menu_arrow_close.gif';
        var SubImgOpen = basePath + '${pageContext.request.contextPath}/style/images/MenuIcon/menu_arrow_open.gif';
    </script>
</head>
<body style="margin:0">
<div id="Menu">
    <ul id="MenuUl">
        <li class="level1">
            <div onClick="menuClick(this);" id="MEMU_FUNC20001" class="level1Sty"><img
                    src="${pageContext.request.contextPath}/style/images/MenuIcon/FUNC20001.gif" class="Icon"/> 个人办公
            </div>
            <ul style="display: none;" id="MEMU_FUNC20001d" class="MenuLevel2">
                <li class="level2">
                    <div id="MEMU_FUNC20019" class="level2Style"><img
                            src="${pageContext.request.contextPath}/style/images/MenuIcon/menu_arrow_single.gif"
                            id="MEMU_FUNC20019_img"/> 个人考勤
                    </div>
                </li>
                <li class="level2">
                    <div id="MEMU_FUNC20023" class="level2Style"><img
                            src="${pageContext.request.contextPath}/style/images/MenuIcon/menu_arrow_single.gif"
                            id="MEMU_FUNC20023_img"/> 日程安排
                    </div>
                </li>
                <li class="level2">
                    <div id="MEMU_FUNC20024" class="level2Style"><img
                            src="${pageContext.request.contextPath}/style/images/MenuIcon/menu_arrow_single.gif"
                            id="MEMU_FUNC20024_img"/> 工作计划
                    </div>
                </li>
                <li class="level2">
                    <div id="MEMU_FUNC20022" class="level2Style"><img
                            src="${pageContext.request.contextPath}/style/images/MenuIcon/menu_arrow_single.gif"
                            id="MEMU_FUNC20022_img"/> 工作日记
                    </div>
                </li>
                <li class="level2">
                    <div onClick="subMenuClick(this);" id="MEMU_FUNC20025" class="level2Style"><img
                            src="${pageContext.request.contextPath}/style/images/MenuIcon/menu_arrow_close.gif"
                            id="MEMU_FUNC20025_img"/> 通讯录
                    </div>
                    <ul style="display: none;" id="MEMU_FUNC20025d" class="MenuLevel2">
                        <li class="level3Head">公共通讯录</li>
                        <li class="level32">个人通讯录</li>
                    </ul>
                </li>
            </ul>
        </li>
        <li class="level1">
            <div onClick="menuClick(this);" id="MEMU_FUNC20057" class="level1Style"><img
                    src="${pageContext.request.contextPath}/style/images/MenuIcon/FUNC20057.gif" class="Icon"/> 审批流转
            </div>
            <ul style="display: none;" id="MEMU_FUNC20057d" class="MenuLevel2">
                <li class="level2">
                    <div class="level2Style"><img
                            src="${pageContext.request.contextPath}/style/images/MenuIcon/menu_arrow_single.gif"
                            id="MEMU_FUNC20059_img"/> <a target="desktop" href="Flow_Formflow/formTemplateList.html">起草申请</a>
                    </div>
                </li>
                <li class="level2">
                    <div class="level2Style"><img
                            src="${pageContext.request.contextPath}/style/images/MenuIcon/menu_arrow_single.gif"
                            id="MEMU_FUNC20060_img"/> <a target="desktop" href="Flow_FormQuery/mySubmittedList.html">我的申请查询</a>
                    </div>
                </li>
                <li class="level2">
                    <div class="level2Style"><img
                            src="${pageContext.request.contextPath}/style/images/MenuIcon/menu_arrow_single.gif"
                            id="MEMU_FUNC20061_img"/> <a target="desktop" href="Flow_Formflow/myTaskList.html"> 待我审批</a>
                    </div>
                </li>
                <li class="level2">
                    <div class="level2Style"><img
                            src="${pageContext.request.contextPath}/style/images/MenuIcon/menu_arrow_single.gif"
                            id="MEMU_FUNC20062_img"/> <a target="desktop"
                                                         href="Flow_FormQuery/myApprovedList.html">经我审批</a></div>
                </li>
                <li class="level2">
                    <div class="level2Style"><img
                            src="${pageContext.request.contextPath}/style/images/MenuIcon/menu_arrow_single.gif"
                            id="MEMU_FUNC20087_img"/> <a target="desktop"
                                                         href="Flow_DocFormTemplate/list.html">表单模板管理</a></div>
                </li>
                <li class="level2">
                    <div class="level2Style"><img
                            src="${pageContext.request.contextPath}/style/images/MenuIcon/menu_arrow_single.gif"
                            id="MEMU_FUNC20063_img"/> <a target="desktop"
                                                         href="Flow_ProcessDefinition/list.html">审批流程管理</a></div>
                </li>
            </ul>
        </li>
        <li class="level1">
            <div onClick="menuClick(this);" id="MEMU_FUNC20064" class="level1Style"><img
                    src="${pageContext.request.contextPath}/style/images/MenuIcon/FUNC20064.gif" class="Icon"/> 网上交流
            </div>
            <ul style="display: none;" id="MEMU_FUNC20064d" class="MenuLevel2">
                <li class="level2">
                    <div onClick="subMenuClick(this);" id="MEMU_FUNC20002" class="level2Style"><img
                            src="${pageContext.request.contextPath}/style/images/MenuIcon/menu_arrow_close.gif"
                            id="MEMU_FUNC20002_img"/> 短消息
                    </div>
                    <ul style="display: none;" id="MEMU_FUNC20002d" class="MenuLevel2">
                        <li class="level3Head"><a target="desktop" href="Person_Message/saveUI.html">发送短消息</a></li>
                        <li class="level33"><a target="desktop" href="Person_Message/inbox.html">已接收</a></li>
                        <li class="level33"><a target="desktop" href="Person_Message/outbox.html">已发送</a></li>
                        <li class="level32"><a target="desktop" href="Person_Message/draftbox.html">草稿箱</a></li>
                    </ul>
                </li>
                <li class="level2">
                    <div id="MEMU_FUNC20065" class="level2Style"><img
                            src="${pageContext.request.contextPath}/style/images/MenuIcon/menu_arrow_single.gif"
                            id="MEMU_FUNC20065_img"/> <a target="desktop" href="BBS_Forum/forumList.html">论坛</a></div>
                </li>
                <li class="level2">
                    <div id="MEMU_FUNC20065" class="level2Style"><img
                            src="${pageContext.request.contextPath}/style/images/MenuIcon/menu_arrow_single.gif"
                            id="MEMU_FUNC20065_img"/> <a target="desktop" href="BBS_ForumManage/list.html">论坛管理</a>
                    </div>
                </li>
                <li class="level2">
                    <div id="MEMU_FUNC20066" class="level2Style"><img
                            src="${pageContext.request.contextPath}/style/images/MenuIcon/menu_arrow_single.gif"
                            id="MEMU_FUNC20066_img"/> 投票
                    </div>
                </li>
                <li class="level2">
                    <div id="MEMU_FUNC20068" class="level2Style"><img
                            src="${pageContext.request.contextPath}/style/images/MenuIcon/menu_arrow_single.gif"
                            id="MEMU_FUNC20068_img"/> 实时聊天
                    </div>
                </li>
            </ul>
        </li>
        <li class="level1">
            <div id="MEMU_FUNC20065" class="level1Style"><img
                    src="${pageContext.request.contextPath}/style/images/MenuIcon/FUNC20056.gif" class="Icon"/> <a
                    target="desktop" href="LanDisk_Folder/list.html">知识管理</a></div>
        </li>
        <li class="level1">
            <div onClick="menuClick(this);" id="MEMU_FUNC20070" class="level1Style"><img
                    src="${pageContext.request.contextPath}/style/images/MenuIcon/FUNC20070.gif" class="Icon"/> 综合行政
            </div>
            <ul style="display: none;" id="MEMU_FUNC20070d" class="MenuLevel2">
                <li class="level2">
                    <div id="MEMU_FUNC20021" class="level2Style"><img
                            src="${pageContext.request.contextPath}/style/images/MenuIcon/menu_arrow_single.gif"
                            id="MEMU_FUNC20021_img"/> 考勤管理
                    </div>
                </li>
                <li class="level2">
                    <div onClick="subMenuClick(this);" id="MEMU_FUNC20071" class="level2Style"><img
                            src="${pageContext.request.contextPath}/style/images/MenuIcon/menu_arrow_close.gif"
                            id="MEMU_FUNC20071_img"/> 会议管理
                    </div>
                    <ul style="display: none;" id="MEMU_FUNC20071d" class="MenuLevel2">
                        <li class="level3Head">会议申请</li
                        <li class="level33">暂存会议查询</li>
                        <li class="level33">待我参加会议</li>
                        <li class="level33">我已参加会议</li>
                        <li class="level33">新建会议纪要</li>
                        <li class="level33">会议纪要查询</li>
                        <li class="level33">待开会议查询</li>
                        <li class="level33">已开会议查询</li>
                        <li class="level33">会议室设置</li>
                        <li class="level32">会议类型设置</li>
                    </ul>
                </li>
                <li class="level2">
                    <div onClick="subMenuClick(this);" id="MEMU_FUNC20072" class="level2Style"><img
                            src="${pageContext.request.contextPath}/style/images/MenuIcon/menu_arrow_close.gif"
                            id="MEMU_FUNC20072_img"/> 车辆管理
                    </div>
                    <ul style="display: none;" id="MEMU_FUNC20072d" class="MenuLevel2">
                        <li class="level3Head">用车申请</li>
                        <li class="level33">派车管理</li>
                        <li class="level33">我的申请记录</li>
                        <li class="level33">车辆状态</li>
                        <li class="level33">车辆档案</li>
                        <li class="level32">私车公用</li>
                    </ul>
                </li>
            </ul>
        </li>
        <li class="level1">
            <div onClick="menuClick(this);" id="MEMU_FUNC261000" class="level1Style"><img
                    src="${pageContext.request.contextPath}/style/images/MenuIcon/FUNC261000.gif" class="Icon"/> 人力资源
            </div>
            <ul style="display: none;" id="MEMU_FUNC261000d" class="MenuLevel2">
                <li class="level2">
                    <div id="MEMU_FUNC261010" class="level2Style"><img
                            src="${pageContext.request.contextPath}/style/images/MenuIcon/menu_arrow_single.gif"
                            id="MEMU_FUNC261010_img"/> 档案管理
                    </div>
                </li>
                <li class="level2">
                    <div id="MEMU_FUNC261030" class="level2Style"><img
                            src="${pageContext.request.contextPath}/style/images/MenuIcon/menu_arrow_single.gif"
                            id="MEMU_FUNC261030_img"/> 培训记录
                    </div>
                </li>
                <li class="level2">
                    <div id="MEMU_FUNC261050" class="level2Style"><img
                            src="${pageContext.request.contextPath}/style/images/MenuIcon/menu_arrow_single.gif"
                            id="MEMU_FUNC261050_img"/> 奖惩记录
                    </div>
                </li>
                <li class="level2">
                    <div id="MEMU_FUNC261070" class="level2Style"><img
                            src="${pageContext.request.contextPath}/style/images/MenuIcon/menu_arrow_single.gif"
                            id="MEMU_FUNC261070_img"/> 职位变更
                    </div>
                </li>
                <li class="level2">
                    <div id="MEMU_FUNC261090" class="level2Style"><img
                            src="${pageContext.request.contextPath}/style/images/MenuIcon/menu_arrow_single.gif"
                            id="MEMU_FUNC261090_img"/> 人事合同
                    </div>
                </li>
                <li class="level2">
                    <div id="MEMU_FUNC261001" class="level2Style"><img
                            src="${pageContext.request.contextPath}/style/images/MenuIcon/menu_arrow_single.gif"
                            id="MEMU_FUNC261001_img"/> 类别维护
                    </div>
                </li>
            </ul>
        </li>
        <li class="level1">
            <div onClick="menuClick(this);" id="MEMU_FUNC20076" class="level1Style"><img
                    src="${pageContext.request.contextPath}/style/images/MenuIcon/FUNC20076.gif" class="Icon"/> 实用工具
            </div>
            <ul style="display: none;" id="MEMU_FUNC20076d" class="MenuLevel2">
                <li class="level2">
                    <div id="MEMU_FUNC20076001" class="level2Style"><img
                            src="${pageContext.request.contextPath}/style/images/MenuIcon/menu_arrow_single.gif"
                            id="MEMU_FUNC20076001_img"/> <a target="_blank" href="http://www.itcast.cn">公司网站</a></div>
                </li>
                <li class="level2">
                    <div id="MEMU_FUNC20008" class="level2Style"><img
                            src="${pageContext.request.contextPath}/style/images/MenuIcon/menu_arrow_single.gif"
                            id="MEMU_FUNC20008_img"/> <a target="_blank" href="http://qq.ip138.com/train/">火车时刻</a>
                    </div>
                </li>
                <li class="level2">
                    <div id="MEMU_FUNC20014" class="level2Style"><img
                            src="${pageContext.request.contextPath}/style/images/MenuIcon/menu_arrow_single.gif"
                            id="MEMU_FUNC20014_img"/> <a target="_blank" href="http://www.airchina.com.cn/">飞机航班</a>
                    </div>
                </li>
                <li class="level2">
                    <div id="MEMU_FUNC20015" class="level2Style"><img
                            src="${pageContext.request.contextPath}/style/images/MenuIcon/menu_arrow_single.gif"
                            id="MEMU_FUNC20015_img"/> <a target="_blank" href="http://www.ip138.com/post/">邮编/区号</a>
                    </div>
                </li>
                <li class="level2">
                    <div id="MEMU_FUNC20018" class="level2Style"><img
                            src="${pageContext.request.contextPath}/style/images/MenuIcon/menu_arrow_single.gif"
                            id="MEMU_FUNC20018_img"/> <a target="_blank" href="http://www.timedate.cn/">国际时间</a></div>
                </li>
            </ul>
        </li>
        <li class="level1">
            <div onClick="menuClick(this);" id="MEMU_FUNC20077" class="level1Style"><img
                    src="${pageContext.request.contextPath}/style/images/MenuIcon/FUNC20077.gif" class="Icon"/> 个人设置
            </div>
            <ul style="display: none;" id="MEMU_FUNC20077d" class="MenuLevel2">
                <li class="level2">
                    <div id="MEMU_FUNC20078" class="level2Style"><img
                            src="${pageContext.request.contextPath}/style/images/MenuIcon/menu_arrow_single.gif"
                            id="MEMU_FUNC20078_img"/> <a target="desktop"
                                                         href="Person_Config/editUserInfoUI.html">个人信息</a></div>
                </li>
                <li class="level2">
                    <div id="MEMU_FUNC20079" class="level2Style"><img
                            src="${pageContext.request.contextPath}/style/images/MenuIcon/menu_arrow_single.gif"
                            id="MEMU_FUNC20079_img"/> <a target="desktop"
                                                         href="Person_Config/editPasswordUI.html">密码修改</a></div>
                </li>
                <li class="level2">
                    <div id="MEMU_FUNC20080" class="level2Style"><img
                            src="${pageContext.request.contextPath}/style/images/MenuIcon/menu_arrow_single.gif"
                            id="MEMU_FUNC20080_img"/> 桌面定义
                    </div>
                </li>
            </ul>
        </li>
        <li class="level1">
            <div onClick="menuClick(this);" id="MEMU_FUNC20082" class="level1Style"><img
                    src="${pageContext.request.contextPath}/style/images/MenuIcon/FUNC20082.gif" class="Icon"/> 系统管理
            </div>
            <ul style="display: none;" id="MEMU_FUNC20082d" class="MenuLevel2">
                <li class="level2">
                    <div id="MEMU_FUNC20083" class="level2Style"><img
                            src="${pageContext.request.contextPath}/style/images/MenuIcon/menu_arrow_single.gif"
                            id="MEMU_FUNC20083_img"/> <a target="desktop" href="${pageContext.request.contextPath}/department/list"> 部门管理</a>
                    </div>
                </li>
                <li class="level2">
                    <div id="MEMU_FUNC20081" class="level2Style"><img
                            src="${pageContext.request.contextPath}/style/images/MenuIcon/menu_arrow_single.gif"
                            id="MEMU_FUNC20081_img"/> <a target="desktop" href="System_Role/list.html"> 岗位管理</a></div>
                </li>
                <li class="level2">
                    <div id="MEMU_FUNC20084" class="level2Style"><img
                            src="${pageContext.request.contextPath}/style/images/MenuIcon/menu_arrow_single.gif"
                            id="MEMU_FUNC20084_img"/> <a target="desktop"
                                                         href="${pageContext.request.contextPath}/user/list"> 用户帐号</a>
                    </div>
                </li>
                <!--
				<li class="level2">
					<div  id="MEMU_FUNC20085" class="level2Style"><img
                    src="${pageContext.request.contextPath}/style/images/MenuIcon/menu_arrow_single.gif" id="MEMU_FUNC20084_img"/> <a target="desktop" href="System_Menu/list.jsp"> 菜单管理</a> </div>
				</li>
				-->
                <li class="level2">
                    <div id="MEMU_FUNC20037" class="level2Style"><img
                            src="${pageContext.request.contextPath}/style/images/MenuIcon/menu_arrow_single.gif"
                            id="MEMU_FUNC20037_img"/> 基础数据设置
                    </div>
                </li>
            </ul>
        </li>
    </ul>
</div>
</body>
</html>
