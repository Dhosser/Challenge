/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package challenge1;

import java.util.Scanner;
import java.util.Random;
import java.io.*;
import javax.swing.JOptionPane;


/**
 *
 * @author lucia
 */
public class Challenge1 {
    
    static Scanner scnr = new Scanner (System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
          
        
        
        
        
        int opcion = 0;
        
        do{
            System.out.println("Opciones");
            System.out.println("-------------------------");
            System.out.println("0 - Menu");
            System.out.println("1 - Genera nuevo archivo");
            System.out.println("2 - lee archivo generado");
            System.out.println("3 - Ordena archivo");
            System.out.println("4 - Lee archivo ordenado");
            System.out.println("5 - Buscar numero en archivo");
            System.out.println("6 - Salir");
        
            System.out.println("Seleccione una opcion :");
            opcion = scnr.nextInt();
            switch(opcion) {
            case 0:
                menu();
                break;
            case 1:
                gna();
                break;
            case 2:
                lag();
                break;
            case 3:
                oa();
                break;
            case 4:
                lao();
                break;
            case 5:
                bnea();
                break;
            case 6:
                salir();
                break;
                
        }
        }while(opcion!=6);
        
        System.out.println("El programa a finalizado");
        
        
    }
    static void menu(){
        System.out.println("Menu");
    }
    static void gna(){
        System.out.println("Genera nuevo archivo");
        System.out.println("Numero aleatorio");
        
            Metodos m = new Metodos();
             m.Escribir2("PrimerArchivo.txt");
             
        
    }
    static void lag(){
        System.out.println("Lee archivo generado");
        FileReader archivo;
        BufferedReader lector;
        
        try{
            archivo = new FileReader("C:\\Challenge1\\PrimerArchivo.txt");
            
            if(archivo.ready()) {
                lector = new BufferedReader(archivo);
                String cadena;
                while ((cadena = lector.readLine()) != null) {
                    System.out.println(cadena);
                } 
            }else {
               System.out.println("El archivo no esta listo para ser leido...");
            }
        }catch (Exception e) {
            System.out.println("Error: "+ e.getMessage());
        }
        
        
    }
    static void oa(){
        System.out.println("Ordena archivo");
        System.out.println("Archivo Ordenado");
        
             Metodos m = new Metodos();
             m.Escribir("SegundoArchivo.txt");
        
    }
    static void lao(){
        System.out.println("Lee archivo ordenado");
        
        FileReader archivo;
        BufferedReader lector;
        
        try{
            archivo = new FileReader("C:\\Challenge1\\SegundoArchivo.txt");
            
            if(archivo.ready()) {
                lector = new BufferedReader(archivo);
                String cadena;
                while ((cadena = lector.readLine()) != null) {
                    System.out.println(cadena);
                } 
            }else {
               System.out.println("El archivo no esta listo para ser leido...");
            }
        }catch (Exception e) {
            System.out.println("Error: "+ e.getMessage());
        }
    }
    static void bnea(){
        System.out.println("Buscar numero en archivo");
        
        int array[] = {Metodos.numero};
        Scanner scr = new Scanner(System.in);
        System.out.println("Ingrese un numero a buscar: ");
        int n = scr.nextInt();
        if(buscarNumero(n,array))
        {
            System.out.println("El numero se encontro.");
        }
        else{
            System.out.println("El numero no se encontro.");
        }
        
    }
    
    public static boolean buscarNumero(int n,int arr[])
    {
        int cont = 0;
        int k = 0;
        boolean encontrado = false;
        for(int i=0;i<arr.length;i++)
        {
            if(n==arr[i])
            {
                cont++;
            }
            if(cont>0)
            {
                k++;
                System.out.println("Veces que se busco el numero: "+k);
                encontrado = false;
                break;
            }
            else
                    
            {
                k++;
                System.out.println("Veces que se busco el numero: "+k);
                encontrado = true;
            }
        }
        return encontrado;
    }
    static void salir(){
        System.out.println("Salir");
    }
    
    
}
