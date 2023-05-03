package Productos;

import java.util.ArrayList;

public class ListaProductosGeneral {

    private ArrayList<ProductosGeneral> listaDeProductos;

    public ListaProductosGeneral() {
        this.listaDeProductos = new ArrayList<ProductosGeneral>();

    }

    public ListaProductosGeneral(ArrayList<ProductosGeneral> listaDeProductos) {
        this.listaDeProductos = listaDeProductos;
    }

    public ArrayList<ProductosGeneral> getListaDeProductos() {
        return listaDeProductos;
    }

    public void setListaDeProductos(ArrayList<ProductosGeneral> listaDeProductos) {
        this.listaDeProductos = listaDeProductos;
    }

    @Override
    public String toString() {
        return "ListaProductos{" +
                "listaDeProductos=" + listaDeProductos +
                '}';
    }

    public void agregar(ProductosGeneral i) {
        this.listaDeProductos.add(i);
    }

    public void mostrarTodo() {
        for (ProductosGeneral i : listaDeProductos) {
            System.out.println(i.toString());
        }
    }

    public void recalcularPrecio() {
        for (ProductosGeneral i : listaDeProductos) {
            if (i instanceof Sillas) {
                System.out.println("\n SILLA " + i.getNombreProducto() + " SIN ACTUALIZAR = " + i.getPrecioProducto());
                i.setPrecioProducto(i.getPrecioProducto() * 1.05);
                System.out.println("\n SILLA " + i.getNombreProducto() + " ACTUALIZADA = " + i.getPrecioProducto());
            } else if (i instanceof Escritorios) {
                System.out.println("\n ESCRITORIO " + i.getNombreProducto() + " SIN ACTUALIZAR = " + i.getPrecioProducto());
                i.setPrecioProducto(i.getPrecioProducto() * 1.1);
                System.out.println("\n ESCRITORIO " + i.getNombreProducto() + " ACTUALIZADO = " + i.getPrecioProducto());
            } else if (i instanceof Impresoras) {
                System.out.println("\n IMPRESORA " + i.getNombreProducto() + " SIN ACTUALIZAR = " + i.getPrecioProducto());
                i.setPrecioProducto(i.getPrecioProducto() * 1.15);
                System.out.println("\n IMPRESORA " + i.getNombreProducto() + " ACTUALIZADA = " + i.getPrecioProducto());
            } else if (i instanceof Notebook) {
                System.out.println("\n NOTEBOOK " + i.getNombreProducto() + " SIN ACTUALIZAR = " + i.getPrecioProducto());
                i.setPrecioProducto(i.getPrecioProducto() * 1.20);
                System.out.println("\n NOTEBOOK " + i.getNombreProducto() + " ACTUALIZADA = " + i.getPrecioProducto());
            }
        }
    }
}
