import java.util.Arrays;

public class EjemploAutomovilArreglos {
    public static void main(String[] args) {



        Persona conductorSubaru = new Persona("Luci", "Martinez");
        Automovil subaru = new Automovil("Subaru","Impreza");
        subaru.setMotor(new Motor(2.0, TipoMotor.GASOLINA));
        subaru.setEstanque(new Estanque());
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);
        subaru.setConductor(conductorSubaru);
        //subaru.setRuedas(ruedasSub);

        Persona pato = new Persona("Pato", "Mendez");
        Automovil mazda = new Automovil("Mazda","BT-50",Color.ROJO, new Motor(3.0, TipoMotor.DIESEL));
        mazda.setTipo(TipoAutomovil.PICKUP);
        mazda.setEstanque(new Estanque());
        mazda.setConductor(pato);
        //mazda.setRuedas(ruedasMaz);


        Persona bea = new Persona("Bea", "Cruz");
        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS,
                new Motor(4.0, TipoMotor.DIESEL), new Estanque(50));
        nissan.setConductor(bea);
        nissan.setTipo(TipoAutomovil.PICKUP);

        Persona lalo = new Persona("Lalo", "Cuboy");
        Automovil suzuki =  new Automovil("Suzuki", "Vitara", Color.GRIS,
                new Motor(1.6, TipoMotor.DIESEL), new Estanque(50));
        suzuki.setTipo(TipoAutomovil.PICKUP);
        suzuki.setConductor(lalo);
        suzuki.setColor(Color.AMARILLO);
        Automovil.setColorPlaca(Color.AZUL);


        Automovil audi =  new Automovil("Audi", "A3");
        audi.setConductor(new Persona("Jano", "Perez"));

        Automovil[] autos = new Automovil[5];
        autos[0] = subaru;
        autos[1] = mazda;
        autos[2] = nissan;
        autos[3] = suzuki;
        autos[4] = audi;

        Arrays.sort(autos);
        for (Automovil auto : autos) {
            System.out.println(auto);
        }
    }
}
