package com.taobao.android.abilityidl.ability;

import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public final class fy {
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    public boolean f8878a;

    static {
        kge.a(-1099963767);
        Companion = new a(null);
    }

    private fy() {
    }

    public fy(Map<String, ? extends Object> map) {
        this();
        Boolean b = com.alibaba.ability.e.b(map, "success", (Boolean) null);
        if (b != null) {
            this.f8878a = b.booleanValue();
            return;
        }
        throw new RuntimeException("success 参数必传！");
    }

    /* loaded from: classes4.dex */
    public static final class a {
        static {
            kge.a(-781125999);
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }
    }
}
