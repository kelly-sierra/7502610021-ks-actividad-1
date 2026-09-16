package ejercicio1_libro;

public class Libro {

    String titulo;
    String autor;
    int numeroPaginas;

    // Constructor por defecto
    public Libro() {
        titulo = "Sin título";
        autor = "Autor desconocido";
        numeroPaginas = 0;
    }

    // Constructor parametrizado
    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    // Método toString
    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", numeroPaginas=" + numeroPaginas +
                '}';
    }
}