package com.taobao.android.abilityidl.ability;

import com.alipay.mobile.common.logging.util.LoggingSPCache;
import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public String f8880a;
    public Map<String, ? extends Object> b;
    public String c;
    public String d;
    public Map<String, ? extends Object> e;

    static {
        kge.a(-233046566);
    }

    public g() {
        this.f8880a = "";
        this.b = kotlin.collections.ai.a();
    }

    public g(Map<String, ? extends Object> map) {
        this();
        String b = com.alibaba.ability.e.b(map, "serviceID", (String) null);
        if (b == null) {
            throw new RuntimeException("serviceID 参数必传！");
        }
        this.f8880a = b;
        Map<String, ? extends Object> c = com.alibaba.ability.e.c(map, "data");
        if (c == null) {
            throw new RuntimeException("data 参数必传！");
        }
        this.b = c;
        this.c = com.alibaba.ability.e.b(map, LoggingSPCache.STORAGE_USERID, (String) null);
        this.d = com.alibaba.ability.e.b(map, "tag", (String) null);
        this.e = com.alibaba.ability.e.c(map, "options");
    }
}
