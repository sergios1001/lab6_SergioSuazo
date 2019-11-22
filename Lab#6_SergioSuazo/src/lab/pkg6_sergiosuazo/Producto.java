
package lab.pkg6_sergiosuazo;

import java.util.ArrayList;

public class Producto {
    private String nombre,marca,region;
    private int codigo,precio,cantidad,azucar,alcohol,lote;
    private ArrayList<String> colorante=new ArrayList<String>();

    public Producto() {
    }

    public Producto(String nombre, String marca, String region, int codigo, int precio, int cantidad, int azucar, int alcohol, int lote) {
        this.nombre = nombre;
        this.marca = marca;
        this.region = region;
        this.codigo = codigo;
        this.precio = precio;
        this.cantidad = cantidad;
        this.azucar = azucar;
        this.alcohol = alcohol;
        this.lote = lote;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getAzucar() {
        return azucar;
    }

    public void setAzucar(int azucar) {
        this.azucar = azucar;
    }

    public int getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(int alcohol) {
        this.alcohol = alcohol;
    }

    public int getLote() {
        return lote;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }

    public ArrayList<String> getColorante() {
        return colorante;
    }

    public void setColorante(ArrayList<String> colorante) {
        this.colorante = colorante;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + '}';
    }
    
}
