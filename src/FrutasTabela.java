import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class FrutasTabela {

	public static void main(String[] args) throws IOException {
		
        String path = "C:\\TEMP\\AULA";
        String nome ="generic_food.csv";
		File arq = new File(path,nome);
		
		FileInputStream fluxo = new FileInputStream(arq);
		InputStreamReader leitor = new InputStreamReader(fluxo);
		BufferedReader buffer = new BufferedReader(leitor);
		String linha = buffer.readLine();
		
		
		    
		    System.out.println("FOOD NAME     |SCIENTIFIC NAME     |SUB GROUP");
		while(linha != null) {
			
			  linha = buffer.readLine();
					
			
			String[] Fileiras = linha.split(",");
			String[] espacos = linha.split("|");
			
			System.out.println(Fileiras[0]+"   |  "+Fileiras[1]+"   |   "+Fileiras[3]);
			
	}
		
			
			Scanner leitor1 = new Scanner(linha);
			
			buffer.close();
			leitor.close();
			fluxo.close();
		
		
	
		
		}

}

