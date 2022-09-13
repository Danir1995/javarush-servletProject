package com.javarush.servletProject.Servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(name = "deathFromDogs", value = "/loser")
public class DeathByDogs extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter printWriter = resp.getWriter();
        HttpSession session = req.getSession();
        printWriter.println("<html>");
        printWriter.println("<head>");
        printWriter.println("<link href=\"style.css\" rel=\"stylesheet\">\n");
        printWriter.println("</head>");
        printWriter.println("<p>Your scream has been heard, three hellhounds came to eat you.<p>");
        printWriter.println("<p><IMG class=\"displayed\" src = \"https://st3.depositphotos.com/1695244/32109/i/600/depositphotos_321091354-stock-photo-trio-black-anubis-hounds-hellhound.jpg\" width = \"400\" height = \"256\">\n</p>");
        printWriter.println("<p>YOU LOSE<p>");
        printWriter.println("<p>START AGAIN?</p>");
        printWriter.println("<p>User name is " + session.getAttribute("user") + "Number of attempts: " + session.getAttribute("count") + "</p>");
        printWriter.println("<button class=\"btn\" onclick=\"window.location='./index.jsp'\">YES</button>\n");
        printWriter.println("</html>");
    }
}
