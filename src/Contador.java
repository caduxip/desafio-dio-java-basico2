import java.util.Scanner;

public final class Contador {
    private static final String PROMPT_PARAMETRO_UM = "Digite o primeiro parâmetro";
    private static final String PROMPT_PARAMETRO_DOIS = "Digite o segundo parâmetro";
    private static final String MENSAGEM_PARAMETROS_INVALIDOS = "O segundo parâmetro deve ser maior que o primeiro";
    private static final String MENSAGEM_ENTRADA_INVALIDA = "Entrada inválida. Digite apenas números inteiros.";
    private static final String FORMATO_IMPRESSAO = "Imprimindo o número %d%n";

    private Contador() {
        // Evita instanciação de classe utilitária.
    }

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        try {
            System.out.println(PROMPT_PARAMETRO_UM);
            int parametroUm = terminal.nextInt();

            System.out.println(PROMPT_PARAMETRO_DOIS);
            int parametroDois = terminal.nextInt();

            contar(parametroUm, parametroDois);
        } catch (java.util.InputMismatchException exception) {
            System.out.println(MENSAGEM_ENTRADA_INVALIDA);
        } catch (ParametrosInvalidosException exception) {
            System.out.println(exception.getMessage());
        }
    }

    public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException(MENSAGEM_PARAMETROS_INVALIDOS);
        }

        int contagem = parametroDois - parametroUm;
        for (int i = 1; i <= contagem; i++) {
            System.out.printf(FORMATO_IMPRESSAO, i);
        }
    }
}
