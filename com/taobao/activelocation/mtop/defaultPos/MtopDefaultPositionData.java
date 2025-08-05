package com.taobao.activelocation.mtop.defaultPos;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes4.dex */
public class MtopDefaultPositionData implements IMTOPDataObject {
    private String cityCode = null;
    private String cityLatitude = null;
    private String cityLongitude = null;
    private String cityName = null;
    private String msgCode = null;
    private String msgInfo = null;

    static {
        kge.a(520395478);
        kge.a(-350052935);
    }

    public String getCityCode() {
        return this.cityCode;
    }

    public void setCityCode(String str) {
        this.cityCode = str;
    }

    public String getCityLatitude() {
        return this.cityLatitude;
    }

    public void setCityLatitude(String str) {
        this.cityLatitude = str;
    }

    public String getCityLongitude() {
        return this.cityLongitude;
    }

    public void setCityLongitude(String str) {
        this.cityLongitude = str;
    }

    public String getCityName() {
        return this.cityName;
    }

    public void setCityName(String str) {
        this.cityName = str;
    }

    public String getMsgCode() {
        return this.msgCode;
    }

    public void setMsgCode(String str) {
        this.msgCode = str;
    }

    public String getMsgInfo() {
        return this.msgInfo;
    }

    public void setMsgInfo(String str) {
        this.msgInfo = str;
    }
}
