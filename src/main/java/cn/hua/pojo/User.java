package cn.hua.pojo;

public class User {
    private int u_id;
    private String u_username;
    private String u_password;
    private String u_member;

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "u_id=" + u_id +
                ", u_username='" + u_username + '\'' +
                ", u_password='" + u_password + '\'' +
                ", u_member='" + u_member + '\'' +
                '}';
    }

    public int getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    public String getU_username() {
        return u_username;
    }

    public void setU_username(String u_username) {
        this.u_username = u_username;
    }

    public String getU_password() {
        return u_password;
    }

    public void setU_password(String u_password) {
        this.u_password = u_password;
    }

    public String getU_member() {
        return u_member;
    }

    public void setU_member(String u_member) {
        this.u_member = u_member;
    }

    public User(int u_id, String u_username, String u_password, String u_member) {
        this.u_id = u_id;
        this.u_username = u_username;
        this.u_password = u_password;
        this.u_member = u_member;
    }
}
