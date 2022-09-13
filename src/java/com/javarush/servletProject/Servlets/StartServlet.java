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

        userRepository = (UserRepository) servletContext.getAttribute("userRepository");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {

        String username = request.getParameter("username");

        HttpSession session = request.getSession();

        Integer count = (Integer) session.getAttribute("count");

        User user;

        if (userRepository.isExists(username)) {

            user = userRepository.fetchByUsername(username);

            user.setAttempts(user.getAttempts()+1);

            session.setAttribute("count", user.getAttempts());
        } else {

            session.setAttribute("count", 1);

            user = new User();

            user.setAttempts(1);

            user.setUserName(username);

            userRepository.save(user);
        }

        session.setAttribute("user", user.getUserName());

        resp.sendRedirect("start.jsp");
    }
}
