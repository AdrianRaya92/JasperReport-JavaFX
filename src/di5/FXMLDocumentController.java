package di5;
/**
 * Archivo: FXMLDocumentController.java
 * Objetivo: Documento para controlar el FXML creado, generar una base de datos
 * y crear acciones en los botones de la interfaz
 * Persona: Adrián Raya Hernández
 */
import Clases.Alumnos;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javax.help.HelpBroker;
import javax.help.HelpSet;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.fxutils.viewer.JasperViewerFX;

/**
 * Esta clase controla la interfaz FXML
 * @author Adrian Raya Hernandez 
 * @version 1.0.0
 */
public class FXMLDocumentController implements Initializable {
    
    /**
     * Creación de un ArrayListo donde añadiremos los alumnos que vamos a crear
     */
    private ArrayList<Alumnos> alumnos = new ArrayList<Alumnos>();
    private Label label;
    
    //Botón del menú ayuda
    @FXML
    private void abrirAyuda(ActionEvent event){
        try{    
            //Accedemos al fichero creado help_set.hs
            File fichero = new File("src\\Documentacion\\help_set.hs");
    
            URL hsURL = fichero.toURI().toURL();
    
            HelpSet helpset = new HelpSet(getClass().getClassLoader(), hsURL);
    
            HelpBroker hb = helpset.createHelpBroker();
    
            //Activamos la ventana cuando activamos el el botón
            hb.setDisplayed(true); 
    
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    /**
     * Botón de matriculados.
     * Este boton muestra los alumnos matriculados en DI con un informe 
     * realizado con Jasper 
     * @param event 
     */
    @FXML
    private void matriculados(ActionEvent event) {
        try{
            
            JRBeanCollectionDataSource beanColDataSource = new JRBeanCollectionDataSource(alumnos);
            Node source = (Node) event.getSource();
            Stage stage = (Stage) source.getScene().getWindow();
            JasperViewerFX viewerfx;
            viewerfx = new JasperViewerFX(stage, "Matriculados en DI", "/Informes/matriculados.jasper", 
                    new HashMap(), beanColDataSource);
            viewerfx.show();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    
    /**
     * Botón para Gráfico de sectores.
     * Muestra un gráfico de sectores los alumnos que hay en cada módulo.
     * @param event 
     */
    @FXML
    private void grafsectores(ActionEvent event) {
        try{
            
            JRBeanCollectionDataSource beanColDataSource = new JRBeanCollectionDataSource(alumnos);
            Node source = (Node) event.getSource();
            Stage stage = (Stage) source.getScene().getWindow();
            JasperViewerFX viewerfx;
            viewerfx = new JasperViewerFX(stage, "Gráfico sectores", "/Informes/graficoPorSectores.jasper", 
                    new HashMap(), beanColDataSource);
            viewerfx.show();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }        
    }
    
    /**
     * Botón para Gráfico de barras.
     * Muestra un gráfico de sectores los alumnos que hay en cada módulo.
     * @param event 
     */
    @FXML
    private void grafbarras(ActionEvent event) {
        try{
            
            JRBeanCollectionDataSource beanColDataSource = new JRBeanCollectionDataSource(alumnos);
            Node source = (Node) event.getSource();
            Stage stage = (Stage) source.getScene().getWindow();
            JasperViewerFX viewerfx;
            viewerfx = new JasperViewerFX(stage, "Gráfico barras", "/Informes/graficoPorBarras.jasper", 
                    new HashMap(), beanColDataSource);
            viewerfx.show();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }           
    }
    
    /**
     * Botón Salir.
     * Cierra la ventana de la interfaz.
     * @param event 
     */
    @FXML
    private void salir(ActionEvent event) {
        System.exit(0);
    }
    
    /**
     * Inicialización de una base de datos no relacional con los alumnos
     * en un ArrayList.
     * @param url
     * @param rb 
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        alumnos.add(new Alumnos("68777546F", "DI", 9.1, "Madrid"));
        alumnos.add(new Alumnos("58989624G", "DI", 5.0, "Granada"));
        alumnos.add(new Alumnos("45363325A", "DI", 4.5, "Málaga"));
        alumnos.add(new Alumnos("65521423X", "DI", 6.7, "Barcelona"));
        
        alumnos.add(new Alumnos("40545889E", "DI", 9.8, "Sevilla"));
        alumnos.add(new Alumnos("51224369R", "DI", 9.8, "Madrid"));
        alumnos.add(new Alumnos("52548441H", "DI", 9.8, "Vizcaya"));
        alumnos.add(new Alumnos("50223658U", "DI", 9.8, "Huelva"));
        alumnos.add(new Alumnos("50998554D", "DI", 9.8, "Sevilla"));
        
        alumnos.add(new Alumnos("49887632V", "PMDM", 9.8, "Badajoz"));
        alumnos.add(new Alumnos("49558632G", "PMDM", 9.8, "Jaén"));
        alumnos.add(new Alumnos("41236998N", "PMDM", 9.8, "Álava"));
        alumnos.add(new Alumnos("40221336M", "PMDM", 9.8, "Gerona"));
        alumnos.add(new Alumnos("50798896C", "PMDM", 9.8, "Asturias"));
        
        alumnos.add(new Alumnos("60111554H", "PMDM", 9.8, "Burgos"));
        alumnos.add(new Alumnos("50478965P", "AD", 9.8, "Granada"));
        alumnos.add(new Alumnos("64221315E", "AD", 9.8, "Madrid"));
        alumnos.add(new Alumnos("46578941R", "AD", 9.8, "Murcia"));
        alumnos.add(new Alumnos("41696325G", "AD", 9.8, "Córdoba"));
        
        alumnos.add(new Alumnos("53211485Y", "AD", 9.8, "Sevilla"));
        alumnos.add(new Alumnos("57696248K", "PSP", 9.8, "Madrid"));
        alumnos.add(new Alumnos("58212365L", "PSP", 9.8, "Barcelona"));
        alumnos.add(new Alumnos("50761546U", "PSP", 9.8, "Granada"));
        
        System.out.println("Se han creado 24 alumnos en DAM");
    }    
}
