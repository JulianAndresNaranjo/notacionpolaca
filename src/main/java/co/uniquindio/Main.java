package co.uniquindio;

import java.util.ArrayList;

public class Main {

    public static void main (String[]args){
        ArrayList<String> expresion = new ArrayList<>();
        expresion.add("3");
        expresion.add("*");
        expresion.add("10");
        expresion.add("^");
        expresion.add("2");
        expresion.add("+");
        expresion.add("15");
        NotPolaca NotPolaca = new NotPolaca(expresion);

        System.out.println("Resultado de notacion polaca:");
        ArrayList<String>polaca=NotPolaca.notacion(expresion);
        for(int i=0;i<polaca.size();i++){
            System.out.println(polaca.get(i));
        }
    }
}