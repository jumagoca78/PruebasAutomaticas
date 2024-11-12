//pruebas de la clase Arreglos.java
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestArreglos {

    @Test
    public void testBuscarMasGrandeAlInicioDelArreglo() {
        int arreglo[] = {9,8,7};
        int resultado = Arreglos.buscarMasGrande(arreglo);
        int esperado = 9;
        assertEquals(esperado, resultado);
    }

    @Test
    public void testBuscarMasGrandeEnmedioDelArreglo() {
        int arreglo[] = {8,9,7};
        int resultado = Arreglos.buscarMasGrande(arreglo);
        int esperado = 9;
        assertEquals(esperado, resultado);
    }

    @Test
    public void testBuscarMasGrandeAlfinalDelArreglo() {
        int arreglo[] = {8,7,9};
        int resultado = Arreglos.buscarMasGrande(arreglo);
        int esperado = 9;
        assertEquals(esperado, resultado);
    }

     @Test
    public void testBuscarMasGrandeNegativo() {
        int arreglo[] = {-8,-7,-9};
        int resultado = Arreglos.buscarMasGrande(arreglo);
        int esperado = -7;
        assertEquals(esperado, resultado);
    }

         @Test
    public void testBuscarMasGrandeConCeroIncluido() {
        int arreglo[] = {-8,0,-9};
        int resultado = Arreglos.buscarMasGrande(arreglo);
        int esperado = 0;
        assertEquals(esperado, resultado);
    }

             @Test
    public void testBuscarMasGrandeConUnElemento() {
        int arreglo[] = {56};
        int resultado = Arreglos.buscarMasGrande(arreglo);
        int esperado = 56;
        assertEquals(esperado, resultado);
    }

             @Test
    public void testBuscarMasGrandeArregloVacio() {
        int arreglo[]=new int[]{};
        try {
            Arreglos.buscarMasGrande(arreglo);
            fail ("Esto debio generar una excepcion");
        } catch (RuntimeException e) {
            assertTrue(true);
        }
        
        
    }
}
