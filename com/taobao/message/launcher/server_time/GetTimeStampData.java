package com.taobao.message.launcher.server_time;

import java.io.Serializable;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes7.dex */
public class GetTimeStampData implements Serializable, IMTOPDataObject {
    private static final long serialVersionUID = 1;
    private String t;

    static {
        kge.a(-1538461212);
        kge.a(-350052935);
        kge.a(1028243835);
    }

    public String getT() {
        return this.t;
    }

    public void setT(String str) {
        this.t = str;
    }
}
