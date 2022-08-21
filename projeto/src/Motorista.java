public class Motorista {
    public static void main(String[] args) {
        Motor configuracoes_moto = new Motor(  "monofasico", 170, true );
        Moto Naked = new Moto(configuracoes_moto, "Naked");

        Naked.pisar_acelerador = true;
        Naked.acelerar();

        Naked.pisar_acelerador = false;
        Naked.acelerar();

        Naked.pisar_acelerador = true;
        Naked.acelerar();
    }
}
