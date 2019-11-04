/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gestor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;

/**
 *
 * @author perchajoa
 */
public class Gestor {
    private Process proceso;
    private BufferedReader br;
    private PrintStream ps;
    private ProcessBuilder pb;
    
    public void comunicacion(){
    br = new BufferedReader(new InputStreamReader(proceso.getInputStream()));
    ps = new PrintStream(proceso.getOutputStream());
    }

    public Gestor(ArrayList<String> values) throws IOException {
        pb = new ProcessBuilder(values);
        comunicacion();
        pb.start();
    }

    public Gestor(String orden) throws IOException {
        proceso = Runtime.getRuntime().exec(orden);
        comunicacion();
    }
    
    public void escribir(String datos){
        ps.println(datos);
        ps.flush();
    }
    
    public String leer() throws IOException{
        return br.readLine();
    }
    
    public void finalizar() throws IOException{
        br.close();
        ps.close();
        proceso.destroy();
    }
    
}
