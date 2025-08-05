package com.taobao.android.abilityidl.ability;

import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class cx {
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    public String f8802a;

    static {
        kge.a(665813712);
        Companion = new a(null);
    }

    private cx() {
        this.f8802a = "";
    }

    public cx(Map<String, ? extends Object> map) {
        this();
        String b = com.alibaba.ability.e.b(map, "bizID", (String) null);
        if (b != null) {
            this.f8802a = b;
            return;
        }
        throw new RuntimeException("bizID 参数必传！");
    }

    /* loaded from: classes4.dex */
    public static final class a {
        static {
            kge.a(857090584);
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }
    }
}
