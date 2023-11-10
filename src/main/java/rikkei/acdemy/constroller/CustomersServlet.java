package rikkei.acdemy.constroller;

import rikkei.acdemy.model.Customers;
import rikkei.acdemy.service.CustomersServiceIMPL;
import rikkei.acdemy.service.ICustomersService;

import java.io.*;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "CustomersServlet", value = "/customers")
public class CustomersServlet extends HttpServlet {
    private ICustomersService customersService = new CustomersServiceIMPL();

    @Override
    public void init() {

    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create" :
                break;
            case "edit":
                break;
            case "delete" :
                break;
            case "view":
                break;
            default:
                listCustomers(request,response);
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action") ;
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create" :
                break;
            case "edit":
                break;
            case "delete" :
                break;
            default:
                break;
        }
    }

    @Override
    public void destroy() {

    }

    private void listCustomers(HttpServletRequest request, HttpServletResponse response){
        List<Customers> customers = this.customersService.findAll();
        request.setAttribute("customers", customers);

        RequestDispatcher dispatcher = request.getRequestDispatcher("customers/list.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e ) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}