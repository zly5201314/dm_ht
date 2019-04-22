package com.jk.controller;

import com.jk.model.Tree;
import com.jk.model.User;
import com.jk.service.UserService;
import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <pre>项目名称：dm_springcloud
 * 类名称：UserController
 * 类描述：
 * 创建人：张利瑶
 * 创建时间：2019/4/15 19:07
 * 修改人：张利瑶
 * 修改时间：2019/4/15 19:07
 * 修改备注：
 * @version </pre>
 */
@RestController
public class UserController {

    @Autowired
    private UserService userservice;

    @Autowired
    private SolrClient client;


    @GetMapping(value = "/hi")
    public String hi(@RequestParam String name) {

        return userservice.hiService( name );
    }

    /*登录*/
    @GetMapping("/login")
    public String login(@RequestParam("userNumber") String userNumber,@RequestParam("userPassword")String userPassword){
        return userservice.login(userNumber,userPassword);
    }

    /*注册*/
    @PostMapping("/regStu")
    public String regStu(@RequestParam("userNumber") String userNumber,@RequestParam("userPassword")String userPassword){
        return userservice.regStu(userNumber,userPassword);
    }


   /* 查询主页面*/
    @GetMapping("/queryOne")
    public List<User>  queryUserList(){
        List<User> list=new ArrayList<>();
        list=  userservice.queryUserList();
        System.out.println(list);
        return list;
    }
    /* 查询树*/
    @GetMapping("/getTree")
   public List<Tree> getTree(){

        return userservice.getTree();
    }
    /* 查询故宫*/
    @GetMapping("/queryGuGong")
    public List<User>  queryGuGong(){
        List<User> list=new ArrayList<>();
        list=  userservice.queryGuGong();
        System.out.println(list);
        return list;
    }
    /* 查询长城*/
    @GetMapping("/queryChangCheng")
    public List<User>  queryChangCheng(){
        List<User> list=new ArrayList<>();
        list=  userservice.queryChangCheng();
        System.out.println(list);
        return list;
    }
   /* 查询欢乐谷*/
    @GetMapping("/queryHuanLeGe")
    public List<User>  queryHuanLeGe(){
        List<User> list=new ArrayList<>();
        list=  userservice.queryHuanLeGe();
        System.out.println(list);
        return list;
    }


    //slor
    @GetMapping("/search")
    public List<User> userlist(User user) throws IOException, SolrServerException {
        //因为使用easyui返回数据
        Map<String,Object> mSolr=new HashMap<String,Object>();

        //把所有查询的高亮显示内容发到list中
        List<User> carList=new ArrayList<>();
        //查询条件的对象
        SolrQuery params = new SolrQuery();
        //判断前台传递的关键字是否为空
        if(!"".equals(user.getUserName()) && user.getUserName()!=null ){
            //不为空设置条件为关键字
            params.set("q", user.getUserName());
        }else if (!"".equals(user.getInfo()) && user.getInfo()!=null ){
            params.set("q", user.getInfo());
        }else if(!"".equals(user.getPrice()) && user.getPrice()!=null ){
            params.set("q", user.getPrice());
        }else{//如果为空查询所有
            params.set("q", "*:*");
        }
        //默认查询字段  一般默认指定
        params.set("df", "userName");
        //指定查询结果返回哪些字段
        params.set("fl", "id,userName,info,price,img");
        // 设置高亮字段
        params.addHighlightField("userName"); // 高亮字段
        //分页
       /* if(page==null){
            params.setStart(0);
        }else {
            params.setStart((page-1)*rows);
        }
        if(rows==null){
            params.setRows(5);
        }else {
            params.setRows(rows);
        }*/
        //高亮
        //打开开关
        params.setHighlight(true);
        //设置前缀
        params.setHighlightSimplePre("<div style='color:red'>");
        //设置后缀
        params.setHighlightSimplePost("</div>");
        //QueryResponse是查询返回的对象数据   client.query("core1",params)  查询的是哪个索引库和条件
        QueryResponse queryResponse = client.query("core1",params);
        ///查询返回的结果list对象   不包括高亮
        SolrDocumentList results = queryResponse.getResults();
        //查询出来总条数
        long numFound = results.getNumFound();
        //查询返回的高亮结果
        Map<String, Map<String, List<String>>> highlight = queryResponse.getHighlighting();
        //循环查询的所有结果
        for (SolrDocument result : results) {
            //创建对象接收循环的对象数据
            User user1=new User();
            //设置高亮的字段
            String highname="";
            //根据id获得高亮的内容
            Map<String, List<String>> map = highlight.get(result.get("id"));
            //根据高亮字段拿到数据
            List<String> list = map.get("userName");
            //判断数据是否为空
            if(list==null){
                //如果为空把普通字段放到对象中
                highname=(String)result.get("userName");
            }else{
                //获得高亮字段查询的值放到变量
                highname=list.get(0);
            }
            ;
            user1.setId(Integer.parseInt((String) result.get("id")));
            user1.setUserName(highname);
            user1.setImg((String) result.get("img"));
            user1.setInfo((String) result.get("info"));
            user1.setPrice((int)result.get("price"));
            user1.setUserDate((String) result.get("userDate"));
            carList.add(user1);
        }
        mSolr.put("total",numFound);
        mSolr.put("rows",carList);
        System.out.println(mSolr);
        return carList;
    }


}
