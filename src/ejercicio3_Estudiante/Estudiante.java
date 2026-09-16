package ejercicio3_Estudiante;

public class Estudiante {

    String nombre;
    int edad;
    String curso;

    // Constructor por defecto
    public Estudiante() {
        nombre = "Nombre desconocido";
        edad = 0;
        curso = "Sin curso";
    }

    // Constructor con nombre y edad
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        curso = "Sin curso";
    }

    // Constructor con todos los parámetros
    public Estudiante(String nombre, int edad, String curso) {
        this(nombre, edad);
        this.curso = curso;
    }

    // Método toString()
    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", curso='" + curso + '\'' +
                '}';
    }
}