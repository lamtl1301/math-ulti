/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hai.util;

import static hai.util.MathUtility.*;
// câu lệnh từ JDK 8 
// để sử dụng hàm static mà không cần gọi các class

/**
 *
 * @author Admin
 */
public class Main {

    public static void main(String[] args) {
        // ta test thử hàm, so sánh kết quả thực tế khi chạy và kết quả mong đợi
        long expected = 120; // ta mong nhận kết quả 120 nếu gọi hàm 5!;
        long actual = getFactorial(5);
        System.out.println("5!: Expected: " + expected + " Actual: " + actual);
        // expected: 720 nếu tính 6!
        System.out.println("6!: " + getFactorial(6));
        // expected: 1 nếu tính 0!
        System.out.println("0!: " + getFactorial(0));
        // expected: IllegalArgumentException nếu tính -5!
        System.out.println("Goodbye and good luck to you all in the FINAL EXAM");
        System.out.println("Hope that you all will get the GREEN ICONS");
        System.out.println("-5!: " + getFactorial(-5));
        //in thử PI coi có giống Math.PI hem?
        System.out.println(PI);
    }
    
}
