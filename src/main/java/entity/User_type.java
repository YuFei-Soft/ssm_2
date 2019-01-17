package entity;

public class User_type {
    private  Integer id;
    private  String name;

    @Override
    public String toString() {
        return "User_type{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public User_type() {
    }

    public User_type( Integer id, String name ) {
        this.id = id;
        this.name = name;
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
}
