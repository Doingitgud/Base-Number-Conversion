
public class Decimal_To_Binary_Converter extends Converter {

    void Decimal_To_Binary(int n) {
        int k, remainder, l = 0;
        int[] value = new int[detArraySize(n, 2)];
        k = n;
        while (k != 0) {
            remainder = k % 2;
            value[l] = remainder;
            k = k / 2;
            l++;
        }
  //---------------Checking for only zero input----------------------------------------      
         if(!checkZero(value,l))
     { 
         System.out.println("Binary value from input: 0");
         return;
     }  
 //-------------------------------------------------------------------------------------        
         
        value = revArray(value,l);
        printArray(value,l,"Binary");
    }

}
