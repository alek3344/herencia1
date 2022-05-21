
package modulo;

public class ProfesorInterino extends Profesor {
    
    String hora;

    public ProfesorInterino() {
        super();
    }

    public ProfesorInterino(String hora, String fecha, String nombre, int id) {
        super(fecha, nombre, id);
        this.hora = hora;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
    

    @Override
    public String toString() {
        return "el profesor interino 1 se incorporo en la fecha: " + super.fecha + " "+ hora;
    }
    
    
}
