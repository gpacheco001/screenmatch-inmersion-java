/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.screenmatch;

import java.util.Scanner;

/**
 *
 * @author TOSHIBA
 */
public class Screenmatch {

    public static void main(String[] args) {
        System.out.println("Bienvenidos a la inmersion en JAVA");
        
        int fechaDeLanzamiento = 1999;
        double evaluacion = 4.5;
        boolean incluidoEnElPlanBasico = true;
        String nombre = "Matrix";
        String sinopsis = """
                          La mejor película del fin del milenio
                          """;
        double mediaEvaluacionUsuario = 0;
        
        System.out.println("Película: "+nombre);
        System.out.println(fechaDeLanzamiento);
        System.out.println(evaluacion);
        System.out.println(incluidoEnElPlanBasico);
        
        if (fechaDeLanzamiento >= 2023){
            System.out.println("Película popular del momento");        
        } else{
            System.out.println("Pelicula retro");
        }
        
        for(int i = 0; i<3; i++){
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingresa la nota de Matrix");
            double notaMatrix = teclado.nextDouble();
            mediaEvaluacionUsuario = mediaEvaluacionUsuario + notaMatrix;
        }
        System.out.println("La media de la pelicula es: "+mediaEvaluacionUsuario/3);
        
        
    }
}
