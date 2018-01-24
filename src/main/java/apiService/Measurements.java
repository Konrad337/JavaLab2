
package apiService;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Measurements {

    @SerializedName("airQualityIndex")
    private Double AirQualityIndex;
    @SerializedName("humidity")
    private Double Humidity;
    @SerializedName("measurementTime")
    private String MeasurementTime;
    @SerializedName("pm1")
    private Double Pm1;
    @SerializedName("pm10")
    private Double Pm10;
    @SerializedName("pm25")
    private Double Pm25;
    @SerializedName("pollutionLevel")
    private Double PollutionLevel;
    @SerializedName("pressure")
    private Double Pressure;
    @SerializedName("temperature")
    private Double Temperature;
    @SerializedName("windDirection")
    private Double WindDirection;
    @SerializedName("windSpeed")
    private Double WindSpeed;

    public Double getAirQualityIndex() {
        return AirQualityIndex;
    }

    public Double getHumidity() {
        return Humidity;
    }

    public String getMeasurementTime() {
        return MeasurementTime;
    }

    public Double getPm1() {
        return Pm1;
    }

    public Double getPm10() {
        return Pm10;
    }

    public Double getPm25() {
        return Pm25;
    }

    public Double getPollutionLevel() {
        return PollutionLevel;
    }

    public Double getPressure() {
        return Pressure;
    }

    public Double getTemperature() {
        return Temperature;
    }

    public Double getWindDirection() {
        return WindDirection;
    }

    public Double getWindSpeed() {
        return WindSpeed;
    }

    public static class Builder {

        private Double mAirQualityIndex;
        private Double mHumidity;
        private String mMeasurementTime;
        private Double mPm1;
        private Double mPm10;
        private Double mPm25;
        private Double mPollutionLevel;
        private Double mPressure;
        private Double mTemperature;
        private Double mWindDirection;
        private Double mWindSpeed;

        public Measurements.Builder withAirQualityIndex(Double airQualityIndex) {
            mAirQualityIndex = airQualityIndex;
            return this;
        }

        public Measurements.Builder withHumidity(Double humidity) {
            mHumidity = humidity;
            return this;
        }

        public Measurements.Builder withMeasurementTime(String measurementTime) {
            mMeasurementTime = measurementTime;
            return this;
        }

        public Measurements.Builder withPm1(Double pm1) {
            mPm1 = pm1;
            return this;
        }

        public Measurements.Builder withPm10(Double pm10) {
            mPm10 = pm10;
            return this;
        }

        public Measurements.Builder withPm25(Double pm25) {
            mPm25 = pm25;
            return this;
        }

        public Measurements.Builder withPollutionLevel(Double pollutionLevel) {
            mPollutionLevel = pollutionLevel;
            return this;
        }

        public Measurements.Builder withPressure(Double pressure) {
            mPressure = pressure;
            return this;
        }

        public Measurements.Builder withTemperature(Double temperature) {
            mTemperature = temperature;
            return this;
        }

        public Measurements.Builder withWindDirection(Double windDirection) {
            mWindDirection = windDirection;
            return this;
        }

        public Measurements.Builder withWindSpeed(Double windSpeed) {
            mWindSpeed = windSpeed;
            return this;
        }

        public Measurements build() {
            Measurements Measurements = new Measurements();
            Measurements.AirQualityIndex = mAirQualityIndex;
            Measurements.Humidity = mHumidity;
            Measurements.MeasurementTime = mMeasurementTime;
            Measurements.Pm1 = mPm1;
            Measurements.Pm10 = mPm10;
            Measurements.Pm25 = mPm25;
            Measurements.PollutionLevel = mPollutionLevel;
            Measurements.Pressure = mPressure;
            Measurements.Temperature = mTemperature;
            Measurements.WindDirection = mWindDirection;
            Measurements.WindSpeed = mWindSpeed;
            return Measurements;
        }

    }

}
