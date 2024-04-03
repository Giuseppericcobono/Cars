public class Cars {

    String marca, modello, targa, cilindrata;

    public Cars(String marca, String modello, String targa, String cilindrata) {
        this.marca = marca;
        this.modello = modello;
        this.targa = targa;
        this.cilindrata = cilindrata;
    }
    @Override
    public String toString() {
        return "Auto{" +
                "marca='" + marca + '\'' +
                ", modello='" + modello + '\'' +
                ", targa='" + targa + '\'' +
                ", cilindrata='" + cilindrata + '\'' +
                '}';
    }
}
