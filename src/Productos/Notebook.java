package Productos;

public class Notebook extends Informatica {

    private int gB;

    public Notebook() {
    }

    public Notebook(String nombreProducto, double precioProducto, String nombreDelFabricante, int gB) {
        super(nombreProducto, precioProducto, nombreDelFabricante);
        this.gB = gB;
    }

    public int getgB() {
        return gB;
    }

    public void setgB(int gB) {
        this.gB = gB;
    }

    @Override
    public String toString() {
        return "Notebook=" + super.toString() +
                ", gB=" + gB;
    }
}
