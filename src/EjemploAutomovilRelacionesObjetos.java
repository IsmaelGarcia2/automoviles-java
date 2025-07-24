public class EjemploAutomovilRelacionesObjetos {
    public static void main(String[] args) {



        Persona conductorSubaru = new Persona("Luci", "Martinez");
        Automovil subaru = new Automovil("Subaru","Impreza");
        subaru.setMotor(new Motor(2.0, TipoMotor.GASOLINA));
        subaru.setEstanque(new Estanque());
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);
        subaru.setConductor(conductorSubaru);
        //subaru.setRuedas(ruedasSub);
        Rueda[] ruedasSub = new Rueda[5];
        for (int i = 0; i < ruedasSub.length; i++){
            subaru.addRueda(new Rueda("Yokohama", 7.5, 16));
        }



        Persona pato = new Persona("Pato", "Mendez");
        Automovil mazda = new Automovil("Mazda","BT-50",Color.ROJO, new Motor(3.0, TipoMotor.DIESEL));
        mazda.setTipo(TipoAutomovil.PICKUP);
        mazda.setEstanque(new Estanque());
        mazda.setConductor(pato);
        //mazda.setRuedas(ruedasMaz);
        Rueda[] ruedasMaz = new Rueda[5];
        for (int i = 0; i < ruedasMaz.length; i++){
            mazda.addRueda(new Rueda("Michelin", 10.5, 18));
        }

        Persona bea = new Persona("Bea", "Cruz");
        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS,
                new Motor(4.0, TipoMotor.DIESEL), new Estanque(50));
        nissan.setConductor(bea);
        nissan.setTipo(TipoAutomovil.PICKUP);
        nissan.addRueda(new Rueda("Pirelli", 10.5, 18)).addRueda(new Rueda("Pirelli", 10.5, 18)).addRueda(new Rueda("Pirelli", 10.5, 18)).addRueda(new Rueda("Pirelli", 10.5, 18)).addRueda(new Rueda("Pirelli", 10.5, 18));

        Rueda[] ruedasNissan2 = {new Rueda("Pirelli", 10.5, 18),
                new Rueda("Pirelli", 10.5, 18),
                new Rueda("Pirelli", 10.5, 18),
                new Rueda("Pirelli", 10.5, 18),
                new Rueda("Pirelli", 10.5, 18)
        };
        Persona lalo = new Persona("Lalo", "Cuboy");
        Automovil nissan2 =  new Automovil("Nissan", "Navara", new Motor(3.5, TipoMotor.DIESEL),
                Color.GRIS, new Estanque(50),ruedasNissan2,lalo);
        nissan2.setTipo(TipoAutomovil.PICKUP);

        nissan2.setColor(Color.AMARILLO);
        Automovil.setColorPlaca(Color.AZUL);

        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan.verDetalle());
        System.out.println(nissan2.verDetalle());

        System.out.println("Conductor subaru: " + subaru.getConductor());


    }
}
