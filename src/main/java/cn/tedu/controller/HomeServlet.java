package cn.tedu.controller;

import cn.tedu.dao.BannerDao;
import cn.tedu.dao.ProductDao;
import cn.tedu.dao.TitleDao;
import cn.tedu.entity.Banner;
import cn.tedu.entity.Product;
import cn.tedu.entity.Title;
import cn.tedu.utils.ThUtils;
import org.thymeleaf.context.Context;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "HomeServlet",urlPatterns = "/home")
public class HomeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        TitleDao dao = new TitleDao();
        List<Title> list = dao.findAll();
        Context context = new Context();
        context.setVariable("list",list);

        //创建并查询出所有banner
        BannerDao bDao = new BannerDao();
        List<Banner> bList = bDao.findAll();
        System.out.println(bList);
        context.setVariable("bList",bList);

        //创建并查询所有瀑布流图片
        ProductDao pDao = new ProductDao();
        List<Product> plist = pDao.findAll();
        System.out.println(plist);
        context.setVariable("plist",plist);
        ThUtils.print("home.html",context,response);
    }
}
