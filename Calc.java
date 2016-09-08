import java.util.Scanner;

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
		System.out.println("Selezionare tra: somma, sottrazione, moltiplicazione, divisione");

		String selettore = null; 
		sc0 = new Scanner(System.in);
		selettore = sc0.nextLine();
		
		
// somma		
		if (selettore.equals("somma")) {
			System.out.println("Inserisci numero 1 #somma");
			sc = new Scanner(System.in);
			float n1 = sc.nextInt();
			System.out.println("Inserisci numero 2 #somma");
			sc1 = new Scanner(System.in);
			float n2 = sc1.nextInt();
			float somma = n1+n2;
			
			System.out.println("La somma è " + somma);
			
// moltiplicazione
		}else if(selettore.equals("moltiplicazione")){
			System.out.println("Inserisci numero 1 #moltiplicazione");
			sc2 = new Scanner(System.in);
			float n1 = sc2.nextInt();
			System.out.println("Inserisci numero 2 #moltiplicazione");
			sc12 = new Scanner(System.in);
			float n2 = sc12.nextInt();
			float moltiplicazione = n1*n2;
			
			System.out.println("La moltiplicazione è " + moltiplicazione);
			
// divisione			
		}else if(selettore.equals("divisione")){
			System.out.println("Inserisci numero 1 #divisione");
			sc3 = new Scanner(System.in);
			float n1 = sc3.nextInt();
			System.out.println("Inserisci numero 2 #divisione");
			sc13 = new Scanner(System.in);
			float n2 = sc13.nextInt();
			float divisione = n1/n2;
			
			System.out.println("La divisione è " + divisione);
			
// sottrazione			
		}else if(selettore.equals("sottrazione")){
			System.out.println("Inserisci numero 1 #sottrazione");
			sc4 = new Scanner(System.in);
			float n1 = sc4.nextInt();
			System.out.println("Inserisci numero 2 #sottrazione");
			sc14 = new Scanner(System.in);
			float n2 = sc14.nextInt();
			float sottrazione = n1-n2;
			
			System.out.println("La sottrazione è " + sottrazione);
			
		}else{
			System.out.println("Leggi le istruzioni");
		}
	}	
}
