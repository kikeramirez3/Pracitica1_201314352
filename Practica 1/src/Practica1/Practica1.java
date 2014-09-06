package Practica1;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
import java.util.Collections;


public class Practica1 {
	static int [] ArrayIntegers=new int[16];
	 static String [] ArrayString= new String[16];
	int c1jugador, c2judar, c1maquina, c2maquina=0;
		
	static String jug1,jug2;
	static String humano;
    static String maquina;
	public static void jugadores(){
		Scanner w=new Scanner(System.in);
		 
		System.out.println("Por favor ingrese su Nombre");
		humano=w.next();
		
		System.out.println("Por favor ingrese el nombre de su rival");
		maquina=w.next();
		
	}
	
	public static void mazo(){
		
		for(int ordenar=0;ordenar< ArrayIntegers.length ;ordenar++){
			ArrayIntegers[ordenar]=ordenar;
			if (ArrayIntegers[ordenar]==0 || ArrayIntegers[ordenar]==1 || ArrayIntegers[ordenar]==2 || ArrayIntegers[ordenar]==3 || ArrayIntegers[ordenar]==4 ){
				ArrayIntegers[ordenar]=1;
			}
			if(ArrayIntegers[ordenar]==5 ||ArrayIntegers[ordenar]==6){
				ArrayIntegers[ordenar]=2;
			}
			if(ArrayIntegers[ordenar]==7 ||ArrayIntegers[ordenar]==8){
				ArrayIntegers[ordenar]=3;
			}
			if(ArrayIntegers[ordenar]==9 ||ArrayIntegers[ordenar]==10){
				ArrayIntegers[ordenar]=4;
			}
			if(ArrayIntegers[ordenar]==11 ||ArrayIntegers[ordenar]==12){
				ArrayIntegers[ordenar]=5;
			}
			if(ArrayIntegers[ordenar]==13){
				ArrayIntegers[ordenar]=6;
			}
			if(ArrayIntegers[ordenar]==14){
				ArrayIntegers[ordenar]=7;
			}
			if(ArrayIntegers[ordenar]==15){
				ArrayIntegers[ordenar]=8;
			}	
			
		}
		
		
		
	
	

	Collections.shuffle(Arrays.asList(ArrayIntegers));
	
	
	

		for(int asignar=0;asignar<ArrayIntegers.length;asignar++){
			if(ArrayIntegers[asignar]==1){
				ArrayString[asignar]="Guard";
				
			}
			if(ArrayIntegers[asignar]==2){
				ArrayString[asignar]="Priest";
			}
			if(ArrayIntegers[asignar]==3){
				ArrayString[asignar]="Baron";
			}
			if(ArrayIntegers[asignar]==4){
				ArrayString[asignar]="HandMaid";
			}
			if(ArrayIntegers[asignar]==5){
				ArrayString[asignar]="Prince";
			}
			if(ArrayIntegers[asignar]==6){
				ArrayString[asignar]="King";
			}
			if(ArrayIntegers[asignar]==7){
				ArrayString[asignar]="Countess";
			}
			if(ArrayIntegers[asignar]==8){
				ArrayString[asignar]="Princess";
			}
	
		
		
		
		
		}
	}
	
	
	public static int moneda(int x){
		Random aleatorio=new Random();
		int randomNum = aleatorio.nextInt(x);
		return randomNum;
		
		
	}
	
	
	public static void ronda(){
		
		mazo();
		jugadores();
		int r= moneda(2);
		if(r==0){
			jug1=humano;
			System.out.println("se acaba de lanzar la moneda");
			System.out.println("la ronda la incia"+jug1);
		}else
			if(r==1){
				jug2=maquina;
				System.out.println("Se acaba de lanzar la moneda");
				System.out.println("la ronda la incia"+jug2);
			
		}
		
		
		
	}
	public int repatir(int valor){
		int h=0;
		int n=0;
		
		return h;
	}
	
	
	public static int tokens(){
		Scanner q=new Scanner(System.in);
		int a=0;
		int c;

		do{
			System.out.println("Usted debe de escoger la candidad de tokens para este juego");
		System.out.println("Usted puede escojer la cantidad de 1 o 3 tokens");
		System.out.println("Ingrese (1) para un token");
		System.out.println("Ingrese (2) para tres tokens");
		c=q.nextInt();
		if (c==1){
			System.out.println("Usted ha escojido un tokens");
			a=1;
		}else if(c==2){
			System.out.println("Usted ha escojido tres tokens");
			a=1;
		}else if(c!=2||c!=1){
			System.out.println("El valor numerico que usted ha ingresado no corresponde con las opciones");
		
		}
		
		}while(a==0);
		return c;			
	}

	
	
public static void reglas(){
	System.out.println("--==Love Letter Reglas==--");
	System.out.println("Es un juego de riegos deducciones y suerte");
	System.out.println("------===Inicio===------");
	System.out.println("Consta de un mazo de 16 cartas, cada jugador comienza con una carta en su mano \n y recibe otra carta al incio de su turno.");
	System.out.println("Si se encuentra protegido por el haid maid el efecto de esta carta desaparecera.");
	System.out.println("------==Utilizar una Carta==------");
	System.out.println("Un jugado podra utilizr una carta sobre su rival siempre y cuando este no se \n encuentre protegido por la HandMaid");
	System.out.println("------==Carta==------");
	System.out.println("-------Guard--------");
	System.out.println("Permite adivinar la mano del rival (cartas del 2-8) si adivina, el jugador rival \n sale del juego. (5 en el mazo)");
	System.out.println("-------Priest--------");
	System.out.println("Permite ver la mano del jugador rival. (2 en el mazo)");
	System.out.println("-------Baron--------");
	System.out.println("Compara manos con el rival, el jugador con la carta mas baja sale del juego. En \n caso de empate no sucede nada. (2 en el mazo)");
	System.out.println("-------HandMaid------");
	System.out.println("El jugador que utiliza esta carta es inmune a los ataques de los demas por un (1) \n turno. (2 en el mazo)");
	System.out.println("Prince");
	System.out.println("-------Prince-------");
	System.out.println("Permite “botar” la mano del jugador o la del rival. Y da una carta nueva del deck.\n (2 en el mazo)");
	System.out.println("-------King---------");
	System.out.println("Intercambia manos entre jugadores.(1 en el mazo)");
	System.out.println("-------Countess--------");
	System.out.println("Si el jugador tiene un Prince o King en su mano y la Countess debe jugar la Countess. \n (1 en el mazo)");
	System.out.println("-------Princess--------");
	System.out.println("Si el jugador juega esta carta pierde el juego. (1 en el mazo)");
	System.out.println("------==Fin de la Ronda==------");
	System.out.println("Si un jugador gana la ronda se le sumara un token,si no se ha llegado al limite se procedera \n a jugar una ronda nueva.");
	System.out.println("");
	System.out.println("");
	
	
	
}	

public static void menu(){
	Scanner s= new Scanner (System.in);
	int a=0;
		System.out.println("-=Bienvenido a Love Letter=-");
		System.out.println("(1)Jugar una partida");
		System.out.println("(2)Seleccionar numero de tokens a jugar");
		System.out.println("(3)Mostrar las reglas del juego");
		System.out.println("(4)salir");
		
		a=s.nextInt();
	
			switch (a){
			case 1:
				ronda();
				break;
			case 2:
				tokens();
				menu();
				
				break;
			case 3:
				reglas();
	menu();
				break;
			case 4:
				System.exit(0);
				break;
				default:
					System.out.println("El numero que usted ingreso no corresponde al menu");
					System.out.println("Presione los numeros que estan en los corchetes");
					
		menu();
			}
}
	


	
	public static void main(String[] args) {
	
			menu();
			
			}
			
			
}
