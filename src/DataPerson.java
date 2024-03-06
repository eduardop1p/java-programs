public class DataPerson {
    private final double height;
    private final char sex;

    public DataPerson(double height, char sex){
        this.height = height;
        this.sex = sex;
    }

    public char getSex(){
        return sex;
    }

    public double getHeight(){
        return height;
    }

}