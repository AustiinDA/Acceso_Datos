import java.io.Serializable;

public class Ficheros13 implements Serializable{
    String titulo;
    String autor;

    public Ficheros13(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Ficheros13{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }
}

