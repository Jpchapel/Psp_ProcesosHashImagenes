/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lector;

import java.io.File;

/**
 *
 * @author perchajoa
 */
public class Lector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File directorio = null;
        File[] archivos = null;
        ClaseLectora lector = new ClaseLectora(directorio, archivos);
        lector.listar();
    }
    
}
