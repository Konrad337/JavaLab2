
package apiService;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class History {

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

        public History.Builder withFromDateTime(String fromDateTime) {
            mFromDateTime = fromDateTime;
            return this;
        }

        public History.Builder withMeasurements(Measurements measurements) {
            mMeasurements = measurements;
            return this;
        }

        public History.Builder withTillDateTime(String tillDateTime) {
            mTillDateTime = tillDateTime;
            return this;
        }

        public History build() {
            History History = new History();
            History.mFromDateTime = mFromDateTime;
            History.mMeasurements = mMeasurements;
            History.mTillDateTime = mTillDateTime;
            return History;
        }

    }

}
