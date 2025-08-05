package com.taobao.android.abilityidl.ability;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.jvm.JvmStatic;
import tb.kge;

/* loaded from: classes4.dex */
public final class em {
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    public String f8845a;
    public String b;
    public String c;

    static {
        kge.a(124117305);
        Companion = new a(null);
    }

    private em() {
        this.f8845a = "";
        this.b = "";
        this.c = "";
    }

    public /* synthetic */ em(kotlin.jvm.internal.o oVar) {
        this();
    }

    public em(Map<String, ? extends Object> map) {
        this();
        String b = com.alibaba.ability.e.b(map, "bizID", (String) null);
        if (b == null) {
            throw new RuntimeException("bizID 参数必传！");
        }
        this.f8845a = b;
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
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1924946241);
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }

        @JvmStatic
        public final em a(String bizID, String key, String value) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (em) ipChange.ipc$dispatch("f28d733d", new Object[]{this, bizID, key, value});
            }
            kotlin.jvm.internal.q.d(bizID, "bizID");
            kotlin.jvm.internal.q.d(key, "key");
            kotlin.jvm.internal.q.d(value, "value");
            em emVar = new em((kotlin.jvm.internal.o) null);
            emVar.f8845a = bizID;
            emVar.b = key;
            emVar.c = value;
            return emVar;
        }
    }
}
