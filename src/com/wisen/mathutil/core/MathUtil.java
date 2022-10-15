/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wisen.mathutil.core;

/**
 *
 * @author trung
 */
//Đây là class mô phỏng lại các hàm tiện ích dùng chung cho mọi
// clas khác, mô phỏng lại class tiện ích java.Math của JDK
//Phàm cái gì là đồ dùng chung, thường được thiết kế là static
public class MathUtil {

    public static final double PI = 3.141592653589793;

//    //hàm tiện ích tính n! = 1.2.3...n
//    //Lưu ý:
//    //  - Không tính giai thừa số âm
//    //    0! = 1! = 1
//    //  - Vì giai thừa tăng cực nhanh nên 21! đã vượt 18 số 0 -> tràn kiểu long -> Ta không tính 21! trở lên
//    public static long getFactorial(int n) {
//        if (n < 0 || n > 20) 
//            throw new IllegalArgumentException("Invalid n. n must be between 0..20");
//        
//        if (n == 0 || n == 1)
//            return 1;
//        
//        //sống đến đây -> sure n = 1..20 ròiii
//        //CẤM dùng ELSE khi hàm đã có return phía trước
//        long product = 1; //biến tích luỹ, nhân dồn/acc/accumulation
//        for (int i = 2; i <= n; i++)
//            product *= i;
//        
//        return product;
//    }
    
    
    //hàm tiện ích tính n! = 1.2.3...n
    //Lưu ý:
    //  - Không tính giai thừa số âm
    //    0! = 1! = 1
    //  - Vì giai thừa tăng cực nhanh nên 21! đã vượt 18 số 0 -> tràn kiểu long -> Ta không tính 21! trở lên
//    SỬA HÀM TÍNH GIAI THỪA BẰNG CÁCH DÙNG ĐỆ QUY
    //n! = 1.2.3.4.5....n
    //4! = 4 . 3!
    //3! = 3 . 2!
    //2! = 2 . 1!
    //1! = 1 -----> chốt dừng, dội ngược lên
    //=> n! = n . (n-1)! ------> công thức đệ quy
    //ĐỆ QUY: gọi lại chính mình với quy mô khác nhỏ hơn 
    //con búp bê Nga
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) 
            throw new IllegalArgumentException("Invalid n. n must be between 0..20");
        
        if (n == 0 || n == 1)
            return 1;
        
        return n*getFactorial(n - 1);
    }
}

//TA SẼ HỌC SƠ KHÁI NIỆM TDD - TEST DRIVEN DEVELOPMENT
//Là kĩ thuật lập trình áp dụng cho dân Dev về gia tăng chất lượng code
//giảm thiểu công sức tìm bug/phát hiện sớm bug
//TĐ yêu cầu dev khi viết code/hàm/class phải viết luôn
//các bộ kiểm thử code/hàm/class để kiểm tra tính đúng đắn của code/hàm/class
//---> Viết code kèm với viết test cases
//--->           có ý thức viết luôn phần kiểm thử code/hàm/class
//          development driven              test
//Sau khi có được tên hàm (only function name)
//ta viết luôn các tình huống dùng hàm
//chấp nhận khi hàm chạy sai do code chưa xong
//Sau đó ta tối ưu/chỉnh sửa code để đảm bảo code chạy đúng
//Quá trình sai - đúng - sai -đúng diễn ra liên tục (cycle)

