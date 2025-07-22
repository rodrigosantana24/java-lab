package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_And_BufferedWriter {

	public static void main(String[] args) {
		String[] lines = new String[] {"Olá, ", "Tudo bem? ", "Me chamo Rodrigo."};
		String path = "c:\\temp\\text.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			for(String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}
