import java.io.IOException;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		
		Scanner leia=new Scanner(System.in);
		Calculadora calc=new Calculadora();
		int result;
		int i,a,b,resultado;
		char op;
		i=1;
		do{
			a=leia.nextInt();
			op=leia.next().charAt(0);
			b=leia.nextInt();
			Arquivo arq=new Arquivo();
			result=calc.Calculando(a, b, op);
			System.out.println(result);
			try {
				arq.escritor(a, b, op);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
			
			
		}while(i!=99);
		
		
		
	}
}
