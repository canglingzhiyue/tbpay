package com.taobao.unit.center.mtop;

import java.util.List;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes9.dex */
public class UnitCenterLayoutSyncModel implements IMTOPDataObject {
    public List<Layout> layouts;

    /* loaded from: classes9.dex */
    public static class Layout {
        public String group;
        public List<UnitCenterLayoutInfoModel> layoutList;
        public boolean next;
        public long timestamp;

        static {
            kge.a(-2076346584);
        }
    }

    static {
        kge.a(-598080890);
        kge.a(-350052935);
    }
}
