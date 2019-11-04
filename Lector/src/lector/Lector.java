package lector;

import java.io.File;

public class Lector {

    private static void verArchivos(String directorio) {
        File[] archivos;

        File f = new File(directorio);
        if (f.exists()) {
            archivos = f.listFiles();

            for (File archivo : archivos) {
                if (archivo.isDirectory()) {
                    verArchivos(archivo.getAbsolutePath());
                } else {
                    System.out.println(archivo.getPath() );
                }
            }
        } else {
            System.out.println("El directorio no existe.");
        }
    }

    public static void main(String[] args) {
        // Como primer argumento se recibe el nombre del directorio
        // donde se almacenan las imágenes.
        if (args.length == 1) {
            Lector.verArchivos(args[0]);
        } else {
            System.out.println("Debe indicar un nombre de directorio");
        }
    }

}
