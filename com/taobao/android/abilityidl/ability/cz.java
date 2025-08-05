package com.taobao.android.abilityidl.ability;

import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class cz {
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    public String f8804a;
    public String b;
    public String c;

    static {
        kge.a(-911672828);
        Companion = new a(null);
    }

    private cz() {
        this.f8804a = "";
        this.b = "";
        this.c = "";
    }

    public cz(Map<String, ? extends Object> map) {
        this();
        String b = com.alibaba.ability.e.b(map, "bizID", (String) null);
        if (b == null) {
            throw new RuntimeException("bizID 参数必传！");
        }
        this.f8804a = b;
        String b2 = com.alibaba.ability.e.b(map, "key", (String) null);
        if (b2 == null) {
            throw new RuntimeException("key 参数必传！");
        }
        this.b = b2;
        String b3 = com.alibaba.ability.e.b(map, "value", (String) null);
        if (b3 == null) {
            throw new RuntimeException("value 参数必传！");
        }
        this.c = b3;
    }

    /* loaded from: classes4.dex */
    public static final class a {
        static {
            kge.a(-10801076);
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }
    }
}
