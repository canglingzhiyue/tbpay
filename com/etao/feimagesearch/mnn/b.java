package com.etao.feimagesearch.mnn;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.t;
import tb.kge;

/* loaded from: classes3.dex */
public final class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final String EXTRA_INFO_KEY = "plt_autodetect_extraInfo";
    private static final kotlin.d b;

    /* renamed from: a  reason: collision with root package name */
    private String f6757a;

    /* loaded from: classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ kotlin.reflect.k[] f6758a;

        static {
            kge.a(2139637711);
            f6758a = new kotlin.reflect.k[]{t.a(new PropertyReference1Impl(t.b(a.class), "instance", "getInstance()Lcom/etao/feimagesearch/mnn/AutoDetectExtraInfoCache;"))};
        }

        public final b a() {
            Object value;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                value = ipChange.ipc$dispatch("5a23394c", new Object[]{this});
            } else {
                kotlin.d c = b.c();
                a aVar = b.Companion;
                value = c.getValue();
            }
            return (b) value;
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    private b() {
        this.f6757a = "";
    }

    public /* synthetic */ b(o oVar) {
        this();
    }

    public static final /* synthetic */ kotlin.d c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (kotlin.d) ipChange.ipc$dispatch("8055a8c5", new Object[0]) : b;
    }

    static {
        kge.a(-1228797625);
        Companion = new a(null);
        b = kotlin.e.a(LazyThreadSafetyMode.SYNCHRONIZED, AutoDetectExtraInfoCache$Companion$instance$2.INSTANCE);
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f6757a;
    }

    public final void a(String value) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, value});
            return;
        }
        q.c(value, "value");
        this.f6757a = value;
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.f6757a = "";
        }
    }
}
