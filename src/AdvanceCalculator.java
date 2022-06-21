import java.util.Scanner;

class AdvanceCalculator {
  public static void main(String[] args) {

    char operator;
    int number1, number2, result;

    Scanner input = new Scanner(System.in);

  
    System.out.println("Choose: p : power , f: factorial");
    operator = input.next().charAt(0);

  

    switch (operator) {

      
      case 'p':
	System.out.println("Enter number");
   	number1 = input.nextInt();
	System.out.println("Enter power");
    	number2 = input.nextInt();

	result =1;
	for(int i=0; i<number2;i++)
	{
		result = result * number1;
	
	}
        
        System.out.println(" result is = " + result);
        break;

     
      case 'f':
	System.out.println("Enter number");
   	number1 = input.nextInt();
	
	int fact=1;
	for(int i=number1; i>0;i--)
	{
		fact = fact *i;
	}
        
        System.out.println("Factorial is = " + fact);
        break;


      default:
        System.out.println("Invalid");
        break;
    }

    input.close();
  }
}