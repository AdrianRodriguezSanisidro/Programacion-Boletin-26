/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg26;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Adry
 */
public class Metodos {
    String aux1,aux2,aux3,aux4,aux5,aux6;
    ArrayList<String> arrayAleatorio=new ArrayList<>();
    public void numerosAleatorios(){
        Random rd=new Random();
        do{
        aux1=(""+rd.nextInt(49+1));
        aux2=(""+rd.nextInt(49+1));
        aux3=(""+rd.nextInt(49+1));
        aux4=(""+rd.nextInt(49+1));   
        aux5=(""+rd.nextInt(49+1));     
        aux6=(""+rd.nextInt(49+1));
        }while(aux1==aux2||aux1==aux3||aux1==aux4||aux1==aux5||aux1==aux6||aux2==aux3||aux2==aux4||aux2==aux5||aux2==aux6||aux3==aux4||aux4==aux5||aux4==aux6||aux5==aux6);
        arrayAleatorio.add(aux1);
        arrayAleatorio.add(aux2);
        arrayAleatorio.add(aux3);
        arrayAleatorio.add(aux4);
        arrayAleatorio.add(aux5);
        arrayAleatorio.add(aux6);
}
}