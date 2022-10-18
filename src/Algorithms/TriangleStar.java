package Algorithms;

public class TriangleStar {
    public void printStar(int n, String now){
        if( n== now.length()){
            return;
        }
        System.out.println(now);
        printStar(n,now+"*");

    }
    public static void main(String[] args) {

        TriangleStar star = new TriangleStar();
        star.printStar(5,"*");

    }
}
