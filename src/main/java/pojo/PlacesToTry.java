package pojo;

import enums.PriceEnum;
import enums.SpeedEnum;
import enums.TagEnum;

public class PlacesToTry {
    private String restName;
    private String restType;
    private TagEnum tagEnum;
    private PriceEnum priceEnum;
    private SpeedEnum speedEnum;

    public PlacesToTry() {
    }

    public PlacesToTry(String restName, String restType, TagEnum tagEnum, PriceEnum priceEnum, SpeedEnum speedEnum) {
        this.restName = restName;
        this.restType = restType;
        this.tagEnum = tagEnum;
        this.priceEnum = priceEnum;
        this.speedEnum = speedEnum;
    }

    public String getRestName() {
        return restName;
    }

    public void setRestName(String restName) {
        this.restName = restName;
    }

    public String getRestType() {
        return restType;
    }

    public void setRestType(String restType) {
        this.restType = restType;
    }

    public TagEnum getTagEnum() {
        return tagEnum;
    }

    public void setTagEnum(TagEnum tagEnum) {
        this.tagEnum = tagEnum;
    }

    public PriceEnum getPriceEnum() {
        return priceEnum;
    }

    public void setPriceEnum(PriceEnum priceEnum) {
        this.priceEnum = priceEnum;
    }

    public SpeedEnum getSpeedEnum() {
        return speedEnum;
    }

    public void setSpeedEnum(SpeedEnum speedEnum) {
        this.speedEnum = speedEnum;
    }

    @Override
    public String toString() {
        return "PlacesToTry{" +
                "restName='" + restName + '\'' +
                ", restType='" + restType + '\'' +
                ", tagEnum=" + tagEnum +
                ", priceEnum=" + priceEnum +
                ", speedEnum=" + speedEnum +
                '}';
    }
}
