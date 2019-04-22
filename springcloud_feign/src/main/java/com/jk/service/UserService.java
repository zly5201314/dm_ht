package com.jk.service;

import com.jk.model.Tree;
import com.jk.model.User;
import com.jk.util.SchedualServiceHiHystric;
import com.sun.org.apache.bcel.internal.generic.Select;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.HashMap;
import java.util.List;

/**
 * <pre>项目名称：dm_springcloud
 * 类名称：UserService
 * 类描述：
 * 创建人：张利瑶
 * 创建时间：2019/4/15 19:12
 * 修改人：张利瑶
 * 修改时间：2019/4/15 19:12
 * 修改备注：
 * @version </pre>
 */
@FeignClient(value = "SERVICE-PROVIDER",fallback = SchedualServiceHiHystric.class)
public interface UserService extends UserServiceApi{

 /*登录*/
    @GetMapping("/login")
   String login(@RequestParam("userNumber") String userNumber,@RequestParam("userPassword")String userPassword);


    /*一日游页面*/
    @GetMapping("/queryUserList")
    List<User> queryUserList();


 /*注册*/
    @PostMapping("/regStu")
    String regStu(@RequestParam("userNumber") String userNumber,@RequestParam("userPassword")String userPassword);

    /*树页面*/
    @GetMapping("/getTree")
    List<Tree> getTree();
    /*故宫页面*/
    @GetMapping("/queryGuGong")
    List<User> queryGuGong();
    /*长城页面*/
    @GetMapping("/queryChangCheng")
    List<User> queryChangCheng();
    /*欢乐谷页面*/
    @GetMapping("/queryHuanLeGe")
    List<User> queryHuanLeGe();


}
