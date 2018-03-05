package com.zp.test.util;

import com.zp.test.constant.Constant;

import java.util.HashMap;
import java.util.Map;

public class Helper {
    private static Helper instance ;

    private Helper(){

    }

    public static Helper getInstance(){
        if (instance == null) {
            synchronized (Helper.class){
                if (instance == null) {
                    instance = new Helper() ;
                }
            }
        }
        return instance ;
    }
    /**
     * 不分页的返回
     * @param object 返回的对象
     * @param size 总条数
     * @return json
     */
    public Map<String,Object> notPagingResult(Object object,int size)
    {
        Map<String,Object> map=new HashMap<>(5);
        map.put("status",Constant.OK);
        map.put("code","");
        map.put("msg",Constant.QUERY_SUCCESS);
        map.put("rows",object);
        map.put("total",size);
        return  map;
    }
    /**
     * @param object 返回的对象 或者list
     * @param successMsg 返回的附加信息
     * @return successMsg
     */
    public Map<String,Object> successJsonResultMap(Object object, String ... successMsg)
    {
        Map<String,Object> map=new HashMap<>(4);
        map.put("code","");
        map.put("status", Constant.OK);
        map.put("data",object);
        if(successMsg.length>0)
        {
            map.put("msg",successMsg[0]);
        }else {
            map.put("msg","");
        }
        return  map;
    }
    /**
     * @param code 错误代码
     * @param errorMsg 占位符对应的值
     * @return errorJResult
     */
    public Map<String,Object> errorJsonResultMap(String code,Object ... errorMsg)
    {
        Map<String,Object> map=new HashMap<>(3);
        map.put("code",code);
        map.put("status",Constant.ERROR);
        if(errorMsg.length>0)
        {
            map.put("msg",errorMsg[0]);
        }else {
            map.put("msg","");
        }
        return  map;
    }
}
