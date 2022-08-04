public class Carro {
    String nome_carro;
    String motor;
    int potencia;
    boolean turbo;
    boolean pisar_acelerador;

    Carro(Motor m, String nome_carro){
        this.nome_carro = nome_carro;
        this.motor = m.motor;
        this.potencia = m.potencia;
        this.turbo = m.turbo;

    }


    void acelerar(){
        if(pisar_acelerador){
            System.out.print("ESTAMOS PRONTOS:\n");
            System.out.printf("MODELO: %s\n", this.nome_carro);
            System.out.printf("MOTOR: %s\n", motor);
            System.out.printf("POTENCIA: %d\n", potencia);
            System.out.printf("TURBO: %b\n", turbo);
            System.out.print("vrummmmmmmmmm\n");
            System.out.println();
        }
        else{
            System.out.print("DEVE-SE PISAR NO ACELERADOR PRIMEIRO\n");
            System.out.println();
        }


    }


}
