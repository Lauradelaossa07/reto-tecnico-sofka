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
import static java.lang.Math.random;
import java.util.ArrayList;

import java.util.List; //importo las librerias pertinentes
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        int p;    //declaro las variables 
        boolean esCorrecta;
        int puntos = 0;
        

        List<Respuesta> listRespuestas = new ArrayList<>(); //creo Listas pertinentes y las almaceno en el Array
        List<Pregunta> listPreguntas = new ArrayList<>();

        String preguntas[][] = new String[5][5]; //creo las matrices con las indicaciones del ejercicio para preguntas 
        String respuestas[][][] = new String[5][5][4]; //creo las matrices con las indicaciones del ejercicio para respuestas

        Respuesta respuesta; 
        Pregunta pregunta;
        
        //Lleno las matrices donde [categoria1][pregunta1][opciones de respuesta]
        preguntas [0][0] = "¿ Cuál es el lugar más frío de la tierra?";
        respuestas[0][0][0] = "Antártida";
        respuestas[0][0][1] = "polo norte";
        respuestas[0][0][2] = "canada";
        respuestas[0][0][3] = "jamaica";

        preguntas [0][1] = "¿Quién escribió La Odisea?";
        respuestas[0][1][0] = "Homero";
        respuestas[0][1][1] = "pablo cohelo";
        respuestas[0][1][2] = "gabriel García Marquez";
        respuestas[0][1][3] = "jose Luis Borges";

        preguntas [0][2] = "¿Cuál es el río más largo del mundo?";
        respuestas[0][2][0] = "Amazonas";
        respuestas[0][2][1] = "Nilo";
        respuestas[0][2][2] = "Río Sínu";
        respuestas[0][2][3] = "Río Cauca";

        preguntas [0][3] = "¿Cómo se llama la Reina del Reino Unido?";
        respuestas[0][3][0] = "Isabel II";
        respuestas[0][3][1] = "Isabel III";
        respuestas[0][3][2] = "Isabel I";
        respuestas[0][3][3] = "Cristina IV";

        preguntas [0][4] = "¿En qué continente está Ecuador?";
        respuestas[0][4][0] = "América";
        respuestas[0][4][1] = "Asia";
        respuestas[0][4][2] = "Oceania";
        respuestas[0][4][3] = "Europa";

        preguntas [1][0] = "¿Dónde originaron los juegos olímpicos?";
        respuestas[1][0][0] = "Grecia";
        respuestas[1][0][1] = "Roma";
        respuestas[1][0][2] = "Brasil";
        respuestas[1][0][3] = "Colombia";

        preguntas [1][1] = "¿Qué tipo de animal es la ballena?";
        respuestas[1][1][0] = "mamífero";
        respuestas[1][1][1] = "anfibios";
        respuestas[1][1][2] = "reptiles";
        respuestas[1][1][3] = "gasterópodos";

        preguntas [1][2] = "¿Qué cantidad de huesos en el cuerpo humano adulto?";
        respuestas[1][2][0] = "206";
        respuestas[1][2][1] = "300";
        respuestas[1][2][2] = "150";
        respuestas[1][2][3] = "204";

        preguntas [1][3] = "¿Cuándo acabó la II Guerra Mundial?";
        respuestas[1][3][0] = "1945";
        respuestas[1][3][1] = "1785";
        respuestas[1][3][2] = "1876";
        respuestas[1][3][3] = "1948";

        preguntas [1][4] = "¿Quién es el autor de el Quijote?";
        respuestas[1][4][0] = "Miguel de Cervantes";
        respuestas[1][4][1] = "Jose Luis Borges";
        respuestas[1][4][2] = "Jane Austen";
        respuestas[1][4][3] = "Gabriel García Marquéz";

        preguntas [2][0] = "¿Quién pintó “la última cena”?";
        respuestas[2][0][0] = "Leonardo da Vinci";
        respuestas[2][0][1] = "Miguel Angel";
        respuestas[2][0][2] = "Pedro Olivera";
        respuestas[2][0][3] = "Frida Kahlo";

        preguntas [2][1] = "¿Qué año llegó Cristóbal Colón a América?";
        respuestas[2][1][0] = "1492";
        respuestas[2][1][1] = "1572";
        respuestas[2][1][2] = "1392";
        respuestas[2][1][3] = "1262";

        preguntas [2][2] = "¿En qué se especializa la cartografía?";
        respuestas[2][2][0] = "ciencia que estudia los mapas.";
        respuestas[2][2][1] = "ciencia que estudia los mares.";
        respuestas[2][2][2] = "ciencia que estudia las montañas.";
        respuestas[2][2][3] = "ciencia que estudia los aires.";

        preguntas [2][3] = "¿Cuál es el país más grande del mundo?";
        respuestas[2][3][0] = "Rusia ";
        respuestas[2][3][1] = "Brasil";
        respuestas[2][3][2] = "EEUU";
        respuestas[2][3][3] = "España";

        preguntas [2][4] = "¿Dónde se encuentra la famosa Torre Eiffel?";
        respuestas[2][4][0] = "París";
        respuestas[2][4][1] = "Madrid";
        respuestas[2][4][2] = "Río";
        respuestas[2][4][3] = "Dubai";

        preguntas [3][0] = "¿Qué deporte practicaba Michael Jordan?";
        respuestas[3][0][0] = "Baloncesto";
        respuestas[3][0][1] = "Futbol";
        respuestas[3][0][2] = "Tennis";
        respuestas[3][0][3] = "Ciclismo";

        preguntas [3][1] = "¿En qué año comenzó la II Guerra Mundial?";
        respuestas[3][1][0] = "1939";
        respuestas[3][1][1] = "1976";
        respuestas[3][1][2] = "1229";
        respuestas[3][1][3] = "1919";

        preguntas [3][2] = "¿Cuál es tercer planeta en el sistema solar?";
        respuestas[3][2][0] = "Tierra";
        respuestas[3][2][1] = "Mercurio";
        respuestas[3][2][2] = "Marte";
        respuestas[3][2][3] = "Jupiter";

        preguntas [3][3] = "¿Cuál es la moneda del Reino Unido?";
        respuestas[3][3][0] = "Libra ";
        respuestas[3][3][1] = "Dolar";
        respuestas[3][3][2] = "Peso";
        respuestas[3][3][3] = "Euro";

        preguntas [3][4] = "¿Cual es país más poblado de la Tierra?";
        respuestas[3][4][0] = "China ";
        respuestas[3][4][1] = "Chile";
        respuestas[3][4][2] = "España";
        respuestas[3][4][3] = "Roma";

        preguntas [4][0] = "¿En qué lugar del cuerpo se produce la insulina?";
        respuestas[4][0][0] = "páncreas";
        respuestas[4][0][1] = "Higado";
        respuestas[4][0][2] = "Apendice";
        respuestas[4][0][3] = "Cerebro";

        preguntas [4][1] = "¿Qué rama de la Biología estudia los animales?";
        respuestas[4][1][0] = "zoología ";
        respuestas[4][1][1] = "Bioquímica";
        respuestas[4][1][2] = "Biotecnología";
        respuestas[4][1][3] = "Anatomía";

        preguntas [4][2] = "¿Cuántas patas tiene la araña??";
        respuestas[4][2][0] = "8";
        respuestas[4][2][1] = "10";
        respuestas[4][2][2] = "6";
        respuestas[4][2][3] = "12";

        preguntas [4][3] = "¿Cómo se llama el animal más rápido del mundo?";
        respuestas[4][3][0] = "guepardo";
        respuestas[4][3][1] = "Leopardo";
        respuestas[4][3][2] = "Tigre";
        respuestas[4][3][3] = "Tortuga";

        preguntas [4][4] = "¿Cuál fue el primer metal que empleó el hombre?";
        respuestas[4][4][0] = "cobre";
        respuestas[4][4][1] = "Hiero";
        respuestas[4][4][2] = "Bronce";
        respuestas[4][4][3] = "Aluminio";


        listPreguntas = new ArrayList<>(); 
        for (int i = 0; i < 5; i++) { // lista de preguntas de las categorias
            p = (int) (Math.random() * 5); // Utilizo la funcion Math.random para escojer una de las 5 preguntas por categoria aleatoriamente.
            listRespuestas = new ArrayList<>(); // lista de respuestas de las categorias
            for (int j = 0; j < 4; j++) { 
                if (j == 0) {
                    esCorrecta = true;
                } else {
                    esCorrecta = false;
                }
                respuesta = new Respuesta(respuestas[i][p][j], esCorrecta);//indico los paramentros que indico en el constructor de la clase Respuesta.
                listRespuestas.add(respuesta);
            }


            pregunta = new Pregunta(preguntas[0][p], listRespuestas, i);
            listPreguntas.add(pregunta);

        }
        
        Scanner lectura = new Scanner (System.in);
        System.out.println("Ingrese su nombre: "); //inicia el juego y pide el nombre del jugador
        String jugador = lectura.next(); //Lee el nombre del jugador
        
        Scanner leer = new Scanner(System.in);
        String opc = ""; 
        System.out.println("seleccione una opción entre (a,b,c,d)");
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Nilvel " + i + ":" + listPreguntas.get(i).getPregunta()); // Mostrara por pantalla desde la categoria mas baja a la mas alta, una pregunta aleatoria con sus opciones de respuesta.
            System.out.println("A:" + listPreguntas.get(i).getRespuestas().get(0).getRespuesta());// opciones de respuesta
            System.out.println("B:" + listPreguntas.get(i).getRespuestas().get(1).getRespuesta());// opciones de respuesta
            System.out.println("C:" + listPreguntas.get(i).getRespuestas().get(2).getRespuesta());// opciones de respuesta
            System.out.println("D:" + listPreguntas.get(i).getRespuestas().get(3).getRespuesta() + "\n\n");// opciones de respuesta

            while (true) { //ciclo de control para evaluar la opción escojida 
                opc = leer.nextLine();
                
                System.out.println("opción seleccionada: " + opc);
                
                switch (opc) {//recorre las opciones en los casos de las posibles respuestas
                    case "a": {
                        if (listPreguntas.get(i).getRespuestas().get(0).esCorrecta()) {
                            puntos = puntos + 10; //por cada ronda del juego se le otorgan 10 puntos
                            break;
                        } else {
                            i = 6;
                            puntos = puntos +0;
                            break;
                        }
                    }

                    case "b": {
                         if (listPreguntas.get(i).getRespuestas().get(1).esCorrecta()) {
                            puntos = puntos + 10;
                            break;
                        } else {
                            i = 6;
                            break;
                        }
                    }

                    case "c": {
                         if (listPreguntas.get(i).getRespuestas().get(2).esCorrecta()) {
                            puntos = puntos + 10;
                            break;
                        } else {
                            i = 6;
                            break;
                        }
                    }

                    case "d": {
                         if (listPreguntas.get(i).getRespuestas().get(3).esCorrecta()) {
                            puntos = puntos + 10;
                            break;
                        } else {
                            i = 6;
                            break;
                        }
                    }

                }
                if (puntos >= 10 && i < 6){
                    System.out.println(jugador+" Respuesta correcta pasa al siguiente nivel, puntuación: "+puntos);
                    break;
                }else{
                    if (i == 6){
                        System.out.println(jugador+" Respuesta Incorrecta-Fin del juego, su puntuación es: "+puntos);
                        break;
                    }
                }

            }
            
        }

    }

}


