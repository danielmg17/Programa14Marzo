
package Modelos;

import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;

/**
 *
 * @author danie
 */
public class ListaModel {
    Queue <Clientes> ListaCliente = new LinkedList();
    public void EncolarCliente(String ape, String nom)
    {
       Clientes nuevoCliente = new Clientes(ape,nom); 
       this.ListaCliente.add(nuevoCliente);
       
       JOptionPane.showMessageDialog(null,"Cliente agregado a la lista!!!");
    }
    
    public  Queue ListarClientes()
    {
        return this.ListaCliente;
    }
    
    public  void DesEncolar()
    { 
        this.ListaCliente.poll();
    }
}
