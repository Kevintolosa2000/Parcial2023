package Productos;

public class ProductosGeneral {

    private String nombreProducto;

    private static int stockProductos = 0;

    //Practicamente podria ser el ID de cada producto por eso lo hice de manera estatica.
    //Cada vez que se agrega uno nuevo producto indepentientemente que esk stock de la empresa aumenta en 1.

    private double precioProducto;


    public ProductosGeneral() {
        stockProductos++;
    }

    public ProductosGeneral(String nombreProducto, double precioProducto) {
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
        stockProductos++;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public static int getStockProductos() {
        return stockProductos;
    }

    public static void setStockProductos(int stockProductos) {
        ProductosGeneral.stockProductos = stockProductos;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    @Override
    public String toString() {
        return nombreProducto +
                ", precio=" + precioProducto + ", stock=" + stockProductos;
    }
}

