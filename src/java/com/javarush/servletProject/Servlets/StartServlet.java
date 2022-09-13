package com.javarush.servletProject.Servlets;

import com.javarush.servletProject.User;
import com.javarush.servletProject.UserRepository;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "startServlet", value = "/start")
public class StartServlet extends HttpServlet {
    private UserRepository userRepository = null;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        ServletContext servletContext = config.getServletContext();
        userRepository = new UserRepository();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {

        String username = request.getParameter("username");

        HttpSession session = request.getSession();
        if (session.getAttribute("user") != null) {
            resp.sendRedirect("start.jsp");
            return;
        }

        User user;

        if (userRepository.isExists(username)) {
            user = userRepository.fetchByUsername(username);
        } else {

            user = new User();

            user.setUserName(username);

            userRepository.save(user);
        }
        session.setAttribute("username", user.getUserName());
        resp.sendRedirect("start.jsp");
    }
}
