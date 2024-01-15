package daw;

public class Tarea5dAdrianViana {

    private String nombre;
    private double altura;
    private double anchura;

    public Tarea5dAdrianViana(String nombre, double altura, double anchura) {
        this.nombre = nombre;
        this.altura = altura;
        this.anchura = anchura;
    }

    public Tarea5dAdrianViana() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAnchura() {
        return anchura;
    }

    public void setAnchura(double anchura) {
        this.anchura = anchura;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tarea5dAdrianViana{");
        sb.append("nombre=").append(nombre);
        sb.append(", altura=").append(altura);
        sb.append(", anchura=").append(anchura);
        sb.append('}');
        return sb.toString();
    }
    
    
}
