package com.automationedge.kshitij;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletHandler;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception {
        Server server = new Server(9090);

        ServletHandler handler = new ServletHandler();
        handler.addServletWithMapping(CustomServletHandler.class, "/ping");
        handler.addFilterWithMapping(CORSFilter.class, "/*", 1);
        server.setHandler(handler);
        server.start();
        server.join();
    }
}
