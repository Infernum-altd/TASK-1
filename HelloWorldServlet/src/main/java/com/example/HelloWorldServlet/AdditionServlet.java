package com.example.HelloWorldServlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class AdditionServlet extends GenericServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

        if (req.getParameter("number1") != null && req.getParameter("number2") !=null) {
            int num1 = Integer.parseInt(req.getParameter("number1"));
            int num2 = Integer.parseInt(req.getParameter("number2"));

            PrintWriter out = res.getWriter();
            out.println("The result is" + (num1 + num2));
        }

    }
}
