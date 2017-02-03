import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public int multiply(ArrayList<Integer> list){
        Integer i = (Integer)list.remove(0);
        if(list.size() == 0){
            return i.intValue();
        }
        return i.intValue() * multiply(list);
    }   
    
    public ArrayList<Integer> getInputValues(){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        @SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = s.nextInt();
        numbers.add(new Integer(firstNumber));
        System.out.print("Enter second number: ");
        int secondNumber = s.nextInt();
        numbers.add(new Integer(secondNumber));
        System.out.print("Enter third number: ");
        int thirdNumber = s.nextInt();
        numbers.add(new Integer(thirdNumber));
        System.out.print("Enter fourth number: ");
        int fourthNumber = s.nextInt();
        numbers.add(new Integer(fourthNumber));
        System.out.print("Enter fifth number: ");
        int fifthNumber = s.nextInt();
        numbers.add(new Integer(fifthNumber));
        return numbers;
    }
   
    public static void main(String[] args){
        Test r = new Test();
        int answer = r.multiply(r.getInputValues());
        System.out.println("The Product is: ");
        System.out.println(answer);
    }
}
