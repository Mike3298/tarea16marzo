
package Modelos;
import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;


public class Lista2Model {
     Queue <Pacientes> Lista2Model = new LinkedList();
    public void EncolarCliente(String ape, String nom)
    {
       Pacientes nuevoPaciente = new Pacientes(ape,nom); 
       this.Lista2Model.add(nuevoPaciente);
       
       JOptionPane.showMessageDialog(null,"Paciente Agregado a la lista!!!");
    }
    
    public  Queue ListarPacientes()
    {
        return this.Lista2Model;
    }
    
    public  void DesEncolar()
    { 
        this.Lista2Model.poll();
    }
    
}
