/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package challenge1;

import java.io.*;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author lucia
 */
public class Metodos {
    public static int numero; 
        
    public void Escribir2(String nombre){
    
    Random dado2 = new Random();
        int numero;  
        int numero1;
        int numero2;
        
        
        File  f;
        FileWriter w;
        BufferedWriter bw;
        PrintWriter  wr;
        
        try {
        
            String path = "C:" + File.separator + "Challenge1" + File.separator + nombre;
            f = new File(path);

            f.getParentFile().mkdirs();
            f.createNewFile();
            w = new FileWriter(f);
            bw = new BufferedWriter(w);
            wr = new PrintWriter(bw);

            numero = dado2.nextInt(15);
            numero1 = dado2.nextInt(15);
            numero2 = dado2.nextInt(15);
            
            wr.write(numero+"\n");
            wr.append(numero1+"\n");
            wr.append(numero2+"\n");

            wr.close();
            bw.close();
        
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ha sucedido un error "+e);
        }
    
    }    
             
        
    public void Escribir(String nombre){
        
        int numero = Metodos.numero; 
        int numero1 = Metodos.numero;  
        int numero2 = Metodos.numero;  
        
        File  f;
        FileWriter w;
        BufferedWriter bw;
        PrintWriter  wr;
            
        try {
                
        String path = "C:" + File.separator + "Challenge1" + File.separator + nombre;
        f = new File(path);
        
        f.getParentFile().mkdirs();
        f.createNewFile();
        w = new FileWriter(f);
        bw = new BufferedWriter(w);
        wr = new PrintWriter(bw); 
        
        File archivo = new File("C:\\Challenge1\\SegundoArchivo.txt");
        Scanner myReader = new Scanner(archivo);
        while (myReader.hasNextLine()) {
        String linea = myReader.nextLine();
        System.out.println("Linea: "+linea);
        
        numero = Metodos.numero; 
        numero1 = Metodos.numero; 
        numero2 = Metodos.numero; 
        
        Metodos.numero = Integer.parseInt(linea);
                
        if(numero<numero1 && numero1<numero2){
            
        
        wr.write("Numeros al azar ordenados:"+numero+" , "+numero1+" , "+numero2+"\n");
        }else if(numero<numero2 && numero2<numero1){
        wr.write("Numeros al azar ordenados:"+numero+" , "+numero2+" , "+numero1+"\n");
        }else if(numero1<numero && numero<numero2){
        wr.write("Numeros al azar ordenados:"+numero1+" , "+numero+" , "+numero2+"\n");
        }else if(numero1<numero2 && numero2<numero){
        wr.write("Numeros al azar ordenados:"+numero1+" , "+numero2+" , "+numero+"\n");
        }else if(numero2<numero && numero<numero1){
        wr.write("Numeros al azar ordenados:"+numero2+" , "+numero+" , "+numero1+"\n");
        }else if(numero2<numero1 && numero1<numero){
        wr.write("Numeros al azar ordenados:"+numero2+" , "+numero1+" , "+numero+"\n");
        }
                
            wr.close();
            bw.close();
            
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ha sucedido un error "+e);
        }
    }
}


 
    
