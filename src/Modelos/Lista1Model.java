
package Modelos;
import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;



public class Lista1Model {
        Queue <Pacientes> Lista1Model = new LinkedList();
    public void EncolarCliente(String ape, String nom)
    {
       Pacientes nuevoPaciente = new Pacientes(ape,nom); 
       this.Lista1Model.add(nuevoPaciente);
       
       JOptionPane.showMessageDialog(null,"Paciente Agregado a la lista!!!");
    }
    
    public  Queue ListarPacientes()
    {
        return this.Lista1Model;
    }
    
    public  void DesEncolar()
    { 
        this.Lista1Model.poll();
    }
    
    
    
    
}
