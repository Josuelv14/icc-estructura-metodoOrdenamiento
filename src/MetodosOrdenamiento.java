public class MetodosOrdenamiento {

    ///Metodo que devuelve un arreglo de enteros ordenados por  seleccion burbuja
    //Agregar una condicion que imoprima o no los pasos
    public int[] sortByBubble(int[]arreglo, boolean logs){
        //Code to sort
        //Obtener tamaño del arreglos
        int tamano = arreglo.length;
        // Bucle externo que va a recorrer todo el arreglo
        for(int i=0; i<tamano;i++){
            if(logs){
                System.out.println("\n Pasado numero" + i);
            }
            //Bucle for interno que compara el elemento actual con los siguientes 
            for(int j = i+1; j< tamano; j++){
                if(logs){
                    System.out.println("i=" + arreglo[i] + "j=" + arreglo[j]);
                }
                if(arreglo[i]> arreglo[j]){
                    //Intercambiamos los elementos 
                    if(logs){
                        System.out.println("- Si es mayor asi que cambio ");
                    }
                    int temporal = arreglo[i];
                    arreglo[i]=arreglo[j];
                    arreglo[j]=temporal;
                    if(logs){
                        System.out.println(" ");
                        imprime(arreglo);
                    }
                }               
            }
        }
        return arreglo;
    }
    public void imprime (int [] arreglo ){
        for(int i = 0; i <arreglo.length; i++){
        System.out.print(arreglo[i] + " ");
        }
        System.out.println();

    }    
}