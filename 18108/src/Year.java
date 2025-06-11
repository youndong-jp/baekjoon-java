import java.util.Scanner;
public class Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        sc.nextLine();
        System.out.println(year-543);
    }
}
///예시로 준 값에서 결과 값을 빼서 불기와 서기가 543년의 차이가 있는걸 유추 함
///sc.nextLine();로 버퍼 까지 지웠다!