
package apiService;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class AirlyData {

    @SerializedName("currentMeasurements")
    private CurrentMeasurements mCurrentMeasurements;
    @SerializedName("forecast")
    private List<Forecast> mForecast;
    @SerializedName("history")
    private List<History> mHistory;

    public CurrentMeasurements getCurrentMeasurements() {
        return mCurrentMeasurements;
    }

    public List<Forecast> getForecast() {
        return mForecast;
    }

    public List<History> getHistory() {
        return mHistory;
    }

    public static class Builder {

        private CurrentMeasurements mCurrentMeasurements;
        private List<Forecast> mForecast;
        private List<History> mHistory;

        public AirlyData.Builder withCurrentMeasurements(CurrentMeasurements currentMeasurements) {
            mCurrentMeasurements = currentMeasurements;
            return this;
        }

        public AirlyData.Builder withForecast(List<Forecast> forecast) {
            mForecast = forecast;
            return this;
        }

        public AirlyData.Builder withHistory(List<History> history) {
            mHistory = history;
            return this;
        }

        public AirlyData build() {
            AirlyData AirlyData = new AirlyData();
            AirlyData.mCurrentMeasurements = mCurrentMeasurements;
            AirlyData.mForecast = mForecast;
            AirlyData.mHistory = mHistory;
            return AirlyData;
        }

    }

}
