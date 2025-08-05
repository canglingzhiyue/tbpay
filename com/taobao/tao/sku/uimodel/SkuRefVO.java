package com.taobao.tao.sku.uimodel;

import java.io.Serializable;
import java.util.ArrayList;
import tb.kge;
import tb.tpc;

/* loaded from: classes8.dex */
public class SkuRefVO implements Serializable {
    public String refKey = "";
    public ArrayList<String> refValue = null;

    static {
        kge.a(1018192763);
        kge.a(1028243835);
    }

    public SkuRefVO() {
        tpc.a("com.taobao.tao.sku.uimodel.SkuRefVO");
    }
}
