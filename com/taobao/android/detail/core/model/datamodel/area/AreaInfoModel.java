package com.taobao.android.detail.core.model.datamodel.area;

import java.util.List;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class AreaInfoModel implements IMTOPDataObject {
    public boolean allRegionEnable;
    public String hostName;
    public int regionLevel;
    public boolean success;
    public List<String> supportedAreaIds;

    static {
        kge.a(-595066713);
        kge.a(-350052935);
    }

    public AreaInfoModel() {
        emu.a("com.taobao.android.detail.core.model.datamodel.area.AreaInfoModel");
    }
}
