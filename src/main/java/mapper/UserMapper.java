package mapper;

import entity.Users;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface UserMapper {
//根据姓名查询（分页）
    //当name为空值是，传递的是空串
    @Select("SELECT u.*,t.name type_name FROM users u  JOIN" +
            "  user_type t ON u.`type_id`=t.`id` " +
            "WHERE u.`name` LIKE " +
            " CONCAT ('%',#{name},'%') LIMIT #{start}, #{pageSize}")
    public List<Users> getByNameAndPage(
            @Param ("name") String name,@Param("start") int start,@Param("pageSize") int pageSize);
    //根据姓名查询总页数
    @Select("SELECT COUNT(1) FROM users WHERE NAME LIKE  CONCAT ('%',#{name},'%')")
    public int getCountByNameAndPage(@Param("name") String name);
    //根据姓名和密码查询(登陆)
    @Select("select * from users where name=#{name} and password=#{password} ")
    public  Users login(@Param("name") String name,@Param("password") String password);


    @Update("update user set password=#{password} where id=#{id}")
    public int updatePassword(@Param("password") String password,@Param("id") int id);


}
