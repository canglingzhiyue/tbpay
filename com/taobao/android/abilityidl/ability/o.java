package com.taobao.android.abilityidl.ability;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.jvm.JvmStatic;
import tb.bip;
import tb.kge;

/* loaded from: classes4.dex */
public final class o {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    public String f8890a;
    public String b;
    public boolean c;

    static {
        kge.a(-198244710);
        Companion = new a(null);
    }

    @JvmStatic
    public static final o a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (o) ipChange.ipc$dispatch("eab345ae", new Object[]{str}) : Companion.a(str);
    }

    private o() {
        this.b = "";
    }

    public /* synthetic */ o(kotlin.jvm.internal.o oVar) {
        this();
    }

    public o(Map<String, ? extends Object> map) {
        this();
        this.f8890a = com.alibaba.ability.e.b(map, "bizId", (String) null);
        String b = com.alibaba.ability.e.b(map, "eventName", (String) null);
        if (b == null) {
            throw new RuntimeException("eventName 参数必传！");
        }
        this.b = b;
        boolean z = false;
        Boolean b2 = com.alibaba.ability.e.b(map, bip.REQUEST_ONCE, (Boolean) false);
        this.c = b2 != null ? b2.booleanValue() : z;
    }

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(818084194);
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }

        @JvmStatic
        public final o a(String eventName) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (o) ipChange.ipc$dispatch("eab345ae", new Object[]{this, eventName});
            }
            kotlin.jvm.internal.q.d(eventName, "eventName");
            o oVar = new o((kotlin.jvm.internal.o) null);
            oVar.b = eventName;
            return oVar;
        }
    }
}
