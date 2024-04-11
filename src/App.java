import java.util.Scanner;
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

        // Hacer un menu que elija el metodo que se va a instanciar: 
        Scanner scanner= new Scanner(System.in);
        MetodosOrdenamiento metodos= new MetodosOrdenamiento();
        int opcion;
        int[] arregloNumeros = new int[0];
        do{
            System.out.println("Menu principa");
            System.out.println("1.Ingrese un arreglo");
            System.out.println("2.Ordenar arreglo");
            System.out.println("0.Salir");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el tamaño de su arreglo");
                    int tamano= scanner.nextInt();
                    arregloNumeros = new int[tamano];
                    for(int i =0; i<arregloNumeros.length;i++ ){
                        System.out.println("Ingrese el valor para" +(i+1)+": ");
                        arregloNumeros[i]= scanner.nextInt();
                    }
                    metodos.imprime(arregloNumeros);
                    break;
                case 2:
                // sub menu para escoger el metodo 
                    mostrarSubMenuMetodos(scanner,metodos, arregloNumeros);    
                    break;
                case 0: 
                    System.out.println("Saliendo del programa....\nAdios");
                    break;
                default:
                    System.out.println("Opcion no valida.Repita");
            }
        }while(opcion !=0);
    }
    public static void mostrarSubMenuMetodos(Scanner scanner, MetodosOrdenamiento metodos, int[] arreglo) {
        int opcionMetodo;
        do {
            System.out.println("\n Escoja un metodo de ordenamiento ");
            System.out.println("1.Metodo Burbuja");
            System.out.println("2.Metodo seleccion");
            System.out.println("3.Metodo insercion");
            System.out.println("0.Regresar al menu principal");
            opcionMetodo = scanner.nextInt();
            switch (opcionMetodo) {
                case 1:
                System.out.println("Ingrese A si quiere ver con pasos");
                String opcion= scanner.nextLine();
                boolean cond;
                if (opcion.equals("A")){
                    cond = true;
                }else{
                    cond=false;
                }
                // Ingrese A -> Para logs y B -> sin logs
                // String opcionLog
                // Boolean cond
                // if opcionLog.equals(A) cond -> true
                // else cond -> false
                // metodos.sortByBubble(arreglo,cond);
                   int[] arregloOrdenado = metodos.sortByBubble(arreglo, false);
                   metodos.imprime(arregloOrdenado);
                    break;
                case 2:

                    break;
                case 3:
                    break;   
                case 0:
                    break;
                default:   
                System.out.println("Ingrese una opcion valida");
                    break;
            }
        } while (opcionMetodo!=0);
        
    }
}