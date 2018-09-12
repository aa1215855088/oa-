<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<HTML>
<HEAD>
<TITLE>选择人员</TITLE>
<META http-equiv=Content-Type CONTENT="text/html; charset=gbk" />
<SCRIPT LANGUAGE="javascript" SRC="${pageContext.request.contextPath}/js/jquery.js"></SCRIPT>
<SCRIPT LANGUAGE="javascript" SRC="${pageContext.request.contextPath}/js/pageCommon.js"></SCRIPT>
<SCRIPT LANGUAGE="javascript" SRC="${pageContext.request.contextPath}/js/general.js"></SCRIPT>
<LINK HREF="${pageContext.request.contextPath}/style/blue/cn_mainWin.css" type=text/css  media=screen rel=stylesheet />
<LINK HREF="${pageContext.request.contextPath}/style/blue/query.css" type=text/css  media=screen rel=stylesheet />
<LINK HREF="${pageContext.request.contextPath}/style/blue/comm_mainWin.css" type=text/css  media=screen rel=stylesheet />
<LINK HREF="${pageContext.request.contextPath}/style/blue/selectPerson.css" REL="stylesheet" TYPE="text/css" />
<BASE TARGET="_self" />
<SCRIPT TYPE="text/javascript">
var basePath = "${pageContext.request.contextPath}/";
function menuClick( sn ){
	$("div[id^=module_]").hide();
	$("li[id^=li_]>span>img").attr("src", basePath + "${pageContext.request.contextPath}/style/images/arrow_close.gif");
	
	$("div[id=module_" + sn + "]").show();
	$("li[id=li_"+sn+"]>span>img").attr("src", basePath + "${pageContext.request.contextPath}/style/images/arrow_open.gif");
}
function changeSelect(type, selectElement){
	if("selectByDepartment" == type){
		
	}
	else if("selectByRole" == type){
	
	}
}
var selectedPersonId;
var selectedPersonName;
function selectPerson( id_name ){
	selectedPersonId = id_name.split("_")[0];
	selectedPersonName = id_name.split("_")[1];
}
function ok(){
	if(selectedPersonId == null){
		alert("请选择人员");
		return;
	}
	// alert(selectedPersonId + "\t" + selectedPersonName);
	dialogArguments.document.forms[0].approverId.value = selectedPersonId;
	dialogArguments.document.forms[0].approverName.value = selectedPersonName;
	window.close();
}
$(function(){
	menuClick(1);
	selectedPersonValue = $("li[id=li_1]>div>select").val();
});
</SCRIPT>
</HEAD>
<BODY MARGINWIDTH="0" TOPMARGIN="0" LEFTMARGIN="0" MARGINHEIGHT="0">
<DIV ID=Title_bar>
    <DIV ID=Title_bar_Head>
        <DIV ID=Title_Head></DIV>
        <DIV ID=Title>
            <!--页面标题-->
            <IMG BORDER="0" WIDTH="13" HEIGHT="13" SRC="${pageContext.request.contextPath}/style/images/title_arrow.gif" /> 选择人员 </DIV>
        <DIV ID=Title_End> </DIV>
    </DIV>
    <DIV ID=Title_bar_bg_up>
        <DIV ID=Title_bar_bg> </DIV>
    </DIV>
    <!--相关操作列表-->
    <DIV ID=Title_bar_Tail>
        <DIV ID=Title_FuncBar>
            <UL  style="margin:0;">
	            <LI CLASS=line ></LI>
                <LI CLASS=title>
                    <DIV CLASS="Btn"> <A HREF="javascript: window.close();">关闭</A> </DIV>
                </LI>
                <LI CLASS=line></LI>
                <LI CLASS=title>
                    <DIV CLASS="Btn"> <A HREF="javascript:ok()">确认选择</A> </DIV>
                </LI>
                <LI CLASS=line ></LI>
            </UL>
        </DIV>
    </DIV>
