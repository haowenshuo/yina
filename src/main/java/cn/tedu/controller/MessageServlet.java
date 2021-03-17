package cn.tedu.controller;

import cn.tedu.dao.ContactDao;
import cn.tedu.entity.Contact;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "MessageServlet",urlPatterns = "/message")
public class MessageServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String name = request.getParameter("name");
        String tel = request.getParameter("tel");
        String comments = request.getParameter("comments");
        if (name=="" || tel=="" || comments=="") {
            response.sendRedirect("/contact");
            return;
        }else {
            Contact contact = new Contact(0, name, tel, comments, null);
            ContactDao cDao = new ContactDao();
            cDao.add(contact);
            response.sendRedirect("success.html");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}