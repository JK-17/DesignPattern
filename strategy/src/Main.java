import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Context ct = new Context();
            System.out.println("=".repeat(10));
            System.out.println("검색 하기!");
            System.out.println("1 모두 검색");
            System.out.println("2. 유튜브 검색");
            System.out.println("3. 인스타 검색");
            System.out.println("=".repeat(10));
            System.out.print("입력하세요 : ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    ct.setSs(new SearchALL());
                    break;
                case 2:
                    ct.setSs(new SearchYoutue());
                    break;
                case 3:
                    ct.setSs(new SearchInsta());
                    break;
                default:
                    System.out.println("Wrong Input");
            }

            ct.getStrategywork();   //search();
        }
    }
