package entity;

import java.util.Date;

public class Users {
    private Integer id;
    private String name;
    private String password;
    private Integer status;
    private Date last_modify_time;
    private Integer type_id;
    private String type_name;

    public String getType_name() {
        return type_name;
    }

    public void setType_name( String type_name ) {
        this.type_name = type_name;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", status=" + status +
                ", last_modify_time=" + last_modify_time +
                ", type_id=" + type_id +
                '}';
    }

    public Users() {
    }

    public Users( Integer id, String name, String password, Integer status, Date last_modify_time, Integer type_id ) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.status = status;
        this.last_modify_time = last_modify_time;
        this.type_id = type_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId( Integer id ) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword( String password ) {
        this.password = password;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus( Integer status ) {
        this.status = status;
    }

    public Date getLast_modify_time() {
        return last_modify_time;
    }

    public void setLast_modify_time( Date last_modify_time ) {
        this.last_modify_time = last_modify_time;
    }

    public Integer getType_id() {
        return type_id;
    }

    public void setType_id( Integer type_id ) {
        this.type_id = type_id;
    }
}
