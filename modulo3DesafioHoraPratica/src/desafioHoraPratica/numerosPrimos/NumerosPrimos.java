package desafioHoraPratica.numerosPrimos;

public class NumerosPrimos {
    public boolean verificarPrimalidade(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void listarPrimos(int limite) {
        System.out.println("Listando primos até: " + limite);
        for (int i = 0; i < limite; i++) {
            if (verificarPrimalidade(i)) {
                System.out.println(i + " ");
            }
        }
        System.out.println();
    }
}
