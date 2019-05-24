package indi.joynic.joodoo.websupport;

import indi.joynic.joodoo.websupport.http.UrlUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Portal of the Web Application
 *
 */
/*@WebServlet(name = "portalServlet", urlPatterns = "/**", loadOnStartup = 1,
        initParams = { @WebInitParam(name = "key1", value = "val1") },
        asyncSupported = true
)*/
public class PortalServlet extends HttpServlet {

    private static final Logger logger = LoggerFactory.getLogger(PortalServlet.class);

    /*@Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException
    {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Hello World!</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Hello World!</h1>");
        out.println("</body>");
        out.println("</html>");
    }*/

    @Override
    public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        logger.info("service!");

        // path 责任链
        //

        // DISPATCH!
        resp.getWriter().println(UrlUtil.extractRequestUri(req));
    }
}