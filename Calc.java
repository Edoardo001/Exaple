// Correggere il crash se inserito un numero decimale e altro che non sia un numero intero

// Importazione scanner
import java.util.Scanner;

// Inizio classe
public class Calc {
	private static Scanner sc0;
	private static Scanner sc;
	private static Scanner sc1;
	private static Scanner sc2;
	private static Scanner sc12;
	private static Scanner sc3;
	private static Scanner sc13;
	private static Scanner sc4;
	private static Scanner sc14;

	public static void main(String[] args) {		
System.out.println("Scrivere info per avere informazioni sul programma");
		System.out.println("Selezionare tra: somma, sottrazione, moltiplicazione, divisione");
		
        // "selettore" parte vuoto
		String selettore = null; 
		sc0 = new Scanner(System.in);
		
		// se presente qualcosa parte il programma
		selettore = sc0.nextLine();
		
		
// somma		
		if (selettore.equals("somma")) {
			// 1 numero
			System.out.println("Inserisci numero 1 #somma");
			sc = new Scanner(System.in);			
			float n1 = sc.nextInt();
			
//			if (sc.equals(int)){
//				System.out.println("Inserire un numero intero");
//			}
			
			// 2 numero
			System.out.println("Inserisci numero 2 #somma");
			sc1 = new Scanner(System.in);
			float n2 = sc1.nextInt();
			
//			if (sc.equals(int)){
//			    System.out.println("Inserire un numero intero");
//		    }
			
			// esegue il calcolo
			float somma = n1+n2;
			// risultato
			System.out.println("La somma è " + somma);
			
// moltiplicazione
		}else if(selettore.equals("moltiplicazione")){
			// 1 numero
			System.out.println("Inserisci numero 1 #moltiplicazione");
			sc2 = new Scanner(System.in);
			float n1 = sc2.nextInt();
			
//			if (sc.equals(int)){
//		        System.out.println("Inserire un numero intero");
//	        }
			
			// 2 numero
			System.out.println("Inserisci numero 2 #moltiplicazione");
			sc12 = new Scanner(System.in);
			float n2 = sc12.nextInt();
			
//			if (sc.equals(int)){
//		        System.out.println("Inserire un numero intero");
//	        }
			
			// esegue il calcolo
			float moltiplicazione = n1*n2;
			// risultato
			System.out.println("La moltiplicazione è " + moltiplicazione);
			
// divisione			
		}else if(selettore.equals("divisione")){
			// 1 numero
			System.out.println("Inserisci numero 1 #divisione");
			sc3 = new Scanner(System.in);
			float n1 = sc3.nextInt();
			
//			if (sc.equals(int)){
//		        System.out.println("Inserire un numero intero");
//	        }
			
			// 2 numero
			System.out.println("Inserisci numero 2 #divisione");
			sc13 = new Scanner(System.in);
			float n2 = sc13.nextInt();
			
//			if (sc.equals(int)){
//		        System.out.println("Inserire un numero intero");
//	        }
			
			// esegue il calcolo
			float divisione = n1/n2;
			// risultato
			System.out.println("La divisione è " + divisione);
			
// sottrazione			
		}else if(selettore.equals("sottrazione")){
			// 1 numero
			System.out.println("Inserisci numero 1 #sottrazione");
			sc4 = new Scanner(System.in);
			float n1 = sc4.nextInt();
			
//			if (sc.equals(int)){
//		        System.out.println("Inserire un numero intero");
//	        }
			
			// 2 numero
			System.out.println("Inserisci numero 2 #sottrazione");
			sc14 = new Scanner(System.in);
			float n2 = sc14.nextInt();
			
//			if (sc.equals(int)){
//		        System.out.println("Inserire un numero intero");
//	        }
			
			// esegue il calcolo
			float sottrazione = n1-n2;
			// risultato
			System.out.println("La sottrazione è " + sottrazione);
			
			// info
		}else if (selettore.equals("info")){
          System.out.print("Calcilatrice: è possibile eseguire addizione, sottrazione, moltiplicazione e divisione. Usare solo numeri interi);

// input non presente tra quelli possibili
}else{
			     System.out.println("Leggi le istruzioni");
		}
	}	
}

