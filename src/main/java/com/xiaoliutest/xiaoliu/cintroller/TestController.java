package com.xiaoliutest.xiaoliu.cintroller;
import com.alibaba.fastjson.JSON;
import com.xiaoliutest.xiaoliu.service.JedisService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author xiaoliu
 * @date 2020/4/1 15:16
 */
@RestController
public class TestController {
    @Autowired
    JedisService jedisService;
    @RequestMapping(value = "/{id}/testapi",method = RequestMethod.GET)
    @ResponseBody
    public String testAPI(@PathVariable("id") String id){
        System.out.println("id:"+id);
        jedisService.saveInt(id);

         return id;
    };

}
