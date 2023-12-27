import java.util.Scanner;

 class IllegalTriangleException extends Exception {
    public IllegalTriangleException(String message) {
        super(message);
    }
}

public class TriangleApplication {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Nhập cạnh thứ nhất: ");
            double side1 = scanner.nextDouble();
            System.out.println("Nhập cạnh thứ hai: ");
            double side2 = scanner.nextDouble();
            System.out.println("Nhập cạnh thứ ba: ");
            double side3 = scanner.nextDouble();

            checkTriangle(side1, side2, side3);

            System.out.println("Ba cạnh đã tạo thành một tam giác hợp lệ.");
        } catch (IllegalTriangleException e) {
            System.out.println("Lỗi: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Lỗi: Đã xảy ra một lỗi không mong muốn.");
        }
    }

    private static void checkTriangle(double side1, double side2, double side3) throws IllegalTriangleException {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0 || (side1 + side2 <= side3) || (side1 + side3 <= side2) || (side2 + side3 <= side1)) {
            throw new IllegalTriangleException("Ba cạnh không thỏa điều kiện để tạo thành một tam giác.");
        }
    }
}
