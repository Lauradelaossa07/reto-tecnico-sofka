/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.ArrayList;//importa librerias necesarias
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Laura
 */
public class Pregunta {
    private String pregunta;
    private int nivel;
    private List<Respuesta> respuestas = new ArrayList<>();
    public Pregunta(String pregunta, List respuestas, int nivel) { //metodo constructor
        this.pregunta = pregunta; //iniciando variables
        this.respuestas = respuestas;
        this.nivel = nivel;
        
    }


    public String getPregunta() { //metodos get de las variables
        return pregunta;
    }
    
    public int getNivel() {
        return nivel;
    }

    public List<Respuesta> getRespuestas() {
        return respuestas;
    }
    
}
