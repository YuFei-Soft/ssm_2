package controller;

import entity.Users;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.UsersService;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Controller
public class UsersController {
    @Resource
    private UsersService usersService;
    @ResponseBody
    @RequestMapping("/login")
    public Map login(String name,String password){
        Map map=new HashMap();
        Users users=usersService.login(name,password);
        if(users==null){
            map.put("code","500");
            map.put("msg","该账户不存在！");
        }else if(!users.getPassword().equals(password)){
            map.put("code","500");
            map.put("msg","密码错误！");
        }else if(users.getStatus()==0){
            map.put("code","500");
            map.put("msg","该账户已经冻结！");
        }else{
            map.put("code","200");
            map.put("msg","登陆成功！");
        }
        return  map;
    }
}
