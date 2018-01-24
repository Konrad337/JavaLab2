
package apiService;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Forecast {

    @SerializedName("fromDateTime")
    private String mFromDateTime;
    @SerializedName("measurements")
    private Measurements mMeasurements;
    @SerializedName("tillDateTime")
    private String mTillDateTime;

    public String getFromDateTime() {
        return mFromDateTime;
    }

    public Measurements getMeasurements() {
        return mMeasurements;
    }

    public String getTillDateTime() {
        return mTillDateTime;
    }

    public static class Builder {

        private String mFromDateTime;
        private Measurements mMeasurements;
        private String mTillDateTime;

        public Forecast.Builder withFromDateTime(String fromDateTime) {
            mFromDateTime = fromDateTime;
            return this;
        }

        public Forecast.Builder withMeasurements(Measurements measurements) {
            mMeasurements = measurements;
            return this;
        }

        public Forecast.Builder withTillDateTime(String tillDateTime) {
            mTillDateTime = tillDateTime;
            return this;
        }

        public Forecast build() {
            Forecast Forecast = new Forecast();
            Forecast.mFromDateTime = mFromDateTime;
            Forecast.mMeasurements = mMeasurements;
            Forecast.mTillDateTime = mTillDateTime;
            return Forecast;
        }

    }

}
