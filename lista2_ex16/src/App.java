import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);

        System.out.println("Vamos fazer uma equacao de 2° grau, vamos precisar que informe os valores de A, B e C.");

        System.out.print("Digite o valor de A: ");
        double a = ler.nextDouble();
        System.out.println("");

        if(a == 0){
            System.out.println("Em uma equacao de segundo grau o valor de A nao pode ser 0.");
        }

        else if(a != 0){
            System.out.print("Digite o valor de B: ");
        double b = ler.nextDouble();
        System.out.println("");

        System.out.print("Digite o valor de C: ");
        double c = ler.nextDouble();
        System.out.println("");

        double delta = (b*b) - (4 * a * c);
        System.out.print(delta);

        if(delta < 0){
            System.out.println("O valor de delta e negativo, a equacao nao possui valores reais.");
        }

        if (delta == 0){
            double x1 = (-b + (Math.sqrt(delta))) / (2*a);
            System.out.printf("A raiz da questao e %2.2f",x1);
        }

        if (delta > 0){
            double x1 = (-b + (Math.sqrt(delta))) / (2*a);
            double x2 = (-b - (Math.sqrt(delta))) / (2*a);
            System.out.printf("A primeira raiz da equacao e %2.2f e a segunda e %2.2f",x1,x2);
        }

        }
        ler.close();


        
        


    }
}
