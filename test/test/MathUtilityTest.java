/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import static hai.util.MathUtility.*;
import java.sql.SQLException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class MathUtilityTest {
    
    @Test //test biến hàm này thành public static void main()
    //cách đặt tên hàm sẽ nói lên mục tiêu test hàm, có nhiều quy tắc đặ tên
    // hàm test
    public void getFactorial_RunsWell_IfValidArgument(){
        assertEquals(720, getFactorial(6));
    }
    @Test(expected = SQLException.class ) // kì vọng ném về ngoại lệ
    // nếu đúng ngoại lệ IllegalArgumentException trong tình huống giai thừ -5 thì t có màu xanh
    public void getFactorial_ThrowsException_IfInvalidArgument(){
        getFactorial(-5);
        //Ngoại lệ không phải là value để so sánh, chỉ có thể kiểm tra nó xem nó có xuất hiện hay không
    }
}
