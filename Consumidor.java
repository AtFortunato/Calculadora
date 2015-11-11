import java.io.File;
import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;


public class Consumidor {
	public static void main (String []args){
		String caminho="log2.txt";
		Arquivo arq=new Arquivo();
		File arquivo = new File("log2.txt");
		int x=1;
		
		while(x==1){
			
		if(arquivo.exists()){
		try {
			arq.leitor(caminho);
			 
			arquivo.delete();
		} catch (IOException e) {
				e.printStackTrace();
		}
		}
		}
	}
}
