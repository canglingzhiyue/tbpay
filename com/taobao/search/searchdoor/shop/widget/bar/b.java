package com.taobao.search.searchdoor.shop.widget.bar;

import java.util.Map;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.nsf;

/* loaded from: classes8.dex */
public final class b extends nsf {
    public static final a Companion;

    static {
        kge.a(-1768334396);
        Companion = new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String appId, String chiTuaAlias, Map<String, String> map) {
        super(chiTuaAlias, map);
        q.c(appId, "appId");
        q.c(chiTuaAlias, "chiTuaAlias");
        a("appId", appId);
        if (map == null || !(!map.isEmpty())) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            boolean z = false;
            if (entry.getKey().length() > 0) {
                String value = entry.getValue();
                if (!((value == null || value.length() == 0) ? true : z)) {
                    b(entry.getKey(), entry.getValue());
                }
            }
        }
    }

    /* loaded from: classes8.dex */
    public static final class a {
        static {
            kge.a(-1282645492);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }
}
