package entrypoint;

import java.util.Scanner;

public class entryPoint2 {
    public static void main(String[] args) {
        System.out.println("Bai 2: Chuong trinh nhap vao so va in ra so do.\n");
        System.out.print("Nhap vao so: ");
        
        Scanner nhap = new Scanner(System.in);
        
        int so = nhap.nextInt();
        System.out.println("So vua nhap la: " + so);
    }
}
