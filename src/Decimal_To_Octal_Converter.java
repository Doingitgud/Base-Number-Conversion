
public class Decimal_To_Octal_Converter extends Converter {

    void Decimal_To_Octal(int n) {
        int k,remainder, l = 0;
        int [] value = new int[detArraySize(n, 8)];
        k = n;
        while (k != 0) {
            remainder = k % 8;
            value[l] = remainder;
            k = k / 8;
            l++;
        }
//---------------Checking for only zero input----------------------------------------      
         if(!checkZero(value,l))
     { 
         System.out.println("Octal value: 0");
         return;
     }    
//-------------------------------------------------------------------------------------        
        value = revArray(value,l);
        printArray(value,l,"Octal");
    }
}
