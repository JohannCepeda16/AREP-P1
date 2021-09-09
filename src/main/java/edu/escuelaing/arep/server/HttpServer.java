package edu.escuelaing.arep.server;

import java.net.*;
import java.io.*;

public class HttpServer {

    private static HttpServer _instance = new HttpServer();

    public String startServer(String[] args) throws IOException {

        StringBuilder result = new StringBuilder();
        URL url = new URL("http://localhost:8080/" + args[0] + "-" + args[1]);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            for (String line; (line = reader.readLine()) != null;) {
                result.append(line);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Ha ocurrido un error");
        }
        System.out.println(result.toString());
        return result.toString();
    }

    public static HttpServer getInstance() {
        return _instance;
    }
}