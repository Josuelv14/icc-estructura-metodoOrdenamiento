public class App {
    public static void main(String[] args) throws Exception {
        // Crear la instancia de la clase u (obejto) MetodosOrdenamientos
        MetodosOrdenamiento metodosOrdenamiento= new MetodosOrdenamiento();
        //Creo arreglo de enteros
        int[]numeros ={30,7,12,4};
        // Mandar a imprimir arreglo
        metodosOrdenamiento.imprime(numeros);
        //Llamo al metodo sortByBubble y su respuesta guardo en 
        // la variable arregloOrdenadoBubble
        int[]arregloOrdenadoBuble= metodosOrdenamiento.sortByBubble(numeros, false);
        // Mando a imprimir mi nuevo arreglo que ya fue ordenado por arregloOrdenadoBubble
        metodosOrdenamiento.imprime(arregloOrdenadoBuble);
        ///TOdo: Hacer un menu que elija el metodo 

    }
}