package tw.agileworks.util;

import static org.junit.Assert.assertEquals;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class DateUtilTest {

        @Test
        public void testGetToday() {
                System.out.println("=== hello junit ===");
                String actual = DateUtil.getToday();
                String expected = new SimpleDateFormat("dd-MMM-yyyy")
                                .format(new Date());
                assertEquals(expected, actual);
        }
}
