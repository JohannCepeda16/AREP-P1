package edu.escuelaing.arep;

import edu.escuelaing.arep.server.HttpServer;

public class App {
    public static void main(String[] args) {
        try {
            HttpServer.getInstance().startServer(args);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
