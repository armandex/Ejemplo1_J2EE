package com.aguinaga.armando.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletRespuesta
 */
public class ServletRespuesta extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletRespuesta() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		request.getRequestDispatcher("respuesta.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
    	float numeroUno;
    	float numeroDos;
    	float suma;
    	
    	numeroUno=Float.parseFloat(request.getParameter("txtNumeroUno"));
    	numeroDos=Float.parseFloat(request.getParameter("txtNumeroDos"));
    	suma = numeroUno + numeroDos;
    
    	request.setAttribute("respuestaSuma", String.valueOf(suma));
    	request.getRequestDispatcher("respuesta.jsp").forward(request, response);
	}

}
