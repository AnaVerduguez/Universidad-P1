import java.util.Scanner;

/* **********************************************************************************
   Materia: Programación I
   Fecha: 26/05/22
   Autor: Ana Belén Verduguez
   Descripción: Ejercicio 2
   Paradigma empleado: Programación modular
   Ultima actualización: 27/05/22
************************************************************************************* */
/* ***********************************************************************************
                         A N A L I S I S 
--------------------------------------------------------------------------------------   
    ENTRADA      |               PROCESOS                       |   SALIDAS
--------------------------------------------------------------------------------------
 opcion          |  repo_final1= repo_prenda1 - stock_prenda1   |  repo_final1
 stock_prenda1   |  repo_final2= repo_prenda2 - stock_prenda2   |  repo_final2
 repo_prenda1    |  repo_final3= repo_prenda3 - stock_prenda3   |  repo_final3
 stock_prenda2   |  max_repo= repo_final > max_repo             |  max_repo
 repo_prenda2    |  min_repo= repo_final < min_repo             |  min_repo
 stock_prenda3   |  acumulador= acumulador + repo_final1 +      |  acumulador
 repo_prenda3    |  repo_final2 + repo_final3                   |  contador
                 |  contador= contador  + 1                     |                                           
--------------------------------------------------------------------------------------
*/
 
class PROG1_2022_ACT2_VERDUGUEZ_ANA{
/* ***********************************************************************************
                     P R O G R A M A  P R I NC I P A L 
 Descripción: Este sera nuestro programa principal o main en donde solo declararemos las 
 variables locales que utilizaremos. Desde el programa principal llamaremos a las funciones
 o procedimientos.                             
*********************************************************************************** */       
 
	public static void main(String[] args) {
        //Declaracion de objetos en JAVA
        Scanner in=new Scanner(System.in);
        //Declaracion e inicializacion de mis variables a utilizar
        char opcion='z';
        
        int stock_prenda1=-1, repo_prenda1=-1, repo_final1=0; 
        
        int stock_prenda2=-1, repo_prenda2=-1, repo_final2=0; 		
        
        int stock_prenda3= -1, repo_prenda3=-1 ,repo_final3=0;
        
        int max_repo=0, min_repo=0;
       
        int contador=0, acumulador=0;
        
        do{
			menu(); //Esto me permite llamar al procedimiento menu
			opcion=opcion_elegida(); //Esto me permite llamar a la función opcion elegida
			
			if(opcion!='e'){
				
				procedimiento_opciones(opcion);
				
			//Inicializo las variables 
	           
		    opcion='z';
		    stock_prenda1= -1;
		    repo_prenda1= -1;
		    stock_prenda2= -1;
		    repo_prenda2= -1;
		    stock_prenda3= -1;
		    repo_prenda3= -1;
			}

        }while(opcion!='e');
    }// F I N   P R O G R A M A     P R I N C I P A L
   

/* **********************************************************************************  
                          M Ó D U L O S 
 Descripción: Los modulos que creamos siempre van despues de la finalizacion de nuestro
 programa principal. En este caso utilizaremos  modulos con sus respectivas operaciones.
********************************************************************************* */

/* **********************************************************************************  
                              M E N U 
 Descripción: Este sera nuestro menu en donde se imprimiran por pantalla todas la opciones
 Tipo: Procedimiento
 Parametros de entrada y salida : No hay dentro del menu ya que es un procedimiento
 
********************************************************************************* */
   public static void menu() {
	   System.out.println("a. Cargar datos de la prenda 1");  
	   System.out.println("b. Cargar datos de la prenda 2"); 
   	   System.out.println("c. Cargar datos de la prenda 3"); 
       System.out.println("d. Reportes."); 
       System.out.println("e. Salir. ");
   }
/* ************************************************************************
                .★. I N G R E S A R    O P C I O N .★.

Descripción: Ingreso y validacion de la opcion del menu que ingresa por teclado el usuario 
Tipo: Funcion
Párametros de entrada: No hay
Páramentros de salida: opcion

********************************************************************** */   
   public static char opcion_elegida(){
		
	   //Declaracion de objetos
	   Scanner in=new Scanner(System.in);
	   //Declaracion de mis variables locales que solo son visibles para este modulo
	   char oopcion= 'z';
	   
	   do{
		   System.out.println("Seleccione la opcion que desee:");
	       oopcion=in.next().charAt(0);
				
	       //Mensaje de error en caso de que el usuario ingrese una opcion diferente
	       if(oopcion!='a' && oopcion!='b' && oopcion!='c' && oopcion!='d' && oopcion!='e'){
	    	   System.out.println("Error-Ingrese una opcion correcta:"); 
	       }
		}while(oopcion!='a' && oopcion!='b' && oopcion!='c' && oopcion!='d' && oopcion!='e');
	
	
		//Devuelvo un parametro, en este caso el parametro de salida ya que utilizo una funcion
		return oopcion;
  }
    
