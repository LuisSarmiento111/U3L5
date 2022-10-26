public class Lottery {
    private int lotteryNumber;
    private int winnings;

    public Lottery(){
        lotteryNumber = (int)Math.random() * 100;
        if (lotteryNumber < 10){
            lotteryNumber = Integer.valueOf("0" + lotteryNumber);
        }
    }

    public int determineWinnings(int userNumber){
        String userNum = Integer.toString(userNumber);
        String lotteryNum = Integer.toString(lotteryNumber);
        if (userNumber < 10){
            userNumber = Integer.valueOf("0" + userNumber);
        }
        if (userNumber == lotteryNumber){
            winnings = 100;
            return winnings;
        } else if ((userNum.substring(0, 1) == lotteryNum.substring(1)) && (userNum.substring(1) == lotteryNum.substring(0, 1))) {
            winnings = 10;
            return winnings;
        }
        else if ((userNum.substring(0, 1) == lotteryNum.substring(1)) || (userNum.substring(1) == lotteryNum.substring(0, 1))){
            winnings = 3;
            return winnings;
        }
        else{
            winnings = 0;
            return winnings;
        }
    }

    public String toString(){
        if (winnings == 100) {
            return "Exact match:  You win $100!";
        }
        else if (winnings == 10){
            return "Match all digits but not in correct order:  You win $10!";
        }
        else if (winnings == 3){
            return "Match one digit: you win $3!";
        }
        else{
            return "No matching numbers, you win nothing :(";
        }
    }
}
