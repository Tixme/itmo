package work.com;
import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Zada1Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		resp.setCharacterEncoding("UTF-8");
		int[][] mas = new int[5][8];
		resp.getWriter().println("<table border=1");
		for(int i=0;i<5;i++)
		{
			resp.getWriter().print("<tr>");
			for(int j=0;j<8;j++)
			{
				mas[i][j] = ((int)(Math.floor(Math.random()*199)-99));
				resp.getWriter().print("<th>"+ mas[i][j] + "</th>");
			}
			resp.getWriter().print("</tr>");
		}
			
		int min,max;
		max = mas[0][0];
		min = mas[0][0];
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<8;j++)
			{
				if(min>mas[i][j])
					min=mas[i][j];
				if(max<mas[i][j])
					max=mas[i][j];
			}
		}
		resp.getWriter().print("<tr><th colspan=8>Максимальный: "+ max + "<br>Минимальный: " + min + "</th></tr>");
		resp.getWriter().println("</table>");
	}

}

