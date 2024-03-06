// exercicios

import jdk.jshell.PersistentSnippet;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // negativos(sc);
        // somaVetor(sc);
         alturas(sc);
        // numerosPares(sc);
        // maiorPosicao(sc);
        // somaVetores(sc);
        // abaixoMedia(sc);
        // mediaPares(sc);
        // maisVelho(sc);
        // aprovados(sc);
        // dadosPessoa(sc);

        sc.close();
    }

    public static void negativos(Scanner sc){
        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        if(n > 10){
            System.out.println("Numero muito grande, tente com um menor ou igual a 10");
            return;
        }

        int[] vect = new int[n];
        for (int i = 0; i < vect.length; i++){
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }
        System.out.println("NUMEROS NEGATIVOS:");
        for (int i = 0; i < vect.length; i++){
            if(vect[i] < 0){
                System.out.println(vect[i]);
            }
        }

    }

    public static void somaVetor(Scanner sc){
        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        double[] vect = new double[n];
        for (int i = 0; i < vect.length; i++){
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }
        String values = Arrays.toString(vect).replaceAll("[\\[\\]]", "");
        double sum = Arrays.stream(vect).sum();
        double avg = sum / vect.length;
        System.out.printf("VALORES = %s\n", values);
        System.out.printf("SOMA = %.2f\n", sum);
        System.out.printf("MEDIA = %.2f\n", avg);

    }

    public static void alturas(Scanner sc){
        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();
        Person[] vectPerson = new Person[n];

        double totalHeight = 0.0;
        int totalAge16 = 0;

        for (int i = 0; i < vectPerson.length; i++){
            System.out.printf("Dados da pessoa %d:\n", i+1);
            System.out.print("Nome: ");
            String name = sc.next();
            System.out.print("Idade: ");
            int age = sc.nextInt();
            System.out.print("Altura: ");
            double height = sc.nextDouble();
            vectPerson[i] = new Person(name, age, height);
            totalHeight += vectPerson[i].getHeight();

            if(vectPerson[i].getAge() < 16){
                totalAge16++;
            }
        }
        System.out.print("\n");
        double avgHeight = totalHeight / vectPerson.length;
        double percentAge = (double) totalAge16 / vectPerson.length * 100;

        System.out.printf("Altura média: %.2f\n", avgHeight);
        System.out.printf("Pessoas com menos de 16 anos: %.2f%%\n", percentAge);
        for (int i = 0; i < vectPerson.length; i++){
            if(vectPerson[i].getAge() < 16){
                System.out.println(vectPerson[i].getName());
            }
        }
    }

    public static void numerosPares(Scanner sc){
        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        int[] vect = new int[n];

        for (int i = 0; i < vect.length; i++){
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }
        System.out.println("Numeros pares: ");
        int pars = 0;
        for (int i = 0; i < vect.length; i++){
            if(vect[i] % 2 == 0){
                System.out.print (vect[i] + " ");
                pars++;
            }
        }
        System.out.print("\n");
        System.out.printf("Quantidade de pares = %d", pars);
    }

    public static void maiorPosicao(Scanner sc){
        System.out.print("Quantos números vai digitar? ");
        int n = sc.nextInt();
        double[] vect = new double[n];
        for (int i = 0; i < vect.length; i++){
            System.out.print("Digite um número: ");
            vect[i] = sc.nextDouble();
        }
        double max = Arrays.stream(vect).max().getAsDouble();
        System.out.printf("Maior valor = %.2f\n", max);
        int index = 0;
        for (int i = 0; i < vect.length; i++){
            if(vect[i] == max){
                index = i;
            }
        }
        System.out.printf("Posição do maior valor = %d", index);
    }

    public static void somaVetores(Scanner sc){
        System.out.print("Quantos valores vai ter cada vetor? ");
        int n = sc.nextInt();
        int[] vectA = new int[n];
        System.out.println("Digite os valores do vetor A:");
        for (int i = 0; i < vectA.length; i++){
          vectA[i] = sc.nextInt();
        }

        int[] vectB = new int[n];
        System.out.println("Digite os valores do vetor B:");
        for (int i = 0; i < vectB.length; i++){
          vectB[i] = sc.nextInt();
        }

        int[] vectC = new int[n];
        for (int i = 0; i < n; i++){
            int vectCValue = vectA[i] += vectB[i];
            vectC[i] = vectCValue;
        }

        System.out.println("Vetor resultante:");
        for (int i = 0; i < vectC.length; i++){
            System.out.println(vectC[i]);
        }
    }

    public static void abaixoMedia(Scanner sc){
        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();
        double[] vect = new double[n];
        for (int i = 0; i < vect.length; i++){
            System.out.print("Digite um número: ");
            vect[i] = sc.nextDouble();
        }
        double avg = Arrays.stream(vect).sum() / vect.length;
        System.out.printf("Media do vetor = %.3f\n", avg);

        System.out.println("Elementos abaixo da média:");
        for (int i = 0; i < vect.length; i++){
            if(vect[i] < avg){
                System.out.println(vect[i]);
            }
        }
    }

    public static void mediaPares(Scanner sc){
        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        int[] vect = new int[n];
        int totalPars = 0;
        int lengthPars = 0;

        for (int i = 0; i < vect.length; i++){
            System.out.print("Digite um número: ");
            vect[i] =  sc.nextInt();
            if(vect[i] % 2 == 0){
                totalPars += vect[i];
                lengthPars++;
            }
        }
        if(totalPars != 0 && lengthPars != 0){
            double avg = (double) totalPars / lengthPars;
            System.out.printf("Media dos pares = %.2f\n", avg);
        }else {
            System.out.println("Nenhum número par");
        }
    }

    public static void maisVelho(Scanner sc){
        System.out.print("Quantas pessoas voce vai adcionar? ");
        int n = sc.nextInt();
        PersonOld[] vect = new  PersonOld[n];
        String oldName = "";
        int oldAge = 0;
        for (int i = 0; i < vect.length; i++){
            System.out.printf("Dados da pessoa %d\n", i + 1);
            System.out.print("Nome: ");
            String name = sc.next();
            System.out.print("Idade: ");
            int age = sc.nextInt();
            vect[i] = new PersonOld(name, age);

            if(vect[i].getAge() > oldAge){
                oldName = vect[i].getName();
            }
        }
        System.out.printf("Pessoa mais velha: %s", oldName);
    }

    public static void aprovados(Scanner sc){
        System.out.print("Quantos alunos serão digitados: ");
        int n = sc.nextInt();
        Aluno[] vect = new Aluno[n];
        for (int i = 0; i < vect.length; i++){
            System.out.printf("Digite nome, primeira e segunda nota do aluno %d:\n", i + 1);
            String name = sc.next();
            double nota1 = sc.nextDouble();
            double nota2 = sc.nextDouble();
            vect[i] = new Aluno(name, nota1, nota1);
        }

        System.out.println("Alunos aprovados:");
        for (int i = 0; i < vect.length; i++){
            double avg = (vect[i].getNota1() + vect[i].getNota2()) / 2;
            if(avg > 5){
                System.out.println(vect[i].getName());
            }
        }
    }

    public static void dadosPessoa(Scanner sc){
        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();
        DataPerson[] vect = new DataPerson[n];

        for (int i = 0; i < vect.length; i++){
            System.out.printf("Altura da pessoa %d: ", i + 1);
            double height = sc.nextDouble();
            System.out.printf("Gênero (M,F) da pessoa %d: ", i + 1);
            char sex = sc.next().toUpperCase().charAt(0);
            vect[i] = new DataPerson(height, sex);
        }

        double minHeight = vect[0].getHeight();
        double maxHeight = vect[0].getHeight();
        double totalHeightF = 0.0;
        int totalSexFCount = 0;
        int totalSexMCount = 0;

        for (int i = 0; i < vect.length; i++){
            if(vect[i].getHeight() < minHeight) minHeight = vect[i].getHeight();
            if(vect[i].getHeight() > maxHeight) maxHeight = vect[i].getHeight();

            if(vect[i].getSex() == 'F') {
                totalHeightF += vect[i].getHeight();
                totalSexFCount++;
            };
            if(vect[i].getSex() == 'M') totalSexMCount++;

        }
        double sexFAvg = totalHeightF / totalSexFCount;

        System.out.printf("Menor altura = %.2f\n", minHeight);
        System.out.printf("Maior altura = %.2f\n", maxHeight);
        System.out.printf("Maior das alturas das mulheres = %.2f\n", sexFAvg);
        System.out.printf("Numero de homens = %d\n", totalSexMCount);
    }
}
