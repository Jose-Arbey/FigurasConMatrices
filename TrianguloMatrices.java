import java.util.Scanner;

public class TrianguloMatrices {
	public static void  main (String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Escribe el numero de pisos de tu triangulo: ");
		int base = sc.nextInt();
		System.out.println();

		int columnas = base + (base - 1);

		char tablero [] [];

		tablero = new char [base] [columnas];

		int punto_medio = columnas / 2;

		int izq = 0;
		int der = 0;

		for(int a = 0; a < tablero.length; a++) {
			for(int b = 0; b < tablero[a].length; b++) {
				if(b == punto_medio && a == 0) {
					tablero[a][b] = '*';
				} 
				else if (((b > izq) && (b < der)) && (b % 2 == 0)) {
						tablero[a][b] = '*';
				}
				else if (((b > izq) && (b < der)) && (b % 2 != 0)) {
						tablero[a][b] = '*';
				}
				else {
						tablero[a][b] = ' ';	
				}
			}
			if(a == 0){
				izq = punto_medio - 2;
				der = punto_medio + 2;
			} else {
				izq = izq - 1;
				der = der + 1;
			}
		}

		mostrarTablero(tablero);
	}

	public static void mostrarTablero ( char tablero [] [] ) {
		for(int a = 0; a < tablero.length; a++) {
			for(int b = 0; b < tablero[a].length; b++) {
				System.out.print(tablero[a][b]);
			}
		  System.out.println();
		}
	}
}