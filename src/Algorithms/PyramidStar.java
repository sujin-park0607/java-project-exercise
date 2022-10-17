package Algorithms;

public class PyramidStar {
    public void printStar(int n){
//            위삼각형
        for(int i=0; i<n; i++){
//            공백
            for(int j=0; j<n-i-1; j++) {
                System.out.print(" ");
            }
//            별
            for(int j=0; j<2*i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

//        아래삼각형
        for(int i=0; i<n-1; i++){
//            공백
            for(int j=0; j<i+1; j++) {
                System.out.print(" ");
            }
//            별
            for(int j=2*(n-i-1)-1; j>0; j--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        PyramidStar pyramidStar = new PyramidStar();
        pyramidStar.printStar(5);
    }
}
