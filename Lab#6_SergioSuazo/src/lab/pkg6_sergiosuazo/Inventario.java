
package lab.pkg6_sergiosuazo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Inventario {
    private ArrayList<Producto> inventario = new ArrayList();
    private File archivo =  null;

    public Inventario(String path) {
        archivo=new File(path);
    }

    public ArrayList<Producto> getInventario() {
        return inventario;
    }

    public void setInventario(ArrayList<Producto> inventario) {
        this.inventario = inventario;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "Inventario{" + "inventario=" + inventario + '}';
    }
    
        public void setProducto(Producto p)
    {
        this.inventario.add(p);
    }
    
    public void escribirArchivo()throws IOException
    {
        FileWriter fw=null;
        BufferedWriter bw=null;
        try{
            fw= new FileWriter(archivo,false);
            bw=new BufferedWriter(fw);
            for (Producto t : inventario) {
                bw.write(t.getNombre());
                bw.write(t.getMarca());
                bw.write(t.getCodigo());
                bw.write(t.getPrecio());
                bw.write(t.getCantidad());
                bw.write(t.getAzucar());
                bw.write(t.getAlcohol());
            }
        }catch (Exception e){
            
        }
    }
    
    public void cargarArchivo()
    {
        Scanner sc = null;
        inventario = new ArrayList();
        if (archivo.exists()) {
            try{
                sc=new Scanner(archivo);
                sc.useDelimiter(";");
                while(sc.hasNext())
                {
                    inventario.add(new Producto(sc.next(),sc.next(),sc.next(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),new Date()));
                }
            }
            catch(Exception e)
            {
                
            }
        }
    }
}
