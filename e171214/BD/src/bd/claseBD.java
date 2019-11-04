/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

/**
 *
 * @author perchajoa
 */
public class claseBD {

    private String hashRecibido;

    public void go() {
        if (hashRecibido.equalsIgnoreCase("ae67e493e8505eab1ddb5cc6d126f241")) {
            System.out.println("Imagen peligrosa");
        }
        else if(hashRecibido.equalsIgnoreCase("6f010bee7b93cf31ad82f46e7140fa82")){
            System.out.println("Imagen peligrosa");
        }
    }
}
