package java_1005;

public class RandomNumber implements RandomNumberImp {
    private int inputNum;
    private int randomNum;

    public RandomNumber(int inputNum) {
        this.inputNum = inputNum;
    }


    public void randomNum(){
        randomNum = (int)(Math.random() * 9);
    }


    @Override
    public int plus() {
        return inputNum + randomNum;
    }

    @Override
    public int minus() {
        return inputNum - randomNum;
    }

    @Override
    public int multiple() {
        return inputNum * randomNum;
    }

    @Override
    public double divide() {
        if(randomNum==0){
            System.out.println("0으로 나눌 수 없습니다");
             return 0;
        } else{
            return (double)(inputNum / randomNum);
        }
    }
}
