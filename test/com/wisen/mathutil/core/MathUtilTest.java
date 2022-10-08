package com.wisen.mathutil.core;

import junit.framework.Assert;
import org.junit.Test;

public class MathUtilTest {
    
    //Ta đi test ngoại lệ, tức là so sánh/đo lường xem ngoại lệ có xuất hiện hay không
    //khi ta đưa data cà chớn, n < 0 || n > 20
    //thay vì so sánh expected vs actual
    //--> Lúc này ta sẽ đi so sánh/ước lượng xem ngoại lệ có xuất hiện như kì vọng hay không.
    //      --> nếu như kì vọng --> Yeah hàm ngon
    
    @Test(expected = Exception.class) //.class là đo lường NHÓM exception là thuộc nhóm (class) IllegalArgumentException
    public void testFactorialGivenWrongArguementThrowsException() {
        //Test case #3: đưa data cà chớn, n âm, n quá lớn
        // hàm được thiết kế ném ngoại lệ
        //Thấy ngoại lệ: mừng rơi nước mắ khi đưa vào -5
        //Thấy ngoại lệ --> như kì vọng --> passed test --> màu xanh
        System.out.println("Hope to see the Exception | Illegal Argument Exception");
        MathUtil.getFactorial(-5);
    }
    
    @Test
    public void testFactorialGivenRightArgumentReturnsWell2() {
       
        //Test case #4: check n = 3, hy vọng hàm trả về 6, 
        //                          thực tế hàm trả về mấy?        
        Assert.assertEquals(6, MathUtil.getFactorial(3));
        
        //Test case #5: check n = 4, hy vọng hàm trả về 24, 
        //                          thực tế hàm trả về mấy?        
        Assert.assertEquals(24, MathUtil.getFactorial(4));
        //Test case #6: check n = 5, hy vọng hàm trả về 120, 
        //                          thực tế hàm trả về mấy?        
        Assert.assertEquals(120, MathUtil.getFactorial(5));
}
    
    
    
    
    
    @Test //coding convention - quy tắc viết code
            //tên hàm kiểm thử/tên hàm của test script
            //phải nói lên ý nghĩa của việc kiểm thử
            //tình huống này, ta muốn test jàm getF() tham số tử tế
            //n = 0..20!
    public void testFactorialGivenRightArgumentReturnsWell() {
        //Test case #1: check n = 0, hy vọng hàm trả về 1
        //                          thực tế hàm trả về mấy?
        long expected = 1;
        long actual = MathUtil.getFactorial(0);
        //so sánh giữa expected vs anual --> máy tự so, không cần sout()
        Assert.assertEquals(expected, actual);
        
        //Test case #2: check n = 1, hy vọng hàm trả về 1, 
        //                          thực tế hàm trả về mấy?        
        Assert.assertEquals(1, MathUtil.getFactorial(1));
        
        //Test case #3: check n = 2, hy vọng hàm trả về 2, 
        //                          thực tế hàm trả về mấy?        
        Assert.assertEquals(2, MathUtil.getFactorial(2));
}
    
    
    @Test //@Test ra lệnh cho thư viện JUnit mình đã add/import 
            //-> tự động generate ra hàm public static void main()
            //-> tự đồng biến hàm tryJUnitComparison() thành hàm main()
            //và gửi main() này cho JVM chạy
    public void tryJUnitComparison(){
        //hàm này thử nghiệm việc so sánh expected vs actual
        //coi sai đúng ra màu thế nào
        //Ta đang sài hàm của thưu viện JUnit nhưng không sài bừa bãi
        //  phải viết quy tắc định trước
        //Quy tắc định trước nằm ở @ - annotation
        
        Assert.assertEquals(100, 100);
        
    }
    
}
//Class này, dev sẽ viết những câu lệnh dùng để test hàm
//  của code cính, test các hàm của class MathUtil
//Trong class này sẽ có những lời gọi hàm getFactorial()
//  có những lệnh so sánh giữa expected và anual
//  giống giống mình đã làm test bên Main
//  Nhưng khác ở chỗ có màu: FAIL -> ĐỎ; PASSED -> XANH
//  mắt không cần nhìn các dòng output từ hàm System.out -> chỉ cần nhìn 2 màu xanh đỏ
//Muốn được điều này thì sẽ dùng thêm các UNIT TESTING FRAMEWORK
//  vd: JUnit, TestNG (Java)
//      xUnit, MSTest, NUnit (C#)
//      PHPUnit (PHP)...


//Việc viết code dể test code gọi là UNIT TESTING
//Đoạn code trong class này dùng JUnit/UNIT TESTING FRAMEWORK
//  để kiểm thử hàm của code chính
//Đoạn code này gọi là TEST SCRIPT - code dùng để test code (chính -DAO, DTO, Controller,...)
//  muốn test thì phải phác thảo các Test Case:
//      vd: Viết code để test hàm getFactorial() với các case n = -5, 0, 1, ...


//QUY TẮC XANH-ĐỎ:
//  Màu xanh:   khi tất cả các test case cùng là màu xanh, tức là expected == actual
//  Màu đỏ:     chỉ cần sai 1 trong những test case, tức là chỉ cần 1 cái expected != actual
//Ý nghĩa của quy tắc: nếu đã test, đã liệt kê các test case --> chúng phải đúng hết
//ĐÚNG thì ĐÚNG HẾT, SAI chỉ cần 1 THẰNG
//
//EXPECTED == ACTUAL --> CASE ĐÚNG, TEST CASE PASSED
//EXPECTED != ACTUAL --> CASE FAILED
//        Nếu expected đúng ---> hàm sai, có bug
//        Có khi expected sai ---> lỗi do dân QC/dân tính toán




