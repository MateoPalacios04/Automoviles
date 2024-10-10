public class Autos2 {
//Propiedades, Atributos o Estado//

    private String marca;
    private String modelo;
    private String color="Verde";
    private float cilindraje;

    //ConstructoresyDestructores//

    public Autos2() {
    }


    //Metodos propios de Java//
    public String leerMarca (){
        this.marca= marca;
        return this.marca;
    }

    public String ingresarMarca(String marca){
        this.marca= marca;
        return this.marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(float cilindraje) {
        this.cilindraje = cilindraje;
    }

    //Metodos acciones (propias)

    public String detalleauto(){
        String marca="CHANGAN";
        String dv = "La marca es: " + marca+ "\n" +
        "El modelo es: "  + this.modelo + "\n" +
         "El color es: " + getColor() + "\n" +
         "el cilindraje es: " + this.cilindraje + "\n";
        return dv;

    }

    public float consumoCombustible(float kmr, float gal){

        float kpg;
        kpg= kmr/gal;
        return kpg;
    }

    public float consumoCombustible(float kmr){

        float pcc;
        pcc=  kmr*0.7f;
        return pcc;
    }
}
