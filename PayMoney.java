import java.util.Scanner;

public class PayMoney {

  public static void main(String[] args) {

    System.out.println("Enter the size of currency denominations");
    Scanner in = new Scanner(System.in);
    int arraySize = Integer.parseInt(in.nextLine());
    String valuesOfArray = "";
    System.out.println("Enter the currency denominations value");
    int val = arraySize;
    while(val!=0){
      valuesOfArray += in.nextLine()+" ";
      val--;
    }
    System.out.println("Enter the amount you want to pay");
    String target = in.nextLine();

    PayMoney payMoney= new PayMoney();
    payMoney.transactions(arraySize , valuesOfArray, target);
  }
  public void transactions(int count, String valuesOfArray,String target){
    int amount = Integer.parseInt(target);
    System.out.println("valuesOfArray" + valuesOfArray);
      String[] arrayValue = valuesOfArray.trim().split(" ");
      int length = count;
      String[] transactionArray = new String[length];
      for(int i=0;i<length;i++){
        transactionArray[i] = arrayValue[i];
      }
int total =0;
    // count notes using Greedy approach
    for (int i=0;i<length;i++) {
      if (amount >= Integer.parseInt(transactionArray[i])) {
        total = amount / Integer.parseInt(transactionArray[i]);
        amount = amount - total * Integer.parseInt(transactionArray[i]);
        System.out.println(transactionArray[i] + " : "
            + total);
      }
    }
    }
}