package servlets;

import db.DBManager;
import db.Footballer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(value = "/index")
public class IndexServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<Footballer> footballers = DBManager.getFootballers();
        PrintWriter out = response.getWriter();
        out.print("<h1>List Footballers</h1>");
        for (Footballer fb : footballers) {
            out.print("<h3 style='color:green'>" + fb.getName() + " " + fb.getSurname() + "</h3>");
            out.print("<p style ='color:blue'>Club " + fb.getClub() + "</p>");
            out.print("<p style ='color:red'>Salary " + fb.getSalary() + " EUR</p>");
            out.print("<p style ='color:red'>Transfer Price " + fb.getTransferPrice() + " EUR</p>");
            out.print("<br>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
