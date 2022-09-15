package com.javarush.servletProject.Servlets;

import com.javarush.servletProject.UserRepository;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

    @WebListener
    public class AppContextListener implements ServletContextListener {

        @Override
        public void contextInitialized(ServletContextEvent servletContextEvent) {
            ServletContext ctx = servletContextEvent.getServletContext();
            ctx.setAttribute("userRepository", new UserRepository());

        }

        @Override
        public void contextDestroyed(ServletContextEvent servletContextEvent) {
            ServletContext ctx = servletContextEvent.getServletContext();

        }

    }
