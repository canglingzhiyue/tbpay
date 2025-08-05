package com.taobao.tao.timestamp;

import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes8.dex */
public class GetTimestampResponseData implements IMTOPDataObject {
    private String t;

    static {
        kge.a(-143358332);
        kge.a(-350052935);
    }

    public String getT() {
        return this.t;
    }

    public void setT(String str) {
        this.t = str;
    }
}
