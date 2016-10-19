package servlets;

import models.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by nik on 17.10.2016.
 */
public class LogIn extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = new User(5,"Andrew",1234567);
        req.setAttribute("userList", user.getUserList(user));
        req.getRequestDispatcher("views/Admin.jsp").forward(req, resp);
    }

}
