package apiService;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.rmi.ServerException;

public class DataReader {

    private AirlyData data;

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://airapi.airly.eu/v1/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    AirlyService service = retrofit.create(AirlyService.class);

    public void readSensor(String apiKey, String sensorID) {

        Call<AirlyData> dataCall = service
                .getDataForSensor(apiKey, sensorID);


        handleCall(dataCall);
    }


    public void readCoords(String apiKey, String latitude, String longitude) {

        Call<AirlyData> dataCall = service
                .getDataForCoords(apiKey, latitude, longitude);

        handleCall(dataCall);
    }

    public void handleCall(Call<AirlyData> dataCall) {

        try {

            Response<AirlyData> response = dataCall.execute();

            if (response.isSuccessful())
                data = response.body();
            else
                throw new IOException(response.errorBody().source().toString());



        } catch (Exception ex) {
            throw new IllegalArgumentException(ex.fillInStackTrace().getMessage());
        }


    }


    public AirlyData getData() {
        return data;
    }
}

