package com.polmauri;

import java.util.Scanner;

public class ArrayAlumnos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroAlumnos;
        float notaMasAlta = 0.0f;
        float [] notaSistemas;
        String[] nombreAlumnos;
        boolean tipoCorrecto = false;

        System.out.println("Hola profesor, bienvenido al programa!");
        System.out.print("Introduce el numero de alumnos que tienes en clase \n");
        numeroAlumnos = scanner.nextInt();
        scanner.nextLine();
        notaSistemas = new float [numeroAlumnos];
        nombreAlumnos = new String [numeroAlumnos];

        for (int i = 0; i < nombreAlumnos.length; i++) {
            System.out.println("Introduce el nombre del alumno " + (i+1));
            nombreAlumnos[i] = scanner.nextLine();
        }

        for (int i = 0; i < notaSistemas.length; i++) {
            do {
                System.out.println("Introduce la nota del alumno [0-10] " + nombreAlumnos[i]);
                tipoCorrecto = scanner.hasNextFloat();
                if (!tipoCorrecto){
                    System.out.println("Valor no aceptado");
                }else{
                    notaSistemas[i] = scanner.nextFloat();
                }
                scanner.nextLine();
            }while (!tipoCorrecto);
            System.out.println("La nota de " + nombreAlumnos[i]  + " es " + notaSistemas[i]);
        }

        for (int i = 0; i < notaSistemas.length; i++) {
            System.out.println("La nota del alumno " + nombreAlumnos[i]  + " es " + notaSistemas[i]);

        }
    }
}