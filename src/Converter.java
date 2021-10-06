
public class Converter {
    
    int[] revArray(int[] forwardArray,int length) {
        int[] revArray = new int[length];
        int j = 0;
        for (int i = length - 1; i >= 0; i--) {
            revArray[j] = forwardArray[i];
            j++;
        }
        return revArray;
    }

    void printArray(int[] arrayToPrint,int length, String print) {

        System.out.print(print+" value: ");
        for (int i = 0; i <length; i++) {
            System.out.print(arrayToPrint[i]);
        }
        System.out.println();
    }
    int detArraySize(int m,int base ) {
        int s = 0;
        while (m != 0) {
            m = m / base;
            s++;
        }
       
        return s;
    }
   boolean checkZero(int []val,int length)
   {
       int counter=0;
       for(int i=0;i<length;i++)
       {
           if(val[i]==0)counter++;       
       }
       if(counter==length)return false;
       else return true;
   }
}
