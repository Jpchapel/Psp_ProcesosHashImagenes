/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lector;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

/**
 *
 * @author perchajoa
 */
public class ClaseLectora {
    private File fichero;
    private File[] archivos;
    private String directorio;

    public ClaseLectora(File fichero, File[] archivos) {
        this.fichero = fichero;
        this.archivos = archivos;
    }
    
    public void listar(){
        fichero = new File(directorio);
        archivos = fichero.listFiles();
    }
            
    
}
