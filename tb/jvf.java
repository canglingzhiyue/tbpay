package tb;

import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.LruCache;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.v3.FalcoGlobalTracer;
import com.taobao.analysis.v3.g;
import com.taobao.analysis.v3.r;
import com.taobao.android.weex_framework.util.f;
import com.taobao.android.weex_framework.util.o;
import com.taobao.monitor.procedure.IPage;
import com.taobao.monitor.procedure.a;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.aks;
import tb.shc;

/* loaded from: classes6.dex */
public class jvf implements jvu {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_INSTANCE_ID = "instanceId";
    public static final String KEY_REMOTE_QKING = "wxRemoteQking";
    public static final String KEY_UNI_FIRST_PAINT = "wxUniFirstPaint";
    public static final String KEY_USER_ACTION_T = "userActionT";
    private static int c;
    private static boolean d;
    public static boolean g;

    /* renamed from: a  reason: collision with root package name */
    public String f29805a;
    private mqc b;
    private boolean e;
    private shc i;
    private shc j;
    private g k;
    private WeakReference<jvv> n;
    private boolean o;
    private LruCache<Integer, jvg> f = new LruCache<>(50);
    private boolean h = false;
    private volatile boolean l = false;
    private CopyOnWriteArrayList<o> m = new CopyOnWriteArrayList<>();