 /* ************************************************************************
               C A R G A  D E  D A T O S 

Descripción: Ingreso y validacion de los datos que ingresa el usuario por teclado
Tipo:Funcion
Párametros de entrada: no hay
Páramentros de salida: stock_prenda1,repo_prenda1,stock_prenda2,repo_prenda2,stock_prenda3,repo_prenda3

********************************************************************** */  
   public static int carga_datos1(int stock_prenda1,int repo_prenda1){	
		
		//Declaracion de objetos
		Scanner in=new Scanner(System.in);
		
		do{
	    	System.out.println("Ingrese el stock actual de la prenda 1:");
	        stock_prenda1= in.nextInt();    
		       
	        //Mensaje de error en caso de que usuario me ingrese numeros negativos
	        if(stock_prenda1<0){
	        		   System.out.println("Error-Ingrese un numero correcto"); 
	        	   }
	    }while(stock_prenda1<=0);
	    return stock_prenda1;
	           
	    do{
	        System.out.println("Ingrese el stock necesario que debe tener la prenda 1:");
	        repo_prenda1= in.nextInt(); 
	        
	        //Mensaje de error en caso de que el usuario me ingrese numeros negativos
	    	if(repo_prenda1<=0){
	        	System.out.println("Error-Ingrese un numero correcto"); 
	        	   }
	     }while(repo_prenda1<=0);
	     return repo_prenda1;
	}
//*************************************************************************
   public static int carga_datos2(int stock_prenda2,int repo_prenda2){	
		
		//Declaracion de objetos
		Scanner in=new Scanner(System.in);
		
		do{
	    	System.out.println("Ingrese el stock actual de la prenda 1:");
	        stock_prenda2= in.nextInt();    
		       
	        //Mensaje de error en caso de que usuario me ingrese numeros negativos
	        if(stock_prenda2<0){
	        		   System.out.println("Error-Ingrese un numero correcto"); 
	        	   }
	    }while(stock_prenda2<=0);
	    return stock_prenda2;
	           
	    do{
	        System.out.println("Ingrese el stock necesario que debe tener la prenda 1:");
	        repo_prenda2= in.nextInt(); 
	        
	        //Mensaje de error en caso de que el usuario me ingrese numeros negativos
	    	if(repo_prenda2<=0){
	        	System.out.println("Error-Ingrese un numero correcto"); 
	        	   }
	     }while(repo_prenda2<=0);
	     return repo_prenda2;
	}   
 //*************************************************************************
   public static int carga_datos3(int stock_prenda3,int repo_prenda3){	
		
		//Declaracion de objetos
		Scanner in=new Scanner(System.in);
		
		do{
	    	System.out.println("Ingrese el stock actual de la prenda 1:");
	        stock_prenda23= in.nextInt();    
		       
	        //Mensaje de error en caso de que usuario me ingrese numeros negativos
	        if(stock_prenda3<0){
	        		   System.out.println("Error-Ingrese un numero correcto"); 
	        	   }
	    }while(stock_prenda3<=0);
	    return stock_prenda3;
	           
	    do{
	        System.out.println("Ingrese el stock necesario que debe tener la prenda 1:");
	        repo_prenda3= in.nextInt(); 
	        
	        //Mensaje de error en caso de que el usuario me ingrese numeros negativos
	    	if(repo_prenda3<=0){
	        	System.out.println("Error-Ingrese un numero correcto"); 
	        	   }
	     }while(repo_prenda3<=0);
	     return repo_prenda3;
	}	           
           

/* ************************************************************************
                D E T E R M I N O  L A  O P C I O N 

Descripción: Ingreso y validacion de la opcion del menu que ingresa por teclado el usuario 
Tipo: Procedimiento
Párametros de entrada: repo_prenda1,stock_prenda1,repo_prenda3,stock_prenda3,repo_prenda3,stock_prenda3
Páramentros de salida: repo_final1, repo_final2, repo_final3

********************************************************************** */   
   public static void procedimiento_opciones(char oopcion){
	   
	   int repo_final1= 0;
	   //Determino las operaciones que elije el usuario
	   if(oopcion=='a'){
		   //Si la opción que eligió el usuario es a, entonces:
           //Calculo la cantidad que debo de reponer de la prenda 1
           repo_final1= repo_prenda1 - stock_prenda1;
           	
	   }else if(oopcion=='b'){
	 		//Si la opción que eligió el usuario es b, entonces:
            //Calculo la cantidad que debo de reponer de la prenda 1
            repo_final2= repo_prenda2 - stock_prenda2;

	   }else if(oopcion=='c'){
            //Si la opción que eligió el usuario es c, entonces:
            //Calculo la cantidad que debo de reponer de la prenda 3
            repo_final3= repo_prenda3 - stock_prenda3;

	   }else if(oopcion=='d'){
            //Salida por pantalla. Le muestro al usuario los resultados obtenidos
            System.out.println("");
	 		System.out.println("Total a reponer del producto " + codigo_prenda1 +":" + repo_final1 + " prendas");
	 		System.out.println("Total a reponer del producto " + codigo_prenda2 +":" + repo_final2 + " prendas");
	 		System.out.println("Total a reponer del producto " + codigo_prenda3 +":" + repo_final3 + " prendas");
	 		System.out.println("Mayor reposicion:" + max_repo + " prendas");
	 		System.out.println("Menor reposicion:" + min_repo + " prendas");
 			System.out.println("Se ha ingresado en el programa un total de:" + contador + " prendas");
 			System.out.println("El stock total a reponer en el dia es de:" + acumulador + " prendas variadas");
        
	   }else if(oopcion=='e'){
            //Salgo del menu
            System.exit(0);
            }  
	   
      //Defino los maximos. Mayor cantidad de prendas que tengo que reponer        
	   if(repo_final1 > max_repo) {
		   max_repo = repo_final1;
	   }
    	
       if(repo_final2 > max_repo) {
    	   max_repo = repo_final2;
       }
       if(repo_final3 > max_repo) {
    	   max_repo = repo_final3;
       }
       //Defino los minimos. Menor cantidad de prendas que tengo que reponer 
       if(repo_final1 < min_repo) {
    	   min_repo = repo_final1;
       }
       if(repo_final2 < min_repo) {
    	   min_repo = repo_final2;
       }
       if(repo_final3 < min_repo) {
    	   min_repo = repo_final3;
       }
    	            
               
   }
     
} 