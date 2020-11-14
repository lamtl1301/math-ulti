/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hai.util;

/**
 *
 * @author Admin
 */
public class Main {

    public static void main(String[] args) {
        // ta test thử hàm, so sánh kết quả thực tế khi chạy và kết quả mong đợi
        long expected = 120; // ta mong nhận kết quả 120 nếu gọi hàm 5!;
        long actual = MathUtility.getFactorial(5);
        System.out.println("5!: Expected: " + expected + " Actual: " + actual);
        // expected: 720 nếu tính 6!
        System.out.println("6!: " + MathUtility.getFactorial(6));
        // expected: 1 nếu tính 0!
        System.out.println("0!: " + MathUtility.getFactorial(0));
        // expected: IllegalArgumentException nếu tính -5!
        System.out.println("-5!: " + MathUtility.getFactorial(-5));
    }
}
