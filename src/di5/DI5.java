package di5;
/**
 * Archivo: DI5.java
 * Objetivo: Ejecutar la interfaz creada en FXML
 * Persona: Adrián Raya Hernández
 */
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Esta clase ejecuta la interfaz
 * @author Adrian Raya Hernandez 
 * @version 1.0.0
 */
public class DI5 extends Application {
    
    /**
     * Esta clase start es la encargada de ejecutar la interfaz. 
     * En esta clase cambiaremos el titulo de la ventana. 
     * @param stage
     * @throws Exception 
     */
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
                
        stage.setTitle("Informes 1.0");
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
