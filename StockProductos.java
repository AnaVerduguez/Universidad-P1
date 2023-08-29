//Librerias
import java.util.Scanner;

public class Ejemplo{

	//Programa principal
	public static void main(String args[]){
		
		//Declaración de objetos
		Scanner in=new Scanner(System.in);
		
		//Declaración de variables
		char opcion='z';
		int cajoncer=-1;
		int cajongas=-1;
		int totalcajoncer=0;
		int totalcajongas=0;
		int totalcajon=0;
		double porcentaje=0;
		double montoenvasescer=0.00;
		
		//Programa principal
		while(opcion!='d'){
			
			//Dibujo menu de opciones
			System.out.println("");
			System.out.println("M E N U");
			System.out.println("a. Cargar cajones de cerveza");  
			System.out.println("b. Cargar cajones de gaseosa");
			System.out.println("c. Reportes");
			System.out.println("d. Salir");
			System.out.println("");
			
			//Validacion y Seleccion de opcion
			while(opcion!='a' && opcion !='b' && opcion !='c' && opcion != 'd'){
			   System.out.println("Seleccione opcion:");
			   opcion=in.next().charAt(0);
			
			   //Mensaje de error
			   if(opcion!='a' && opcion !='b' && opcion !='c' && opcion != 'd'){
			     System.out.println("Error - ingrese a,b,c, o d"); 
			   }
			}
			
			//************************************************************************
			//  O P C I O N    E L E G I D A
			//************************************************************************
			
			// ***********************************************************************
			//   C A R G A    D E   C E R V E Z A 
			// ***********************************************************************
			if(opcion=='a'){
			   //Validacion y Seleccion de opcion
			   while(cajoncer <=0){
			      System.out.println("Ingrese cajones de cerveza");
			      cajoncer=in.nextInt();
			
			      //Mensaje de error
			      if(cajoncer <=0){
			        System.out.println("Error - ingrese valor positivo"); 
			      }
			   }
			   //Calcular el total de cajones de cerveza
			   totalcajoncer=totalcajoncer + cajoncer;
			}
			
			// ***********************************************************************
		    //   C A R G A   D E   G A S E O S A
			// ***********************************************************************
			if(opcion=='b'){
			   //Validacion y Seleccion de opcion
			   while(cajongas <=0){
			      System.out.println("Ingrese cajones de gaseosa");
			      cajongas=in.nextInt();
			
			      //Mensaje de error
			      if(cajongas <=0){
			        System.out.println("Error - ingrese valor positivo"); 
			      }
			   }
			   //Calcular el total de cajones de cerveza
			   totalcajongas=totalcajongas + cajongas;
			}
			
			// ***********************************************************************
		    //   R E P O R T E S
			// ***********************************************************************
			if(opcion=='c'){
			   
			   //Calcular el total general de cajones
			   totalcajon=totalcajoncer + totalcajongas;
			   
			   //Calcular el porcentaje de cajones de cerveza
			   //---------------------------------------------------------------------------------------------------
			   //IMPORTANTE: La función Double.Valueof(variable) permite convertir un tipo de dato entero a double
			   //Si no se convierten las variables totalcajoncer y totalcajon (son enteras) a double el resultado 
			   //de la división será cero, y el porcentaje se mostrará de manera incorrecta
			   //--------------------------------------------------------------------------------------------------
			   porcentaje=(Double.valueOf(totalcajoncer)/Double.valueOf(totalcajon))*100;
			   
			   //Monto valorizado de envases
			   montoenvasescer=totalcajoncer*6*50;
			   
			   //Salida por pantalla
			   System.out.println("");
			   System.out.println("Total de cajones de cerveza: "+totalcajoncer);
			   System.out.println("Total de cajones de gaseosa: "+totalcajongas);
			   System.out.println("Total de cajones de cajones: "+totalcajon);
			   System.out.println("Porcentaje de cajones de cerveza sobre el total de cajones: "+porcentaje);
			   System.out.println("Monto de envases de cerveza: "+montoenvasescer);
			   System.out.println("");
			}
			
			// ***********************************************************************
		    //   S A L I R
			// ***********************************************************************
			if(opcion=='d'){
			   System.exit(0);
			}
			
            //Incializar las variables para forzar entrada a las validaciones
			opcion='z';
			cajoncer=-1;
			cajongas=-1;
		}
	}
}

