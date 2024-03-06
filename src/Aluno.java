public class Aluno {
    private final String name;
    private final double nota1;
    private final double nota2;

    public Aluno(String name, double nota1, double nota2){
        this.name = name;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getName(){
        return name;
    }

    public double getNota1(){
        return nota1;
    }

    public double getNota2(){
        return nota2;
    }
}