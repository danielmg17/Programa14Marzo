
import Controladores.ListaController;
import Modelos.ListaModel;
import Vistas.frmListas;


public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        frmListas VistaListas = new frmListas(null, true);
        ListaModel ModeloVista = new ListaModel();
        ListaController ControladorLista = new ListaController(VistaListas, ModeloVista);
    }
    
}
