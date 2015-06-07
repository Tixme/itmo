package work.com;
import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Zadani1Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
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
				resp.getWriter().print("");
			}
			else if(a==0 && b==0 && c==0){
				resp.getWriter().print("x - любое число");
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
					resp.getWriter().print("Уравнение не имеет корней");
				}
			}
		} else {
			resp.getWriter().println();
		}
	}
}

