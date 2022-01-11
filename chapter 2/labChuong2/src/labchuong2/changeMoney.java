package labchuong2;

import java.util.Scanner;

public class changeMoney {
    
    public static void main(String[] args) {
        System.out.println("----Chuong trinh doi tien USD -> VND----\n");
        Scanner scan = new Scanner(System.in);
        
        final int USD = 23500;
        int usd, change;
        System.out.print("Nhap vao so tien muon doi (USD): ");
        usd = scan.nextInt();
        
        change = usd * USD;
        System.out.println("So tien sau khi doi tư " + usd + " (USD) sang (VND) la: " + change + " VND");
           
    }
    
}
