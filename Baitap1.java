import java.util.Scanner;

public class Baitap1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ho va ten: ");
        String hoVaTen = scanner.nextLine();
        System.out.print("Nhap lop: ");
        String lop = scanner.nextLine();
        System.out.print("Nhap ma so sinh vien: ");
        String maSoSinhVien = scanner.nextLine();

        System.out.println("\nThong tin:");
        System.out.println("Ho va ten: " + hoVaTen);
        System.out.println("Lop: " + lop);
        System.out.println("Ma so sinh vien: " + maSoSinhVien);

        scanner.close();
    }
}

