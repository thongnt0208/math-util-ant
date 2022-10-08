/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.wisen.mathutil.main;

import com.wisen.mathutil.core.MathUtil;

/**
 *
 * @author wisen
 */
public class Main {

    public static void testFactorialGivenWrongArguementThrowsException() {
        //Test case #3: đưa data cà chớn, n âm, n quá lớn
        // hàm được thiết kế ném ngoại lệ
        //Thấy ngoại lệ: mừng rơi nước mắ khi đưa vào -5
        //Thấy ngoại lệ --> như kì vọng --> passed test --> màu xanh
        System.out.println("Hope to see the Exception | Illegal Argument Exception");
        MathUtil.getFactorial(-5);
    }

    /**
     * Hàm này được viết ra để dùng kĩ thuật viết code kiểu TDD gọi thử/dùng thử
     * hàm chính bên core Xem nó sai đúng ra sao, ở ngay mức khởi đầu viết hàm
     */
    public static void tryTDDFirst() {
        //Test case #1:
        //- Input: n = 1;
        //- Gọi hàm getFactorial(1)
        //- Hy vọng hàm trả về 1, vì 1! = 1

        long expected = 1;
        long actual = MathUtil.getFactorial(1);
        //so sánh expected vs actual coi chúng nó giống nhau không?
        //giống --> Hàm đúng với case đang test
        //sai   --> Bug rồi!!! với case đang test
        System.out.println("Test 1! | Status: "
                + "Expected: " + expected
                + " | Actual: " + actual);
    }

    public static void tryTDDSecond() {
        //Test case #2:
        //- Input: n = 2;
        //- Gọi hàm getFactorial(2)
        //- Hy vọng hàm trả về 2, vì 2! = 2

        long expected = 2;
        long actual = MathUtil.getFactorial(2);
        //so sánh expected vs actual coi chúng nó giống nhau không?
        //giống --> Hàm đúng với case đang test
        //sai   --> Bug rồi!!! với case đang test
        System.out.println("Test 2! | Status: "
                + "Expected: " + expected
                + " | Actual: " + actual);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("This statement comes frome main() method");
        tryTDDFirst();
        tryTDDSecond();
//        testFactorialGivenWrongArguementThrowsException();

    }

}

//TEST CASE là gì?
//Là 1 tình huống xài app/kiểm thử app/tính năng/màn hình chức năng/xử lí của app
//Test case là tình huống kiểm thử các app/chức năng mà khi đó ta phải
//  - đưa vào data giả/mẫu/test,
//  - đưa ra giá trị kì vọng ta mong chờ app trả ra
//Sau đó chờ hàm/tính năng xử lí xong trả ra kết quả
//ta nhìn kết quả và so sánh với kì vọng trước đó!!!
//để kết luận hàm ổn/tính năng ổn
//Test case FAILED hoặc PASSED
//nếu FAILED thì Refactor

