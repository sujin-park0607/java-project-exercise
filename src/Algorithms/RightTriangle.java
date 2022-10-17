package Algorithms;

public class RightTriangle{
    private String letter = "*";

    public RightTriangle(){
    }

    public RightTriangle(String letter) {
        this.letter = letter;
    }


    public void printStars(int n){

        for(int i=1; i <= n; i++){
            for(int j=0; j<i; j++){
                System.out.printf("%s ",this.letter);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        RightTriangle triangle = new RightTriangle("#");
        triangle.printStars(4);
    }


}
