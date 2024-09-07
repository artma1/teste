//5) Você está em uma sala com três interruptores, cada um conectado a
// uma lâmpada em salas diferentes. Você não pode ver as lâmpadas da sala em que está,
// mas pode ligar e desligar os interruptores quantas vezes quiser.
// Seu objetivo é descobrir qual interruptor controla qual lâmpada.
// Como você faria para descobrir, usando apenas
// duas idas até uma das salas das lâmpadas, qual interruptor controla cada lâmpada?

public class Lampada {
    public static void main(String[] args) {

        System.out.println("LAMPADA");
        System.out.println("Não há solução para os dados fornecidos.");
        System.out.println("Precisaria de pelo menos 3 idas, considerando o enunciado correto" +
                " (3 salas, cada uma com uma lâmpada e duas idas) ou a informação de lâmpada incandescente\n");
        System.out.println("Se considerarmos que as lâmpadas são incandescentes (esquentam):");
        System.out.println("deixar interruptor1 e interruptor2 ligados por 10 minutos.");
        System.out.println("desligar interruptor2 e ir imediatamente à sala da lâmpada1");
        System.out.println("se estiver acesa, a lâmpada pertence ao interruptor1");
        System.out.println("se estiver apagada e quente, ao interruptor2");
        System.out.println("se estiver apagada e fria, ao interruptor3");
        System.out.println("deixar interruptores restantes um ligado, um desligado");
        System.out.println("ir à uma das duas salas restantes");
        System.out.println("se a lâmpada estiver acesa, pertence ao interruptor ligado");
        System.out.println("senão, pertence ao outro e finalizamos o problema com duas idas e lâmpadas incandescentes\n");

        System.out.println("Considerando 3 idas:");
        System.out.println("deixar interruptor1 ligado, interruptor2 e interruptor3 desligados");
        System.out.println("ir à sala da lâmpada1, e depois ir à da lâmpada2");
        System.out.println("a lâmpada acesa pertence ao interruptor1");
        System.out.println("Se não houver lâmpada acesa, a lâmpada3 pertence ao interruptor1");
        System.out.println("ligar o interruptor2");
        System.out.println("ir em uma das duas salas restantes");
        System.out.println("se a lâmpada estiver acesa, ela pertence ao interruptor2, senão, ao interruptor3");
        System.out.println("por exclusão conectamos o último par lâmpada-interruptor, e finalizamos com 3 idas");
    }
}