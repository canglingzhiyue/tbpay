package com.etao.feimagesearch.mnn.realtime;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import kotlin.collections.p;
import kotlin.jvm.internal.o;
import tb.cox;
import tb.kge;
import tb.oxt;

/* loaded from: classes3.dex */
public final class k {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private static long f6798a;
    private static long b;
    private static long c;
    private static long d;
    private static long e;
    private static long f;

    /* loaded from: classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(422483716);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        public final void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            k.a(System.currentTimeMillis());
            HashMap hashMap = new HashMap(2);
            hashMap.put("time", Double.valueOf(k.b() - k.a()));
            cox.a(oxt.KEY_DIMENSION, "metasightCanRequest", hashMap, new HashMap(1));
        }

        public final void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            } else {
                k.b(System.currentTimeMillis());
            }
        }

        public final void a(boolean z, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c190d17", new Object[]{this, new Boolean(z), new Integer(i)});
                return;
            }
            k.c(System.currentTimeMillis());
            HashMap hashMap = new HashMap(2);
            hashMap.put("time", Double.valueOf(k.d() - k.c()));
            hashMap.put("objectCount", Double.valueOf(i));
            HashMap hashMap2 = new HashMap(1);
            hashMap2.put("success", String.valueOf(z));
            cox.a(oxt.KEY_DIMENSION, "metasightRequestEnd", hashMap, hashMap2);
        }

        public final void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            } else {
                k.d(System.currentTimeMillis());
            }
        }

        public final void a(boolean z, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("270908cc", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2)});
                return;
            }
            k.e(System.currentTimeMillis());
            HashMap hashMap = new HashMap(2);
            hashMap.put("time", Double.valueOf(k.f() - k.e()));
            hashMap.put("requestObjectCount", Double.valueOf(i));
            hashMap.put("objectCount", Double.valueOf(i2));
            HashMap hashMap2 = new HashMap(1);
            hashMap2.put("success", String.valueOf(z));
            cox.a(oxt.KEY_DIMENSION, "metasightRequestProcess", hashMap, hashMap2);
        }

        public final void a(boolean z, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c1910d8", new Object[]{this, new Boolean(z), new Long(j)});
                return;
            }
            HashMap hashMap = new HashMap(2);
            hashMap.put("time", Double.valueOf(j));
            HashMap hashMap2 = new HashMap(1);
            hashMap2.put("success", String.valueOf(z));
            cox.a(oxt.KEY_DIMENSION, "metasightCardRender", hashMap, hashMap2);
        }
    }

    public static final /* synthetic */ long a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[0])).longValue() : f6798a;
    }

    public static final /* synthetic */ void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{new Long(j)});
        } else {
            b = j;
        }
    }

    public static final /* synthetic */ long b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dd", new Object[0])).longValue() : b;
    }

    public static final /* synthetic */ void b(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66ffb", new Object[]{new Long(j)});
        } else {
            c = j;
        }
    }

    public static final /* synthetic */ long c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5e", new Object[0])).longValue() : c;
    }

    public static final /* synthetic */ void c(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b489a", new Object[]{new Long(j)});
        } else {
            d = j;
        }
    }

    public static final /* synthetic */ long d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2df", new Object[0])).longValue() : d;
    }

    public static final /* synthetic */ void d(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad402139", new Object[]{new Long(j)});
        } else {
            e = j;
        }
    }

    public static final /* synthetic */ long e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca60", new Object[0])).longValue() : e;
    }

    public static final /* synthetic */ void e(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef4f9d8", new Object[]{new Long(j)});
        } else {
            f = j;
        }
    }

    public static final /* synthetic */ long f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1e1", new Object[0])).longValue() : f;
    }

    static {
        kge.a(429057724);
        Companion = new a(null);
        cox.a(oxt.KEY_DIMENSION, "metasightCanRequest", p.a("time"), p.a());
        cox.a(oxt.KEY_DIMENSION, "metasightRequestEnd", p.b("time", "objectCount"), p.a("success"));
        cox.a(oxt.KEY_DIMENSION, "metasightRequestProcess", p.b("time", "requestObjectCount", "objectCount"), p.a("success"));
        cox.a(oxt.KEY_DIMENSION, "metasightCardRender", p.a("time"), p.a("success"));
    }
}
