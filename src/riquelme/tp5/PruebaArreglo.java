package riquelme.tp5;



public class PruebaArreglo {
    
    public static void main(String[] args) {  
        //variables a usar en los metodos
        int lista[]={10,2,78,56,34}; //sumarLista()
        
       // int matriz[][];
        //matriz=new int[100][100];
        
        
        //Metodos estaticos de la clase Arreglo
        System.out.println("Sumar Lista:");
        Arreglo.sumarLista(lista);
        
        int[][] matriz2={{10,0,33,4},{566,66,7,8}};
        
        System.out.println("\nBuscando numero mas grande en una matriz:");
        System.out.println("El numero mas grande encontrado:"+Arreglo.buscarMayor(matriz2));
        
        System.out.println("\nContar vocales de una palabra:");
        String palabra="Hello";
        Arreglo.cuentaVocales(palabra);
        
        String cadena="Bienvenidos a laboratorio de programacion 1";
        
        System.out.println("\nContar Caracteres encontrados en una cadena:");
        System.out.println("Cadena ingresada:"+cadena);
        Arreglo.cuentaCaracter(cadena, 'o');
        Arreglo.cuentaCaracter(cadena, 'a');
        Arreglo.cuentaCaracter(cadena, 'e');
        Arreglo.cuentaCaracter(cadena, 'n');
        System.out.println("\n\n\n ");
        
    }
}
