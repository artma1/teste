//3) Observe o trecho de código abaixo:
// int INDICE = 12, SOMA = 0, K = 1; enquanto K < INDICE
// faça { K = K + 1; SOMA = SOMA + K; } imprimir(SOMA);

//Ao final do processamento, qual será o valor da variável SOMA?

public class EncontrarSoma {
    public static void main(String[] args) {

        System.out.println("ENCONTRAR SOMA");
        int INDICE = 12, SOMA = 0, K = 1;

        while (K < INDICE) {
            K ++;
            SOMA += K;
        }
        System.out.println("O valor da variável SOMA é: "+ SOMA);
    }
}