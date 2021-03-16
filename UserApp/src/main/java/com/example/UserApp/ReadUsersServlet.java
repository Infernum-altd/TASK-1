package com.example.UserApp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

public class ReadUsersServlet extends HttpServlet {
    private Connection connection;
    @Override
    public void init(){
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbc-test", "postgres", "admin");

        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void destroy() {
        try {
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String email = req.getParameter("email");
        String password = req.getParameter("password");

        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from users");

            PrintWriter out = resp.getWriter();

            out.println("<table>");
            out.println("<tr>");
            out.println("<th>");
            out.println("First name");
            out.println("<th/>");
            out.println("<th>");
            out.println("Last name");
            out.println("<th/>");
            out.println("<th>");
            out.println("email");
            out.println("<th/>");
            out.println("</tr>");
            while (rs.next()) {
                out.println("tr");
                out.println("<td>");
                out.println(rs.getString(1));
                out.println("</td>");
                out.println("<td>");
                out.println(rs.getString(2));
                out.println("</td>");
                out.println("<td>");
                out.println(rs.getString(3));
                out.println("</td>");
                out.println("</tr>");
            }
            out.println("</table>");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
