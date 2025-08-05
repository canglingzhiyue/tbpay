package com.taobao.activelocation.mtop.pois;

import java.util.List;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes4.dex */
public class MtopPoiResponseData implements IMTOPDataObject {
    private String msgCode = null;
    private String msgInfo = null;
    private List<Poi> pois;

    static {
        kge.a(2046025229);
        kge.a(-350052935);
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

    public List<Poi> getPois() {
        return this.pois;
    }

    public void setPois(List<Poi> list) {
        this.pois = list;
    }
}
