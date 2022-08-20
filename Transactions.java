import java.util.Scanner;

public class Transactions {
  public static void main(String[] args) {

    System.out.println("Enter the size of transaction array");
    Scanner in = new Scanner(System.in);
    String arraySize = in.nextLine();

    System.out.println("Enter the values of array");
    String valuesOfArray = in.nextLine();

    System.out.println("Enter the total no of targets that needs to be achieved");
    String target = in.nextLine();
    System.out.println("Enter the value of target");
    String targetValue = in.nextLine();

   if(Integer.parseInt(target) == 2){

     System.out.println("Target achieved after 2 transactions");

     System.out.println("Enter the value of target");

     String target1Value = in.nextLine();

     System.out.println("Target achieved after 1 transactions");

   }

    Transactions transactions= new Transactions();
    String result = transactions.paymoney(arraySize , valuesOfArray , targetValue);
    System.out.println(result);
  }
  public String paymoney(String count, String valuesOfArray, String targetValue){
    String[] arrayValue = valuesOfArray.split(" ");
    int length = Integer.parseInt(count);
    int total = 0;
    String target1Message = null;
    String[] transactionArray = new String[length];
    for(int i=0;i<length;i++){
      transactionArray[i] = arrayValue[i];
      total = total+Integer.parseInt(transactionArray[i]);

      target1Message = "Target "+i+" i.e "+total+" is achieved after "+i+" transactions\n";
    }

 if(total<= Integer.parseInt(targetValue)) {
   total=0;
   return "Given target is not achieved ";

 }
    return target1Message;
  }
}