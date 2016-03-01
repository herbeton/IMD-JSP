package aula06.encontro;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import aula06.encontro.modelo.SistemaEncontros;

public class ContextListener implements ServletContextListener {
	public static final String SISTEMA_ENCONTROS = "sistemaEncontros";
    public void contextInitialized(ServletContextEvent event) {
          ServletContext context = event.getServletContext();
          context.setAttribute("SISTEMA_ENCONTROS", new SistemaEncontros());
    }

    public void contextDestroyed(ServletContextEvent event) {
          ServletContext context = event.getServletContext();
          context.removeAttribute("SISTEMA_ENCONTROS");
    }
}
