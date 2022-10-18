package Algorithms;

public class SquareStar {
    public void printSquareMatrix(int n){
        for(int i=0; i<n; i++){
            System.out.println("*".repeat(n));
        }
    }
    public void printRectangle(int x, int y){
        for(int i=0; i<x; i++){
            for(int j=0; j<y; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        SquareStar star = new SquareStar();

        star.printSquareMatrix(5);
        star.printRectangle(5,4);
    }
}
