package work.com;
import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Zadanie1Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		resp.setCharacterEncoding("UTF-8");
		double n = 0, m = 0;
		boolean corr = true;
		try {
			n = Double.parseDouble(req.getParameter("N"));
			m = Double.parseDouble(req.getParameter("M"));
		} catch (NumberFormatException e) {

			corr = false;
		}
		if (corr) {
			if (Math.abs(n - 10) > Math.abs(m - 10)) {
				resp.getWriter().println("Ближайшее к десяти число: " + m);
			} else if (Math.abs(n - 10) < Math.abs(m - 10)) {
				resp.getWriter().println("Ближайшее к десяти число: " + n);
			} else {
				resp.getWriter().println(n + " и " + m + " одинаково близки к десяти");
			}
		}
		else {
			resp.getWriter().println("Ближайшее к десяти число:");			
		}
	}

public void doGet1(HttpServletRequest req, HttpServletResponse resp)
		throws IOException {
	resp.setContentType("text/plain");
	resp.setCharacterEncoding("UTF-8");
	double a = 0, b = 0, c = 0;
	boolean corr = true;
	try {
		a = Double.parseDouble(req.getParameter("A"));
		b = Double.parseDouble(req.getParameter("B"));
		c = Double.parseDouble(req.getParameter("C"));
	} catch (NumberFormatException e) {

		corr = false;
	}
	if (corr) {
		if(a==0 && b!=0){
			resp.getWriter().print("x="+ -c/b);
		}
		else if(a==0 && b==0 && c!=0){
			resp.getWriter().print("Ýòî íè÷óòü íå ïîõîæå íà óðàâíåíèå");
		}
		else if(a==0 && b==0 && c==0){
			resp.getWriter().print("x - ëþáîå ÷èñëî");
		}
		else{
			double d = b * b - 4 * a * c;
			if(d>0){
				resp.getWriter().print("x<sub>1</sub>="+ (-b + Math.sqrt(d))/(2*a) + "<br>" + ("x<sub>2</sub>=" + (-b - Math.sqrt(d))/(2*a)));
			}
			else if(d==0){
				resp.getWriter().print("x<sub>1</sub>=x<sub>2</sub>="+ (-b)/(2*a));
			}
			else {
				resp.getWriter().print("Óðàâíåíèå íå èìååò êîðíåé");
			}
		}
	} else {
		resp.getWriter().println("Ââåäèòå êîððåêòíûå ÷èñëà");
	}

}

}