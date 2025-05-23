/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.labs9;

import java.util.Scanner;

/**
 *
 * @author LAB-USR-LNORTE
 */
public class ListaInvertida {

    String[][] matrix = {
        {"Juan", "Matematico", "32"},
        {"Daniel", "Fisico", "40"},
        {"Jose", "Matematico", "25"},
        {"Pascual", "Ingeniero", "38"},
        {"Migul", "Ingeniero", "43"},
        {"Felipe", "Abogado", "35"},};

    public void mostrartabla() {
        System.out.println("\nNOMBRE\tPROFESION\tEDAD");
        for (String[] personas : matrix) {
            System.out.println(personas[0] + "\t" + personas[1] + "\t" + personas[2]);
        }
    }

    public void por_profesion() {
        String[] profesiones = {"Matematico", "Fisico", "Ingeniero", "Abogado"};
        for (String profesion : profesiones) {
            System.out.println("- " + profesion + ":");
            for (String[] personas : matrix) {
                if (personas[1].equalsIgnoreCase(profesion)) {
                    System.out.println("  *" + personas[0]);
                }
            }

        }
    }

    public void comparacion() {
        System.out.println("\nMatematicos o fiscos mayores de 25 años");
        for (String[] persona : matrix) {
            int edad = Integer.parseInt(persona[2]);
            if (persona[1].equalsIgnoreCase("Matematico") || persona[1].equalsIgnoreCase("Fisico") && edad > 25) {
                System.out.println(persona[0] + " - " + persona[1] + "- Edad: " + edad);
            }
        }

    }

    public void comparacion2() {
        System.out.println("\nIngenieros mayores de 40 años");
        for (String[] persona : matrix) {
            int edad = Integer.parseInt(persona[2]);
            if (persona[1].equalsIgnoreCase("Ingenieros") && edad > 40) {
                System.out.println(persona[0] + " - " + persona[1] + "- Edad: " + edad);
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner opcion = new Scanner(System.in);
        System.out.println("Mostar tabla -> 1");
        System.out.println("Listar por profesion -> 2");
        System.out.println("Listar por Matematicos Fiscos -> 3");
        System.out.println("Listar por Edad de Ingenieros -> 4");
        System.out.println("Salir -> 5");
        opcion = Scanner.nextInt();
    }
}