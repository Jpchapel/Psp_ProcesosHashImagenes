
package e171214;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;

public class Proceso {    
    private final BufferedReader br;
    private final PrintStream ps;
    
    public Proceso (ArrayList<String> aplicación) throws IOException{
        ProcessBuilder pb = new ProcessBuilder();
        pb.command(aplicación);
        Process proceso = pb.start();
        br = new BufferedReader(new InputStreamReader(proceso.getInputStream()));
        ps = new PrintStream(proceso.getOutputStream(), true);
    }
    
    public String leer() throws IOException{
        return br.readLine();
    }
    
    public void escribir(String texto){
        ps.println(texto);
        //ps.flush();
    }
}
