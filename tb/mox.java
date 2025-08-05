package tb;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Debug;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Display;
import android.view.KeyEvent;
import android.view.Window;
import android.view.WindowManager;
import com.alipay.zoloz.hardware.camera.preview.utils.SPManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.p;
import com.taobao.android.autosize.l;
import com.taobao.application.common.c;
import com.taobao.application.common.impl.d;
import com.taobao.monitor.impl.util.f;
import com.taobao.monitor.impl.util.h;
import com.taobao.monitor.performance.cpu.e;
import com.taobao.monitor.performance.cpu.g;
import com.taobao.orange.OConstant;
import com.taobao.search.common.util.i;
import com.taobao.tao.flexbox.layoutmanager.container.b;
import com.taobao.tao.remotebusiness.js.MtopJSBridge;
import com.taobao.tao.tbmainfragment.s;
import com.uc.webview.export.media.MessageID;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class mox extends mos {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static String B = "";
    private static String C;
    private static final List<String> F = new ArrayList(4);
    private static final List<String> N = new ArrayList();
    private static final List<String> O = new ArrayList();
    private long A;
    private final JSONObject D;
    private long[] G;
    private final long[] H;
    private final e I;
    private g J;
    private long K;
    private boolean L;
    private final Map<String, Long> M;
    private boolean P;
    private boolean R;
    private boolean S;
    private boolean T;
    private int U;
    private boolean V;
    private boolean W;
    private long X;
    private long Y;
    private long Z;
    private long aa;
    public boolean x;
    private long y;
    private long z;

    public static /* synthetic */ Object ipc$super(mox moxVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1474193572) {
            super.a(((Number) objArr[0]).longValue());
            return null;
        } else if (hashCode != 90991720) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.a();
            return null;
        }
    }

    @Override // com.taobao.monitor.impl.trace.d.a
    public void a(String str, int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3526bd3", new Object[]{this, str, new Integer(i), new Long(j)});
        }
    }

    @Override // com.taobao.monitor.impl.trace.d.a
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        }
    }

    static {
        N.add(s.KEY_FRAGMENT_IS_FRAGMENT_MODEL);
        N.add("lastJumpPageSchemaUrl");
        N.add("fullPageName");
        N.add("activityName");
        O.add("constructPageTime");
        O.add("navStartTime");
        O.add("navStartActivityTime");
        O.add("navStartPageTime");
        O.add("jumpTime");
    }

    public mox(mou mouVar) {
        super(mouVar);
        this.A = 0L;
        this.D = new JSONObject();
        this.H = new long[2];
        this.X = 0L;
        this.Y = 0L;
        this.Z = 0L;
        this.aa = 0L;
        this.I = new e(com.taobao.monitor.impl.common.e.a().b().getPackageName());
        this.J = null;
        this.K = 0L;
        this.L = true;
        this.M = new HashMap();
        this.P = true;
        this.x = true;
        this.R = true;
        this.V = true;
        this.S = true;
        this.T = true;
        this.U = 1;
        this.W = true;
    }

    @Override // tb.mop
    public void a(long j) {
        WindowManager windowManager;
        Display defaultDisplay;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
            return;
        }
        super.a(j);
        this.b.a("procedureStartTime", j);
        this.b.a("errorCode", (Object) 1);
        this.b.a("installType", mnd.k);
        this.b.a("timestampInterval", Long.valueOf(System.currentTimeMillis() - SystemClock.uptimeMillis()));
        this.b.a("leaveType", "other");
        this.b.a("saveMode", Boolean.valueOf(d.a().a("saveMode", false)));
        f.a(this.b, "groupRelatedId", this.f31174a.q());
        if (l.d(com.taobao.monitor.impl.common.e.a().b())) {
            this.b.a("foldStatus", Integer.valueOf(l.q(com.taobao.monitor.impl.common.e.a().b())));
        }
        Window b = this.f31174a.b();
        if (b == null || (windowManager = b.getWindowManager()) == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null) {
            return;
        }
        this.b.a("pageRefreshRate", Integer.valueOf((int) defaultDisplay.getRefreshRate()));
    }

    @Override // tb.mos
    public void a(String str, String str2, Map<String, Object> map, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("feaf215b", new Object[]{this, str, str2, map, new Long(j)});
            return;
        }
        mpi.c("PageProcessor", "onPageCreate", str, str2, map);
        this.y = h.a();
        long[] jArr = this.H;
        jArr[0] = 0;
        jArr[1] = 0;
        this.G = mog.a();
        if (F.size() < 10) {
            F.add(str);
        }
        a(map);
        a(str, str2, this.y, j);
        if (!com.taobao.monitor.impl.common.d.v) {
            return;
        }
        a(this.f31174a.m());
        try {
            this.D.put(i.b.MEASURE_ONCREATE, mnu.a(false, j));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private void a(Activity activity) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{this, activity});
        } else if (activity == null) {
        } else {
            Intent intent = activity.getIntent();
            if (intent != null) {
                String stringExtra = intent.getStringExtra("referrer");
                if (!TextUtils.isEmpty(stringExtra)) {
                    try {
                        Uri parse = Uri.parse(stringExtra);
                        str = parse.getHost() + parse.getPath();
                    } catch (Exception e) {
                        str = e.getMessage();
                    }
                    this.b.a(MtopJSBridge.MtopJSParam.REFERER, str);
                }
            }
            str = "null";
            this.b.a(MtopJSBridge.MtopJSParam.REFERER, str);
        }
    }

    private void a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else if (map != null) {
            try {
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    if (!TextUtils.isEmpty(entry.getKey()) && N.contains(entry.getKey()) && entry.getValue() != null) {
                        this.b.a(entry.getKey(), entry.getValue());
                    }
                    if (!TextUtils.isEmpty(entry.getKey()) && O.contains(entry.getKey()) && entry.getValue() != null) {
                        this.b.a(entry.getKey(), mqe.a(entry.getValue(), -1L));
                    }
                }
                this.f31174a.b(mqe.a(map.get("navStartTime"), -1L));
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private void a(String str, String str2, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6998f6fc", new Object[]{this, str, str2, new Long(j), new Long(j2)});
            return;
        }
        this.b.a("isFirstLoad", Boolean.valueOf(mnd.w.a(this.f31174a.k())));
        this.b.a("pageName", str);
        this.b.a("isFirstInstall", Boolean.valueOf(mnd.c));
        this.b.a("isFirstLaunch", Boolean.valueOf(mnd.e));
        this.b.a("lastValidTime", Long.valueOf(mnd.s));
        this.b.a("lastValidLinksPage", F.toString());
        this.b.a("lastValidPage", mnd.v);
        this.b.a(b.KEY_LOAD_TYPE, "push");
        f.b(this.b, "fromPageName", B);
        f.b(this.b, "lastJumpPage", C);
        f.b(this.b, "schemaUrl", str2);
        f.b(this.b, p.KEY_DEVICE_TYPE, mnd.a());
        this.b.a(OConstant.DIMEN_PROCESS_START_TIME, mnd.m);
        this.b.a("pageStartTime", j2);
        this.b.a("loadStartTime", j);
        HashMap hashMap = new HashMap(1);
        hashMap.put("timestamp", Long.valueOf(j2));
        this.b.a("onPageCreate", (Map<String, Object>) hashMap);
    }

    @Override // tb.mos
    public void b(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66ffb", new Object[]{this, new Long(j)});
            return;
        }
        mpi.c("PageProcessor", "onPageAppear", this.f31174a.i());
        long a2 = h.a();
        this.z = a2;
        this.J = this.I.b();
        HashMap hashMap = new HashMap(1);
        hashMap.put("timestamp", Long.valueOf(j));
        this.b.a("onPageAppear", (Map<String, Object>) hashMap);
        B = this.f31174a.i();
        if (this.f31174a.w()) {
            C = this.f31174a.i();
        }
        if (this.x && this.G != null) {
            this.x = false;
            long[] a3 = mog.a();
            long[] jArr = this.H;
            long j2 = jArr[0];
            long j3 = a3[0];
            long[] jArr2 = this.G;
            jArr[0] = j2 + (j3 - jArr2[0]);
            jArr[1] = jArr[1] + (a3[1] - jArr2[1]);
        }
        this.G = mog.a();
        mnd.v = this.f31174a.i();
        mnd.s = a2;
        if (com.taobao.monitor.impl.common.d.v) {
            try {
                this.D.put("onAppear", mnu.a(true, j));
                this.b.a("plugged", Integer.valueOf(mnu.f31145a));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        if (Build.VERSION.SDK_INT < 23) {
            return;
        }
        Map<String, String> runtimeStats = Debug.getRuntimeStats();
        if (runtimeStats != null) {
            this.Z = mqe.a((Object) runtimeStats.get("art.gc.blocking-gc-count"), 0L);
            this.aa = mqe.a((Object) runtimeStats.get("art.gc.blocking-gc-time"), 0L);
            return;
        }
        this.Z = -1L;
        this.aa = -1L;
    }

    @Override // tb.mos
    public void c(long j) {
        Map<String, String> runtimeStats;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b489a", new Object[]{this, new Long(j)});
            return;
        }
        mpi.c("PageProcessor", "onPageDisappear", this.f31174a.i());
        this.A += h.a() - this.z;
        g b = this.I.b();
        if (b != null && this.J != null) {
            this.K += b.a() - this.J.a();
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("timestamp", Long.valueOf(j));
        this.b.a("onPageDisappear", (Map<String, Object>) hashMap);
        if (this.G != null) {
            long[] a2 = mog.a();
            long[] jArr = this.H;
            long j2 = jArr[0];
            long j3 = a2[0];
            long[] jArr2 = this.G;
            jArr[0] = j2 + (j3 - jArr2[0]);
            jArr[1] = jArr[1] + (a2[1] - jArr2[1]);
            this.G = a2;
        }
        if (com.taobao.monitor.impl.common.d.v) {
            try {
                this.D.put("onDisappear", mnu.a(true, j));
                if (mnu.f31145a > 0) {
                    this.b.a("plugged", Integer.valueOf(mnu.f31145a));
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        if (Build.VERSION.SDK_INT < 23 || (runtimeStats = Debug.getRuntimeStats()) == null || this.Z < 0 || this.aa < 0) {
            return;
        }
        this.X += Math.max(mqe.a((Object) runtimeStats.get("art.gc.blocking-gc-count"), 0L) - this.Z, 0L);
        this.Y += Math.max(mqe.a((Object) runtimeStats.get("art.gc.blocking-gc-time"), 0L) - this.aa, 0L);
    }

    @Override // tb.mos
    public void d(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad402139", new Object[]{this, new Long(j)});
            return;
        }
        mpi.c("PageProcessor", "onPageDestroy", this.f31174a.i());
        HashMap hashMap = new HashMap(1);
        hashMap.put("timestamp", Long.valueOf(j));
        this.b.a("onPageDestroy", (Map<String, Object>) hashMap);
        if (this.G != null) {
            long[] a2 = mog.a();
            long[] jArr = this.H;
            long j2 = jArr[0];
            long j3 = a2[0];
            long[] jArr2 = this.G;
            jArr[0] = j2 + (j3 - jArr2[0]);
            jArr[1] = jArr[1] + (a2[1] - jArr2[1]);
        }
        if (!com.taobao.monitor.impl.common.d.v) {
            return;
        }
        try {
            this.D.put(MessageID.onDestroy, mnu.a(false, j));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // tb.mos
    public void b(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d253fb1", new Object[]{this, str, new Long(j)});
        } else if (!this.P) {
        } else {
            this.P = false;
            this.b.a("leaveType", str);
            this.b.a("leaveTime", j);
        }
    }

    @Override // com.taobao.monitor.impl.trace.MemoryDispatcher.a
    public void a(long j, long j2, long j3, long j4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ed98968", new Object[]{this, new Long(j), new Long(j2), new Long(j3), new Long(j4)});
            return;
        }
        Long l = this.M.get("peakJavaMemoryUsage");
        if (l == null || l.longValue() < j) {
            this.M.put("peakJavaMemoryUsage", Long.valueOf(j));
        }
        Long l2 = this.M.get("peakNativeHeapSize");
        if (l2 == null || l2.longValue() < j2) {
            this.M.put("peakNativeHeapSize", Long.valueOf(j2));
        }
        Long l3 = this.M.get("peakNativeHeapAllocated");
        if (l3 == null || l3.longValue() < j3) {
            this.M.put("peakNativeHeapAllocated", Long.valueOf(j3));
        }
        Long l4 = this.M.get("peakPss");
        if (j4 <= 0) {
            return;
        }
        if (l4 != null && l4.longValue() >= j4) {
            return;
        }
        this.M.put("peakPss", Long.valueOf(j4));
    }

    @Override // tb.mos, tb.mop
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        super.a();
        if (this.b.c()) {
            if (this.L) {
                this.b.a("utSession", moi.b().a());
            }
            if (this.f31174a.h() != null) {
                this.b.a("pageCalculateType", "view_manual_calculate");
            }
            com.taobao.application.common.d a2 = c.a();
            mpi.c("PageProcessor", "errorCode", Integer.valueOf(this.U));
            this.b.a("totalProcessCpuJiffy", Long.valueOf(this.K));
            this.b.a("totalVisibleDuration", Long.valueOf(this.A));
            this.b.a("deviceLevel", Integer.valueOf(a2.a("deviceLevel", -1)));
            this.b.a("totalScrollTime", Long.valueOf(this.f31174a.J()));
            f.a(this.b, "firstFrameTime", this.f31174a.u());
            this.b.b(SPManager.FPS_KEY, this.m.toString());
            this.b.b("blockFps", this.o.toString());
            this.b.b("scrollHitchRate", this.v.toString());
            this.b.b("scrollFps", this.n.toString());
            this.b.b("frozenFrameCount", Integer.valueOf(this.p));
            this.b.b("slowFrameCount", Integer.valueOf(this.q));
            this.b.b("jankCount", Integer.valueOf(this.r));
            this.b.b("movieJankCount", Integer.valueOf(this.s));
            this.b.b("movieBigJankCount", Integer.valueOf(this.t));
            this.b.b("image", Integer.valueOf(this.e));
            this.b.b("imageOnRequest", Integer.valueOf(this.e));
            this.b.b("imageSuccessCount", Integer.valueOf(this.f));
            this.b.b("imageFailedCount", Integer.valueOf(this.g));
            this.b.b("imageCanceledCount", Integer.valueOf(this.h));
            this.b.b("network", Integer.valueOf(this.i));
            this.b.b("networkOnRequest", Integer.valueOf(this.i));
            this.b.b("networkSuccessCount", Integer.valueOf(this.j));
            this.b.b("networkFailedCount", Integer.valueOf(this.k));
            this.b.b("networkCanceledCount", Integer.valueOf(this.l));
            this.b.b("renderFrameCount", Integer.valueOf(this.f31174a.y()));
            this.b.b("dropRenderFrameCount", Integer.valueOf(this.f31174a.A()));
            this.b.b("scrollRenderFrameCount", Integer.valueOf(this.f31174a.B()));
            this.b.b("blockRenderFrameCount", Integer.valueOf(this.f31174a.D()));
            this.b.b("frozenRenderFrameCount", Integer.valueOf(this.f31174a.F()));
            this.b.b("mainBlockFrameCauses", b(this.f31174a.H()));
            this.b.b("importantBlockFrameCauses", b(this.f31174a.I()));
            this.b.b("mainThreadBlock", (Object) this.w);
            this.b.b("totalTrafficRxBytes", Long.valueOf(this.H[0]));
            this.b.b("totalTrafficTxBytes", Long.valueOf(this.H[1]));
            this.b.b("blocking-gc-count", Long.valueOf(this.X));
            this.b.b("blocking-gc-time", Long.valueOf(this.Y));
            if (com.taobao.monitor.impl.common.d.v) {
                try {
                    for (Map.Entry<String, Long> entry : this.M.entrySet()) {
                        this.D.put(entry.getKey(), entry.getValue());
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                this.b.a("runtimeInfo", this.D);
            }
            this.b.a("procedureEndTime", h.a());
            this.b.d();
        }
        i();
    }

    private JSONObject b(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d6e7436a", new Object[]{this, map});
        }
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            for (Object obj : map.keySet()) {
                jSONObject.put(String.valueOf(obj), map.get(obj));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    @Override // com.taobao.monitor.procedure.IPage.b
    public void i(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5c85c54", new Object[]{this, new Long(j)});
            return;
        }
        mpi.c("PageProcessor", "onPageClickTime", Long.valueOf(j));
        this.b.a("clickTime", j);
    }

    @Override // tb.mos
    public void e(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef4f9d8", new Object[]{this, new Long(j)});
            return;
        }
        mpi.c("PageProcessor", "onPageRenderStart", Long.valueOf(j));
        if (!this.R) {
            return;
        }
        this.b.a("pageInitDuration", Long.valueOf(j - this.y));
        this.b.a("renderStartTime", j);
        this.R = false;
    }

    @Override // tb.mos
    public void a(float f, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0ff96c", new Object[]{this, new Float(f), new Long(j)});
            return;
        }
        mpi.c("PageProcessor", "onPageRenderPercent", Float.valueOf(f), Long.valueOf(j));
        if (!this.S) {
            return;
        }
        this.b.a("onRenderPercent", Float.valueOf(f));
        this.b.a("drawPercentTime", Long.valueOf(j));
    }

    @Override // tb.mos
    public void f(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0a9d277", new Object[]{this, new Long(j)});
            return;
        }
        mpi.c("PageProcessor", "onPageVisible", Long.valueOf(j));
        if (!this.S) {
            return;
        }
        this.S = false;
        this.b.a("displayDuration", Long.valueOf(j - this.y));
        this.b.a("displayedTime", j);
        this.b.a("firstScreenPaint", j);
        if (!this.L || TextUtils.isEmpty(moi.b().a())) {
            return;
        }
        this.b.a("utSession", moi.b().a());
        this.L = false;
    }

    @Override // tb.mos
    public void g(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25eab16", new Object[]{this, new Long(j)});
        } else {
            this.b.a("customFirstScreenPaint", j);
        }
    }

    @Override // tb.mos
    public void h(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b41383b5", new Object[]{this, new Long(j)});
            return;
        }
        mpi.c("PageProcessor", "onPageInteractive", Long.valueOf(j));
        if (!this.T) {
            return;
        }
        this.T = false;
        this.U = 0;
        this.b.a("interactiveDuration", Long.valueOf(j - this.y));
        this.b.a("loadDuration", Long.valueOf(j - this.y));
        this.b.a("interactiveTime", j);
        this.b.a("errorCode", (Object) 0);
        this.b.b("totalRx", Long.valueOf(this.H[0]));
        this.b.b("totalTx", Long.valueOf(this.H[1]));
    }

    @Override // tb.mos
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        mpi.c("PageProcessor", "onPageLoadError", Integer.valueOf(i));
        if (this.U != 1) {
            return;
        }
        this.b.a("errorCode", Integer.valueOf(i));
        this.U = i;
    }

    @Override // tb.mos
    public void i(mou mouVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6f89577", new Object[]{this, mouVar, new Long(j)});
        } else if (!this.V) {
        } else {
            this.b.a("customDisplayedTime", j);
            this.V = false;
        }
    }

    @Override // com.taobao.monitor.impl.trace.ApplicationBackgroundChangedDispatcher.a
    public void a(int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c115689", new Object[]{this, new Integer(i), new Long(j)});
            return;
        }
        mpi.c("PageProcessor", "onChanged", Integer.valueOf(i), Long.valueOf(j));
        if (i == 1) {
            HashMap hashMap = new HashMap(1);
            hashMap.put("timestamp", Long.valueOf(j));
            this.b.a("foreground2Background", (Map<String, Object>) hashMap);
            return;
        }
        HashMap hashMap2 = new HashMap(1);
        hashMap2.put("timestamp", Long.valueOf(j));
        this.b.a("background2Foreground", (Map<String, Object>) hashMap2);
    }

    @Override // com.taobao.monitor.impl.trace.c.a
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("timestamp", Long.valueOf(h.a()));
        this.b.a("onLowMemory", (Map<String, Object>) hashMap);
    }

    @Override // com.taobao.monitor.impl.trace.r.a
    public void a(Activity activity, KeyEvent keyEvent, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c497142", new Object[]{this, activity, keyEvent, new Long(j)});
        } else if (!mnh.a(activity, this.f31174a.a())) {
        } else {
            int action = keyEvent.getAction();
            int keyCode = keyEvent.getKeyCode();
            if (action != 0) {
                return;
            }
            if (keyCode != 4 && keyCode != 3) {
                return;
            }
            HashMap hashMap = new HashMap(2);
            hashMap.put("timestamp", Long.valueOf(j));
            hashMap.put("key", Integer.valueOf(keyEvent.getKeyCode()));
            this.b.a("keyEvent", (Map<String, Object>) hashMap);
        }
    }

    @Override // com.taobao.monitor.impl.trace.r.a
    public void a(Activity activity, int i, float f, float f2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb07419b", new Object[]{this, activity, new Integer(i), new Float(f), new Float(f2), new Long(j)});
        } else if (!mnh.a(activity, this.f31174a.a())) {
        } else {
            if (this.W) {
                this.b.a("firstInteractiveTime", j);
                this.b.a("firstInteractiveDuration", Long.valueOf(j - this.y));
                this.W = false;
            }
            F.clear();
            F.add(com.taobao.monitor.impl.util.d.b(activity));
            mnd.v = com.taobao.monitor.impl.util.d.b(activity);
            mnd.s = j;
        }
    }

    @Override // com.taobao.monitor.impl.trace.d.a
    public void a(float f, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25ef32b8", new Object[]{this, new Float(f), new Integer(i), new Integer(i2)});
            return;
        }
        mnu.f31145a = i;
        if (i <= 0) {
            return;
        }
        this.b.a("plugged", Integer.valueOf(i));
    }
}
