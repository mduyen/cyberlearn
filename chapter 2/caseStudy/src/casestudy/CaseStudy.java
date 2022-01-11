package casestudy;

import java.util.Scanner;

public class CaseStudy {

    public static void main(String[] args) {
        
        // Hằng số được định dạng bên trái
        final int NUM_CHAR_PADD_LEFT = -70;
        
        int costAdult, costChild, sold, soldToAdult, soldToChild, percent;
        String nameMovie;
        float charity, remainder, income;
        Scanner nhap = new Scanner(System.in);
        
        System.out.println("Chuong trinh tinh tien tu thien tu ve xem phim va dinh dang no.\n");
        
        System.out.print("Nhap vao ten phim: ");  
        nameMovie = nhap.nextLine();
        
        System.out.print("Nhap vao gia ve nguoi lon: ");
        costAdult = Integer.parseInt(nhap.nextLine());
        
        System.out.print("Nhap vao gia ve tre em: ");
        costChild = Integer.parseInt(nhap.nextLine());
        
        System.out.print("Nhap so ve da ban cho nguoi lon: ");
        soldToAdult = Integer.parseInt(nhap.nextLine());
        
        System.out.print("Nhap so ve da ban cho tre em: ");
        soldToChild = Integer.parseInt(nhap.nextLine());
        
        System.out.print("Nhap vao phan tram lam tu thien: ");
        percent = Integer.parseInt(nhap.nextLine());
        
        // Tính toán
        sold = soldToAdult + soldToChild;   // Tổng vé = số vé bán cho người lớn + số vé bán cho trẻ em
        income = costAdult*soldToAdult + costChild*soldToChild;  // Tổng thu nhập = tiền bán vé người lớn + tiền bán vé trẻ em
        // vì tiền từ thiện (float) khác kiểu với phần trăm (int) nên ta phải ép kiểu
        charity = ((1.0f)*percent)/100*income;   // Tiền từ thiện = phần trăm từ thiện / 100 * tổng thu nhập
        remainder = income - charity;   // Tiền còn lại = tổng thu nhập - từ thiện
        
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");

        // Phần định dạng
        // Vì 100 = $ nên chúng ta thay ("%-100s") thành ("%1$" + "-100" + "s") rồi chuyển qua hằng số
     
        String text = String.format("%1$" + NUM_CHAR_PADD_LEFT + "s","Ten-phim-").replace(' ','.').replace('-',' ');
        System.out.println(text + nameMovie);
        
        text = String.format("%1$" + NUM_CHAR_PADD_LEFT + "s","So-ve-da-ban-la:-").replace(' ','.').replace('-',' ');
        System.out.println(text + sold);
        
        text = String.format("%1$" + NUM_CHAR_PADD_LEFT + "s","Doanh-thu-la:-").replace(' ','.').replace('-',' ');
        System.out.println(text + income);
        
        text = String.format("%1$" + NUM_CHAR_PADD_LEFT + "s","Trich-phan-tram-tu-thien:-").replace(' ','.').replace('-',' ');
        System.out.println(text + percent + "%");
        
        text = String.format("%1$" + NUM_CHAR_PADD_LEFT + "s" ,"Tong-tien-trich-tu-thien:-").replace(' ','.').replace('-',' ');
        System.out.println(text + charity);
        
        text = String.format("%1$" + NUM_CHAR_PADD_LEFT + "s" ,"Tong-thu-dươc-sau-khi-tru:-").replace(' ','.').replace('-',' ');
        System.out.println(text + remainder);
    }
    
}

