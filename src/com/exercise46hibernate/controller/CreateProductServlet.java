package com.exercise46hibernate.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.exercise46hibernate.model.Product;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

/**
 * Servlet implementation class CreateProductServlet
 */
@WebServlet("/CreateProductServlet")
public class CreateProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//setear
		response.setContentType("aplication/json charset='utf-8'");
		PrintWriter output= response.getWriter();
		
		//objeto de persistencia o POJO
		Product myProduct = new Product();
		myProduct.setNameProduct(request.getParameter("txtNameProduct"));
		myProduct.setPriceProduct((Double.parseDouble(request.getParameter("txtPriceProduct"))));
		
		
		String JsonString= request.getParameter("txtJson");
		
		//serializa a json o descerealiza a json
		Gson myGson= new Gson();	//objeto 1 serializacion con gson
		
		ObjectMapper myMapper = new ObjectMapper();
		Product myProduct2 = new Product();
	
		Product myProduct3 = new Product();		//objeto 3 libreria jackson 
		
		myProduct2 = myGson.fromJson(JsonString, Product.class);	//descerializacion de json
		
		myProduct3 = myMapper.readValue(JsonString, Product.class);		//jackson
		
		System.out.println("myProduct2 content: "+ myProduct2.toString());
		
		System.out.println("myProduct3 content: "+ myProduct3.toString());	//jackson
		
		output.append(myGson.toJson(myProduct));
		
		output.append(myMapper.writeValueAsString(myProduct3));
		
		System.out.println(myProduct.toString());
		/*
		//crear el objeto de configuracion
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		//crear el objeto de sesion
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		
		
		//abrir la sesión
		Session session =sessionFactory.openSession();
		
		//iniciar el request
		Transaction t = session.beginTransaction();
		session.persist(myProduct);
		
		//cerramos la conexion
		session.close();
		
		
		System.out.println("Se guardaron los datos");
		
		*/
		output.close();
	}

}
