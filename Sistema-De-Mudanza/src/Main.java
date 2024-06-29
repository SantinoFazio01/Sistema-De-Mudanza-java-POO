public class Main {
    public static void main (String args[]){

    Transporte camion1 = new Transporte(
            500,
            new Dimension( 2.5,4,1.5),
            3
            );

    Producto play5 = new Producto(0.950,
            new Dimension(0.14,0.15,0.18)
            ,"play5" ,true
            );

        Producto sillaGamer = new Producto(2,
                new Dimension(0.7 ,0.8,0.9)
                ,"sillaGamer" ,false
        );

        Producto tv = new Producto(8,
                new Dimension(1,0.2,2)
                ,"60pulgadas samsung" ,true
        );

        Producto mesa = new Producto(15,
                new Dimension(1.8 ,2,4)
                ,"mesa pino" ,false
        );



        camion1.cargar(play5);
        camion1.cargar(sillaGamer);
        camion1.cargar(tv);
        camion1.cargar(mesa);

        camion1.descargar(play5);
        camion1.descargar(sillaGamer);
        camion1.descargar(tv);


        camion1.mostrar();

    }

}
