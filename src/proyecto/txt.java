
package proyecto;

import java.io.*;
import javax.swing.JOptionPane;


public class txt {

    
    public static void main(String[] args) {
        
   int registros=1; 
   File archivo;
   FileWriter escribir;
   FileReader leer; 
   BufferedReader almacenamiento;
   PrintWriter linea;
   
   String nombre="", direccion="", telefono="", paginawed="", identificacion="", cadena="";
   archivo = new File("archivo2.txt");
 
   
   if (!archivo.exists()){
       
       try {
           archivo.createNewFile();

           nombre=JOptionPane.showInputDialog("Ingrese su nombre ");
           identificacion=JOptionPane.showInputDialog("Ingrese su identificacion ");
           direccion=JOptionPane.showInputDialog("Ingrese la direccion de su residencia ");
           telefono=JOptionPane.showInputDialog("Ingrese su numero de telefono ");
           paginawed=JOptionPane.showInputDialog("Ingrese el nombre de su pagina wed ");
           
           escribir = new FileWriter(archivo,true);
           linea = new PrintWriter(escribir);
           
           linea.println(nombre);
           linea.println(identificacion);
           linea.println(direccion);
           linea.println(telefono);
           linea.println(paginawed);
           linea.close();
           escribir.close();
           
       } catch (IOException ex) {
          
       }
       
   }else {
       
       try {
           
           nombre=JOptionPane.showInputDialog("Ingrese su nombre ");
           identificacion=JOptionPane.showInputDialog("Ingrese su identificacion ");
           direccion=JOptionPane.showInputDialog("Ingrese la direccion de su residencia ");
           telefono=JOptionPane.showInputDialog("Ingrese su numero de telefono ");
           paginawed=JOptionPane.showInputDialog("Ingrese el nombre de su pagina wed ");
           
           escribir = new FileWriter(archivo,true);
           linea = new PrintWriter(escribir);
           
           linea.println(nombre);
           linea.println(identificacion);
           linea.println(direccion);
           linea.println(telefono);
           linea.println(paginawed);
           linea.close();
           escribir.close();
           
        } catch (IOException ex) {
          
       }
       
   }
   
   
   
        try {
            
            leer = new FileReader(archivo);
            almacenamiento = new BufferedReader(leer);
            while(cadena!=null){
                
                try {
                    
                    cadena = almacenamiento.readLine();
                    nombre=cadena;
                    cadena = almacenamiento.readLine();
                    identificacion=cadena;
                    cadena = almacenamiento.readLine();
                    direccion=cadena;
                    cadena = almacenamiento.readLine();
                    telefono=cadena;
                    cadena = almacenamiento.readLine();
                    paginawed=cadena;
                    
                    if (cadena!=null){
                        
                        JOptionPane.showMessageDialog(null, "Nombre: "+nombre
                                +"\nIdentificacion "+identificacion+" \nDireccion "+direccion+" \nTelefono "+telefono+" \nPagina wed "+paginawed,
                                "Mostrando datos #" +registros,1);
                        registros++;
                    }
                    
                    
                } catch (IOException ex) {
                   
                }
                
            }
            
       try {
           
           almacenamiento.close();
           leer.close();
           
       } catch (IOException ex) {
         
       }
            
        } catch (FileNotFoundException ex) {
            
            
        }
        
   
}
   

    
}
