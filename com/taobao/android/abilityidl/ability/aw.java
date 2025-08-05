package com.taobao.android.abilityidl.ability;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.jvm.JvmStatic;
import tb.kge;

/* loaded from: classes4.dex */
public final class aw {
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    public String f8794a;

    static {
        kge.a(1539882344);
        Companion = new a(null);
    }

    private aw() {
        this.f8794a = "";
    }

    public /* synthetic */ aw(kotlin.jvm.internal.o oVar) {
        this();
    }

    public aw(Map<String, ? extends Object> map) {
        this();
        String b = com.alibaba.ability.e.b(map, "key", (String) null);
        if (b != null) {
            this.f8794a = b;
            return;
        }
        throw new RuntimeException("key 参数必传！");
    }

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(339281584);
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }

        @JvmStatic
        public final aw a(String key) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (aw) ipChange.ipc$dispatch("6bb54303", new Object[]{this, key});
            }
            kotlin.jvm.internal.q.d(key, "key");
            aw awVar = new aw((kotlin.jvm.internal.o) null);
            awVar.f8794a = key;
            return awVar;
        }
    }
}