</DIV>
<DIV ID="MainArea"> <BR/>
    <CENTER>
        <DIV CLASS="OutsideBorder">
            <DIV CLASS="InsideBorder">
                <DIV CLASS="OperateArea">
                    <DIV ID="SearchInputArea">
                        <INPUT TYPE="text" CLASS="SearchInput" AUTOCOMPLETE="off" NAME="keyWord" ID="textSuggest" readonly/>
                        <IMG BORDER="0" SRC="${pageContext.request.contextPath}/style/images/search.gif" ID="search_icon"/> </DIV>
                    <DIV ID="ItemListArea">
                        <UL>
                            <LI ID="li_1"><SPAN onClick="menuClick(1);"><IMG BORDER="0" SRC="${pageContext.request.contextPath}/style/images/arrow_close.gif"/> 所有人员列表</SPAN>
                                <DIV ID="module_1" STYLE="display: none;" CLASS="moduleContainer">
                                    <SELECT SIZE="5" STYLE="width: 100%; height: 255px;" NAME="leftList_10" onChange="selectPerson(this.value)">
                                        <OPTION VALUE="1_张三">张三【总经理室】</OPTION>
                                        <OPTION VALUE="2_王英">王英【产品事业部】</OPTION>
                                        <OPTION VALUE="3_陈小">陈小【OA开发部】</OPTION>
                                    </SELECT>
                                </DIV>
                            </LI>
                            <!--
                            <LI id="li_2"><SPAN ONCLICK=menuClick(2);><img border="0" src="${pageContext.request.contextPath}/style/images/arrow_close.gif" /> 按部门选择人员</SPAN>
                                <DIV id="module_2" style="display:none;">
                                    <DIV STYLE="height:20px">
                                        <select onChange="changeSelect('selectByDepartment',this);" class="SelectStyle" name="groupNameList">
                                            <option value="WONoSelectionString">请选择部门</option>
                                            <option value="ROOT">大连华天软件有限公司</option>
                                            <option value="^DEPT0001">|-总经理室</option>
                                            <option value="^DEPT0008">|---产品事业部</option>
                                            <option value="^DEPT0009">|-----OA开发部</option>
                                            <option value="^DEPT0002">|---办公室</option>
                                        </select>
                                    </DIV>
                                    <SELECT NAME=leftList_2 SIZE=5 onChange="selectPerson(this.value)">
                                    	<option value="1_张三">张三</option>
                                        <option value="2_王英">王英</option>
                                        <option value="3_陈小">陈小</option>
                                    </SELECT>
                                </DIV>
                            </LI>
                            <LI id="li_3"><SPAN ONCLICK=menuClick(3);><img border="0" src="${pageContext.request.contextPath}/style/images/arrow_close.gif" /> 按角色选择人员</SPAN>
                                <DIV ID="module_3" STYLE="display:none;">
                                    <DIV STYLE="height:20px">
                                        <select onChange="changeSelect('selectByRole',this);" class="SelectStyle" name="roleList">
                                            <option value=";US0001;">总经理</option>
                                            <option value=";US0019;">----财务经理</option>
                                            <option value=";US0021;">------会计</option>
                                            <option value=";US0022;">------出纳</option>
                                            <option value=";US0025;">----企划部经理</option>
                                            <option value=";US0027;">------美工</option>
                                            <option value=";US0029;">------市场策划</option>
                                            <option value=";US0031;">----销售部经理</option>
                                            <option value=";US0032;US0033;">------OA渠道专员</option>
                                            <option value=";US0035;US0034;US0036;">------OA销售专员</option>
                                        </select>
                                    </DIV>
                                    <SELECT NAME=leftList_3 onChange="selectPerson(this.value)" size="15">
                                    	<option value="1_张三">张三</option>
                                        <option value="2_王英">王英</option>
                                        <option value="3_陈小">陈小</option>
                                    </SELECT>
                                </DIV>
                            </LI>
                            -->
                        </UL>
                    </DIV>
                </DIV>
            </DIV>
        </DIV>
        <!--
        <div>
            <ul style="margin: 5px; float: left; padding-top: 60px;">
                <li><img border="0" src="${pageContext.request.contextPath}/style/blue/images/btn_to_right.gif" onclick="UserMove (0);"/></li>
                <li/>
                <li><img border="0" src="${pageContext.request.contextPath}/style/blue/images/btn_to_left.gif" onclick="UserMove (1);"/></li>
                <li/>
                <li><img border="0" src="${pageContext.request.contextPath}/style/blue/images/btn_all_right.gif" onclick="UserMove (2);"/></li>
                <li/>
                <li><img border="0" src="${pageContext.request.contextPath}/style/blue/images/btn_all_left.gif" onclick="UserMove (3);"/></li>
            </ul>
        </div>
        <div class="OutsideBorder">
            <div class="InsideBorder">
                <div style="float: right;" class="OperateArea">
                    <div id="SelectedHead"> <img border="0" src="${pageContext.request.contextPath}/style/images/selected.gif"/> 已选人员 </div>
                    <select size="5" class="Selected" name="rightList" id="rightList" multiple="" ondblclick="UserMove(1);"/>
                    
                </div>
            </div>
        </div>
        -->
    </CENTER>
</DIV>
</BODY>
</HTML>
