
import java.util.InputMismatchException;
import java.util.Scanner;

public class TestConverter {

    public static void main(String[] args) {
        int input, switchNum;
        String st;
        System.out.println("Press 1 for Decimal to Binary Conversion");
        System.out.println("Press 2 for Decimal to Octal Conversion");
        System.out.println("Press 3 for Decimal to Hexadecimal Conversion");
        System.out.println("Press 4 for Binary to Decimal Conversion");
        System.out.println("Press 5 for Binary to Octal Conversion");
        System.out.println("Press 6 for Binary to Hexadecimal Conversion");
        System.out.println("Press 7 for Octal to Decimal Conversion");
        System.out.println("Press 8 for Octal to Binary Conversion");
        System.out.println("Press 9 for Octal to Hexadecimal Conversion");
        System.out.println("Press 10 for Hexadecimal to decimal Conversion");
        System.out.println("Press 11 for Hexadecimal to binary Conversion");
        System.out.println("Press 12 for Hexadecimal to octal Conversion");
        Scanner s = new Scanner(System.in);

        switchNum = s.nextInt();

        switch (switchNum) {
            case 1:
                System.out.println("Decimal to Binary Conversion");
                System.out.print("Enter your Decimal number: ");
                try {
                    input = s.nextInt();
                    Decimal_To_Binary_Converter dtb = new Decimal_To_Binary_Converter();
                    dtb.Decimal_To_Binary(input);
                } catch (InputMismatchException inmimaexOne) {
                    System.out.println("Wrong input. Try again");
                }
                break;
            case 2:
                System.out.println("Decimal to Octal Conversion");
                System.out.print("Enter your Decimal number: ");
                try {
                    input = s.nextInt();
                    Decimal_To_Octal_Converter dto = new Decimal_To_Octal_Converter();
                    dto.Decimal_To_Octal(input);
                } catch (InputMismatchException inmimaexTwo) {
                    System.out.println("Wrong input. Try again");
                }
                break;
            case 3:
                System.out.println("Decimal to Hexadecimal Conversion");
                System.out.print("Enter your Decimal number: ");
                try {
                    input = s.nextInt();
                    Decimal_To_Hex dth = new Decimal_To_Hex();
                    dth.Decimal_To_Hex(input);
                } catch (InputMismatchException inmimaexThree) {
                    System.out.println("Wrong input. Try again");
                }
                break;
            case 4:
                System.out.println("Binary to Decimal Conversion");
                System.out.print("Enter your Binary number: ");
                try {
                    input = s.nextInt();
                    Binary_To_Decimal_Converter btd = new Binary_To_Decimal_Converter();
                    btd.binToDecimal(input);
                } catch (InputMismatchException inmimaexFour) {
                    System.out.println("Wrong input. Try again");
                }
                break;
            case 5:
                System.out.println("Binary to Octal Conversion");
                System.out.print("Enter your Binary number: ");
                try {
                    input = s.nextInt();
                    Binary_To_Octal_Converter bto = new Binary_To_Octal_Converter();
                    bto.binToOctal(input);
                } catch (InputMismatchException inmimaexFive) {
                    System.out.println("Wrong input. Try again");
                }
                break;
            case 6:
                System.out.println("Binary to Hexadecimal Conversion");
                System.out.print("Enter your Binary number: ");
                try {
                    input = s.nextInt();
                    Binary_To_Hex_Converter bth = new Binary_To_Hex_Converter();
                    bth.binToDecimal(input);
                } catch (InputMismatchException inmimaexSix) {
                    System.out.println("Wrong input. Try again");
                }
                break;
            case 7:
                System.out.println("Octal to Decimal Conversion");
                System.out.print("Enter your Octal number: ");
                try {
                    input = s.nextInt();
                    Octal_To_Decimal_Converter otd = new Octal_To_Decimal_Converter();
                    otd.octToDecimal(input);
                } catch (InputMismatchException inmimaexSeven) {
                    System.out.println("Wrong input. Try again");
                }
                break;
            case 8:
                System.out.println("Octal to Binary Conversion");
                System.out.print("Enter your Octal number: ");
                try {
                    input = s.nextInt();
                    Octal_To_Binary_Converter otb = new Octal_To_Binary_Converter();
                    otb.octal_To_Binary(input);
                } catch (InputMismatchException inmimaexEight) {
                    System.out.println("Wrong input. Try again");
                }
                break;
            case 9:
                System.out.println("Octal to Hexadecimal Conversion");
                System.out.print("Enter your Octal number: ");
                try {
                    input = s.nextInt();
                    Octal_To_Hex_Converter oth = new Octal_To_Hex_Converter();
                    oth.octal_To_Hex(input);
                } catch (InputMismatchException inmimaexNine) {
                    System.out.println("Wrong input. Try again");
                }
                break;
            case 10:
                s.nextLine();
                System.out.println("Hexadecimal to Decimal Conversion");
                System.out.print("Enter your Hexadecimal number: ");
                st = s.nextLine();
                Hex_To_Decimal htd = new Hex_To_Decimal();
                htd.hex_To_Decimal_Convert(st);
                break;
            case 11:
                s.nextLine();
                System.out.println("Hexadecimal to Binary Conversion");
                System.out.print("Enter your Hexadecimal number: ");
                st = s.nextLine();
                Hex_To_Binary htb = new Hex_To_Binary();
                htb.hex_To_Bin_Convert(st);
                break;
            case 12:
                s.nextLine();
                System.out.println("Hexadecimal to Octal Conversion");
                System.out.print("Enter your Hexadecimal number: ");
                st = s.nextLine();
                Hex_To_Octal hto = new Hex_To_Octal();
                hto.hex_To_Bin_Convert(st);
                break;
            default:
                System.out.println("Invalid");
                break;
        }

    }
}
