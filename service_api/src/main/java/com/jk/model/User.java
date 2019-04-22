/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: User
 * Author:   dell
 * Date:     2019/4/17 21:16
 * Description: a
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 〈一句话功能简述〉<br> 
 * 〈a〉
 *
 * @author dell
 * @create 2019/4/17
 * @since 1.0.0
 */
public class User implements Serializable {
    private static final long serialVersionUID = 4971583831825963652L;
    private Integer id;
    private String userName;
    private String userNumber;
    private String userPassword;
    private String img;
    private String info;
    private Integer price;
    private String userDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(String userNumber) {
        this.userNumber = userNumber;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getUserDate() {
        return userDate;
    }

    public void setUserDate(String userDate) {
        this.userDate = userDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", userNumber='" + userNumber + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", img='" + img + '\'' +
                ", info='" + info + '\'' +
                ", price=" + price +
                ", userDate='" + userDate + '\'' +
                '}';
    }
}
