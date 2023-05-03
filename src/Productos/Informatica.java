package Productos;

public class Informatica extends ProductosGeneral {

    private String nombreDelFabricante;


    public Informatica() {
    }

    public Informatica(String nombreProducto, double precioProducto, String nombreDelFabricante) {
        super(nombreProducto, precioProducto);
        this.nombreDelFabricante = nombreDelFabricante;
    }

    public String getNombreDelFabricante() {
        return nombreDelFabricante;
    }

    public void setNombreDelFabricante(String nombreDelFabricante) {
        this.nombreDelFabricante = nombreDelFabricante;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Nombre Del Fabricante='" + nombreDelFabricante;
    }
}

