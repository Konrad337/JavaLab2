package app;

import apiService.AirlyData;
import apiService.DataReader;
import infoPrinter.DataPrinter;

import java.io.IOException;
import java.util.HashMap;
import java.util.Optional;
import java.util.stream.IntStream;

public class App {


    public static void main(String[] args) throws IOException{


        Optional<String> apiRead = Optional.empty();
        String apiKey;
        DataReader reader = new DataReader();
        DataPrinter printer = new DataPrinter();

        HashMap<String, Optional<String>> mainArgs = new HashMap<>();

        if (System.getenv().containsKey("API_KEY"))
            apiRead = Optional.of(System.getenv("API_KEY"));

        IntStream.range(0,args.length).forEach(
                i -> {
                    if (args[i].startsWith("--"))
                        mainArgs.put(args[i].substring(2), i + 1 < args.length && !args[i + 1].startsWith("--") ?
                                Optional.of(args[i+1]):
                                Optional.empty()
                        );
                }
                );


        apiKey =  apiRead.orElseGet(() ->
                mainArgs.get("api-key").orElseThrow(IllegalArgumentException::new));

        if (mainArgs.containsKey("latitude") && mainArgs.containsKey("longitude"))
            reader.readCoords(apiKey
                    , mainArgs.get("latitude")
                            .orElseThrow(IllegalArgumentException::new)
                    , mainArgs.get("longitude")
                            .orElseThrow(IllegalAccessError::new));

        else if (mainArgs.containsKey("sensor-id"))
            reader.readSensor(apiKey,
                    mainArgs.get("sensor-id")
                            .orElseThrow(IllegalArgumentException::new));

        else throw new IllegalArgumentException();

        printer.printDataOnScreen(reader.getData(), mainArgs.containsKey("history"));





    }



}
