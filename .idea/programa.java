public class programa{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); /*Usamos el scanner para leer la entrada del usuario*/

        String sistema = System.getProperty("os.name").toLowerCase();/*Nos va a devolver el nombre del sistema operativo*/
        boolean esWin = false;
        if(sistema.contains("win")) {
            esWin = true; /*Con esto podremos saber si se trata del sistema operativo Windows*/
        }

        System.out.println("El sistema es:" + (esWin ? "Windows": "Linux"));

        /*Ahora vamos a hacer un menú de las opciones que quiera elegir el usuario utilizando un bucle*/

        while(true){
            System.out.println("\n Escoga una ")
        }



    }


}