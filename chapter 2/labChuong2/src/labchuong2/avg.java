package labchuong2;

import java.util.Scanner;

public class avg {

    public static void main(String[] args) {
        System.out.println("----Chuong trinh tinh trung binh cong 5 so.----\n");
        Scanner scan = new Scanner(System.in);
        
        int num1, num2, num3, num4, num5;
        int sum = 0;
        float avg;
        
        System.out.print("Nhap so thu nhat: ");
        num1 = scan.nextInt();
        System.out.print("Nhap so thu hai: ");
        num2 = scan.nextInt();
        System.out.print("Nhap so thu ba: ");
        num3 = scan.nextInt();
        System.out.print("Nhap so thu tu: ");
        num4 = scan.nextInt();
        System.out.print("Nhap so thu nam: ");
        num5 = scan.nextInt();
        
        sum = num1 + num2 + num3 + num4 + num5;
        // vì avg (float) khác kiểu sum (int) nên phải ép kiểu
        avg = (1.0f)*sum/5;
        System.out.println("Trung binh cong 5 so la: " + avg);
    }
}
