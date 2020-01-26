package cn.itcast.controller;

import cn.itcast.exception.SysException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 时间：  2020/1/26
 * 创建者：  Administrator 钟文
 * 描述：
 * 参数：
 * 返回值：
 **/
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/testException")
    public String testException() throws Exception {
        System.out.println("testException 执行了");

        try {
            int a =10/0;
        } catch (Exception e) {
            e.printStackTrace();
            throw  new SysException("查询发生了异常");
        }


        return "success";
    }
}
