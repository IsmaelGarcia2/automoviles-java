public class EjemploAutomovilEnum {
    public static void main(String[] args) {


        Automovil.setCapacidadTanqueEstatico(45);
        Automovil subaru = new Automovil("Subaru","Impreza");
        subaru.setMotor(new Motor(2.0,TipoMotor.GASOLINA));
        subaru.setEstanque(new Estanque());
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);

        Automovil mazda = new Automovil("Mazda","BT-50",Color.ROJO, new Motor(3.0, TipoMotor.DIESEL));
        mazda.setTipo(TipoAutomovil.PICKUP);
        System.out.println("mazda.getFabricante() = " + mazda.getFabricante());
        TipoAutomovil tipo = subaru.getTipo();
        System.out.println("tipoSubaru.getNombre() = " + tipo.getNombre());
        System.out.println("tipoSubaru.getDescripcion() = " + tipo.getDescripcion());

        tipo = mazda.getTipo();
        switch (tipo) {
            case SEDAN:
                System.out.println("Auto de turismo con maletero separado");
                break;
            case STATION_WAGON:
                System.out.println("Auto familiar con gran espacio trasero");
                break;
            case HATCHBACK:
                System.out.println("Compacto con maletero integrado al habitáculo");
                break;
            case PICKUP:
                System.out.println("Camioneta con cabina y caja de carga abierta");
                break;
            case COUPE:
                System.out.println("Auto deportivo de dos puertas");
                break;
            case CONVERTIBLE:
                System.out.println("Auto con techo retráctil");
                break;
            case FURGON:
                System.out.println("Vehículo cerrado para transporte de carga o pasajeros");
                break;
            default:
                System.out.println("Tipo de vehículo no reconocido");
                break;
        }

        TipoAutomovil[] tipos = TipoAutomovil.values();
        for (TipoAutomovil ta : tipos){
            System.out.print(ta + " => " + ta.name() + ", " +
                    ta.getNombre() + ", " +
                    ta.getDescripcion()+ ", " +
                    ta.getNumeroPuerta());
            System.out.println();
        }

    }
}
