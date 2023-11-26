package graphic;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import com.fasterxml.jackson.databind.JsonNode;

import data.FileChooser;
import data.JsonGrafoParser;

public class WindowMainController {
	
    private WindowMainView vista;
    private WindowMainModel modelo;
    
    public WindowMainController (WindowMainView vista, WindowMainModel modelo) {
        this.vista = vista;
        this.modelo = modelo;
        
        initActionListeners();
    }
    
    private void initActionListeners() {
        // Botones listener
        vista.getSubirGrafoButton().addActionListener(e -> subirGrafoHandler());
        
        // Canvas listener -> Más adelante si da tiempo, implementar interacciones con el grafo.
        vista.getCanvasGrafo().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                clickCanvasGrafoHandler(e.getX(), e.getY());
            }

            @Override
            public void mousePressed(MouseEvent e) {
                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
            }
        });
    }
    
    // ------------------- Handlers ------------------- //
    
    private void subirGrafoHandler() {
        FileChooser fileChoose = new FileChooser();
        String archivoJsonPath = fileChoose.getPathGrafo();
        
        if (!archivoJsonPath.equals("null")) {
        	JsonGrafoParser grafoParser = new JsonGrafoParser();
            grafoParser.setPath(archivoJsonPath);
            
            JsonNode grafoNodo = grafoParser.parseJsonFromFile();  
            
            System.out.println(grafoNodo.toPrettyString());
            
            // TODO -> Algoritmo para graficar
        	
        } else {
        	System.out.println("Sin ruta");
        }  
    }
    
    // Canvas
    private void clickCanvasGrafoHandler(int x, int y) {
        System.out.println("Clic en el Canvas en las coordenadas (" + x + ", " + y + ")");
        vista.getCanvasGrafo().setCoordenadasCirculo(x-15, y-15);
    }
}
