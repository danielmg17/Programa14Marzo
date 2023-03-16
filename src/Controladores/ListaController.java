
package Controladores;

import Modelos.Clientes;
import Modelos.ListaModel;
import Vistas.frmListas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;

/**
 *
 * @author danie
 */

public class ListaController implements ActionListener {
    
    frmListas VistaLista;
    ListaModel ModeloLista;

    public ListaController(frmListas VistaLista, ListaModel ModeloLista) {
        this.VistaLista = VistaLista;
        this.ModeloLista = ModeloLista;
        
        //PONER A LA ESCUCHA LOS BOTONES
        this.VistaLista.btnAtenderCliente.addActionListener(this);
        this.VistaLista.btnIngresarCliente.addActionListener(this);
        this.VistaLista.btnAtenderTodos.addActionListener(this);
        
        //PONER A LA ESCUCHA LA VISTA        
        this.VistaLista.setLocationRelativeTo(null);
        this.VistaLista.setVisible(true);
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.VistaLista.btnIngresarCliente){
            this.ModeloLista.EncolarCliente(this.VistaLista.txtApellidos.getText(),
                    this.VistaLista.txtNombres.getText());
            
            //mostrar los datos en el text area
            Queue <Clientes>listaLocal = this.ModeloLista.ListarClientes();
            
            String Cadena = "";
            for(Clientes MiListaClientes: listaLocal)
            {
               Cadena = Cadena + MiListaClientes.getApellidos()+" "+MiListaClientes.getNombre()+"\n";
               this.VistaLista.txtListaClientes.setText(Cadena);
            }
                this.VistaLista.txtApellidos.setText("");
                this.VistaLista.txtNombres.setText("");
        }
        
        if(e.getSource() == this.VistaLista.btnAtenderCliente){
            
            this.ModeloLista.DesEncolar();
            JOptionPane.showMessageDialog(null, "Cliente atendido!!!");
                
        }
        
        if(e.getSource() == this.VistaLista.btnAtenderTodos){
            
            this.VistaLista.txtListaClientes.setText("");    
            JOptionPane.showMessageDialog(null, "Todos los clientes han sido atendido!!!");
                                     
        }
    }
}

