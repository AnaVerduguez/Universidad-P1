//Librerias
import java.util.Scanner;
 
public class 1er_parcial_2022{
 
    //Programa principal
    public static void main(String args[]){
        
        //Declaración de objetos
        Scanner in=new Scanner(System.in);
        
        //Declaración de variables
        int origen=-1;
        int destino=0;
        int nropasaje=-1;
        int nrocoche=0;
        double precio=-1.00;
        double totalpasajes=0.00;
        int cantviajescabaros=0;
        int cantcoche1=0;
        int cantcoche2=0;
        int cantcoche3=0;
        
        //int canttotaldeviajes=0;
        
        //Programa principal
        while(nropasaje!=0){
            
            //Ingreso y validacion del precio
            while(nropasaje <0){
                System.out.println("Ingrese un nro de pasaje");
                nropasaje=in.nextInt();
                
                //Mensaje de error
                if(nropasaje <0){
                    System.out.println("ERROR - Ingrese un nro de pasaje");
                }
            }
            
            while(origen <1 || origen >3){
                System.out.println("1. CABA");
                System.out.println("2. ROSARIO");
                System.out.println("3. RESISTENCIA");
                System.out.println("Seleccion un origen");
                origen=in.nextInt();
                
                //Mensaje de error
                if(origen <1 || origen >3){
                    System.out.println("ERROR - Ingrese un origen valido 1-3");
                }
            }
            
            while(destino <1 || destino >3){
                System.out.println("1. CABA");
                System.out.println("2.ROSARIO");
                System.out.println("3.RESISTENCIA");
                System.out.println("Seleccion un destino");
                destino=in.nextInt();
                
                //Mensaje de error
                if(destino <1 || destino >3){
                    System.out.println("ERROR - Ingrese un destino valido 1-3");
                }
            }
            
            while(precio <0.00){
                System.out.println("Ingrese el precio del pasaje");
                precio=in.nextDouble();
                
                //Mensaje de error
                if(precio <0.00){
                    System.out.println("ERROR - Ingrese un precio valido");
                }
            }
            
            //Nro de coche
            while(nrocoche <1 || nrocoche >3){
                System.out.println("Ingrese nro de coche (1-3)");
                nrocoche=in.nextInt();
                
                //Mensaje de error
                if(nrocoche <1 || nrocoche >3){
                    System.out.println("ERROR - Ingrese un nro coche valido 1-3");
                }
            }
            
            /* ************************************************************************************
                          CALCULOS
            /* ********************************************************************************** */
            //Viajes cuyo origen es CABA y destino rosario
            if(origen==1 && destino==2){
                cantviajescabaros=cantviajescabaros+1;
            }
            
            //Calcular el monto total de pasajes vendidos
            totalpasajes=totalpasajes+precio;
            
            //Determinamos el coche que realizo el viaje para contar
            if(nrocoche==1){
                cantcoche1=cantcoche1+1;    
            }
            
            if(nrocoche==2){
                cantcoche2=cantcoche2+1;    
            }
            
            if(nrocoche==3){
                cantcoche3=cantcoche3+1;    
            }
            
            //Incializar variables
            origen=-1;
            destino=-1;
            precio=-1.00;
            nropasaje=-1;   
        }
 
        //Reportes
        System.out.println("Cantidad de viajes CABA y destino ROSARIO:"+cantviajescabaros);
        System.out.println("Monto total:"+totalpasajes);
        System.out.println("Monto total de IVA:"+totalpasajes*0.1050);
        
        //Coche que más viajes hizo
        if(cantcoche1>cantcoche2 && cantcoche1>cantcoche3){
            System.out.println("El coche 1 es el que más viajes realizo");
            
        }else if(cantcoche2>cantcoche1 && cantcoche2>cantcoche3){
            System.out.println("El coche 2 es el que más viajes realizo");
        }else{
            System.out.println("El coche 3 es el que más viajes realizo");
        }
    }
}