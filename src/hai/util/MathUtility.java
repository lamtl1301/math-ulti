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
public class MathUtility {
    //Math này fake JDK
    // JDK có .abs(), .sqrt(), .sin(), .Pi
    public static final double PI = 3.1415;
    
    //hàm tính giai thừa n! = 1.2.3.4...n;
    //mình ko tính giai thừa âm
    //21! cực lớn, tràn kiểu long
    //int: tối đa 2 tỷ .....
    // hàm tính giai thừa trong giới hạn đầu vào từ 0...20
    public static long getFactorial(int n){
        if (n < 0 || n > 20){
            throw new IllegalArgumentException("n must be between 0..20");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        // ko dùng else
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

}
