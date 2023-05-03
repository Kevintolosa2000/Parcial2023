import Productos.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n--------------------------------PUNTO1y2----------------------------------------------\n");

        //region objetos
        Impresoras impresora1 = new Impresoras("xiaomi", 12000.52, "Victor", 23);
        Impresoras impresora2 = new Impresoras("samsung", 77777.77, "Hugo", 22);
        Notebook notebook1 = new Notebook("LG", 7.77, "Nachito", 500);
        Notebook notebook2 = new Notebook("LG Trucha", 10.0, "Leo", 250);
        Sillas silla1 = new Sillas("Silla Gamer", 200.00, -1);
        Sillas silla2 = new Sillas("Silla de escritorio", 143.23, 4);
        Escritorios escritorio1 = new Escritorios("Escritorio de caoba", 18000.00, 17, 54);
        Escritorios escritorio2 = new Escritorios("Escritorio de abeto", 1000.00, 12, 12);

        //Puse dos de cada una para ver que se vea que se instancian bien.

// endregion

        //region listaDeProductos

        ListaProductosGeneral listaDeProductos = new ListaProductosGeneral();

        listaDeProductos.agregar(impresora1);
        listaDeProductos.agregar(impresora2);
        listaDeProductos.agregar(notebook1);
        listaDeProductos.agregar(notebook2);
        listaDeProductos.agregar(silla1);
        listaDeProductos.agregar(silla2);
        listaDeProductos.agregar(escritorio1);
        listaDeProductos.agregar(escritorio2);
        //endregion

        System.out.println("\n--------------------------------PUNTO3----------------------------------------------\n");

        listaDeProductos.mostrarTodo();

        System.out.println("\n------------------------------------------------------------------------------\n");

        System.out.println("\n--------------------------------PUNTO4----------------------------------------------\n");

        System.out.printf(" \n" + "Precio impresora con descuento: " + impresora1.calcularDescuento(15.0));
        System.out.printf(" \n" + "Precio Silla con descuento: " + silla1.calcularDescuento(50.0) + " \n");

        System.out.println("\n------------------------------------------------------------------------------\n");

        System.out.println("\n--------------------------------PUNTO5----------------------------------------------\n");

        listaDeProductos.recalcularPrecio();

        System.out.println("\n------------------------------------------------------------------------------\n");

    }
}

