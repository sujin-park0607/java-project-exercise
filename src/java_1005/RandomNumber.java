package java_1005;

public class RandomNumber implements RandomNumberImp {
    private int inputNum;
    private int randomNum;

    public RandomNumber(int inputNum) {
        this.inputNum = inputNum;
    }


    public void randomNum(){
        randomNum = (int)(Math.random() * 9);
        if(randomNum == 0){
            System.out.println("랜덤하게 생성된 숫자가 0입니다.");
            return;
        }else{
            System.out.println("난수: " + randomNum);
        }
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
        return (double)(inputNum / randomNum);
    }
}
