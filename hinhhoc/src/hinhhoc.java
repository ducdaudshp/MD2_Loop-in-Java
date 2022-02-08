import java.util.Scanner;

public class hinhhoc {
    public static void main(String[] args) {
        int choice =-1,k=0;
        Scanner scanner=new Scanner(System.in);
        while (choice !=0){
            System.out.println("Menu");
            System.out.println("1. Vẽ hình chữ nhật");
            System.out.println("2. Vẽ hình tam giác vuông");
            System.out.println("3. Vẽ hình tam giác cân");
            System.out.println("4. Thoát");
            System.out.print("Chọn hình muốn vẽ: ");
            choice= scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Hình chữ nhật");
                    for (int i=1;i<=3;i++){
                        for (int j=1;j<=5;j++){
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Hình tam giác vuông");
                    for (int i=1;i<=5;i++){
                        for (int j=1;j<=i;j++){
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Hình tam giác cân");
                    for (int i=1;i<=4;++i,k=0){
                        for (int j=1;j<=4-i;++j){
                            System.out.print("  ");
                        }
                        while (k!=2*i-1){
                            System.out.print("* ");
                            ++k;
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.exit(4);
                default:
                    System.out.println("Mời chọn lại hình");
            }
        }
    }
}
