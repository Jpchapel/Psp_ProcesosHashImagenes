/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e171214;

import gestor.Gestor;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author perchajoa
 */
public class E171214 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Gestor gestor1 = null; 
       Gestor gestor2 = null;
       Gestor gestor3 = null;
        try {

            //Instanciamos un gestor por cada proceso que vayamos a usar
            //Para el Lector
            gestor1 = new Gestor("java -cp C:\\Users\\perchajoa\\Desktop\\Examen\\e171214\\Lector\\build\\classes lector.Lector");
            //Para el programa fciv.exe
            gestor2 = new Gestor("C:\\Users\\perchajoa\\Desktop\\Examen\\fciv.exe -sha1");
            //Para la BD
            gestor3 = new Gestor("java -cp C:\\Users\\perchajoa\\Desktop\\Examen\\e171214\\BD\\build\\classes bd.BD");
            
            String linea ="";
            while (linea !=null) {
                gestor1.escribir(linea);
                System.out.println(gestor1.leer());
                gestor2.escribir(linea);
                System.out.println(gestor2.leer());
                gestor3.escribir(linea);
                System.out.println(gestor3.leer());
            }
            

        } catch (IOException ex) {
            Logger.getLogger(E171214.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            
           try {
               
               gestor1.finalizar();
               gestor2.finalizar();
               
           } catch (IOException ex) {
               Logger.getLogger(E171214.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
    }

}
