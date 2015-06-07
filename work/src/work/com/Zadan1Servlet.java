package work.com;
import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Zadan1Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		int[][] mas = new int[8][5];
		resp.getWriter().println("<table border=1");
		for(int i=0;i<8;i++)
		{
			resp.getWriter().print("<tr>");
			for(int j=0;j<5;j++)
			{
				mas[i][j] = ((int)(Math.floor(Math.random()*90)+10));
				resp.getWriter().print("<th>"+ mas[i][j] + "</th>");
			}
			resp.getWriter().print("</tr>");
		}
		resp.getWriter().println("</table>");
			
	}
}