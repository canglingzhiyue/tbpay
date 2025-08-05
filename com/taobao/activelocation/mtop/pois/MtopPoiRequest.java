package com.taobao.activelocation.mtop.pois;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;
import tb.mto;

/* loaded from: classes4.dex */
public class MtopPoiRequest implements IMTOPDataObject {
    private String API_NAME = "mtop.taobao.wireless.regeo.getDetailPois";
    private String VERSION = "1.0";
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = false;
    private String keywords = null;
    private long radius = 0;
    private double longitude = mto.a.GEO_NOT_SUPPORT;
    private double latitude = mto.a.GEO_NOT_SUPPORT;
    private String types = null;

    static {
        kge.a(-1391592755);
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

    public String getKeywords() {
        return this.keywords;
    }

    public void setKeywords(String str) {
        this.keywords = str;
    }

    public long getRadius() {
        return this.radius;
    }

    public void setRadius(long j) {
        this.radius = j;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public void setLongitude(double d) {
        this.longitude = d;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public void setLatitude(double d) {
        this.latitude = d;
    }

    public String getTypes() {
        return this.types;
    }

    public void setTypes(String str) {
        this.types = str;
    }
}
