package cn.tedu.entity;

public class Contact {
    private int id;
    private String name;
    private String tel;
    private String comments;
    private String update_time;

    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tel=" + tel +
                ", comments='" + comments + '\'' +
                ", Create_time='" + update_time + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(String update_time) {
        this.update_time = update_time;
    }

    public Contact(int id, String name, String tel, String comments, String update_time) {
        this.id = id;
        this.name = name;
        this.tel = tel;
        this.comments = comments;
        this.update_time = update_time;
    }
}