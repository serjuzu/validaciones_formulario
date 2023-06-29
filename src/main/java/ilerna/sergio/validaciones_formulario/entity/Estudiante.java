package ilerna.sergio.validaciones_formulario.entity;



import javax.persistence.*;
import java.io.Serializable;

/**
 * Autor:sjulvez
 * Fecha:29/06/2023
 */
@Entity
@Table(name="alumnos")
public class Estudiante implements Serializable {


    private static final long serialVersionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String nombre;
    private String apellidos;
    private String edad;
    private String curso;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Estudiante() {
    }

    public Estudiante(Long id, String nombre, String apellidos, String edad, String curso) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.curso = curso;
    }
}
