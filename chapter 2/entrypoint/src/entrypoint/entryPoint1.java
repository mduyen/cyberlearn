package entrypoint;

import java.util.Scanner;

public class entryPoint1 {
   
    public static void main(String[] args) {
        System.out.println("Bai 1: Chuong trinh nhap chuoi va in ra chuoi do.\n");
        System.out.println("Demo lenh nhap.");  
        System.out.print("Nhap vao chuoi: ");
        
        Scanner nhap = new Scanner(System.in);
        
        String chuoi = nhap.nextLine(); 
        System.out.println("Chuoi vua nhap la: " + chuoi);
    }
    
}
