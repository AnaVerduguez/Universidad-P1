import java.util.Scanner;

/*ANALISIS:

1)ENTRADA-> opcion_pago, monto_pagar, modo_pagar
2)PROCESO-> opcion_pago= 1 o 2, opcion_medio= 1 , 2 o 3 -> Operaciones más detalladas
3)SALIDA-> salgo_pagar, saldo_final

*/

class practica {
    //Programa principal
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        //Declaro mis variables locales, en este caso son las que me permiten llamar a las FUNCIONES
        double monto_pagar= 0.00,saldo_pagar= 0.00,saldo_final = 0.00;
        int opcion_pago=0 ,modo_pago=0;
        String continuar="SI";

        //Llamo a mis modulos que contienen procesos o funciones
        //Mis modulos iran dentro de un DO que me permite finalizar cuando el usario ingrese NO
        //Debo guardar mis funciones en variables

        do{
            monto_pagar= monto_pago(); //-> Nombre de la funcion () se guarda en variable local
            opcion_pago= opcion_pagar();
            saldo_pagar= pago_final(opcion_pagar); //-> (Return que se utiliza de otra funcion)
            modo_pago= modo_pagar();
            saldo_final= recargo_final(modo_pago);
            imprimir(monto_pagar,opcion_pago,modo_pago,saldo_final); //-> Funciones que quiero imprimir por pantalla
            continua= continuar();

        }while(continua.equals("SI"));
    }// Fin del programa principal
    
    //Creo una funcion que me permita ingresar por teclado el monto que deseo pagar
    public static double monto_pago() {
        Scanner in=new Scanner(System.in);
        //Declaracion de mis variables locales
        double monto_pagar=0.00;    
        
        //Validacion del monto a pagar ingresado por teclado
        while(monto_pagar < 0 && monto_pagar >1500){
            System.out.println("Ingrese el monto que desea pagar:");
            monto_pagar= in.nextInt();
        
            if (monto_pagar < 0 && monto_pagar >1500){
            System.out.println("Ingrese una monto correcto:");
            }
        }
        //Me guarda el valor que quiero utilizar en el programa principal o en otra funcion
        return monto_pagar;
    }    
        
    //Creo una funcion que me permita seleccionar la opcion de pago
    public static int opcion_pagar() {
        Scanner in=new Scanner(System.in);
        //Declaracion de mis variables locales
        int opcion_pago=0;
        double salgo_pagar=0.00;
        final int cuota= 1500;
        
        //Validacion de ingresos por teclado por el usuario
        while(opcion_pago!= 1 && opcion_pago!= 2){
            System.out.println("Ingrese la opcion de pago:");
            System.out.println("1.Total");  
            System.out.println("2.Parcial");
            opcion_pago=in.nextInt();
            
            //Mensaje de error
            if (opcion_pago!= 1 && opcion_pago!= 2) {
                System.out.println("Ingrese una opcion correcta:"); 
            }
        } 
        
        //Guardo el valor de la opcion de pago que me ingreso el usario
        return opcion_pago;
    }

    //Creo una funcion que me permita hacer operaciones con el valor que mi usario elegio en la opcion de pago
    public static double pago_final(int opcion_pagar) {
        //Utilizo el modulo opcion pagar
        opcion_pago= opcion_pagar();

        //Operaciones en caso de que el usario me elija un opcion u otra
        if(opcion_pago == 1){
            saldo_pagar= cuota;
        }
        
        else{
            saldo_pagar= cuota - monto_pagar;
        }
            
        return saldo_pagar;   
    }    
}

    //Creo una funcion que me permita ingresar el modo de pago de ese monto a pagar
    public static int modo_pagar() {
        Scanner in=new Scanner(System.in);

        //Defino mis variables locales
        int modo_pago= 0;
        //Validacion de los ingresos por teclado del usuario
        while(modo_pago!= 1 && modo_pago!= 2 && modo_pago!= 3){
            System.out.println("Ingrese el modo de pago:");
            System.out.println("1.Efectivo");  
            System.out.println("2.Tarjeta de credito");
            System.out.println("3.Tarjeta de debito");
            modo_pago=in.nextInt();
            
            //Mensaje de error
            if (modo_pago!= 1 && modo_pago!= 2 && modo_pago!= 3) {
                System.out.println("Ingrese una modo de pago correcto:"); 
            }
        }

        return modo_pago;
    }

    //Creo una funcion que me permite realizar operaciones con ese modo de pago
    public static double recargo_final(int saldo_pagar, int modo_pago){
        Scanner in=new Scanner(System.in);
        //Utilizo mi modulo saldo pagar
        saldo_pagar= pago_final();
        //Utilizo mi modulo modo pagar
        modo_pago= modo_pagar();


        //Defino mi variable local
        double saldo_final= 0.00;

        //Operaciones en caso de que el usario me elija un opcion u otra
        //Descuento de un 10% al ser pago en efectivo
        if(modo_pago == 1){
            saldo_final= saldo_pagar * 0.9;
        //Regargo de un 7% al ser pago en tarjeta de debito
        }else if(modo_pago == 2){
            saldo_final= saldo_pagar * 1.07;
        //Recargo de un 5% al ser pago en tarjeta de credito
        }else{
            saldo_final= saldo_pagar * 1.05;
        }
        
        return saldo_final;  
    }

    //Creo un procedimiento que me permita generar un print por pantalla de mis resultados
    public static void imprimir(int monto_pago,int opcion_pagar,int modo_pagar,int recargo_final){ //-> los return o el nombre de variables

        //Imprimo por pantalla a los resultados obtenidos en el programa 
        System.out.println("El monto a pagar es:" + monto_pagar );
        System.out.println("La opcion de pago es:" + opcion_pago);
        System.out.println("El modo de pago es:" + modo_pago);
        System.out.println("El saldo final a pagar es:" + saldo_final);
    }

    //Creo una funcion que me permita continuar o no el programa
    public static String continuar(){
        Scanner in=new Scanner(System.in);

        //Declaro mis variables locales
        String continua;

        do{
            System.out.println("Desea continuar?");
            continua=in.nextLine().toUpperCase();
            
            //Validacion del ingreso por teclado del usario
            if(continua.equals("SI")==false && continua.equals("NO")==false){
                System.out.println("ERROR- Ingrese solo SI o NO:");
            }
            
        }while(continua.equals("SI")==false && continua.equals("NO")==false);
        
        return continua;
    }

}