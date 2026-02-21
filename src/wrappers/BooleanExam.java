package wrappers;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

import static java.util.Collections.fill;

public class BooleanExam {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyy MM dd");
        String text = localDate.format(dateTimeFormatter);
        LocalDate localDate1 = LocalDate.parse(text,dateTimeFormatter);
        System.out.println(localDate1);
    }
}
