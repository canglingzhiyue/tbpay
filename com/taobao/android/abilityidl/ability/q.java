package com.taobao.android.abilityidl.ability;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.jvm.JvmStatic;
import tb.kge;

/* loaded from: classes4.dex */
public final class q {
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    public String f8892a;
    public String b;
    public String c;

    static {
        kge.a(1539351765);
        Companion = new a(null);
    }

    private q() {
        this.b = "";
    }

    public /* synthetic */ q(kotlin.jvm.internal.o oVar) {
        this();
    }

    public q(Map<String, ? extends Object> map) {
        this();
        this.f8892a = com.alibaba.ability.e.b(map, "bizId", (String) null);
        String b = com.alibaba.ability.e.b(map, "eventName", (String) null);
        if (b == null) {
            throw new RuntimeException("eventName 参数必传！");
        }
        this.b = b;
        this.c = com.alibaba.ability.e.b(map, "listenerId", (String) null);
    }

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1910748707);
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }

        @JvmStatic
        public final q a(String eventName) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (q) ipChange.ipc$dispatch("eab345ec", new Object[]{this, eventName});
            }
            kotlin.jvm.internal.q.d(eventName, "eventName");
            q qVar = new q((kotlin.jvm.internal.o) null);
            qVar.b = eventName;
            return qVar;
        }
    }
}
