package com.taobao.android.abilityidl.ability;

import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class ek {
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    public String f8843a;

    static {
        kge.a(-92884155);
        Companion = new a(null);
    }

    private ek() {
        this.f8843a = "";
    }

    public ek(Map<String, ? extends Object> map) {
        this();
        String b = com.alibaba.ability.e.b(map, "bizID", (String) null);
        if (b != null) {
            this.f8843a = b;
            return;
        }
        throw new RuntimeException("bizID 参数必传！");
    }

    /* loaded from: classes4.dex */
    public static final class a {
        static {
            kge.a(1730612301);
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }
    }
}
