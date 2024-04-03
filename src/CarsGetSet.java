public class CarsGetSet {

    public static void main(String[] args) {
        Auto auto1 = new Auto("Fiat", "Punto", "CC194AB", "1200cc");
        System.out.println(auto1.getMarca() + ',' + auto1.getModello() + ',' + auto1.getTarga() + ',' + auto1.getCilindrata());
    }
}

    class Auto {
        String marca, modello, targa, cilindrata;

        public Auto(String marca, String modello, String targa, String cilindrata) {
            this.marca = marca;
            this.modello = modello;
            this.targa = targa;
            this.cilindrata = cilindrata;
        }

        public String getMarca() {
            return marca;
        }

        public String getModello() {
            return modello;
        }

        public String getTarga() {
            return targa;
        }

        public String getCilindrata() {
            return cilindrata;
        }

        public void setMarca() {
            this.marca = marca;
        }

        public void setModello() {
            this.modello = modello;
        }

        public void setTarga() {
            this.targa = targa;
        }

        public void setCilindrata() {
            this.cilindrata = cilindrata;
        }
    }