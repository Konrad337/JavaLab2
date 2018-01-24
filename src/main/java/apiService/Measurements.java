
package apiService;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Measurements {

    @SerializedName("airQualityIndex")
    private Long mAirQualityIndex;
    @SerializedName("humidity")
    private Long mHumidity;
    @SerializedName("measurementTime")
    private String mMeasurementTime;
    @SerializedName("pm1")
    private Long mPm1;
    @SerializedName("pm10")
    private Long mPm10;
    @SerializedName("pm25")
    private Long mPm25;
    @SerializedName("pollutionLevel")
    private Long mPollutionLevel;
    @SerializedName("pressure")
    private Long mPressure;
    @SerializedName("temperature")
    private Long mTemperature;
    @SerializedName("windDirection")
    private Long mWindDirection;
    @SerializedName("windSpeed")
    private Long mWindSpeed;

    public Long getAirQualityIndex() {
        return mAirQualityIndex;
    }

    public Long getHumidity() {
        return mHumidity;
    }

    public String getMeasurementTime() {
        return mMeasurementTime;
    }

    public Long getPm1() {
        return mPm1;
    }

    public Long getPm10() {
        return mPm10;
    }

    public Long getPm25() {
        return mPm25;
    }

    public Long getPollutionLevel() {
        return mPollutionLevel;
    }

    public Long getPressure() {
        return mPressure;
    }

    public Long getTemperature() {
        return mTemperature;
    }

    public Long getWindDirection() {
        return mWindDirection;
    }

    public Long getWindSpeed() {
        return mWindSpeed;
    }

    public static class Builder {

        private Long mAirQualityIndex;
        private Long mHumidity;
        private String mMeasurementTime;
        private Long mPm1;
        private Long mPm10;
        private Long mPm25;
        private Long mPollutionLevel;
        private Long mPressure;
        private Long mTemperature;
        private Long mWindDirection;
        private Long mWindSpeed;

        public Measurements.Builder withAirQualityIndex(Long airQualityIndex) {
            mAirQualityIndex = airQualityIndex;
            return this;
        }

        public Measurements.Builder withHumidity(Long humidity) {
            mHumidity = humidity;
            return this;
        }

        public Measurements.Builder withMeasurementTime(String measurementTime) {
            mMeasurementTime = measurementTime;
            return this;
        }

        public Measurements.Builder withPm1(Long pm1) {
            mPm1 = pm1;
            return this;
        }

        public Measurements.Builder withPm10(Long pm10) {
            mPm10 = pm10;
            return this;
        }

        public Measurements.Builder withPm25(Long pm25) {
            mPm25 = pm25;
            return this;
        }

        public Measurements.Builder withPollutionLevel(Long pollutionLevel) {
            mPollutionLevel = pollutionLevel;
            return this;
        }

        public Measurements.Builder withPressure(Long pressure) {
            mPressure = pressure;
            return this;
        }

        public Measurements.Builder withTemperature(Long temperature) {
            mTemperature = temperature;
            return this;
        }

        public Measurements.Builder withWindDirection(Long windDirection) {
            mWindDirection = windDirection;
            return this;
        }

        public Measurements.Builder withWindSpeed(Long windSpeed) {
            mWindSpeed = windSpeed;
            return this;
        }

        public Measurements build() {
            Measurements Measurements = new Measurements();
            Measurements.mAirQualityIndex = mAirQualityIndex;
            Measurements.mHumidity = mHumidity;
            Measurements.mMeasurementTime = mMeasurementTime;
            Measurements.mPm1 = mPm1;
            Measurements.mPm10 = mPm10;
            Measurements.mPm25 = mPm25;
            Measurements.mPollutionLevel = mPollutionLevel;
            Measurements.mPressure = mPressure;
            Measurements.mTemperature = mTemperature;
            Measurements.mWindDirection = mWindDirection;
            Measurements.mWindSpeed = mWindSpeed;
            return Measurements;
        }

    }

}
