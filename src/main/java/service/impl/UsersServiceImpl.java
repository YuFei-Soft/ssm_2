package service.impl;

import entity.Users;
import mapper.UserMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import service.UsersService;
import util.PageBean;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class UsersServiceImpl implements UsersService {
    @Resource
    private UserMapper userMapper;
    @Override
    public PageBean<Users> getByPage( String name, Integer pageNo ) {
        PageBean<Users> pb=new PageBean<Users>();
        int count = userMapper.getCountByNameAndPage(name);
        if(count>0){
          pb.setPageNo(pageNo);
          pb.setTotalCount(count);
            List<Users> list= userMapper.getByNameAndPage(name, pb.getStart(), pb.getPageNo());
            pb.setList(list);
        }
        return pb;
    }

    @Override
    public Users login( String name, String password ) {
        return userMapper.login(name,password);
    }

    @Override
    public boolean updatePwd( String oldPwd, String newPwd, int id ) {
        return userMapper.updatePassword(newPwd,id)==1;
    }




}
