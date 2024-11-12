public class Arreglos{
    
    //mostrar el arreglo
    public static void mostrarArreglo(int arreglo[]) {
        for (int i = 0; i <= arreglo.length-1; i++) {
            System.out.println("[" + i + "] = " + arreglo[i]);
        }
    }

    public static int buscarMasGrande(int arreglo[]) {
        int indice;//indice para recorrer el arreglo
        int max=Integer.MIN_VALUE;

        if (arreglo==null || arreglo.length==0) {
            throw new RuntimeException("Arreglo vacio o nulo");
        }

        for (indice=0; indice<=arreglo.length-1; indice++) {
            if (arreglo[indice]>max) {
                max=arreglo[indice];
            }
        }
        return max;
    }

    //llenar un arreglo de pares
    public static void llenarArregloPares(int arreglo[]) {
        int indice;
        for (indice=0; indice<=arreglo.length-1; indice++) {
            arreglo[indice]=indice*2;
        }
    }

    //llenar un arreglo de Impares
    public static void llenarArregloImpares(int arreglo[]) {
        int indice;
        for (indice=0; indice<=arreglo.length-1; indice++) {
            arreglo[indice]=indice*2+1;
        }
    }

}