package skynet;

import com.fasterxml.jackson.databind.JsonNode;

import data.JsonGrafoParser;
import graphic.*;
public class Main {

	public static void main(String[] args) {
		// Inicialización de la ventana, el modelo y el controller.
		WindowMainView vista = new WindowMainView();
		WindowMainModel modelo = new WindowMainModel();
		WindowMainController controller = new WindowMainController(vista, modelo);
		vista.setVisible(true);
		vista.setResizable(false);
		
		// Parser (instancia temporal / permanente)
		JsonGrafoParser grafosJasonParser = new JsonGrafoParser();
		
		grafosJasonParser.setPath("C:\\Users\\Hellish\\Desktop\\SkyNet\\data\\grafo1.txt");
		JsonNode grafo1Node = grafosJasonParser.parseJsonFromFile();
		
		grafosJasonParser.setPath("C:\\Users\\Hellish\\Desktop\\SkyNet\\data\\grafo2.txt");
		JsonNode grafo2Node = grafosJasonParser.parseJsonFromFile();
		
		grafosJasonParser.setPath("C:\\Users\\Hellish\\Desktop\\SkyNet\\data\\grafo3.txt");
		JsonNode grafo3Node = grafosJasonParser.parseJsonFromFile();
		
		//System.out.println(grafo1Node.toPrettyString());
		//System.out.println(grafo2Node.toPrettyString());
		//System.out.println(grafo3Node.toPrettyString());
		
	}
}
