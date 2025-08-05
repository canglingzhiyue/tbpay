package com.taobao.android.abilityidl.ability;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import kotlin.jvm.JvmStatic;
import tb.kge;

/* loaded from: classes4.dex */
public final class p {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    public String f8891a;
    public String b;
    public Map<String, ? extends Object> c;

    static {
        kge.a(-1602586401);
        Companion = new a(null);
    }

    @JvmStatic
    public static final p a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (p) ipChange.ipc$dispatch("eab345cd", new Object[]{str}) : Companion.a(str);
    }

    private p() {
        this.b = "";
    }

    public /* synthetic */ p(kotlin.jvm.internal.o oVar) {
        this();
    }

    public p(Map<String, ? extends Object> map) {
        this();
        this.f8891a = com.alibaba.ability.e.b(map, "bizId", (String) null);
        String b = com.alibaba.ability.e.b(map, "eventName", (String) null);
        if (b == null) {
            throw new RuntimeException("eventName 参数必传！");
        }
        this.b = b;
        this.c = com.alibaba.ability.e.c(map, "detail");
    }

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(881596775);
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }

        @JvmStatic
        public final p a(String eventName) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (p) ipChange.ipc$dispatch("eab345cd", new Object[]{this, eventName});
            }
            kotlin.jvm.internal.q.d(eventName, "eventName");
            p pVar = new p((kotlin.jvm.internal.o) null);
            pVar.b = eventName;
            return pVar;
        }
    }
}
