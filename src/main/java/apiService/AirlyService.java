package apiService;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.util.List;

public interface AirlyService {


    @GET("mapPoint/measurements")
    Call<AirlyData> getDataForCoords(@Header("apikey") String key,
                                           @Query("latitude") String latitude,
                                           @Query("longitude") String longitude);

    @GET("sensor/measurements")
    Call<AirlyData> getDataForSensor(@Header("apikey") String key,
                                           @Query("sensorId") String sensorID);



}


