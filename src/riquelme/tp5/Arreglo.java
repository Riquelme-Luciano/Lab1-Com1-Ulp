package riquelme.tp5;

public class Arreglo {
    
    public static void sumarLista(int lista[]){
        int suma=0;
        double promedio=0;
        
        for(int i=0;i<lista.length;i++) {
            suma+=lista[i];
            if(lista.length-1==i) 
                promedio=suma/++i;
        }
        
        System.out.println("Suma="+suma+", promedio="+promedio);
    }
    
    public static int buscarMayor(int matriz[][]) {
        int max[][];
        /*
        for(int  f=0 ;f<matriz[f].length;f++)
            for(int c=0;c<matriz[f].length;c++)
                if(matriz[f][c]>max)
                    max=matriz[f][c];
        
        System.out.print("El numero mas grande: "+max[][]);
        */        
        return 0;
    }
    
    public static int cuentaVocales(String cadena[]) {
        int vocales=0;
        for(int i=0;i<cadena.length;i++) {
            switch(cadena[i]){
                case "a":
                case "A":
                    vocales++;
                    break;
                case "e":
                case "E":
                    vocales++;
                    break;
                case "i":
                case "I":
                    vocales++;
                    break;
                case "o":
                case "O":
                    vocales++;
                    break;
                case "u":
                case "U":
                    vocales++;
                    break;
                default:
                    if(vocales==0)
                        System.out.println("No se encontraron vocales.");
                    break;
            }
        } 
        System.out.println(vocales);
        return 0;
    }
    
    public static String cuentaCaracter(String cadena,char caracter){
        return "";
    }
}
