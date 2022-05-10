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
        int max=matriz[0][0];
        
        for (int i = 0; i< matriz.length; i++) 
            for (int j = 0; j <matriz[i].length; j++) {
                if (matriz[i][j]>max) {
                    max=matriz[i][j];
                }
            }
        
        return max;
    }
    
    public static int cuentaVocales(String palabra) {
        int vocales=0;
        
        for (int i = 0; i < palabra.length(); i++) {
            if(palabra.charAt(i)=='A' || palabra.charAt(i)=='a')
                vocales++;
            if(palabra.charAt(i)=='E'|| palabra.charAt(i)=='e')
                vocales++;
            if(palabra.charAt(i)=='I'|| palabra.charAt(i)=='i')
                vocales++;
            if(palabra.charAt(i)=='O' || palabra.charAt(i)=='o')
                vocales++;
            if(palabra.charAt(i)=='U' || palabra.charAt(i)=='u')
                vocales++;
        }
        System.out.println("Se encontraron "+vocales+" vocales en la palabra '"+palabra+"'");
        
        return 0;
    }
    
    public static int cuentaCaracter(String cadena,char caracter){
        int counter=0;
        
        for (int i = 0; i < cadena.length(); i++) {
            if(cadena.charAt(i)==caracter)
                counter++;
        }
        System.out.println("Cantidad de veces encontrado el caracter '"+ caracter+"' en la cadena:"+counter);
        return 0;
    }
}

/*
 Scanner filas= new Scanner(System.in);
        Scanner columnas= new Scanner(System.in);
        Scanner numbers= new Scanner(System.in);
        
        int f;
        int c;
        int max;
        
        System.out.println("Ingrese numero de filas: ");
        f=filas.nextInt();
        
        System.out.println("Ingrese numero de columnas: ");
        c=columnas.nextInt();
        
        matriz=new int[f][c];
        
        
        System.out.println("Llene la matriz con numeros enteros:");
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println("["+i+"]["+j+"]");
                 matriz[i][j]=numbers.nextInt();
            }
        }
        
        max=matriz[0][0];
        
        System.out.println("Matriz Ingresada:");
        for(int x=0;x<f;x++) {
            for(int y=0;y<c;y++) {
                if(matriz[x][y]>max)
                    max=matriz[x][y];
                if(matriz[x][y]<10)
                    System.out.print("0");
                System.out.print(matriz[x][y]+"  ");
            }
            System.out.println("");
        }
        System.out.println("el numero mas grande de la matriz es: "+max);    
         
        return 0;*/
