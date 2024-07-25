package chap02.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/fshop")
public class FruitShopServlet extends HttpServlet {
	
	// 해당 서블릿으로 GET 방식 요청이 들어오면 doGet()에서 처리한다.
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// form으로 요청 보낸 데이터들을 요청 객체의 getParameter("name") 메서드로 꺼낼 수 있다.(input 태그에서 설정한 name)
		// getParameter()는 어떤 데이터를 보내든 간에 일단은 문자열로 꺼내게 된다.
		String fname = req.getParameter("fname");
		String fprice = req.getParameter("fprice");
		
		System.out.println("도착한 과일 이름: " + fname);
		System.out.println("도착한 과일 가격: " + fprice);
	}
	
	// POST 방식 요청은 doPost()에 도착한다.
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("POST 방식 요청입니다~!");
		
		String fcolor = req.getParameter("fcolor");
		String fname = req.getParameter("fname");
		
		System.out.println("사용자가 고른 색: " + fcolor);
		System.out.println("사용자가 고른 과일: " + fname);
	}
}
