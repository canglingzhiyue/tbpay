package com.taobao.taolive.room.business.commission.request;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import java.util.List;
import tb.kge;

/* loaded from: classes8.dex */
public class OuterTraceLocalInfo implements INetDataObject {
    public List<LocalOuterParam> localCacheContext;

    static {
        kge.a(738276634);
        kge.a(-540945145);
    }

    /* loaded from: classes8.dex */
    public static class LocalOuterParam implements INetDataObject {
        public long expireTime;
        public String key;
        public String value;

        static {
            kge.a(-1872004365);
            kge.a(-540945145);
        }

        public LocalOuterParam() {
        }

        public LocalOuterParam(long j, String str, String str2) {
            this.expireTime = j;
            this.key = str;
            this.value = str2;
        }
    }
}
