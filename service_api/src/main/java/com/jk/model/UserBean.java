package com.jk.model;

import java.io.Serializable;

/**
 * <pre>项目名称：springcloud
 * 类名称：UserBean
 * 类描述：
 * 创建人：张利瑶
 * 创建时间：2019/4/12 21:04
 * 修改人：张利瑶
 * 修改时间：2019/4/12 21:04
 * 修改备注：
 * @version </pre>
 */
public class UserBean implements Serializable {
    private static final long serialVersionUID = 4971583831825963652L;

    private  Integer id;

    private  String name;

    private  Integer age;

    private  Integer sex;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "UserBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}
