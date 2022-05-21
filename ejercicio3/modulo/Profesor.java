
package modulo;

public class Profesor extends Persona {

    String fecha;
    
    public Profesor() {
        super();
    }

    public Profesor(String fecha, String nombre, int id) {
        super(nombre, id);
        this.fecha = fecha;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }


    @Override
    public String toString() {
        return "Profesor de nombre: " + super.toString();
    }
    
}
