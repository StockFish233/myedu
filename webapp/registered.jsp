<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2018/3/22
  Time: 20:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>

    <script type="text/javascript">
        function registered() {
            document.regs.action="${pageContext.request.contextPath }/edu/edu_regs.action";
            document.regs.submit();
        }


    </script>
</head>
<body>
    <div id="content" style="margin:0 auto;  width:1000px; height:500px; position:relative; align-items: center;">
        <div style=" text-align:center">
            <div class="login" style="position:absolute; top:50%;left:50%;margin-top:-100px;margin-left:-200px;background:#d6ffdf; width:400px; height: 200px; border-radius:10px;">

                <form method="post" name="regs">
                    <div style=" margin-left:0px;margin-top:50px">
                        <select id="selec" name="selec" value="${selec}">
                            <option value="stu">学生</option>
                            <option value="tch">教师</option>
                        </select>
                        <p style="display:inline">&nbsp;&nbsp;用户名</p>
                        <input type="text" name="userName" value="${userName}"/><br/>
                    </div>
                    <div style="margin-left:53px;margin-top:20px">
                        <p style="display:inline">输入账号</p>
                        <input type="text" name="userId" value="${userId}"><br/>
                    </div>
                    <div style="margin-left:53px;margin-top:20px">
                        <p style="display:inline">密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码</p>
                        <input type="password" name="userPwd" value="${userPwd}"><br/>
                    </div>
                    <div style="margin-top:20px;margin-left: 10px">
                        <button onclick="registered()"style="padding:5px 15px; background:#cec1c4; border-radius:3px; border:#101012 1px solid;">注册</button>
                    </div>

                    <br>
                    <font color="red">${error1}</font> <font color="green">${result}</font>
                </form>

            </div>
        </div>
    </div>
</body>
</html>
