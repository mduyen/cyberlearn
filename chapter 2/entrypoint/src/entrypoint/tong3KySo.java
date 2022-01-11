package entrypoint;

import java.util.Scanner;

public class tong3KySo {
    public static void main(String[] args) {
        
        int n, unit, ten, hundred, sum;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Chuong trinh tinh tong 3 ky so.\n");
        System.out.print("Nhap vao mot so tu nhien co 3 chu so: ");
        
        n = Integer.parseInt(scan.nextLine());
        
        /*
        Ví dụ: n =256
        hundred = 256 / 100 = 2
        ten = 256 % 100 = 56 / 10 = 5
        unit = 256 % 10 = 6
        */
        hundred = n/100;
        ten = (n%100)/10;
        unit = n%10;
        sum = hundred + ten + unit;
        System.out.println("Tong 3 ky so cua n = " + n + " la: " + sum);
    }
    
}
