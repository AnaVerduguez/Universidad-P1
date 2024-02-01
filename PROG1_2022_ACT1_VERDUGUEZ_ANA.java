/* ************************************************************************************
  Un emprendimiento de ropa de mujer necesita un programa que permita registrar su stock.
Esto permitirá saber que prendas aún están disponibles para la venta al público y la
cantidad de prendas que se debe de reponer.

El emprendimiento cuenta con 3 prendas para su venta al público, cada una de ellas posee
un código que nos permite saber de que tipo de prenda es:
#1247 👗 POLLERAS
#1248 👖JEANS
#1249 🩳Shorts

Debemos de tener en cuenta que el emprendimiento siempre se asegura de tener en stock
ciertas cantidades para cada prenda en específico. Por ejemplo, hay temporadas que se
necesita la totalidad de 20 shorts y en otras solamente de 15 shorts.
Los datos que se necesitan ingresar por parte del usuario son:
● Cantidad de stock actual de esa prenda.
● Cantidad de stock necesario que debe tener esa prenda.

Para llevar a cabo este análisis se debe de crear un menú de opciones. Dentro de él, el
usuario podrá cargar los datos ingresados por teclado y obtener el informe final. El
programa debe de finalizar cuando el usuario marque una de las opciones del menú.
Cuando el programa finalice debemos mostrar por pantalla:
● Cantidad que necesito reponer de la primera prenda.
● Cantidad que necesito reponer de la segunda prenda.
● Cantidad que necesito reponer de la tercera prenda.
● Mayor cantidad de reposición.
● Menor cantidad de reposición.
--------------------------------------------------------------------------------------
*/

import java.util.Scanner;
 
public class PROG1_2022_ACT1_VERDUGUEZ_ANA{
 
