package pers.cxy.myedu.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.springframework.stereotype.Controller;
import pers.cxy.myedu.entity.Student;
import pers.cxy.myedu.entity.Teacher;
import pers.cxy.myedu.entity.User;
import pers.cxy.myedu.service.StudentService;
import pers.cxy.myedu.service.TeacherService;
import pers.cxy.myedu.service.UserService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class Action extends ActionSupport  implements ServletRequestAware{

    private static final long serialVersionUID = 1L;

    private HttpServletRequest request;


    @Resource
    private StudentService studentService;

    @Resource
    private TeacherService teacherService;

    private String userName;
    private String userPwd;
    private int userId;


    private String newpassword;
    private String selec;
    private String error1,error2,error3,result;


    public String getNewpassword() {
        return newpassword;
    }

    public void setNewpassword(String newpassword) {
        this.newpassword = newpassword;
    }

    @Override
    public void setServletRequest(HttpServletRequest request) {
        this.request = request;
    }

    public String getSelec() {
        return selec;
    }

    public void setSelec(String selec) {
        this.selec = selec;
    }




    public String getError1() {
        return error1;
    }

    public void setError1(String error) {
        this.error1 = error;
    }

    public String getError2() {
        return error2;
    }

    public void setError2(String error) {
        this.error2 = error;
    }

    public String getError3() {
        return error3;
    }

    public void setError3(String error) {
        this.error3 = error;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String login() throws Exception{
        HttpSession session = request.getSession();
        System.out.println(selec);

        if(selec.equals(new String("stu")) ){
            System.out.println(userName);
            System.out.println(userPwd);
            Student student = new Student();
            student.setStu_pwd(new String(""+userPwd));
            student.setStu_name(new String(""+userName));
            System.out.println(student);
            Student currentStu = studentService.findStudentByNameAndPassword(student);

            if (currentStu != null){
                session.setAttribute("currentStu",currentStu);
                return "stu_login";
            }else {
                error1 = "用户名或密码错误";
                return ERROR;
            }
        }else{
            Teacher teacher = new Teacher();
            teacher.setTch_pwd(new String(""+userPwd));
            teacher.setTch_name(new String(""+userName));
            Teacher currentTch = teacherService.findTeacherByNameAndPassword(teacher);
            System.out.println(teacher);
            System.out.println(userName);
            System.out.println(userPwd);
            if(currentTch != null){
                session.setAttribute("currentTch",currentTch);
                return "tch_login";
            }else{
                error1 = "用户名或密码错误";
                return ERROR;
            }
        }

    }
    public String to_regs() throws Exception{
        return "to_regs";
    }
    public String regs() throws Exception{

        System.out.println("selec = " + selec);
        if(selec.equals(new String( "stu") )){
           Student student =new Student();
           student.setStu_name(new String(userName));
           student.setStu_id(new Integer(userId));
           student.setStu_pwd(new String((userPwd)));
           student.setId(1);
           Student stu = studentService.findStudentById(student.getStu_id());
           if(stu == null){
               studentService.saveStudent(student);
               result = "成功添加学生";
               return "stu_reg";
           }else{
               error1 ="已有账号";

               return "stu_reg";
           }
        }else{

            Teacher teacher =new Teacher();
            teacher.setTch_name(new String(userName));
            teacher.setTch_id(new Integer(userId));
            teacher.setTch_pwd(new String((userPwd)));
            teacher.setId(1);
            Teacher tch = teacherService.findTeacherById(teacher.getTch_id());
            if(tch == null){
                teacherService.saveTeacher(teacher);
                result = "成功添加教师";
                return "tch_reg";
            }else{
                error1 ="已有账号";
                return "tch_reg";
            }
        }

    }
}
