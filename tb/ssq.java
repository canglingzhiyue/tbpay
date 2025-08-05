package tb;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.alipay.mobile.security.bio.api.BioDetector;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.m;
import com.taobao.infoflow.protocol.model.datamodel.action.IUiRefreshActionModel;
import java.util.HashMap;

/* loaded from: classes7.dex */
public class ssq extends lql {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private a f33889a;

    static {
        kge.a(603541862);
    }

    public static /* synthetic */ Object ipc$super(ssq ssqVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* loaded from: classes7.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private boolean f33891a = false;
        private long b = SystemClock.uptimeMillis();
        private long c;
        private String d;
        private int e;
        private int f;
        private int g;
        private long h;
        private long i;
        private long j;
        private boolean k;
        private int l;
        private String m;

        static {
            kge.a(1282729052);
        }

        public static /* synthetic */ int a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9411f57d", new Object[]{aVar})).intValue() : aVar.g;
        }

        public static /* synthetic */ int a(a aVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ee2d2eac", new Object[]{aVar, new Integer(i)})).intValue();
            }
            aVar.e = i;
            return i;
        }

        public static /* synthetic */ long a(a aVar, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ee2d326e", new Object[]{aVar, new Long(j)})).longValue();
            }
            aVar.h = j;
            return j;
        }

        public static /* synthetic */ String a(a aVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("56bea64c", new Object[]{aVar, str});
            }
            aVar.d = str;
            return str;
        }

        public static /* synthetic */ boolean a(a aVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ee2d6e8e", new Object[]{aVar, new Boolean(z)})).booleanValue();
            }
            aVar.k = z;
            return z;
        }

        public static /* synthetic */ int b(a aVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("cfbf0c8b", new Object[]{aVar, new Integer(i)})).intValue();
            }
            aVar.f = i;
            return i;
        }

        public static /* synthetic */ long b(a aVar, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("cfbf104d", new Object[]{aVar, new Long(j)})).longValue();
            }
            aVar.j = j;
            return j;
        }

        public static /* synthetic */ String b(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5584c435", new Object[]{aVar}) : aVar.d;
        }

        public static /* synthetic */ String b(a aVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("48684c6b", new Object[]{aVar, str});
            }
            aVar.m = str;
            return str;
        }

        public static /* synthetic */ boolean b(a aVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("cfbf4c6d", new Object[]{aVar, new Boolean(z)})).booleanValue();
            }
            aVar.f33891a = z;
            return z;
        }

        public static /* synthetic */ int c(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("47c8c9ff", new Object[]{aVar})).intValue() : aVar.e;
        }

        public static /* synthetic */ int c(a aVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("b150ea6a", new Object[]{aVar, new Integer(i)})).intValue();
            }
            aVar.l = i;
            return i;
        }

        public static /* synthetic */ long c(a aVar, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("b150ee2c", new Object[]{aVar, new Long(j)})).longValue();
            }
            aVar.i = j;
            return j;
        }

        public static /* synthetic */ int d(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a1a43440", new Object[]{aVar})).intValue() : aVar.l;
        }

        public static /* synthetic */ int d(a aVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("92e2c849", new Object[]{aVar, new Integer(i)})).intValue();
            }
            aVar.g = i;
            return i;
        }

        public static /* synthetic */ long d(a aVar, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("92e2cc0b", new Object[]{aVar, new Long(j)})).longValue();
            }
            aVar.c = j;
            return j;
        }

        public static /* synthetic */ int e(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fb7f9e81", new Object[]{aVar})).intValue() : aVar.f;
        }

        public static /* synthetic */ long f(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("555b08c3", new Object[]{aVar})).longValue() : aVar.i;
        }

        public static /* synthetic */ String g(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fe760390", new Object[]{aVar}) : aVar.m;
        }

        public static /* synthetic */ boolean h(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("911dd55", new Object[]{aVar})).booleanValue() : aVar.k;
        }

        public static /* synthetic */ long i(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("62ed4786", new Object[]{aVar})).longValue() : aVar.b;
        }

        public static /* synthetic */ long j(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bcc8b1c7", new Object[]{aVar})).longValue() : aVar.h;
        }

        public static /* synthetic */ long k(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("16a41c08", new Object[]{aVar})).longValue() : aVar.j;
        }

        public static /* synthetic */ long l(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("707f8649", new Object[]{aVar})).longValue() : aVar.c;
        }

        public static /* synthetic */ boolean m(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ca5af09a", new Object[]{aVar})).booleanValue() : aVar.f33891a;
        }

        public long a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[]{this})).longValue();
            }
            if (!TextUtils.equals(this.m, "error")) {
                long j = this.i;
                if (j > 0) {
                    return this.c - j;
                }
            }
            return 0L;
        }

        public long e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5a4ca60", new Object[]{this})).longValue();
            }
            if (!TextUtils.equals(this.m, "error")) {
                return this.j - this.h;
            }
            return 0L;
        }

        public long b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dd", new Object[]{this})).longValue() : this.c - this.b;
        }

        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
                return;
            }
            this.f33891a = false;
            this.m = "none";
        }

        public a d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("1c9e246d", new Object[]{this});
            }
            a aVar = new a();
            aVar.f33891a = this.f33891a;
            aVar.b = this.b;
            aVar.h = this.h;
            aVar.j = this.j;
            aVar.i = this.i;
            aVar.c = this.c;
            aVar.d = this.d;
            aVar.e = this.e;
            aVar.l = this.l;
            aVar.m = this.m;
            aVar.f = this.f;
            aVar.g = this.g;
            return aVar;
        }
    }

    public synchronized void a(String str, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18670bf2", new Object[]{this, str, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        this.f33889a = new a();
        a.a(this.f33889a, str);
        a.a(this.f33889a, i);
        a.b(this.f33889a, i4);
        a.c(this.f33889a, i2);
        a.d(this.f33889a, i3);
        a.b(this.f33889a, "none");
    }

    public synchronized void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.f33889a == null) {
        } else {
            a.a(this.f33889a, SystemClock.uptimeMillis());
        }
    }

    public synchronized void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (this.f33889a == null) {
        } else {
            a.b(this.f33889a, SystemClock.uptimeMillis());
        }
    }

    @Override // tb.lql
    public synchronized void a(IUiRefreshActionModel iUiRefreshActionModel) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4935db30", new Object[]{this, iUiRefreshActionModel});
            return;
        }
        if (TextUtils.equals(iUiRefreshActionModel.getRequestType(), "scrollNextPage") && this.f33889a != null) {
            if (TextUtils.isEmpty(iUiRefreshActionModel.getDataChangeType())) {
                z = false;
            }
            this.b = z;
            a.a(this.f33889a, this.b);
            if (!c() && this.b) {
                a();
                return;
            }
            if (!this.b && c()) {
                c(a.c(this.f33889a), a.a(this.f33889a), a.d(this.f33889a));
            }
        }
    }

    public synchronized void b(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfaa61a", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        if (this.f33889a != null && !c()) {
            if (this.b) {
                f();
            } else {
                c(i, i2, i3);
            }
        }
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (this.f33889a == null || c()) {
        } else {
            a.b(this.f33889a, true);
            a.b(this.f33889a, "loading");
            a.c(this.f33889a, SystemClock.uptimeMillis());
        }
    }

    private boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : a.f(this.f33889a) > 0;
    }

    private void c(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5dbd2f9", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        } else if (this.f33889a != null) {
        } else {
            if (c() && TextUtils.equals(a.g(this.f33889a), "error")) {
                return;
            }
            a d = this.f33889a.d();
            a();
            a(a.b(d), i, i3, i2, a.e(d));
            a.b(this.f33889a, "error");
            a.b(this.f33889a, true);
            a.a(this.f33889a, false);
            a.c(this.f33889a, SystemClock.uptimeMillis());
        }
    }

    @Override // tb.lql
    public synchronized void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        try {
            if (this.f33889a == null) {
                return;
            }
            if (!c()) {
                this.f33889a.c();
            }
            a.d(this.f33889a, SystemClock.uptimeMillis());
            final HashMap hashMap = new HashMap(16);
            hashMap.put("containerId", String.valueOf(a.b(this.f33889a)));
            hashMap.put("index", String.valueOf(a.a(this.f33889a)));
            hashMap.put(BioDetector.EXT_KEY_PAGENUM, String.valueOf(a.c(this.f33889a)));
            hashMap.put("totalNum", String.valueOf(a.d(this.f33889a)));
            hashMap.put("preloadMoreCount", String.valueOf(a.e(this.f33889a)));
            hashMap.put("deviceLevel", String.valueOf(ldc.a()));
            hashMap.put("scrollFullTime", String.valueOf(this.f33889a.b()));
            hashMap.put(joq.STAGE_NETWORK, String.valueOf(this.f33889a.e()));
            hashMap.put("requestResult", String.valueOf(a.h(this.f33889a)));
            hashMap.put("startTime", String.valueOf(a.i(this.f33889a)));
            hashMap.put("requestStartTime", String.valueOf(a.j(this.f33889a)));
            hashMap.put("requestEndTime", String.valueOf(a.k(this.f33889a)));
            hashMap.put("showLoadingTime", String.valueOf(a.f(this.f33889a)));
            hashMap.put("endTime", String.valueOf(a.l(this.f33889a)));
            hashMap.put("isLoadingShow", String.valueOf(a.m(this.f33889a)));
            long j = 0;
            hashMap.put("isLoadingViewAppear", String.valueOf(a.f(this.f33889a) > 0));
            if (a.f(this.f33889a) > 0) {
                j = this.f33889a.a();
            }
            hashMap.put("loadingViewStayTime", String.valueOf(j));
            hashMap.put("loadingType", a.g(this.f33889a));
            hashMap.put("frameworkType", "infoflow");
            a(hashMap);
            this.f33889a = null;
            ljd.a().a(new Runnable() { // from class: tb.ssq.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        m.a().a("Smart_Loading", "loadingView_stay_time", "1.0", "PageHomeCommitTracker_Loading_PV_Rate", "PageHomeCommitTracker_Loading_PV_Rate_Legacy", hashMap);
                    }
                }
            });
        } catch (Exception e) {
            ldf.d("LoadingTraceUmbrellaMonitorV2", "stopRecord:", Log.getStackTraceString(e));
        }
    }
}
