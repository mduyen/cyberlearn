
package lenhdieukien;

import java.util.Scanner;

public class superMarket {

    public static void main(String[] args) {
        final int QUOTE1 = 100;
        final int QUOTE2 = 50;
        final float GIFT_QUOTE1 = 0.88f;
        final float GIFT_QUOTE2 = 0.92f;
        
        System.out.println("Chuong trinh tinh tien va khuyen mai sieu thi.\n");
        Scanner scan = new Scanner (System.in);
        String tenHang;
    
        float donGia, thanhTien, soLuong;
        
        System.out.print("Nhap vao ten hang: ");
        tenHang = scan.nextLine();
        do{
            System.out.print("Nhap so luong: ");
            soLuong = Float.parseFloat(scan.nextLine()); 
            if (soLuong<=0){
                System.out.println("Nhap lai so luong!");
            }
        } while(soLuong<=0);
        System.out.print("Nhap don gia: ");
        donGia = Float.parseFloat(scan.nextLine());
        
//        if ((soLuong > 0)&&(soLuong <=50)){
//            thanhTien = soLuong*donGia;
//        } else if ((soLuong > 50)&&(soLuong <= 100)){
//            thanhTien = 50*donGia + (soLuong-50)*donGia*0.92f; 
//        } else {
//            thanhTien = 50*donGia + (soLuong-50)*donGia*0.88f;
//        }
        if ((soLuong > 0)&&(soLuong <=QUOTE2)){
            thanhTien = soLuong*donGia;
        } else if ((soLuong > QUOTE2)&&(soLuong <= QUOTE1)){
            thanhTien = QUOTE2*donGia + (soLuong-QUOTE2)*donGia*GIFT_QUOTE2; 
        } else {
            thanhTien = QUOTE2*donGia + (soLuong-QUOTE2)*donGia*GIFT_QUOTE1;
        }
        System.out.println("Ten: " + tenHang);
        System.out.println("So luong: " + soLuong);
        System.out.println("Thanh tien: " + thanhTien);
    }
    
}
