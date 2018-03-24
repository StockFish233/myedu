package pers.cxy.myedu.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="t_teacher")
public class Teacher extends User{
    private String tch_name,tch_pwd;
    private  Integer tch_id,id;
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

    @Column(name = "tch_name", length=20)
    public String getTch_name() {
        return tch_name;
    }

    public void setTch_name(String tch_name) {
        this.tch_name = tch_name;
    }

    @Column(name = "tch_pwd", length=20)
    public String getTch_pwd() {
        return tch_pwd;
    }

    public void setTch_pwd(String tch_pwd) {
        this.tch_pwd = tch_pwd;
    }

    @Column(name = "tch_id", length=20)
    public Integer getTch_id() {
        return tch_id;
    }

    public void setTch_id(Integer tch_id) {
        this.tch_id = tch_id;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "tch_name='" + tch_name + '\'' +
                ", tch_pwd='" + tch_pwd + '\'' +
                ", tch_id=" + tch_id +
                '}';
    }
}
