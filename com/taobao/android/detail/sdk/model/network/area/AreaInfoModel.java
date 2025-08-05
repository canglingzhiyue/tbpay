package com.taobao.android.detail.sdk.model.network.area;

import java.util.List;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class AreaInfoModel implements IMTOPDataObject {
    public boolean allRegionEnable;
    public String hostName;
    public int regionLevel;
    public boolean success;
    public List<String> supportedAreaIds;

    static {
        kge.a(666068115);
        kge.a(-350052935);
    }

    public AreaInfoModel() {
        tpc.a("com.taobao.android.detail.sdk.model.network.area.AreaInfoModel");
    }
}
