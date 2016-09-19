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
                System.out.println("Scrivere: info -per avere informazioni sul programma");
		System.out.println("Selezionare tra: somma, sottrazione, moltiplicazione, divisione");
		
        // "selettore" parte vuoto
		String selettore = null; 
		sc0 = new Scanner(System.in);
		
	// se presente qualcosa parte il programma
		selettore = sc0.nextLine();
		
		if (selettore.equals("impostazioni")) {
			System.out.println("Inserire utente");
			String user = null;
			Scanner sc2 = new Scanner(System.in);
			user = sc2.nextLine();

			System.out.println("Inserire password");
			String password = null;
			Scanner sc3  = new Scanner(System.in);
			password = sc3.nextLine();

			if (user.equals("admin") && password.equals("admin")) {
				System.out.println("Grazie per esserti loggato");

				/* Aggiungere impostazioni nelle impostazioni*/

				return;
			}else System.out.println("Utente o password errati");
			return;
// somma
		}else if (selettore.equals("somma")) {
			// 1 numero
			System.out.println("Inserisci numero 1 #somma");
			sc = new Scanner(System.in);			
			Double n1 = sc.nextDouble();
			
			// 2 numero
			System.out.println("Inserisci numero 2 #somma");
			sc1 = new Scanner(System.in);
			Double n2 = sc1.nextDouble();

			// esegue il calcolo
			Double somma = n1+n2;
			// risultato
			System.out.println("La somma è " + somma);
			
// moltiplicazione
		}else if(selettore.equals("moltiplicazione")){
			// 1 numero
			System.out.println("Inserisci numero 1 #moltiplicazione");
			sc2 = new Scanner(System.in);
			Double n1 = sc2.nextDouble();
			
			// 2 numero
			System.out.println("Inserisci numero 2 #moltiplicazione");
			sc12 = new Scanner(System.in);
			Double n2 = sc12.nextDouble();

			// esegue il calcolo
			Double moltiplicazione = n1*n2;
			// risultato
			System.out.println("La moltiplicazione è " + moltiplicazione);
			
// divisione			
		}else if(selettore.equals("divisione")){
			// 1 numero
			System.out.println("Inserisci numero 1 #divisione");
			sc3 = new Scanner(System.in);
			Double n1 = sc3.nextDouble();
			
			// 2 numero
			System.out.println("Inserisci numero 2 #divisione");
			sc13 = new Scanner(System.in);
			Double n2 = sc13.nextDouble();
			
			// esegue il calcolo
			Double divisione = n1/n2;
			// risultato
			System.out.println("La divisione è " + divisione);
			
// sottrazione			
		}else if(selettore.equals("sottrazione")){
			// 1 numero
			System.out.println("Inserisci numero 1 #sottrazione");
			sc4 = new Scanner(System.in);
			Double n1 = sc4.nextDouble();
			
			// 2 numero
			System.out.println("Inserisci numero 2 #sottrazione");
			sc14 = new Scanner(System.in);
			Double n2 = sc14.nextDouble();

			// esegue il calcolo
			Double sottrazione = n1-n2;
			// risultato
			System.out.println("La sottrazione è " + sottrazione);
			
			// info
		}else if (selettore.equals("info")){
                        System.out.print("Calcolatrice: è possibile eseguire addizione, sottrazione, moltiplicazione e divisione");

// input non presente tra quelli possibili
                }else{
			System.out.println("Leggi le istruzioni");
			return;
		}
	}	
}
