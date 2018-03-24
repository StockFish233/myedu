package pers.cxy.myedu.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="t_student")
public class Student extends User{
    private Integer stu_id,id;
    private String stu_name,stu_pwd;

    @Id
    @GenericGenerator(name = "generator", strategy = "native")
    @GeneratedValue(generator = "generator")



    @Column(name = "id", length=20)
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }


    @Column(name = "stu_id", length=20)
    public Integer getStu_id() {
        return stu_id;
    }
    public void setStu_id(Integer stu_id) {
        this.stu_id = stu_id;
    }

    @Column(name = "stu_name", length = 20)
    public String getStu_name() {
        return stu_name;
    }
    public void setStu_name(String stu_name) {
        this.stu_name = stu_name;
    }

    @Column(name = "stu_pwd", length = 20)
    public String getStu_pwd() {
        return stu_pwd;
    }
    public void setStu_pwd(String stu_pwd) {
        this.stu_pwd = stu_pwd;
    }


}
