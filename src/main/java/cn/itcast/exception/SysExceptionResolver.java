package cn.itcast.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 时间：  2020/1/26
 * 创建者：  Administrator 钟文
 * 描述：   自定义异常处理器
 * 参数：
 * 返回值：
 **/
public class SysExceptionResolver implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest,
                                         HttpServletResponse httpServletResponse, Object o, Exception ex) {

        SysException e =null;
        if (ex instanceof  SysException){
          e =(SysException)ex;
      }else {
            e= new SysException("系统真正处理");
        }

        ModelAndView mv = new ModelAndView();
        mv.addObject("errorMsg",e.getMessage());
        mv.setViewName("error");


        return mv;
    }
}
