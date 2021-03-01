package cn.tedu.dao;

import cn.tedu.entity.Details;
import cn.tedu.utils.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DetailsDao {

    public List<Details> findAll(String id) {
        ArrayList<Details> list = new ArrayList<>();
        //获取连接
        try (Connection conn = DBUtils.getConn()){
            String sql = "select id,url from details limit ?,6";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1,(Integer.parseInt(id)-1)*6);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                int oid = rs.getInt(1);
                String url = rs.getString(2);
                list.add(new Details(oid,url));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
