import java.util.Random;
public class arrays {
  public static void main(String[] args) {
    Random num = new Random(); 
	int[] arr = new int[20];
		for (int i = 0; i < arr.length; i++) {
        	 arr[i] = num.nextInt(); 
         	System.out.println(arr[i]);
      }    }
}