/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author Laura
 */
public class Respuesta {
    private String respuesta; // declaracion de variables 
    private boolean correcta;

    public Respuesta(String respuesta, boolean correcta) { //metodo constructor
        this.respuesta = respuesta; 
        this.correcta = correcta;
    }

    public String getRespuesta() { //metodos get de las varibles
        return this.respuesta;
    }


    public boolean esCorrecta() {
        return this.correcta;
    }

}
