public class Automovil implements Comparable<Automovil>{

    private int id;
    private String fabricante;
    private String modelo;
    private Color color = Color.GRIS;
    private Motor motor;
    private Estanque estanque;
    private Persona conductor;
    private Rueda[] ruedas;
    private int indiceRueda;

    private TipoAutomovil tipo;

    private static int capacidadTanqueEstatico = 30;
    private static Color colorPlaca = Color.NARANJO;
    private static int ultimoId;

    public static final Integer VELOCIDAD_MAXIMA_CARRETERA = 120;
    public static final int VELOCIDAD_MAXIMA_CIUDAD = 60;

    public static final String COLOR_ROJO = "Rojo";
    public static final String COLOR_AMARILLO = "Amarillo";
    public static final String COLOR_AZUL = "Azul";
    public static final String COLOR_BLANCO = "Blanco";
    public static final String COLOR_GRIS = "Gris Oscuro";

    public Automovil() {
        this.id = ++ultimoId;
        this.ruedas = new Rueda[5];
    }

    public Automovil(String fabricante, String modelo) {
        this();
        this.fabricante = fabricante;
        this.modelo = modelo;
    }
    public Automovil(String fabricante, String modelo, Color color) {
        this(fabricante, modelo);
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor) {
        this(fabricante, modelo, color);
        this.motor =  motor;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Estanque estanque) {
        this(fabricante, modelo, color, motor);
        this.estanque = estanque;
    }

    public Automovil(String fabricante, String modelo, Motor motor, Color color, Estanque estanque, Rueda[] ruedas, Persona conductor) {
        this(fabricante, modelo, color, motor, estanque);
        this.ruedas = ruedas;
        this.conductor = conductor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public static Color getColorPlaca(){
       return colorPlaca;
    }

    public static void setColorPlaca(Color colorPlaca) {
        Automovil.colorPlaca = colorPlaca;
    }

    public static int getCapacidadTanqueEstatico() {
        return capacidadTanqueEstatico;
    }

    public static void setCapacidadTanqueEstatico(int capacidadTanqueEstatico) {
        Automovil.capacidadTanqueEstatico = capacidadTanqueEstatico;
    }

    public TipoAutomovil getTipo() {
        return tipo;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Estanque getEstanque() {
        if (estanque == null){
            this.estanque = new Estanque();
        }
        return estanque;
    }

    public void setEstanque(Estanque estanque) {
        this.estanque = estanque;
    }

    public Persona getConductor() {
        return conductor;
    }

    public void setConductor(Persona conductor) {
        this.conductor = conductor;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }

    public Automovil addRueda(Rueda rueda){
        if (indiceRueda < this.ruedas.length){
            this.ruedas[indiceRueda++] = rueda;
        }
        return this;

    }
    public String verDetalle(){
        StringBuilder sb = new StringBuilder();
        sb.append("\nauto.id = " + this.getId());
        sb.append("\nauto.fabricante = " + this.getFabricante());
        sb.append("\nauto.Modelo = " + this.getModelo());
        if (this.getTipo() != null ){
            sb.append("\nauto.tipo = " + this.getTipo().getDescripcion());
        }
        sb.append("\nauto.Color = " + this.getColor());
        sb.append("\nauto.PlacaColor = " + colorPlaca);

        if (this.motor != null){
            sb.append("\nauto.Motor = " + this.motor.getCilindrada());
        }
        return sb.toString();
    }

    public String acelerar(int rpm){
        return "El auto " + fabricante + " acelerando a " + rpm + "rpm";
    }

    public String frenar(){
        return this.fabricante + " " + this.modelo + " frenando!";
    }

    public String acelerarFrenar(int rpm){
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar + "\n" + frenar;
    }

    public float calcularConsumo(int km, float porcentajeGasolina){
        return km/(estanque.getCapacidad() * porcentajeGasolina);
    }

    public float calcularConsumo(int km, int porcentajeGasolina){
        return km/(estanque.getCapacidad() * (porcentajeGasolina/100f));
    }

    public static float calcularConsumoEstatico(int km, int porcentajeGasolina){
        return km/(capacidadTanqueEstatico * (porcentajeGasolina/100f));
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (!(obj instanceof Automovil)){
            return false;
        }
        Automovil a = (Automovil) obj;
        return (this.fabricante != null && this.modelo != null
                && this.fabricante.equals(a.getFabricante())
                && this.modelo.equals(a.getModelo()));
    }

    @Override
    public String toString() {
        return this.id + " : " +fabricante + " " + modelo;
    }

    @Override
    public int compareTo(Automovil a) {
        return this.conductor.toString().compareTo(a.conductor.toString());
    }
}
