
class Libro {
    private String titulo;
    private String autor;
    private int paginaCount;
    public Libro(String titulo, String autor, int paginaCount) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginaCount = paginaCount;
    }
    public String infoLibro() {
        return "Título: " + titulo + ", Autor: " + autor + ", Páginas: " + paginaCount;
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("\nLos siguientes libros estan en la biblioteca: \n");
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 417);
        Libro libro2 = new Libro("1984", "George Orwell", 328);
        System.out.println(libro1.infoLibro());
        System.out.println(libro2.infoLibro());
        System.out.println("\n¡QUE TENGAN UN LINDO DIA/NOCHE!");
    }
}
