package com.taobao.android.abilityidl.ability;

import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class de {
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    public long f8810a;
    public String b;

    static {
        kge.a(-691999445);
        Companion = new a(null);
    }

    private de() {
        this.f8810a = 15000L;
        this.b = "";
    }

    public de(Map<String, ? extends Object> map) {
        this();
        long j = 15000;
        Long b = com.alibaba.ability.e.b(map, RemoteMessageConst.TTL, (Long) 15000L);
        this.f8810a = b != null ? b.longValue() : j;
        String b2 = com.alibaba.ability.e.b(map, "key", (String) null);
        if (b2 != null) {
            this.b = b2;
            return;
        }
        throw new RuntimeException("key 参数必传！");
    }

    /* loaded from: classes4.dex */
    public static final class a {
        static {
            kge.a(-1607033165);
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }
    }
}
