package cn.tedu.controller;

import cn.tedu.dao.ProductDao;
import cn.tedu.dao.TitleDao;
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

@WebServlet(name = "ProductServlet",urlPatterns = "/product")
public class ProductServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ProductDao dao = new ProductDao();
        List<Product> pList = dao.findTopSix();
        Context context = new Context();
        context.setVariable("pList",pList);
        TitleDao Tdao = new TitleDao();
        List<Title> list = Tdao.findAll();
        context.setVariable("list",list);
        ThUtils.print("product.html",context,response);
    }
}
