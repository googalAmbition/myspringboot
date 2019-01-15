package com.ctc.myspringboot.controller.sys;

import com.ctc.myspringboot.common.dto.AjaxResult;
import com.ctc.myspringboot.common.utils.ServletUtils;
import com.ctc.myspringboot.common.utils.StringUtils;
import com.ctc.myspringboot.common.utils.security.ShiroUtils;
import com.ctc.myspringboot.model.sys.Menu;
import com.ctc.myspringboot.model.sys.User;
import com.ctc.myspringboot.service.sys.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.List;

import static com.ctc.myspringboot.common.dto.AjaxResult.error;
import static com.ctc.myspringboot.common.dto.AjaxResult.success;


/**
 * @author ctc
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String login(HttpServletRequest request, HttpServletResponse response) {
        // 如果是Ajax请求，返回Json字符串。
        if (ServletUtils.isAjaxRequest(request)) {
            return ServletUtils.renderString(response, "{\"code\":\"1\",\"msg\":\"未登录或登录超时。请重新登录\"}");
        }
        return "login";
    }

    @PostMapping("/login")
    @ResponseBody
    public AjaxResult ajaxLogin(String username, String password, Boolean rememberMe) {
        UsernamePasswordToken token = new UsernamePasswordToken(username, password, rememberMe);
        Subject subject = SecurityUtils.getSubject();
        try {
            subject.login(token);
            return success();
        } catch (AuthenticationException e) {
            String msg = "用户或密码错误";
            if (StringUtils.isNotEmpty(e.getMessage())) {
                msg = e.getMessage();
            }
            return error(msg);
        }
    }

    @GetMapping("/index")
    public String index(Model model){
        User user = ShiroUtils.getUser();
        model.addAttribute("user", user);
        List<Menu> menus = userService.selectMenuByUserId(user.getUserId());
        model.addAttribute("menus",menus);
        model.addAttribute("copyrightYear",2019);
        //model.
        return "index";
    }

    @GetMapping("/unauth")
    public String unauth() {
        return "/error/unauth";
    }

}

