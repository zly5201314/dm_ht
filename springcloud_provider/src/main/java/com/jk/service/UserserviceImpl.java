package com.jk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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

    @GetMapping(value = "/hi")
    @ResponseBody
    public String hiService(String name) {
        return "hi,"+name+",sorry,error!";
    }


}
