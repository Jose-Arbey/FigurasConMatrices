import java.util.Scanner;

public class CuadradoMatrices {
	public static void  main (String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Escribe el numero de asteriscos por lado del cuadrado: ");
		int lado = sc.nextInt();
		System.out.println();

		String tablero [] [];

		tablero = new String [lado] [lado];

		for(int a = 0; a < tablero.length; a++) {
			for(int b = 0; b < tablero[a].length; b++) {
				if(a == 0 || a == tablero.length - 1) {
					tablero[a][b] = "* ";
				}else if(b == 0 || b == tablero[a].length - 1){
					tablero[a][b] = "* ";
				} else {
					tablero[a][b] = "  ";
				}
			}
			
		}

		mostrarTablero(tablero);
	}

	public static void mostrarTablero ( String tablero [] [] ) {
		for(int a = 0; a < tablero.length; a++) {
			for(int b = 0; b < tablero[a].length; b++) {
				System.out.print(tablero[a][b]);
			}
		  System.out.println();
		}
	}
}
