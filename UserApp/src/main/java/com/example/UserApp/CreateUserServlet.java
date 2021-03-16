package com.example.UserApp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

@WebServlet("/addServlet")
public class CreateUserServlet extends HttpServlet {
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

        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        String email = req.getParameter("email");
        String password = req.getParameter("password");

        try {
            Statement statement = connection.createStatement();
            int result = statement.executeUpdate("insert into users values('"+ firstName+"','" + lastName + "','" + email + "','" + password + "')");

            PrintWriter out = resp.getWriter();

            if (result > 0) {
                out.println("<H1>User created</H1>");
            } else {
                out.println("<H1>Error creating user</H1>");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
