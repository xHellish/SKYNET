package data;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

// Parser de un json de acuerdo a su ruta
public class JsonGrafoParser {
	
	String path;
	
	public JsonGrafoParser() {
		
	}
	
	public JsonNode parseJsonFromFile() {
        try {
            String jsonContent = readFile();
            ObjectMapper objectMapper = new ObjectMapper();
            return objectMapper.readTree(jsonContent);
        } catch (IOException e) {
            System.err.println("Error al leer o parsear el archivo JSON: " + e.getMessage());
            return null; 
        }
    }
	
	private String readFile() throws IOException {
        Path _path = Paths.get(path);
        return new String(Files.readAllBytes(_path));
    }
	
	public void setPath(String newPath) {
		this.path = newPath;
	}
}
