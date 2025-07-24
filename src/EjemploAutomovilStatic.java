import java.net.CookieHandler;

public class EjemploAutomovilStatic {
    public static void main(String[] args) {


        Automovil.setCapacidadTanqueEstatico(45);
        Automovil subaru = new Automovil("Subaru","Impreza");
        subaru.setMotor(new Motor(2.0, TipoMotor.GASOLINA));
        subaru.setEstanque(new Estanque());
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);

        Automovil mazda = new Automovil("Mazda","BT-50",Color.ROJO, new Motor(3.0, TipoMotor.DIESEL));
        mazda.setTipo(TipoAutomovil.PICKUP);
        mazda.setEstanque(new Estanque());
        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS, new Motor(4.0, TipoMotor.DIESEL), new Estanque(50));
        nissan.setTipo(TipoAutomovil.PICKUP);
        Automovil nissan2 =  new Automovil("Nissan", "Navara", Color.GRIS, new Motor(3.5, TipoMotor.DIESEL), new Estanque(50));
        nissan2.setTipo(TipoAutomovil.PICKUP);

        nissan2.setColor(Color.AMARILLO);
        Automovil.setColorPlaca(Color.AZUL);

        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan.verDetalle());
        System.out.println(nissan2.verDetalle());
        System.out.println("Automovil.getColorPlaca() = " + Automovil.getColorPlaca());
        System.out.println("Km por litros = " + Automovil.calcularConsumoEstatico(300,60));
        System.out.println("VELOCIDAD_MAXIMA_CARRETERA: "+Automovil.VELOCIDAD_MAXIMA_CARRETERA);
        System.out.println("VELOCIDAD_MAXIMA_CIUDAD: "+Automovil.VELOCIDAD_MAXIMA_CIUDAD);
        
        TipoAutomovil tipoSubaru = subaru.getTipo();
        System.out.println("tipoSubaru.getNombre() = " + tipoSubaru.getNombre());
        System.out.println("tipoSubaru.getDescripcion() = " + tipoSubaru.getDescripcion());

        System.out.println(mazda.calcularConsumo(300,70));
    }
}
