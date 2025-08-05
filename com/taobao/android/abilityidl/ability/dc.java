package com.taobao.android.abilityidl.ability;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.jvm.JvmStatic;
import tb.kge;

/* loaded from: classes4.dex */
public final class dc {
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    public String f8808a;

    static {
        kge.a(-26121150);
        Companion = new a(null);
    }

    private dc() {
        this.f8808a = "";
    }

    public /* synthetic */ dc(kotlin.jvm.internal.o oVar) {
        this();
    }

    public dc(Map<String, ? extends Object> map) {
        this();
        String b = com.alibaba.ability.e.b(map, "key", (String) null);
        if (b != null) {
            this.f8808a = b;
            return;
        }
        throw new RuntimeException("key 参数必传！");
    }

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1054839542);
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }

        @JvmStatic
        public final dc a(String key) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (dc) ipChange.ipc$dispatch("6bb54bda", new Object[]{this, key});
            }
            kotlin.jvm.internal.q.d(key, "key");
            dc dcVar = new dc((kotlin.jvm.internal.o) null);
            dcVar.f8808a = key;
            return dcVar;
        }
    }
}
