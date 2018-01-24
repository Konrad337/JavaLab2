package infoPrinter;

import apiService.AirlyData;
import apiService.History;
import apiService.Measurements;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class DataPrinter {

    private static Integer boxWidth = 44;

    public void printDataOnScreen(AirlyData data, Boolean historeMode) {

        if (historeMode) {
            data.getHistory().forEach(record ->
            {
                System.out.println(record.getFromDateTime());
                System.out.println(record.getTillDateTime());
                printData(record.getMeasurements());
                System.out.println();
                System.out.println();
            });
        }
            else
            printData(data.getMeasurements());


    }

    public void printData(Measurements data) {

        List<Field> fields = Arrays.asList(data.getClass().getDeclaredFields());

        printBoxLine(boxWidth);

            fields.stream().forEach(field -> {
                try {
                    field.setAccessible(true);
                    printLine(field.getName(), field.get(data));
                } catch (IllegalAccessException ex) {
                    System.out.println("Data could not be accessed");
                }
            }
            );

        printBoxLine(boxWidth);

    }
    public void printLine(String name, Object parametr) {

        if(parametr == null) return;
        System.out.println(String.format("| %-26s| %-12.2f |",name, parametr));

    }

    public void printBoxLine(Integer count) {
        IntStream.range(0,count).forEach(i -> System.out.print('-'));
        System.out.println();
    }

}
