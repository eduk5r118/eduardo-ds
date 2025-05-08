public class Carro {
    private String modelo;
    private String cor;
    private double velocidadeAtual;
    private double velocidadeMaxima;
    private boolean ligado;

    // Construtor
    public Carro(String modelo, String cor, double velocidadeMaxima) {
        this.modelo = modelo;
        this.cor = cor;
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidadeAtual = 0;
        this.ligado = false;
    }

    // Métodos
    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("O carro está ligado.");
        } else {
            System.out.println("O carro já está ligado.");
        }
    }

    public void desligar() {
        if (ligado) {
            ligado = false;
            velocidadeAtual = 0;
            System.out.println("O carro está desligado.");
        } else {
            System.out.println("O carro já está desligado.");
        }
    }

    public void acelerar(double incremento) {
        if (ligado) {
            if (velocidadeAtual + incremento <= velocidadeMaxima) {
                velocidadeAtual += incremento;
                System.out.println("Acelerando... Velocidade atual: " + velocidadeAtual + " km/h.");
            } else {
                System.out.println("Velocidade máxima atingida!");
            }
        } else {
            System.out.println("O carro precisa estar ligado para acelerar.");
        }
    }

    public void frear(double decremento) {
        if (ligado) {
            if (velocidadeAtual - decremento >= 0) {
                velocidadeAtual -= decremento;
                System.out.println("Freando... Velocidade atual: " + velocidadeAtual + " km/h.");
            } else {
                velocidadeAtual = 0;
                System.out.println("O carro parou.");
            }
        } else {
            System.out.println("O carro precisa estar ligado para frear.");
        }
    }

    public void exibirFichaTecnica() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Velocidade Máxima: " + velocidadeMaxima + " km/h");
        System.out.println("Velocidade Atual: " + velocidadeAtual + " km/h");
        System.out.println("Status: " + (ligado ? "Ligado" : "Desligado"));
    }
}
