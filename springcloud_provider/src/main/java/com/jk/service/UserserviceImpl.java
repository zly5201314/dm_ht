package com.jk.service;

import com.jk.mapper.UserMapper;
import com.jk.model.Tree;
import com.jk.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import java.util.HashMap;
import java.util.List;

/**
 * <pre>项目名称：springcloud
 * 类名称：UserserviceImpl
 * 类描述：
 * 创建人：张利瑶
 * 创建时间：2019/4/12 21:08
 * 修改人：张利瑶
 * 修改时间：2019/4/12 21:08
 * 修改备注：
 * @version </pre>
 */
@Controller
public class UserserviceImpl{

    @Autowired
    private UserMapper userMapper;


    @GetMapping(value = "/hi")
    @ResponseBody
    public String hiService(String name) {
        return "hi,"+name+",sorry,error!";
    }

    /*登录*/
    @GetMapping(value="/login")
    @ResponseBody
    public String login(@RequestParam("userNumber") String userNumber,@RequestParam("userPassword")String userPassword) {
        User user= userMapper.login(userNumber);

            if(user==null){

            return "3";
        }
        String password=userPassword;
        if(!user.getUserPassword().equals(password)){

            return "2";
        }
         return "1";
    }



    /*注册*/
    @RequestMapping(value="/regStu",method = RequestMethod.POST)
    @ResponseBody
    public String regStu(@RequestParam("userNumber") String userNumber,@RequestParam("userPassword")String userPassword) {
        userMapper.regStu(userNumber,userPassword);
        return "注册成功";
    }

    /*一日游页面*/
    @GetMapping(value="/queryUserList")
    @ResponseBody
    public List<User> queryUserList(){
        List<User> users = userMapper.queryUserList();
        System.out.println(users);
        return users;

    }
    /*树页面*/
    @GetMapping(value="/getTree")
    @ResponseBody
    public List<Tree> getTree() {
        int pid=0;
        List<Tree> list = findnode(pid);
        return list;
    }

    private List<Tree> findnode(@RequestParam("pid")int pid) {
        List<Tree> list=userMapper.findTreeById(pid);

        for (Tree tree : list) {
            Integer id = tree.getId();
            List<Tree> node=findnode(id);

            if(node.size()<=0){
                //没有节点的话可以点
                tree.setSelectable(true);
            }else{
                tree.setSelectable(false);
                tree.setNodes(node);
            }


        }
        return list;

    }

    /*故宫页面*/
    @GetMapping(value="/queryGuGong")
    @ResponseBody
    public List<User> queryGuGong(){
        return userMapper.queryGuGong();
    }
    /*长城页面*/
    @GetMapping(value="/queryChangCheng")
    @ResponseBody
    public List<User> queryChangCheng(){
        return userMapper.queryChangCheng();
    }
    /*欢乐谷页面*/
    @GetMapping(value="/queryHuanLeGe")
    @ResponseBody
    public List<User> queryHuanLeGe(){
        return userMapper.queryHuanLeGe();
    }

}
