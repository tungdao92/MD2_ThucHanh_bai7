import java.util.Scanner;

public class Bai7_ChiSoCanNang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.println("nhập số cân(in kilogam)");
        weight = scanner.nextDouble();
        System.out.println("nhập chiều cao(in meter)");
        height = scanner.nextDouble();
        bmi = weight/Math.pow(height, 2);
        // System.out.println("% -20s%s" + "bmi" + "Interpretation\n");
        if (bmi < 18.0){
            System.out.println(bmi + "Hơi gầy");
        } else
        if (bmi< 25.0){
            System.out.println(bmi + "Bình Thường");
        } else
        if (bmi < 30.0){
            System.out.println(bmi + "Hơi béo");
        } else {
            System.out.println(bmi + "Quá béo");
        }
    }
}
