package practice;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OrderList orderList = OrderList.getInstance();

        while(true){
            System.out.println("=".repeat(10));
            System.out.println("MENU");
            System.out.println("1. 주문 넣기");
            System.out.println("2. 들어온 주문 확인 하기");
            System.out.println("3. 종료하기");
            System.out.println("=".repeat(10));
            System.out.print("입력하세요 : ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Name : ");
                    String name = sc.nextLine();
                    System.out.print("Price : ");
                    Long price = sc.nextLong();
                    sc.nextLine();
                    System.out.print("Quantity : ");
                    Long quan = sc.nextLong();
                    sc.nextLine();
                    orderList.addOrder(name, quan, price);
                    System.out.println("정상적으로 주문이 입력 되었습니다.");
                    break;
                case 2:
                    orderList.printOrders();
                    break;
                case 3:
                    System.out.println("THANKS FOR USING");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong Input");
            }
        }

    }
}
