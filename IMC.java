import java.util.Scanner;

public class IMC
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); 

        float altura,
              peso,
              dobroaltura,
              imc; 

        System.out.print("Qual sua altura ?");
        altura = input.nextFloat();
        dobroaltura = (altura * altura);
        
        System.out.print("Qual seu peso ?");
        peso = input.nextFloat();
        imc = (peso / dobroaltura);

        if(imc <= 18.5){
            System.out.println("Você está abaixo do peso");
            System.out.printf("Seu IMC é \u00e9 %.1f\n", imc);
        }
        if(imc >= 18.6 && imc <= 24.9){
            System.out.println("Você está no peso ideal");
            System.out.printf("Seu IMC é \u00e9 %.1f\n", imc);
        }
        if(imc >= 25.0 && imc <= 29.9){
            System.out.println("Você está levemente acima do peso");
            System.out.printf("Seu IMC é \u00e9 %.1f\n", imc);
        }
        if(imc >= 30.0 && imc <= 34.9){
            System.out.println("Você está em obesidade grau I");
            System.out.printf("Seu IMC é \u00e9 %.1f\n", imc);
        }
        if(imc >= 35.0 && imc <= 39.9){
            System.out.println("Você está em obesidade grau II (severa)");
            System.out.printf("Seu IMC é \u00e9 %.1f\n", imc);
        }
        if(imc > 40.0){
            System.out.println("Você está em obesidade grau III (mórbida)");
            System.out.printf("Seu IMC é \u00e9 %.1f\n", imc);
        }                   
    }
}

        

