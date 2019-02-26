import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class TestPhone {


    String badNum = "1234567890";
    String goodNum = "(123)456-7890";



    @Test
    public void testIsFormatted() {
        assertFalse(Telephone.isFormatted(badNum), "badNum is in fact a bad Num");
    }
    @Test
    public void testFormat(){
        assertEquals(goodNum,Telephone.format(badNum),"Formatting Operational");
    }
    @Test
    public void testUnFormat(){
    assertEquals(badNum,Telephone.unformat(goodNum),"Unformat Successful ");
    }

}


