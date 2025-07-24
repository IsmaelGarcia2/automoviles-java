public enum TipoAutomovil {
    SEDAN("Sedán", "Auto de turismo con maletero separado", 4),
    STATION_WAGON("Station Wagon", "Auto familiar con gran espacio trasero", 5),
    HATCHBACK("Hatchback", "Compacto con maletero integrado al habitáculo", 3),
    PICKUP("Pickup", "Camioneta ", 2),
    COUPE("Coupé", "Auto deportivo de dos puertas", 2),
    CONVERTIBLE("Convertible", "Auto con techo retráctil", 2),
    FURGON("Furgón", "Vehículo transporte", 4),
    SUS("SUV", "Todo terreno deportivo", 5);


    private final String nombre;
    private final int numeroPuerta;
    private final String descripcion;

    TipoAutomovil(String nombre, String descripcion,int numeroPuerta) {
        this.nombre = nombre;
        this.numeroPuerta = numeroPuerta;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getNumeroPuerta() {
        return numeroPuerta;
    }
}
