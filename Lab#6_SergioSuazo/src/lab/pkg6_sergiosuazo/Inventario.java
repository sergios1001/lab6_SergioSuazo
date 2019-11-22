
package lab.pkg6_sergiosuazo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Inventario {
    private ArrayList<Producto> inventario = new ArrayList<>();
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
                bw.write(t.getNombre()+ ";");
                bw.write(t.getMarca()+ ";");
                bw.write(t.getRegion()+ ";");
                bw.write(t.getColorante()+ ";");
                bw.write(t.getCodigo()+ ";");
                bw.write(t.getPrecio()+ ";");
                bw.write(t.getCantidad()+ ";");
                bw.write(t.getAzucar()+ ";");
                bw.write(t.getAlcohol()+ ";");
                bw.write(t.getLote()+ ";");
                bw.write(t.getFecha()+ ";");
                
                bw.write(';');
                bw.newLine();
            }
            bw.flush();
        }catch (Exception e){
            
        }
        bw.close();
        fw.close();
    }
    
    public void cargarArchivo()
    {
        inventario = new ArrayList<>();
        if (archivo.exists()) {
            try {
                String linea;
                FileReader fr = new FileReader(archivo);
                BufferedReader br = new BufferedReader(fr);
                while ((linea=br.readLine()) != null) {
                    String[] tokens = linea.split(";");

                    String [] token2 = tokens[3].split(",");
                    String colorizante="";
                    for (int i = 0; i < token2.length; i++) {
                        colorizante+=token2[i];
                    }
                    inventario.add(new Producto(tokens[0],tokens[1],tokens[2],colorizante,Integer.parseInt(tokens[4]),Integer.parseInt(tokens[5]),Integer.parseInt(tokens[6]),Integer.parseInt(tokens[7]),Integer.parseInt(tokens[8]),Integer.parseInt(tokens[9]),new Date()));
                }
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
