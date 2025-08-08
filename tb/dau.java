package tb;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.config.b;
import com.etao.feimagesearch.config.c;
import com.etao.feimagesearch.mnn.BaseMnnRunUnit;
import com.etao.feimagesearch.util.ac;
import com.etao.feimagesearch.util.al;
import com.taobao.android.ugc.h5.WVMicorPublishPlugin;
import com.taobao.android.virtual_thread.face.VExecutors;
import java.util.ArrayList;
import java.util.HashMap;
import tb.mto;

/* loaded from: classes3.dex */
public class dau {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static a f26646a;

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
        }
    }

    public static /* synthetic */ void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[0]);
        } else {
            o();
        }
    }

    public static /* synthetic */ a q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("7a4cda99", new Object[0]) : f26646a;
    }

    static {
        kge.a(1324391591);
        g();
    }

    private static void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[0]);
            return;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add("renderSuccess");
        arrayList.add("renderFail");
        arrayList.add("firstFrameCostTime");
        arrayList.add("fetchTemplateCostTime");
        arrayList.add("renderCostTime");
        arrayList.add("prepareCostTime");
        arrayList.add("muiseCostTime");
        arrayList.add("prepareAlbumCost");
        arrayList.add("postAlbumThreadCost");
        arrayList.add("createCursorCost");
        arrayList.add("moveCursorCost");
        arrayList.add("sortAlbumCost");
        arrayList.add("postResult2UiCost");
        arrayList.add("bindItemCost");
        arrayList.add("albumLoadCostTime");
        arrayList.add("nativeCostTime");
        arrayList.add("interactiveCostTime");
        arrayList.add("interactiveCostTimeExcludeDowngrade");
        arrayList.add("has_tmpl_cache_value");
        ArrayList arrayList2 = new ArrayList(10);
        arrayList2.add("byeBackSource");
        arrayList2.add(BaseMnnRunUnit.MONITOR_POINT_PREPARE_SUCCESS);
        arrayList2.add("errorCode");
        arrayList2.add("errorMsg");
        arrayList2.add("pssource");
        arrayList2.add(WVMicorPublishPlugin.TEMPLATE_URL);
        arrayList2.add("deviceLevel");
        arrayList2.add("hasDowngrade");
        arrayList2.add("has_tmpl_cache");
        cox.a("plt_capture", "render_result", arrayList, arrayList2);
    }

    public static void a(Activity activity) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{activity});
            return;
        }
        boolean b = al.b(activity);
        if (al.b((Context) activity) == 0) {
            z = true;
        }
        f26646a = new a(b, z, nnh.a(activity));
    }

    public static void a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ece2", new Object[]{str, new Boolean(z)});
            return;
        }
        a aVar = f26646a;
        if (aVar == null) {
            return;
        }
        aVar.a(str, z);
    }

    public static void a(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        a aVar = f26646a;
        if (aVar == null) {
            return;
        }
        aVar.a(str);
        if (b.dL()) {
            a.a(f26646a, Boolean.valueOf(dpl.a().e(str)));
        } else {
            VExecutors.defaultSharedThreadPool().submit(new ac() { // from class: tb.dau.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.etao.feimagesearch.util.ac
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        a.a(dau.q(), Boolean.valueOf(dpl.a().e(str)));
                    }
                }
            });
        }
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
            return;
        }
        a aVar = f26646a;
        if (aVar == null) {
            return;
        }
        aVar.b();
        n();
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
            return;
        }
        a aVar = f26646a;
        if (aVar == null) {
            return;
        }
        aVar.a(str, str2);
        n();
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[0]);
            return;
        }
        a aVar = f26646a;
        if (aVar == null) {
            return;
        }
        aVar.d();
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        a aVar = f26646a;
        if (aVar == null || !aVar.I || f26646a.p != 0) {
            return;
        }
        f26646a.p = System.currentTimeMillis() - a.a(f26646a);
        f26646a.O = SystemClock.uptimeMillis();
        n();
    }

    public static void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[0]);
            return;
        }
        a aVar = f26646a;
        if (aVar == null) {
            return;
        }
        aVar.e();
    }

    public static void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[0]);
            return;
        }
        a aVar = f26646a;
        if (aVar == null) {
            return;
        }
        aVar.f();
    }

    public static void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[0]);
            return;
        }
        a aVar = f26646a;
        if (aVar == null) {
            return;
        }
        aVar.g();
    }

    public static void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[0]);
            return;
        }
        a aVar = f26646a;
        if (aVar == null) {
            return;
        }
        aVar.h();
    }

    public static void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[0]);
            return;
        }
        a aVar = f26646a;
        if (aVar == null) {
            return;
        }
        aVar.i();
    }

    public static void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[0]);
            return;
        }
        a aVar = f26646a;
        if (aVar == null) {
            return;
        }
        aVar.j();
    }

    public static void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[0]);
            return;
        }
        a aVar = f26646a;
        if (aVar == null || !aVar.H || f26646a.o != 0) {
            return;
        }
        f26646a.c();
        n();
    }

    public static void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[0]);
        } else {
            f26646a = null;
        }
    }

    private static void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[0]);
            return;
        }
        a aVar = f26646a;
        if (aVar == null || aVar.o == 0 || f26646a.m == 0 || f26646a.p == 0 || !f26646a.I || !f26646a.H) {
            return;
        }
        VExecutors.defaultSharedThreadPool().submit(new ac() { // from class: tb.dau.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.etao.feimagesearch.util.ac
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    dau.p();
                }
            }
        });
    }

    private static void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[0]);
        } else if (f26646a == null || !b.ar() || com.r() || com.s()) {
        } else {
            cot.a("Dynamic", "CaptureUiPerformMonitor", "reportRenderResult: " + JSON.toJSONString(f26646a));
            HashMap hashMap = new HashMap(4);
            if (f26646a.I) {
                hashMap.put("firstFrameCostTime", Double.valueOf(f26646a.p));
            }
            double d = 1.0d;
            if (a.c(f26646a)) {
                hashMap.put("renderSuccess", Double.valueOf(1.0d));
                hashMap.put("renderFail", Double.valueOf((double) mto.a.GEO_NOT_SUPPORT));
            } else {
                hashMap.put("renderSuccess", Double.valueOf((double) mto.a.GEO_NOT_SUPPORT));
                hashMap.put("renderFail", Double.valueOf(1.0d));
            }
            hashMap.put("fetchTemplateCostTime", Double.valueOf(f26646a.j));
            hashMap.put("prepareCostTime", Double.valueOf(f26646a.k));
            hashMap.put("renderCostTime", Double.valueOf(f26646a.l));
            hashMap.put("prepareAlbumCost", Double.valueOf(f26646a.c));
            hashMap.put("postAlbumThreadCost", Double.valueOf(f26646a.v));
            hashMap.put("createCursorCost", Double.valueOf(f26646a.w));
            hashMap.put("moveCursorCost", Double.valueOf(f26646a.x));
            hashMap.put("sortAlbumCost", Double.valueOf(f26646a.y));
            hashMap.put("postResult2UiCost", Double.valueOf(f26646a.z));
            hashMap.put("bindItemCost", Double.valueOf(f26646a.A));
            if (f26646a.o > 0) {
                hashMap.put("albumLoadCostTime", Double.valueOf(f26646a.o));
            }
            if (f26646a.m > 0) {
                hashMap.put("muiseCostTime", Double.valueOf(f26646a.m));
            }
            if (f26646a.n > 0) {
                hashMap.put("nativeCostTime", Double.valueOf(f26646a.n));
            }
            hashMap.put("interactiveCostTime", Double.valueOf(Math.max(Math.max(f26646a.n, f26646a.m), Math.max(f26646a.p, f26646a.o))));
            if (!f26646a.g) {
                hashMap.put("interactiveCostTimeExcludeDowngrade", Double.valueOf(Math.max(f26646a.m, Math.max(f26646a.p, f26646a.o))));
            }
            cot.c("CaptureUiPerformMonitor", "albumLoadCostTime " + f26646a.o + ", muiseCostTime " + f26646a.m + ", firstFrameCostTime " + f26646a.p);
            HashMap hashMap2 = new HashMap(6);
            hashMap2.put(BaseMnnRunUnit.MONITOR_POINT_PREPARE_SUCCESS, String.valueOf(f26646a.f));
            if (!a.c(f26646a)) {
                hashMap2.put("errorCode", f26646a.h);
                hashMap2.put("errorMsg", f26646a.i);
            }
            hashMap2.put("byeBackSource", String.valueOf(f26646a.b));
            hashMap2.put("pssource", f26646a.f26648a);
            hashMap2.put(WVMicorPublishPlugin.TEMPLATE_URL, f26646a.d);
            hashMap2.put("deviceLevel", f26646a.e);
            hashMap2.put("hasDowngrade", String.valueOf(f26646a.g));
            Boolean b = a.b(f26646a);
            if (b != null) {
                if (!b.booleanValue()) {
                    d = 0.0d;
                }
                hashMap.put("has_tmpl_cache_value", Double.valueOf(d));
                hashMap2.put("has_tmpl_cache", String.valueOf(b));
            }
            if (!StringUtils.isEmpty(f26646a.K)) {
                nnh.a(f26646a.K, "capturePerfDimension", hashMap2);
                nnh.a(f26646a.K, "capturePerfMeasure", hashMap);
                nnh.a(f26646a.K, "bizPageLoadEnd", Long.valueOf(Math.max(Math.max(f26646a.M, f26646a.L), Math.max(f26646a.N, f26646a.O))));
            }
            cox.a("plt_capture", "render_result", hashMap, hashMap2);
            f26646a = null;
        }
    }

    /* loaded from: classes3.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public long A;
        private long B;
        private long C;
        private long D;
        private long E;
        private long F;
        private long G;
        public boolean H;
        public boolean I;
        private Boolean J;
        public String K;
        public long L;
        public long M;
        public long N;
        public long O;

        /* renamed from: a  reason: collision with root package name */
        public String f26648a;
        public boolean b;
        public long c;
        public String d;
        public String e;
        public boolean g;
        public long j;
        public long k;
        public long l;
        public long m;
        public long n;
        public long o;
        public long p;
        private long s;
        private long t;
        private long u;
        public long v;
        public long w;
        public long x;
        public long y;
        public long z;
        public boolean f = false;
        public String h = "";
        public String i = "";
        private boolean q = false;
        private final long r = System.currentTimeMillis();

        static {
            kge.a(894892097);
        }

        public static /* synthetic */ long a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("cc838c57", new Object[]{aVar})).longValue() : aVar.r;
        }

        public static /* synthetic */ Boolean a(a aVar, Boolean bool) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Boolean) ipChange.ipc$dispatch("5b390d07", new Object[]{aVar, bool});
            }
            aVar.J = bool;
            return bool;
        }

        public static /* synthetic */ Boolean b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Boolean) ipChange.ipc$dispatch("f08d2721", new Object[]{aVar}) : aVar.J;
        }

        public static /* synthetic */ boolean c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("803a60e9", new Object[]{aVar})).booleanValue() : aVar.q;
        }

        public a(boolean z, boolean z2, String str) {
            long j = this.r;
            this.s = j;
            this.J = null;
            this.t = j;
            this.u = j;
            this.j = 0L;
            this.k = 0L;
            this.l = 0L;
            this.m = 0L;
            this.L = 0L;
            this.n = 0L;
            this.M = 0L;
            this.B = 0L;
            this.C = 0L;
            this.D = 0L;
            this.E = 0L;
            this.F = 0L;
            this.G = 0L;
            this.c = 0L;
            this.v = 0L;
            this.w = 0L;
            this.x = 0L;
            this.y = 0L;
            this.z = 0L;
            this.A = 0L;
            this.o = 0L;
            this.N = 0L;
            this.p = 0L;
            this.O = 0L;
            this.e = c.a();
            this.I = z;
            this.H = z2;
            this.g = false;
            this.K = str;
        }

        public void a(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8123ece2", new Object[]{this, str, new Boolean(z)});
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            this.s = currentTimeMillis;
            this.t = currentTimeMillis;
            this.u = currentTimeMillis;
            this.f26648a = str;
            this.b = z;
        }

        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
                return;
            }
            this.d = str;
            long currentTimeMillis = System.currentTimeMillis();
            this.j = currentTimeMillis - this.s;
            this.t = currentTimeMillis;
            this.u = currentTimeMillis;
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            this.l = currentTimeMillis - this.u;
            this.m = currentTimeMillis - this.r;
            this.L = SystemClock.uptimeMillis();
            this.q = true;
        }

        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                return;
            }
            this.h = str;
            this.i = str2;
            this.q = false;
        }

        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
                return;
            }
            this.B = System.currentTimeMillis();
            this.c = this.B - this.r;
        }

        public void f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
                return;
            }
            this.C = System.currentTimeMillis();
            this.v = this.C - this.B;
        }

        public void g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
                return;
            }
            this.D = System.currentTimeMillis();
            this.w = this.D - this.C;
        }

        public void h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
                return;
            }
            this.E = System.currentTimeMillis();
            this.x = this.E - this.D;
        }

        public void i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5dd2870", new Object[]{this});
                return;
            }
            this.F = System.currentTimeMillis();
            this.y = this.F - this.E;
        }

        public void j() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
                return;
            }
            this.G = System.currentTimeMillis();
            this.z = this.G - this.F;
        }

        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            this.A = currentTimeMillis - this.G;
            this.o = currentTimeMillis - this.r;
            this.N = SystemClock.uptimeMillis();
        }

        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("596b2eb", new Object[]{this});
                return;
            }
            this.g = true;
            this.n = System.currentTimeMillis() - this.r;
            this.M = SystemClock.uptimeMillis();
        }
    }
}
