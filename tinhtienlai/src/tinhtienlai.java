import java.util.Scanner;

public class tinhtienlai {
    public static void main(String[] args) {
        double money=1.0;
        int month=1;
        double interestRate=1.0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập số tiền muốn gửi: ");
        money= scanner.nextDouble();
        System.out.println("Nhập sô tháng gửi: ");
        month= scanner.nextInt();
        System.out.println("Nhập lãi suất: ");
        interestRate= scanner.nextDouble();
        double totalInterest =0;
        for (int i=0;i<month;i++){
            totalInterest += money * (interestRate/100)/12 *month;
        }
        System.out.println("Tiền lãi = " +totalInterest);
    }
}
