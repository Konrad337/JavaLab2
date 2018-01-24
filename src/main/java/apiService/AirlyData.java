
package apiService;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class AirlyData {

    @SerializedName("currentMeasurements")
    private Measurements mMeasurements;
    @SerializedName("history")
    private List<History> mHistory;


    public Measurements getMeasurements() {
        return mMeasurements;
    }

    public List<History> getHistory() {
        return mHistory;
    }

    public static class Builder {

        private Measurements mMeasurements;
        private List<History> mHistory;

        public AirlyData.Builder withMeasurements(Measurements Measurements) {
            mMeasurements = Measurements;
            return this;
        }

        public AirlyData.Builder withHistory(List<History> History) {
            mHistory = History;
            return this;
      }


        public AirlyData build() {
            AirlyData AirlyData = new AirlyData();
            AirlyData.mMeasurements = mMeasurements;
            AirlyData.mHistory = mHistory;
            AirlyData.mHistory = mHistory;
            return AirlyData;
        }

    }

}
