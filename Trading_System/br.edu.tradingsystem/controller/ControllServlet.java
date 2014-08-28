package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Controll;

@WebServlet(asyncSupported = true, urlPatterns={"/index"})
public class ControllServlet extends HttpServlet {
private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		service(request, response);
	}

	@Override
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String param = request.getParameter("classe");

		String nomeClasse = "controller." + param;

		try {

			Class classe = Class.forName(nomeClasse);

			Controll controll = (Controll) classe.newInstance();

			String pagina = controll.execute(request, response);

			request.getRequestDispatcher(pagina).forward(request, response);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {

			e.printStackTrace();
		} catch (IllegalAccessException e) {

			e.printStackTrace();
		}

	}

}
