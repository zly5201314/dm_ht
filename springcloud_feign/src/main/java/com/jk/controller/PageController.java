/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: PageController
 * Author:   dell
 * Date:     2019/4/17 10:30
 * Description: a
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.controller;


import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈a〉
 *
 * @author dell
 * @create 2019/4/17
 * @since 1.0.0
 */
@Controller
public class PageController {

  /*  @Autowired
    private UserService userservice;
*/
  /*登录*/
    @RequestMapping("getLogin")
    public String getLogin(){
        System.out.println("getLogin");
        return "login";
    }
    /*注册*/
    @RequestMapping("getRegister")
    public String getRegister(){

        return "register";
    }
    /*一日游页面*/
    @RequestMapping("get")
    public String get(){

        return "one";
    }
    /*树页面*/
    @RequestMapping("aaa")
    public String aaa(){

        return "oneday";
    }
    /*故宫页面*/
    @RequestMapping("gugong")
    public String gugong(){

        return "GuGong";
    }
    /*长城页面*/
    @RequestMapping("changcheng")
    public String changcheng(){

        return "changcheng";
    }
    /*欢乐谷页面*/
    @RequestMapping("happy")
    public String happy(){

        return "happy";
    }


}
