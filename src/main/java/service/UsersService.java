package service;

import entity.Users;
import util.PageBean;

public interface UsersService {
    //分页查询
    public PageBean<Users> getByPage(String name,Integer pageNo);

    //登陆
    public  Users login(String name,String password);

    //修改密码
    public boolean updatePwd(String oldPwd,String newPwd,int id);
}
