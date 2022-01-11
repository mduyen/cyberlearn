package lenhdieukien;

import java.util.Scanner;

public class creditCard {

    public static void main(String[] args) {
        
        final float INTEREST = 0.015f;
        
        Scanner scan = new Scanner(System.in);
        float creditCardBalence, payment, balance;
        float penalty = 0;
        
        System.out.print("Nhap so du the tin dung: ");
        creditCardBalence = Float.parseFloat(scan.nextLine());
        System.out.print("Nhap so tien ban da thanh toan: ");
        payment = Float.parseFloat(scan.nextLine());
        
        balance = creditCardBalence - payment;
        if (balance > 0){
            penalty = balance*INTEREST;      
        }
        System.out.println("Phi phat la: " + penalty);
    }
    
}
