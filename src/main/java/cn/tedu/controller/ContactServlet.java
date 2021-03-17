package cn.tedu.controller;

import cn.tedu.dao.ContactDao;
import cn.tedu.dao.TitleDao;
import cn.tedu.entity.Contact;
import cn.tedu.entity.Title;
import cn.tedu.utils.ThUtils;
import org.thymeleaf.context.Context;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ContactServlet",urlPatterns = "/contact")
public class ContactServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        TitleDao dao = new TitleDao();
        List<Title> list = dao.findAll();
        Context context = new Context();
        context.setVariable("list",list);
        ThUtils.print("contact.html",context,response);


    }
}
