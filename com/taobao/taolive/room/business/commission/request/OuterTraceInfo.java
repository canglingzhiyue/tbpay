package com.taobao.taolive.room.business.commission.request;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import java.util.List;
import tb.kge;

/* loaded from: classes8.dex */
public class OuterTraceInfo implements INetDataObject {
    public OuterTraceResult result;

    /* loaded from: classes8.dex */
    public static class OuterParam implements INetDataObject {
        public long expireTime;
        public String key;
        public String value;

        static {
            kge.a(74234953);
            kge.a(-540945145);
        }
    }

    /* loaded from: classes8.dex */
    public static class OuterTraceResult implements INetDataObject {
        public List<OuterParam> localCacheContext;

        static {
            kge.a(-1698577282);
            kge.a(-540945145);
        }
    }

    static {
        kge.a(1053458861);
        kge.a(-540945145);
    }
}
