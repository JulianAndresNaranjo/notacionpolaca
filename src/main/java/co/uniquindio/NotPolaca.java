package co.uniquindio;
import java.util.ArrayList;

public class NotPolaca {

    private ArrayList<String> pila=new ArrayList<>();
    private ArrayList<String> polaca=new ArrayList<>();

    public NotPolaca(ArrayList<String> expresion){
       
    }
    public ArrayList<String> notacion(ArrayList<String> expresion){
        for (int i=0;i<expresion.size();i++){

            if(expresion.get(i)=="^" || expresion.get(i)=="/" || expresion.get(i)=="*" || expresion.get(i)=="+" || expresion.get(i)=="-"){
                if(expresion.get(i)=="^"){
                    pila.add(expresion.get(i));
                }else{
                    
                    for (int j=pila.size()-1;j>=0;j--){
                            if(pila.get(j)=="^" || pila.get(j)=="*" || pila.get(j)=="/"){
                                polaca.add(pila.get(j));
                                pila.remove(j);
                        }
                    }pila.add(expresion.get(i));
             
                }   
            }else{
                polaca.add(expresion.get(i));
            }
        }
        for(int i=0;i<pila.size();i++){
            polaca.add(pila.get(i));
        }
        return polaca;
    } 
}