package com.example.aciolekwaw.retrofitexample;

/**
 * Created by aciolekwaw on 2015-10-13.
 */
public class Main {

    @Expose
    private Double temp;
    @Expose
    private Integer pressure;
    @Expose
    private Integer humidity;
    @SerializedName("temp_min")
    @Expose
    private Double tempMin;
    @SerializedName("temp_max")
    @Expose
    private Double tempMax;

    /**
     *
     * @return
     * The temp
     */
    public Double getTemp() {
        return temp;
    }

    /**
     *
     * @param temp
     * The temp
     */
    public void setTemp(Double temp) {
        this.temp = temp;
    }

    /**
     *
     * @return
     * The pressure
     */
    public Integer getPressure() {
        return pressure;
    }

    /**
     *
     * @param pressure
     * The pressure
     */
    public void setPressure(Integer pressure) {
        this.pressure = pressure;
    }

    /**
     *
     * @return
     * The humidity
     */
    public Integer getHumidity() {
        return humidity;
    }

    /**
     *
     * @param humidity
     * The humidity
     */
    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

    /**
     *
     * @return
     * The tempMin
     */
    public Double getTempMin() {
        return tempMin;
    }

    /**
     *
     * @param tempMin
     * The temp_min
     */
    public void setTempMin(Double tempMin) {
        this.tempMin = tempMin;
    }

    /**
     *
     * @return
     * The tempMax
     */
    public Double getTempMax() {
        return tempMax;
    }

    /**
     *
     * @param tempMax
     * The temp_max
     */
    public void setTempMax(Double tempMax) {
        this.tempMax = tempMax;
    }
}
