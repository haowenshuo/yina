package cn.tedu.dao;

import cn.tedu.entity.Contact;
import cn.tedu.utils.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ContactDao {
    public void add(Contact contact) {
        //获取连接
        try (Connection conn = DBUtils.getConn()){
            String sql = "insert into message values(null,?,?,?,null)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,contact.getName());
            ps.setString(2,contact.getTel());
            ps.setString(3,contact.getComments());
            ps.executeUpdate();
            System.out.println("添加完成");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
