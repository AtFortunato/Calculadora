# Calculadora
package new_calc;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		File arquivo = new File("arquivo.txt");
		Scanner key = new Scanner(System.in);
		int op = 0;
		try {
			arquivo.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		do{
		Gerencia.escrever("arquivo.txt");
		Gerencia.ler("arquivo.txt");
		System.out.println("deseja continuar 1 = sim / 2 = nao");
		op = key.nextInt();
		}while(op != 2);
	}

}
