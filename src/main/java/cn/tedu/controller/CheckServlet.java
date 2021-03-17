package cn.tedu.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CheckServlet",urlPatterns = "/check")
public class CheckServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String tel = request.getParameter("tel");
        String comments = request.getParameter("comments");
        response.setContentType("text/html;charset=utf-8");
        if (name ==""){
            response.getWriter().print("您的称呼不能为空");
        }
        if (tel==""){
            response.getWriter().print("您的联系方式不能为空");
        }
        if (comments==""){
            response.getWriter().print("您的意见不能为空");
        }else{
            return;
        }
    }
}
