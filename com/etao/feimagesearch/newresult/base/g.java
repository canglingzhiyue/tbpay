package com.etao.feimagesearch.newresult.base;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.o;
import tb.kge;

/* loaded from: classes3.dex */
public final class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;
    private static volatile g c;

    /* renamed from: a  reason: collision with root package name */
    private Boolean f6842a;
    private Integer b;
    private Boolean d;

    static {
        kge.a(-899176511);
        Companion = new a(null);
    }

    /* loaded from: classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(608015817);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        public final g a() {
            g c;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (g) ipChange.ipc$dispatch("4443feef", new Object[]{this});
            }
            g c2 = g.c();
            if (c2 != null) {
                return c2;
            }
            synchronized (this) {
                c = g.c();
                if (c == null) {
                    c = new g(null);
                    g.a(c);
                }
            }
            return c;
        }

        public final void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            } else {
                g.a(null);
            }
        }
    }

    private g() {
    }

    public /* synthetic */ g(o oVar) {
        this();
    }

    public static final /* synthetic */ void a(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fa0e22f", new Object[]{gVar});
        } else {
            c = gVar;
        }
    }

    public static final /* synthetic */ g c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("798583f1", new Object[0]) : c;
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        Boolean bool = this.f6842a;
        if (bool == null) {
            bool = Boolean.valueOf(com.etao.feimagesearch.config.b.aY());
            this.f6842a = bool;
        }
        return bool.booleanValue();
    }

    public final int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        Integer num = this.b;
        if (num == null) {
            num = Integer.valueOf(com.etao.feimagesearch.config.b.aS());
            this.b = num;
        }
        return num.intValue();
    }

    public final boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        Boolean bool = this.d;
        if (bool == null) {
            bool = Boolean.valueOf(com.etao.feimagesearch.config.b.bX());
            this.d = bool;
        }
        return bool.booleanValue();
    }
}
