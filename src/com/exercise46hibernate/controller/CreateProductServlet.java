package com.exercise46hibernate.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.exercise46hibernate.model.Product;

/**
 * Servlet implementation class CreateProductServlet
 */
@WebServlet("/CreateProductServlet")
public class CreateProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//setear
		response.setContentType("text/html charset='utf-8'");
		PrintWriter output= response.getWriter();
		
		//objeto de persistencia o POJO
		Product myProduct = new Product();
		
		myProduct.setNameProduct(request.getParameter("txtNameProduct"));
		
		myProduct.setPriceProduct((Double.parseDouble(request.getParameter("txtPriceProduct"))));
		
		System.out.println(myProduct.toString());
		
		
		output.close();
	}

}
