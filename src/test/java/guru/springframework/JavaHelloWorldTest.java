package guru.springframework;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

class JavaHelloWorldTest {

    @Test
    void getHello() throws InterruptedException {

        LocalDate localDate = LocalDate.now().minusMonths(1L);
        System.out.println(localDate);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        LocalTime localTime = LocalTime.now();
        Thread.sleep(2000L);
        LocalTime localTime2 = LocalTime.now();
        System.out.println(localTime.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        System.out.println(localTime2.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        System.out.println(new JavaHelloWorld().getHello());

    }
}