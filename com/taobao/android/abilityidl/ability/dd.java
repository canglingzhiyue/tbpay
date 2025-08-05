package com.taobao.android.abilityidl.ability;

import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.Map;
import kotlin.jvm.JvmStatic;
import tb.kge;

/* loaded from: classes4.dex */
public final class dd {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    public long f8809a;
    public String b;
    public String c;
    public boolean d;

    static {
        kge.a(-856634973);
        Companion = new a(null);
    }

    @JvmStatic
    public static final dd a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dd) ipChange.ipc$dispatch("130285ef", new Object[]{str, str2}) : Companion.a(str, str2);
    }

    private dd() {
        this.f8809a = 15000L;
        this.b = "";
        this.c = "";
        this.d = true;
    }

    public /* synthetic */ dd(kotlin.jvm.internal.o oVar) {
        this();
    }

    public dd(Map<String, ? extends Object> map) {
        this();
        long j = 15000;
        Long b = com.alibaba.ability.e.b(map, RemoteMessageConst.TTL, (Long) 15000L);
        this.f8809a = b != null ? b.longValue() : j;
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
        boolean z = true;
        Boolean b4 = com.alibaba.ability.e.b(map, "removeAfterRead", (Boolean) true);
        this.d = b4 != null ? b4.booleanValue() : z;
    }

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1014449451);
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }

        @JvmStatic
        public final dd a(String key, String value) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (dd) ipChange.ipc$dispatch("130285ef", new Object[]{this, key, value});
            }
            kotlin.jvm.internal.q.d(key, "key");
            kotlin.jvm.internal.q.d(value, "value");
            dd ddVar = new dd((kotlin.jvm.internal.o) null);
            ddVar.b = key;
            ddVar.c = value;
            return ddVar;
        }
    }
}
