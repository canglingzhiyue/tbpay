package com.taobao.android.abilityidl.ability;

import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class cy {
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    public String f8803a;
    public String b;

    static {
        kge.a(1773218753);
        Companion = new a(null);
    }

    private cy() {
        this.f8803a = "";
        this.b = "";
    }

    public cy(Map<String, ? extends Object> map) {
        this();
        String b = com.alibaba.ability.e.b(map, "bizID", (String) null);
        if (b == null) {
            throw new RuntimeException("bizID 参数必传！");
        }
        this.f8803a = b;
        String b2 = com.alibaba.ability.e.b(map, "key", (String) null);
        if (b2 == null) {
            throw new RuntimeException("key 参数必传！");
        }
        this.b = b2;
    }

    /* loaded from: classes4.dex */
    public static final class a {
        static {
            kge.a(-395175479);
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }
    }
}
