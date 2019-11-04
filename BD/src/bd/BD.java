package bd;

import java.util.Scanner;

public class BD {

    private final String[] registro = new String[2];

    private boolean estáRegistrado(String sha) {
        boolean está = false;
//        int i = 0;
//        while (i<registro.length && !está){
//            if (registro[i].equals(sha))
//                está = true;
//            i++;
//        }
        for (int j = 0; j < registro.length; j++) {
            if (registro[j].equals(sha)){
                está = true;
                break;
            }
        }
        return está;
    }

    private void go(){
        Scanner sc = new Scanner(System.in);

        String sha;
        while (!(sha = sc.next()).equalsIgnoreCase("fin")) {
            System.out.println(estáRegistrado(sha));
        }        
    }
    
    public BD(){
        registro[0] = "ae67e493e8505eab1ddb5cc6d126f241";
        registro[1] = "6f010bee7b93cf31ad82f46e7140fa82";
    }
    
    public static void main(String[] args) {
        BD bd = new BD();
        bd.go();
    }

}
