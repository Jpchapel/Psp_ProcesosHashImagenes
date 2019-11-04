package e171214;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class E171214 {

    private String cálculoSHA(String archivo) throws IOException {
        Process firma = Runtime.getRuntime().exec("F:\\CS DAM\\Programación de servizos e procesos\\Exámenes\\UD 1\\e181115\\fciv.exe " + archivo);
        BufferedReader brFirma = new BufferedReader(new InputStreamReader(firma.getInputStream()));
        String línea, anterior = "";
        while ((línea = brFirma.readLine()) != null) {
            //System.out.println(línea);
            anterior = línea;
        }
        String[] palabras = anterior.split(" ");
        return palabras[0];
    }

    private void go(String directorio) throws IOException {
        ArrayList<String> values = new ArrayList<>();
        values.add("java");
        values.add("-cp");
        values.add("F:\\CS DAM\\Programación de servizos e procesos\\Exámenes\\UD 1\\e181115\\Solucion\\Lector\\build\\classes");
        values.add("lector.Lector");
        values.add(directorio);
        Proceso lector = new Proceso(values);

        values.clear();
        values.add("java");
        values.add("-cp");
        values.add("F:\\CS DAM\\Programación de servizos e procesos\\Exámenes\\UD 1\\e181115\\Solucion\\BD\\build\\classes");
        values.add("bd.BD");
        values.add(directorio);
        Proceso baseDatos = new Proceso(values);
                
        String línea;
        String sha;
        while ((línea = lector.leer()) != null) {
            System.out.println("Procesando " + línea);
            sha = cálculoSHA(línea);
            System.out.println("\tSHA-1: " + sha);
            baseDatos.escribir(sha);
            if (baseDatos.leer().equalsIgnoreCase("true"))
                System.out.println("\t" + línea + " ES UN ARCHIVO POTENCIALMENTE PELIGROSO.");
            else
                System.out.println("\t" + línea + " no está registrado como un archivo potencialmente peligroso.");
            
        }
    }

    public static void main(String[] args) throws IOException {
        // Se recibe como argumento el nombre del directorio 
        // donde están las imágenes que se quieren procesar.
        E171214 app = new E171214();
        app.go(args[0]);
    }

}
