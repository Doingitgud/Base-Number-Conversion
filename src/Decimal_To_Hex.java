
public class Decimal_To_Hex extends Converter {

    void Decimal_To_Hex(int n) {
        int k, remainder, l = 0;
        int[] value = new int[detArraySize(n, 16)];
        k = n;
        while (k != 0) {
            remainder = k % 16;
            value[l] = remainder;
            k = k / 16;
            l++;
        }
 //---------------Checking for only zero input----------------------------------------      
         if(!checkZero(value,l))
     { 
         System.out.println("Hex value: 0");
         return;
     }    
//-------------------------------------------------------------------------------------         
        value = revArray(value,l);
        printArray(value,l, "Hex");
    }
    String intToHex(int h)
    {
        if(h==0)return "0";
        else if(h==1) return "1";
        else if(h==2) return "2";
        else if(h==3) return "3";
        else if(h==4) return "4";
        else if(h==5) return "5";
        else if(h==6) return "6";
        else if(h==7) return "7";
        else if(h==8) return "8";
        else if(h==9) return "9";
        else if(h==10) return "A";
        else if(h==11) return "B";
        else if(h==12) return "C";
        else if(h==13) return "D";
        else if(h==14) return "E";
        else if(h==15) return "F";
        else return "Invalid";
    }

    void printArray(int[] arrayToPrint,int length,String print) {

        System.out.print(print + " Value For Input: ");
        for (int i = 0; i <length; i++) {
            System.out.print(intToHex(arrayToPrint[i]));
        }
        System.out.println();
    }
}
