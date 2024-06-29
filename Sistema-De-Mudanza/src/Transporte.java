import java.util.ArrayList;

public class Transporte {

    private ArrayList<Producto> transportables;
    private double capacidadMaxima;
    private double capacida;
    private Dimension dimension;
    private int cantidadMaxima;

   public Transporte(double capacidadMaxima,Dimension dimension, int cantidadMaxima){
        setTransportables(new ArrayList<Producto>());
        setCapacida(0);
        setCantidadMaxima(cantidadMaxima);
        setDimension(dimension);
        setCapacidadMaxima(capacidadMaxima);
    }



    public ArrayList<Producto> getTransportables() {
        return transportables;
    }

    public void setTransportables(ArrayList<Producto> transportables) {
        this.transportables = transportables;
    }

    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public double getCapacida() {
        return capacida;
    }

    public void setCapacida(double capacida) {
        this.capacida = capacida;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    public int getCantidadMaxima() {
        return cantidadMaxima;
    }

    public void setCantidadMaxima(int cantidadMaxima) {
        this.cantidadMaxima = cantidadMaxima;
    }

    public void cargar(Producto transportable){
       if (getTransportables().size() >= getCantidadMaxima() ) {
           System.out.println("maximo 3 productos,productos cargados:");
           return;
       }
       getTransportables().add(transportable);
    }
    public void descargar(Producto transportable){
            System.out.println("producto descargado " + transportable.getNombre());
        getTransportables().remove(transportable);
    }


    public void mostrar(){
        for (int i = 0; i < getTransportables().size() ; i++) {
            getTransportables().get(i).getNombre();
            System.out.println( getTransportables().get(i).getNombre());
        }
    }



}
