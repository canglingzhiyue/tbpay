package com.taobao.tao.sku.uimodel;

import java.io.Serializable;
import java.util.HashMap;
import tb.kge;
import tb.tpc;

/* loaded from: classes8.dex */
public class MallInfoVO implements Serializable {
    public boolean hasService = false;
    public boolean allAreaSold = false;
    public AreaItemVO[] soldAreas = null;
    public HashMap<String, String> serIdMap = null;
    public HashMap<String, String> uniqIdMap = null;

    static {
        kge.a(-689391577);
        kge.a(1028243835);
    }

    public MallInfoVO() {
        tpc.a("com.taobao.tao.sku.uimodel.MallInfoVO");
    }
}
