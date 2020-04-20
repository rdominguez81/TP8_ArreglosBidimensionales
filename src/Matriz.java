/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Laura
 */
public class Matriz 
{
    public void armar()
    {
        String cadena = "";
        int nro = 3;
        int[][] arreglo = new int[4][];        
        arreglo[0] = new int[4];
        arreglo[1] = new int[3];
        arreglo[2] = new int[5];
        arreglo[3] = new int[2];
        
        /*arreglo[0][0] = 3;
        arreglo[0][1] = 6;
        arreglo[0][2] = 9;
        arreglo[0][3] = 12;
        
        arreglo[1][0] = 15;
        arreglo[1][1] = 18;
        arreglo[1][2] = 21;
        
        arreglo[2][0] = 24;
        arreglo[2][1] = 27;
        arreglo[2][2] = 30;
        arreglo[2][3] = 33;
        arreglo[2][4] = 36;
        
        arreglo[3][0] = 39;
        arreglo[3][1] = 42; */
        
        ///////////////////////////////////////////CARGA DEL ARREGLO
        for(int k = 0;k < arreglo.length;k ++)
        {   
            for(int i = 0; i < arreglo[k].length;i ++)
            {
                arreglo[k][i] = nro;
                
                nro = nro + 3;
            }
        }
        ///////////////////////////////////////////
        for(int k = 0;k < arreglo.length;k ++)
        {
            for(int i = 0; i < arreglo[k].length;i ++)
            {
                if((arreglo[k][i] % 2) == 0)
                {
                    cadena = cadena+" "+arreglo[k][i]; 
                }
            }
            
            System.out.println("Fila "+(k + 1)+" "+cadena);
                
            cadena = "";
        }
    }
}
