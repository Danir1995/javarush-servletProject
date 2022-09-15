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

@WebServlet(name = "Items", value = "/takeItem")
public class TakeItemsServlet extends HttpServlet {
    private UserRepository userRepository = null;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        ServletContext servletContext = config.getServletContext();
        userRepository = (UserRepository) servletContext.getAttribute("userRepository");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession();
        String item = req.getParameter("item");
        User user = (User) session.getAttribute("user");

        if (userRepository.isExists(user.getUserName())) {
            user = userRepository.fetchByUsername(user.getUserName());
            user.addItems(item);
        } else {
            throw new RuntimeException("user doesn't exist.");
        }
        if (item.equals("medicine")) {
            resp.sendRedirect("shop.jsp");
        }else if (item.equals("gun")){
            resp.sendRedirect("deathByDogs.jsp");
        }
        switch (item){
            case "medicine": resp.sendRedirect("shop.jsp");
            case "gun": resp.sendRedirect("/street");
        }

    }
}
