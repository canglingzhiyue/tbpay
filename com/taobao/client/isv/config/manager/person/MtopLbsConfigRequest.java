package com.taobao.client.isv.config.manager.person;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;
import tb.mto;

/* loaded from: classes7.dex */
public class MtopLbsConfigRequest implements IMTOPDataObject {
    private String API_NAME = "mtop.taobao.lbsConfig.getSdkConfig";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = false;
    private String cellType = null;
    private short mcc = 0;
    private short mnc = 0;
    private double longitude = mto.a.GEO_NOT_SUPPORT;
    private String cellInfo = null;
    private double latitude = mto.a.GEO_NOT_SUPPORT;
    private String wifiInfos = null;

    static {
        kge.a(-1230499113);
        kge.a(-350052935);
    }

    public String getAPI_NAME() {
        return this.API_NAME;
    }

    public void setAPI_NAME(String str) {
        this.API_NAME = str;
    }

    public String getVERSION() {
        return this.VERSION;
    }

    public void setVERSION(String str) {
        this.VERSION = str;
    }

    public boolean isNEED_ECODE() {
        return this.NEED_ECODE;
    }

    public void setNEED_ECODE(boolean z) {
        this.NEED_ECODE = z;
    }

    public boolean isNEED_SESSION() {
        return this.NEED_SESSION;
    }

    public void setNEED_SESSION(boolean z) {
        this.NEED_SESSION = z;
    }

    public String getCellType() {
        return this.cellType;
    }

    public void setCellType(String str) {
        this.cellType = str;
    }

    public short getMcc() {
        return this.mcc;
    }

    public void setMcc(short s) {
        this.mcc = s;
    }

    public short getMnc() {
        return this.mnc;
    }

    public void setMnc(short s) {
        this.mnc = s;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public void setLongitude(double d) {
        this.longitude = d;
    }

    public String getCellInfo() {
        return this.cellInfo;
    }

    public void setCellInfo(String str) {
        this.cellInfo = str;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public void setLatitude(double d) {
        this.latitude = d;
    }

    public String getWifiInfos() {
        return this.wifiInfos;
    }

    public void setWifiInfos(String str) {
        this.wifiInfos = str;
    }
}
