import org.apache.commons.lang.ArrayUtils;
 
public class Array {
    public static void main(String[] args) {
        int[] numbers = {4, 9, 7, 3, 2, 8}; 
        int element = 2;
         
        int index = ArrayUtils.indexOf(numbers, element);
         
        System.out.println("Index of "+element+" is : "+index);
    }
}