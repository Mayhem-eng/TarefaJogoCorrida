public class Motorista {
    public static void main(String[] args) {
        Motor configuracoes_carro = new Motor(  "monofasico", 170, true );
        Carro fusca = new Carro(configuracoes_carro, "Fusca");

        fusca.pisar_acelerador = true;
        fusca.acelerar();

        fusca.pisar_acelerador = false;
        fusca.acelerar();

        fusca.pisar_acelerador = true;
        fusca.acelerar();
    }
}