    public static /* synthetic */ g a(jvf jvfVar, g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("93317858", new Object[]{jvfVar, gVar});
        }
        jvfVar.k = gVar;
        return gVar;
    }

    public static /* synthetic */ a a(jvf jvfVar, int i, jvv jvvVar, IPage iPage) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("46193802", new Object[]{jvfVar, new Integer(i), jvvVar, iPage}) : jvfVar.a(i, jvvVar, iPage);
    }

    public static /* synthetic */ shc a(jvf jvfVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (shc) ipChange.ipc$dispatch("9c5081da", new Object[]{jvfVar}) : jvfVar.i;
    }

    public static /* synthetic */ shc a(jvf jvfVar, shc shcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (shc) ipChange.ipc$dispatch("fe8b5298", new Object[]{jvfVar, shcVar});
        }
        jvfVar.i = shcVar;
        return shcVar;
    }

    public static /* synthetic */ void a(jvf jvfVar, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("417f857c", new Object[]{jvfVar, str, new Long(j)});
        } else {
            jvfVar.c(str, j);
        }
    }

    public static /* synthetic */ boolean a(jvf jvfVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("14765e9a", new Object[]{jvfVar, new Boolean(z)})).booleanValue();
        }
        jvfVar.l = z;
        return z;
    }

    public static /* synthetic */ shc b(jvf jvfVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (shc) ipChange.ipc$dispatch("83f25839", new Object[]{jvfVar}) : jvfVar.j;
    }

    public static /* synthetic */ shc b(jvf jvfVar, shc shcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (shc) ipChange.ipc$dispatch("ef5c59f7", new Object[]{jvfVar, shcVar});
        }
        jvfVar.j = shcVar;
        return shcVar;
    }

    public static /* synthetic */ g c(jvf jvfVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("6a14a150", new Object[]{jvfVar}) : jvfVar.k;
    }

    public static /* synthetic */ CopyOnWriteArrayList d(jvf jvfVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CopyOnWriteArrayList) ipChange.ipc$dispatch("a5e3996e", new Object[]{jvfVar}) : jvfVar.m;
    }

    public static /* synthetic */ WeakReference e(jvf jvfVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeakReference) ipChange.ipc$dispatch("4b9723d0", new Object[]{jvfVar}) : jvfVar.n;
    }

    static {
        kge.a(-1667411661);
        kge.a(2050542959);
        g = false;
        c = -2;
        d = true;
    }

    @Override // tb.jvu
    public void a(String str) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str) || this.e) {
        } else {
            this.f29805a = str;
            String b = f.b("weex_rum_performance_enable");
            String str2 = "true";
            this.h = b == null || str2.equals(b);
            String b2 = f.b("weex_fix_leak_enable");
            if (b2 == null || str2.equals(b2)) {
                z = true;
            }
            this.o = z;
            this.b = mpy.b().a();
            mqc mqcVar = this.b;
            if (mqcVar == null) {
                return;
            }
            mqcVar.b(str);
            c();
            if (Build.VERSION.SDK_INT >= 30) {
                if (!g) {
                    str2 = "false";
                }
                a(KEY_REMOTE_QKING, str2);
            } else {
                a(KEY_REMOTE_QKING, "other");
            }
            this.e = true;
        }
    }

    private void c(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        final r rVar = FalcoGlobalTracer.get();
        if (rVar == null) {
            return;
        }
        rVar.a(new shc.a() { // from class: tb.jvf.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.shc.a
            public void a(shc shcVar) {
                jvf jvfVar;
                String str2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("feb9cb6a", new Object[]{this, shcVar});
                    return;
                }
                jvf.a(jvf.this, shcVar);
                jvf.b(jvf.this, rVar.a(shc.MODULE, shc.SCENE_TAP).a(jvf.a(jvf.this)).av_());
                if (jvf.a(jvf.this) != null) {
                    jvf.b(jvf.this).a(jvf.a(jvf.this));
                }
                jvf.a(jvf.this, rVar.a("weex", "").a(jvf.b(jvf.this)).c());
                jvf.a(jvf.this, true);
                if (jvf.a(jvf.this) != null) {
                    jvf.c(jvf.this).a(jvf.KEY_USER_ACTION_T, Long.valueOf(jvf.a(jvf.this).k()));
                }
                jvf.c(jvf.this).a("instanceId", str);
                if (Build.VERSION.SDK_INT >= 30) {
                    jvfVar = jvf.this;
                    str2 = jvf.g ? "true" : "false";
                } else {
                    jvfVar = jvf.this;
                    str2 = "other";
                }
                jvfVar.a(jvf.KEY_REMOTE_QKING, str2);
                if (jvf.d(jvf.this).size() <= 0) {
                    return;
                }
                Iterator it = jvf.d(jvf.this).iterator();
                while (it.hasNext()) {
                    ((o) it.next()).run();
                }
            }
        });
    }

    @Override // tb.jvu
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        o oVar = new o() { // from class: tb.jvf.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.weex_framework.util.o
            public void a() throws Exception {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                if (jvf.b(jvf.this) != null) {
                    jvf.b(jvf.this).c();
                }
                if (jvf.c(jvf.this) == null) {
                    return;
                }
                jvf.c(jvf.this).c();
            }
        };
        if (this.l) {
            oVar.run();
        } else {
            this.m.add(oVar);
        }
        mqc mqcVar = this.b;
        if (mqcVar == null) {
            return;
        }
        mqcVar.c();
    }

    @Override // tb.jvu
    public void a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123b0d2", new Object[]{this, str, new Long(j)});
            return;
        }
        b(str, j);
        mqc mqcVar = this.b;
        if (mqcVar == null) {
            return;
        }
        mqcVar.a(str, j);
    }

    private void b(final String str, final long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d253fb1", new Object[]{this, str, new Long(j)});
        } else if (!this.h) {
        } else {
            if (this.k == null) {
                this.m.add(new o() { // from class: tb.jvf.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.weex_framework.util.o
                    public void a() throws Exception {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        } else {
                            jvf.a(jvf.this, str, j);
                        }
                    }
                });
            } else {
                c(str, j);
            }
        }
    }

    private void c(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7926ce90", new Object[]{this, str, new Long(j)});
        } else if (this.k == null) {
        } else {
            long a2 = a(j);
            if (this.j != null) {
                if (jvw.KEY_PAGE_STAGES_CUSTOM_START_TIME.equals(str)) {
                    this.j.a(Long.valueOf(j));
                    this.k.a(KEY_USER_ACTION_T, Long.valueOf(j));
                } else if (jvw.KEY_PAGE_STAGES_STANDARD_CONTAINER_START.equals(str)) {
                    this.j.j(Long.valueOf(j));
                } else if ("wxStartDownLoadBundle".equals(str)) {
                    this.j.p(Long.valueOf(a2));
                } else if ("wxEndDownLoadBundle".equals(str)) {
                    this.j.q(Long.valueOf(a2));
                } else if (KEY_UNI_FIRST_PAINT.equals(str)) {
                    this.j.r(Long.valueOf(a2));
                } else if (jvw.KEY_PAGE_STAGES_RASTER_INTERACTION_OPT.equals(str)) {
                    this.j.s(Long.valueOf(a2));
                }
            }
            if (jvw.KEY_PAGE_STAGES_CUSTOM_START_TIME.equals(str) || jvw.KEY_PAGE_STAGES_STANDARD_CONTAINER_START.equals(str)) {
                this.k.a(str, Long.valueOf(j));
            } else {
                this.k.a(str, Long.valueOf(a2));
            }
        }
    }

    public long a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a8219750", new Object[]{this, new Long(j)})).longValue();
        }
        if (j <= 0) {
            return 0L;
        }
        return (System.currentTimeMillis() - SystemClock.uptimeMillis()) + j;
    }

    @Override // tb.jvu
    public void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb6538e", new Object[]{this, str, obj});
            return;
        }
        b(str, obj);
        mqc mqcVar = this.b;
        if (mqcVar == null) {
            return;
        }
        mqcVar.a(str, obj);
    }

    private void b(final String str, final Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18567e8f", new Object[]{this, str, obj});
        } else if (!this.h) {
        } else {
            g gVar = this.k;
            if (gVar != null) {
                gVar.a(str, obj.toString());
            } else {
                this.m.add(new o() { // from class: tb.jvf.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.weex_framework.util.o
                    public void a() throws Exception {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        } else {
                            jvf.c(jvf.this).a(str, obj.toString());
                        }
                    }
                });
            }
        }
    }

    @Override // tb.jvu
    public String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str});
        }
        String a2 = jvl.a(str, false);
        return TextUtils.isEmpty(a2) ? "emptyParseUrl" : a2;
    }

    @Override // tb.jvu
    public void a(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
            return;
        }
        mqc mqcVar = this.b;
        if (mqcVar == null) {
            return;
        }
        mqcVar.a(str, map);
    }

    @Override // tb.jvu
    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        mqc mqcVar = this.b;
        return mqcVar == null ? "" : mqcVar.g();
    }

    @Override // tb.jvu
    public void a(final int i, View view, final jvv jvvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38d25fdd", new Object[]{this, new Integer(i), view, jvvVar});
            return;
        }
        if (this.o) {
            this.n = new WeakReference<>(jvvVar);
            com.taobao.monitor.procedure.o.f18229a.a(view).a(view, new IPage.a() { // from class: tb.jvf.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.monitor.procedure.IPage.a
                public a a(IPage iPage) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (a) ipChange2.ipc$dispatch("a6cb61c5", new Object[]{this, iPage});
                    }
                    jvv jvvVar2 = (jvv) jvf.e(jvf.this).get();
                    if (jvvVar2 == null) {
                        return null;
                    }
                    try {
                        return jvf.a(jvf.this, i, jvvVar2, iPage);
                    } catch (Throwable th) {
                        com.taobao.android.weex_framework.util.g.c("WeexAPMAdapter report error", th);
                        return null;
                    }
                }
            });
        } else {
            com.taobao.monitor.procedure.o.f18229a.a(view).a(view, new IPage.a() { // from class: tb.jvf.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.monitor.procedure.IPage.a
                public a a(IPage iPage) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (a) ipChange2.ipc$dispatch("a6cb61c5", new Object[]{this, iPage});
                    }
                    try {
                        return jvf.a(jvf.this, i, jvvVar, iPage);
                    } catch (Throwable th) {
                        com.taobao.android.weex_framework.util.g.c("WeexAPMAdapter report error", th);
                        return null;
                    }
                }
            });
        }
        a(i, "wxAttachWindowIntervalOpt", SystemClock.uptimeMillis());
        if (!this.h) {
            return;
        }
        c(String.valueOf(i));
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00ad A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.taobao.monitor.procedure.a a(int r13, tb.jvv r14, com.taobao.monitor.procedure.IPage r15) {
        /*
            Method dump skipped, instructions count: 579
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.jvf.a(int, tb.jvv, com.taobao.monitor.procedure.IPage):com.taobao.monitor.procedure.a");
    }

    @Override // tb.jvu
    public void a(int i, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd34debf", new Object[]{this, new Integer(i), str, new Long(j)});
            return;
        }
        if (this.f == null) {
            this.f = new LruCache<>(50);
        }
        jvg jvgVar = this.f.get(Integer.valueOf(i));
        if (jvgVar == null) {
            jvgVar = new jvg();
            this.f.put(Integer.valueOf(i), jvgVar);
        }
        jvgVar.b().put(str, Long.valueOf(j));
    }

    @Override // tb.jvu
    public void a(int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8114572f", new Object[]{this, new Integer(i), str, str2});
            return;
        }
        if (this.f == null) {
            this.f = new LruCache<>(50);
        }
        jvg jvgVar = this.f.get(Integer.valueOf(i));
        if (jvgVar == null) {
            jvgVar = new jvg();
            this.f.put(Integer.valueOf(i), jvgVar);
        }
        jvgVar.c().put(str, str2);
    }

    @Override // tb.jvu
    public void a(int i, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb0bf6eb", new Object[]{this, new Integer(i), str, jSONObject});
            return;
        }
        if (this.f == null) {
            this.f = new LruCache<>(50);
        }
        jvg jvgVar = this.f.get(Integer.valueOf(i));
        if (jvgVar == null) {
            jvgVar = new jvg();
            this.f.put(Integer.valueOf(i), jvgVar);
        }
        if (jvgVar.a().get(str) != null) {
            jvgVar.a().get(str).putAll(jSONObject);
        } else {
            jvgVar.a().put(str, jSONObject);
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        d();
        a("wxDeviceLevel", Integer.valueOf(c + 1));
    }

    public static int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("596b2de", new Object[0])).intValue();
        }
        if (d) {
            try {
                aks.d g2 = aks.a().g();
                c = g2 == null ? -1 : g2.f25407a;
            } catch (Throwable unused) {
                d = false;
                c = -1;
            }
        } else {
            c = -1;
        }
        return c + 1;
    }
}
