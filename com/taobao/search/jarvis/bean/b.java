package com.taobao.search.jarvis.bean;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes7.dex */
public final class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;
    private static final b g;

    /* renamed from: a  reason: collision with root package name */
    private final String f19064a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;

    public b(String exposeIds, String exposeTypes, String unExposeIds, String unExposeTypes, String lastPageExposeIds, String lastPageExposeTypes) {
        q.c(exposeIds, "exposeIds");
        q.c(exposeTypes, "exposeTypes");
        q.c(unExposeIds, "unExposeIds");
        q.c(unExposeTypes, "unExposeTypes");
        q.c(lastPageExposeIds, "lastPageExposeIds");
        q.c(lastPageExposeTypes, "lastPageExposeTypes");
        this.f19064a = exposeIds;
        this.b = exposeTypes;
        this.c = unExposeIds;
        this.d = unExposeTypes;
        this.e = lastPageExposeIds;
        this.f = lastPageExposeTypes;
    }

    public static final /* synthetic */ b g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("d3036346", new Object[0]) : g;
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f19064a;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.c;
    }

    public final String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : this.d;
    }

    public final String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : this.e;
    }

    public final String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : this.f;
    }

    /* loaded from: classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1905025179);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        public final b a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("5d146e40", new Object[]{this}) : b.g();
        }
    }

    static {
        kge.a(656175379);
        Companion = new a(null);
        g = new b("", "", "", "", "", "");
    }
}
