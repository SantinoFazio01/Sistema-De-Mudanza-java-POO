public class Producto {


    private double peso;
    private Dimension dimension;
    private String nombre;
    private boolean fragil;

    Producto(double peso,Dimension dimension , String nombre, boolean fragil){
        setPeso(peso);
        setDimension(dimension);
        setNombre(nombre);
        setFragil(fragil);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isFragil() {
        return fragil;
    }

    public void setFragil(boolean fragil) {
        this.fragil = fragil;
    }






}
