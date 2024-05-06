/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.ProductDAO;
import entity.Products;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Michael Dang
 */
public class CartControl extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            response.setContentType("text/html;charset=UTF-8");
            String pid = request.getParameter("pid");
            ProductDAO pdao = new ProductDAO();
            Products x = pdao.getObjectById(pid);
            int tf = 20000;
            int total = 0;
            int vat = 0;
            int it = 0;
            HttpSession session = request.getSession();
            ArrayList<Products> ds = (ArrayList<Products>) session.getAttribute("listCart");
            if (ds == null) {
                ds = new ArrayList<>();
                ds.add(x);
            } else {
                ds.add(x);
            }
            for (Products d : ds) {
                it+=d.getPrice();
                if(d.getDiscount()!=0){
                    request.setAttribute("thongBao", "Giá khi có khuyến mãi đã đc trừ vào giá tổng tiền hàng !");
                    it = it -(it*d.getDiscount()/100);
                }
            }
            session.setAttribute("listCart", ds);
            vat = it * 10 / 100;
            total = it + vat + tf;
            request.setAttribute("tf", tf);
            request.setAttribute("total", total);
            request.setAttribute("vat", vat);
            request.setAttribute("it", it);
            request.getRequestDispatcher("Cart.jsp").forward(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CartControl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CartControl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
