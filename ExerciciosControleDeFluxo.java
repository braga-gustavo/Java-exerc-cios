
public class ExerciciosControleDeFluxo {
    public static void main(String[] args) {
        /**
         * Crie uma variavel salario e imprima seu imposto 
         * imposto: 
         * salario <1000 5% 
         * salario >= 1000 && salario < 2000 10% 
         * salario >= 2000 && salario <4000 15% 
         * salario > 5000 20%
         */

        float salario = 4001;
        float imposto = 0;

        if (salario < 1000) {
            salario *= 0.05;
            imposto = salario;

        } else if ((salario > 1000) && (salario < 2000)) {
            salario *= 0.1;
            imposto = salario;

        } else if ((salario >= 2000) && (salario < 4000)) {
            salario *= 0.15;
            imposto = salario;

        } else {
            salario *= 0.2;
            imposto = salario;
        }
        System.out.println("Imposto: R$" + imposto);

    }

}
