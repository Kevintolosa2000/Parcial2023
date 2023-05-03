package Productos;

public class Escritorios extends ProductosGeneral {

    private Integer alto;
    private Integer ancho;

    public Escritorios() {
    }

    public Escritorios(String nombreProducto, double precioProducto, Integer alto, Integer ancho) {
        super(nombreProducto, precioProducto);
        this.alto = alto;
        this.ancho = ancho;
    }

    public Integer getAlto() {
        return alto;
    }

    public void setAlto(Integer alto) {
        this.alto = alto;
    }

    public Integer getAncho() {
        return ancho;
    }

    public void setAncho(Integer ancho) {
        this.ancho = ancho;
    }

    @Override
    public String toString() {
        return "Escritorio=" + super.toString() +
                ", alto=" + alto +
                ", ancho=" + ancho;
    }
}

