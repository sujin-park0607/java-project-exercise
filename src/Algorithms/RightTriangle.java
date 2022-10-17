package Algorithms;

public class RightTriangle {
    public void printStars(int n){
        for(int i=1; i <= n; i++){
            for(int j=0; j<i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        RightTriangle triangle = new RightTriangle();
        triangle.printStars(4);
    }
}
