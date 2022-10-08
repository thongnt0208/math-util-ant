/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.wisen.mathutil.core;

import static com.wisen.mathutil.core.MathUtil.getFactorial;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author trung
 */
@RunWith (value = Parameterized.class)
public class MathUtilDDTTest {
    
    //1. Chuẩn bị bộ data, là mảng 2 chiều, 2 cột ứng với Expected và n
    //      dòng ứng với các test case
    
    //Mảng object, số thì dùng Wrapper class - class gói các primitive
    //Interger  -> int; Long -> long
    
    @Parameterized.Parameters
    public static Object[][] initData() {
        return new Integer[][] {{1, 0}, 
                                {1, 1}, 
                                {2, 2}, 
                                {6, 3}, 
                                {24, 4}, 
                                {120, 5}, 
                                {720, 6}
                                };
    }
    
    //Ta sẽ ánh xạ các cột của mỗi dòng, vd: dòng đầu tiên
    //có 2 cột laf 1 0 -> ánh xạ 1 vào biến expected; 0 vào biến n
    //tương tự cho các dòng còn lại
    
    @Parameterized.Parameter(value = 0)
    public long expected; //map vào cột 0 của mảng
    
    @Parameterized.Parameter(value = 1)
    public int n;//map vào cột 1 của mảng
    
    @Test //kiểm thử các test case với data được trích ra từ mảng và map vào 2 biến trên
    public void testFactorialGivenRightArgumentReturnWell(){
        assertEquals(expected, getFactorial(n));
    }
}

//Phân tích cách viết code cho phần test hàm getF() hôm trước

//Assert.assertEquals(1, MathUtil.getFactorial(0));

//lệnh dùng để test này lặp đi lặp lại cho các data đưa vào để ta kiểm tra các tình huống sài app
//Một hồi ta thay data 1 0 thành các data tương ứng khác.
//vd:
//Expected      n!
//1             0
//1             1
//2             2
//6             3
//...           ...

//Nếu ta có được cách nào đó mà tách đám data đó ra một chỗ
//Sau đó nhồi/nhóm/feed data này vào câu lệnh test hàm ở trên
//--> Coi như chỉ cần 1 lệnh gọi test hàm, data cứ thế tuần tự đẩy vào
//-----> Kĩ thuật tách data ra khỏi các câu lệnh test, sau đó nhồi nó vào cấc câu lệnh test
//giúp rút gọn số câu lệnh tes -> giúp dễ dàng kiểm tra tính thiếu/đủ của các test case
//KĨ THUẬT NÀY GỌI TÊN LÀ DDT - DATA DRIVEN TESTING
//(Viết code kiểm thử theo hướng tách data)
//Còn gọi một tên khác là kiểm thử theo kiểu THAM SỐ HOÁ - PARAMETERIZE
//Dấu ? ở câu lệnh gọi hàm chính là tên biến sẽ dùng để nhận data đã tách ra - CONVERT DATA THÀNH BIẾN

//Chơi với DDT ta cần
//Bộ data test tách rieng
//Các tham số ứng với bộ data - chính là các biến dùng trích data ra
//Gọi hàm kiểm thử xài các tham số

//Toàn bộ code trong class này được viết ra để test code chính ở bên src package
//Code được viết ra dùng để test code khác -> gọi là script
//1 test script sẽ chứa nhiều code để test hàm chính
//1 test script sẽ chứa nhiều test case (các tình huống sài app)
//1 test script có thể sài DDT để bảo trì code test
//việc viết code chính có thể xài TDD