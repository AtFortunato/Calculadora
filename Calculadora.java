public class Calculadora {
	int a,b,resutado;
	char op;
	
	
	public int Calculando(int a,int b,char op){
		this.a=a;
		this.b=b;
		this.op=op;
		
		switch(op){
		
		case '+':
			resutado= a+b;
			break;
		
			
		case '-':
			resutado= a-b;
			break;
			
		case '/':
			resutado=a/b;
			break;
			
		case '*':
			resutado=a*b;
			break;
		
			
		}
		
		return resutado;
	}
}
