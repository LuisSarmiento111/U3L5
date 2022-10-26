import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter your lottery pick: ");
        int lotteryNum = myObj.nextInt();
        Lottery lotteryNumber = new Lottery();
        lotteryNumber.determineWinnings(lotteryNum);
        System.out.println("The lottery number is " + lotteryNumber.determineWinnings(lotteryNum));
        lotteryNumber.toString();
    }
}