package cn.tedu.controller;

import cn.tedu.dao.DetailsDao;
import cn.tedu.dao.TitleDao;
import cn.tedu.entity.Details;
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

@WebServlet(name = "DetailsServlet",urlPatterns = "/details")
public class DetailsServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        DetailsDao dao = new DetailsDao();
        List<Details> dList = dao.findAll(id);
        System.out.println(dList);
        Context context = new Context();
        context.setVariable("dList",dList);

        TitleDao tDao = new TitleDao();
        List<Title> list = tDao.findAll();
        context.setVariable("list",list);

        ThUtils.print("details.html",context,response);
    }
}
