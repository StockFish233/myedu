<%--
  Created by IntelliJ IDEA.
  User: 林之谦
  Date: 2018/3/7
  Time: 19:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <script type="text/javascript">
        function registered() {
            document.login.action="${pageContext.request.contextPath }/edu/edu_to_regs.action";
            document.login.submit();
        }
        function logins() {
            document.login.action="${pageContext.request.contextPath }/edu/edu_login.action";
            document.login.submit();
        }

    </script>

    <title>My_Edu</title>
</head>
<body>

<hr/>

    <div id="content" style="margin:0 auto;  width:1000px; height:500px; position:relative; align-items: center;">
        <div style=" text-align:center">
            <div class="login" style="position:absolute; top:50%;left:50%;margin-top:-100px;margin-left:-200px;background:#d6ffdf; width:400px; height: 200px; border-radius:10px;">

                <form  method="post" name="login">
                    <div style=" margin-left:0px;margin-top:50px">
                        <select id="selec" name="selec" value="${selec}">
                            <option value="stu">学生</option>
                            <option value="tch">教师</option>
                        </select>
                        <p style="display:inline">登陆账号:</p>
                        <input type="text" name="userName" value="${userName}"/><br/>
                    </div>
                    <div style="margin-left:53px;margin-top:20px">
                        <p style="display:inline">密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码:</p>
                        <input type="password" name="userPwd" value="${userPwd}"><br/>
                    </div>
                        <div style="margin-top:20px;margin-left: 10px">
                            <button onclick="logins()" style="margin-right:10px; padding:5px 15px; background:#cec1c4; border-radius:3px; border:#101012 1px solid;">登录</button>
                            <button onclick="registered()"style="padding:5px 15px; background:#cec1c4; border-radius:3px; border:#101012 1px solid;">注册</button>
                        </div>

                        <br>
                    <font color="red">${error1}</font>
                </form>

            </div>
        </div>
    </div>

<hr/>
<%--<form action="${pageContext.request.contextPath}/user/user_FindById.action" method="post">--%>
    <%--userId:<input type="text" name="user.id" value="${user.id}"/> <br/>--%>
    <%--<input type="submit" value="find"/><font color="red">${error2}</font>--%>
<%--</form>--%>
<%--<hr/>--%>
<%--<form action="${pageContext.request.contextPath}/user/user_addUsers.action" method="post">--%>
    <%--&lt;%&ndash;userId:<input type="text" name="user.id" value="${user.id}"/> <br/>&ndash;%&gt;--%>
    <%--userName:<input type="text" name="user.userName" value="${user.userName}"/> <br/>--%>
    <%--password:<input type="password" name="user.password" value="${user.password }"/> <br/>--%>
    <%--${user.userName}--%>
    <%--<input type="submit" value="add"/>--%>
<%--</form>--%>
<%--<hr/>--%>
<%--<form action="${pageContext.request.contextPath}/user/user_ModifyUser.action" method="post">--%>
    <%--userId:<input type="text" name="user.id" value="${user.id}"/> <br/>--%>
    <%--userName:<input type="text" name="user.userName" value="${user.userName}"/> <br/>--%>
    <%--oldPassword:<input type="password" name="user.password" value="${user.password }"/> <br/>--%>
    <%--newPassword:<input type="password" name="newpassword" value="${newpassword }"/> <br/>--%>
    <%--<input type="submit" value="modify"/>--%>
<%--</form>--%>

<%--<hr/>--%>
<%--<form action="${pageContext.request.contextPath}/user/user_DeleteUsers.action" method="post">--%>
    <%--userId:<input type="text" name="user.id" value="${user.id}"/> <br/>--%>
    <%--userName:<input type="text" name="user.userName" value="${user.userName}"/> <br/>--%>
    <%--Password:<input type="password" name="user.password" value="${user.password }"/> <br/>--%>
    <%--<input type="submit" value="delete"/>--%>
<%--</form>--%>
<%--<hr/>--%>
<%--<form action="${pageContext.request.contextPath}/user/user_ShowAll.action" method="post">--%>
    <%--<input type="submit" value="show"/>--%>
<%--</form>--%>

</body>
</html>

