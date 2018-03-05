package com.zp.test.controller;

import com.zp.test.constant.Constant;
import com.zp.test.domain.User;
import com.zp.test.service.impl.UserServiceImpl;
import com.zp.test.util.Helper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class UserController {
    @Autowired
    UserServiceImpl userService;

    @RequestMapping(value = "/easyUITest",method ={RequestMethod.GET,RequestMethod.POST} )
    public  String easyUITest(){
        return "test";
    }

    @RequestMapping(value = "/getUser",method ={RequestMethod.GET,RequestMethod.POST} )
    @ResponseBody
    public Map getUser (User user){
        try {
            List<User> userList= userService.getUser(user);
            return Helper.getInstance().notPagingResult(userList,userList.size());
        }catch (Exception e)
        {
            e.printStackTrace();
            return Helper.getInstance().errorJsonResultMap(Constant.SERVER_ERROR);
        }
    }
    @RequestMapping(value = "/addUser",method ={RequestMethod.GET,RequestMethod.POST} )
    @ResponseBody
    public Map addUser (User user){
        try {
             userService.addUser(user);
            return Helper.getInstance().successJsonResultMap("操作成功");
        }catch (Exception e)
        {
            e.printStackTrace();
            return Helper.getInstance().errorJsonResultMap(Constant.SERVER_ERROR);
        }
    }
    @RequestMapping(value = "/editUser",method ={RequestMethod.GET,RequestMethod.POST} )
    @ResponseBody
    public Map editUser (User user){
        try {
            userService.editUser(user);
            return Helper.getInstance().successJsonResultMap("操作成功");
        }catch (Exception e)
        {
            e.printStackTrace();
            return Helper.getInstance().errorJsonResultMap(Constant.SERVER_ERROR);
        }
    }
    @RequestMapping(value = "/delUser",method ={RequestMethod.GET,RequestMethod.POST} )
    @ResponseBody
    public Map delUser (User user){
        try {
            userService.delUser(user);
            return Helper.getInstance().successJsonResultMap("操作成功");
        }catch (Exception e)
        {
            e.printStackTrace();
            return Helper.getInstance().errorJsonResultMap(Constant.SERVER_ERROR);
        }
    }
}