    //Programa principal de JAVA
    public static void main(String args[]){
        
        //Declaración de objetos en JAVA
        Scanner in=new Scanner(System.in);
        
        //Declaración de mis variables a utilizar
        char opcion='z';
        
        int codigo_prenda1=1247;
        int stock_prenda1=-1;		
        int repo_prenda1=-1;
        int repo_final1=0;
        
        int codigo_prenda2=1248;
        int stock_prenda2=-1;		
        int repo_prenda2=-1;
        int repo_final2=0;
        
        int codigo_prenda3=1249;
        int stock_prenda3= -1;		
        int repo_prenda3=-1;
        int repo_final3=0;
        
        int max_repo=0;
        int min_repo=0;
        	
        //Programa Actividad 1
        //While principal de mi programa que desencadena las demas operaciones
        
        while(opcion!='e'){
        //Mientras la opción sea diferente a 'e', entonces:   
        //Creo un menu de opciones
            System.out.println(".*.BIENVENIDO.*.");
            System.out.println("    M E N U     ");
            System.out.println("a. Cargar datos de la prenda 1");  
            System.out.println("b. Cargar datos de la prenda 2"); 
            System.out.println("c. Cargar datos de la prenda 3"); 
            System.out.println("d. Reportes."); 
            System.out.println("e. Salir. ");
            
            //Validación de datos ingresados por teclado y selección de opción por parte del usuario. Permite que el usuario NO ingrese
            while(opcion!='a' && opcion!='b' && opcion!='c' && opcion!='d' && opcion!='e'){
               System.out.println("Seleccione la opcion que desee:");
               opcion=in.next().charAt(0);
            
               //Mensaje de error en caso de que el usuario ingrese una opcion diferente
               if(opcion!='a' && opcion!='b' && opcion!='c' && opcion!='d' && opcion!='e'){
                 System.out.println("Error-Ingrese una opcion correcta:"); 
               }
            }
                        
            // ***********************************************************************
            //            C A R G A    D E   D A T O S
            // ***********************************************************************
           
            
         	if(opcion=='a'){
            //Si la opción que eligió el usuario es a, entonces:
            //Validacion y proceso de la opción elegida
         		System.out.println("Ingrese el código de la prenda 1:");
            	while(stock_prenda1<0){
            		System.out.println("Ingrese el stock actual de la prenda 1:");
		            stock_prenda1= in.nextInt();    
		            
		            //Mensaje de error en caso de que usuario me ingrese numeros negativos
		            if(stock_prenda1<0){
		            	System.out.println("Error-Ingrese un numero correcto"); 
		            }
            	}    
		        while(repo_prenda1<=0){
		            System.out.println("Ingrese el stock necesario que debe tener la prenda 1:");
		            repo_prenda1= in.nextInt(); 
		            
		            //Mensaje de error en caso de que el usuario me ingrese numeros negativos
		            if(stock_prenda1<=0){
		            	System.out.println("Error-Ingrese un numero correcto"); 
		            }
            	}  
            	//Calculo la cantidad que debo de reponer de la prenda 1
            	repo_final1= repo_prenda1 - stock_prenda1;
		    }
            
            if(opcion=='b'){
            //Si la opción que eligió el usuario es b, entonces:
            //Validacion y proceso de la opción elegida
            
            	while(stock_prenda2<0){
            		System.out.println("Ingrese el stock actual de la prenda 2:");
		            stock_prenda2= in.nextInt();    
		            
		             //Mensaje de error en caso de que usuario me ingrese numeros negativos
		            if(stock_prenda2<0){
		            	System.out.println("Error-Ingrese un numero correcto"); 
		            }
            	}    
		        while(repo_prenda2<=0){
		            System.out.println("Ingrese el stock necesario que debe tener la prenda 2:");
		            repo_prenda2= in.nextInt(); 
		            
		            //Menesaje de error en caso de que el usuario me ingrese numeros negativos
		            if(stock_prenda2<=0){
		            	System.out.println("Error-Ingrese un numero correcto"); 
		            }
            	}  
            	//Calculo la cantidad que debo de reponer de la prenda 1
            	repo_final2= repo_prenda2 - stock_prenda2;

		    }
		         
		    
            if(opcion=='c'){
            //Si la opción que eligió el usuario es c, entonces:
            //Validacion y proceso de la opción elegida
            
            	while(stock_prenda3<0){
            		System.out.println("Ingrese el stock actual de la prenda 3:");
		            stock_prenda3= in.nextInt();    
		            
		             //Mensaje de error en caso de que usuario me ingrese numeros negativos
		            if(stock_prenda3<0){
		            	System.out.println("Error-Ingrese un numero correcto"); 
		            }
            	}    
		        while(repo_prenda3<=0){
		            System.out.println("Ingrese el stock necesario que debe tener la prenda 3:");
		            repo_prenda3= in.nextInt(); 
		            
		            //Mensaje de error en caso de que el usuario me ingrese numeros negativos
		            if(stock_prenda3<=0){
		            	System.out.println("Error-Ingrese un numero correcto"); 
		            }
            	}  
            	//Calculo la cantidad que debo de reponer de la prenda 3
            	repo_final3= repo_prenda3 - stock_prenda3;

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
	            
            if(opcion=='d') {
            	//Salida por pantalla. Le muestro al usuario los resultados obtenidos
            	System.out.println("");
	 			System.out.println("Total a reponer del producto " + codigo_prenda1 +":" + repo_final1 + " prendas");
	 			System.out.println("Total a reponer del producto " + codigo_prenda2 +":" + repo_final2 + " prendas");
	 			System.out.println("Total a reponer del producto " + codigo_prenda3 +":" + repo_final3 + " prendas");
	 			System.out.println("");
	 			System.out.println("Mayor reposicion:" + max_repo + " prendas");
	 			System.out.println("Menor reposicion:" + min_repo + " prendas");
            }
            
            if(opcion=='e') {
            	//Salgo del menu
            	System.exit(0);
            }

               
            //Inicializo las variables para volver a entrar al while
           
            opcion='z';
            stock_prenda1= -1;
            repo_prenda1= -1;
            stock_prenda2= -1;
            repo_prenda2= -1;
            stock_prenda3= -1;
            repo_prenda3= -1;
       
        }    
     }
} 
