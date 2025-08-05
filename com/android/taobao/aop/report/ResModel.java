package com.android.taobao.aop.report;

import java.io.Serializable;
import tb.kge;

/* loaded from: classes3.dex */
public class ResModel implements Serializable {
    public String packageName;
    public String resName;
    public String resType;

    static {
        kge.a(2076735364);
        kge.a(1028243835);
    }

    public ResModel(String str, String str2, String str3) {
        this.packageName = str;
        this.resType = str2;
        this.resName = str3;
    }
}
