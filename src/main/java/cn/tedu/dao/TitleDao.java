package cn.tedu.dao;

import cn.tedu.entity.Title;
import cn.tedu.utils.DBUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TitleDao {
    public List<Title> findAll() {
        ArrayList<Title> list = new ArrayList<>();
        //获取连接
        try (Connection conn = DBUtils.getConn()){
            String sql = "select id,name,url from title";
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery(sql);
            while (rs.next()){
                int id = rs.getInt(1);
                String name = rs.getString(2);
                String url = rs.getString(3);
                list.add(new Title(id,name,url));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
