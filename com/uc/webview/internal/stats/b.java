package com.uc.webview.internal.stats;

import mtopsdk.common.util.StringUtils;
import android.webkit.ValueCallback;
import com.uc.webview.base.GlobalSettings;
import com.uc.webview.base.Log;
import com.uc.webview.base.task.c;
import com.uc.webview.base.timing.StartupTimingKeys;
import com.uc.webview.base.timing.a;
import com.uc.webview.export.extension.UCExtension;
import com.uc.webview.stat.a;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import tb.mly;

/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicBoolean f23991a = new AtomicBoolean(false);

    /* loaded from: classes9.dex */
    public interface a {
        void a(C1045b c1045b);
    }

    /* renamed from: com.uc.webview.internal.stats.b$b  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    public static class C1045b {

        /* renamed from: a  reason: collision with root package name */
        private final Map<String, String> f23994a;
        private final Map<Integer, String> b;
        private final Map<Integer, Long> c;
        private final Map<Integer, Long> d;
        private c e;

        public C1045b() {
            this(null);
        }

        public C1045b(String str) {
            this.f23994a = new HashMap();
            this.b = new HashMap();
            this.c = new HashMap();
            this.d = new HashMap();
            this.e = null;
            if (!StringUtils.isEmpty(str)) {
                try {
                    for (String str2 : str.split("\\`")) {
                        String[] split = str2.trim().split(mly.UNESCAPED_SEPARATOR);
                        if (split != null && split.length == 2) {
                            this.f23994a.put(split[0], split[1]);
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }

        private static void a(Object obj, Map<String, String> map) {
            if (map == null || map.isEmpty()) {
                return;
            }
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (obj instanceof JSONObject) {
                    try {
                        ((JSONObject) obj).put(key, value);
                    } catch (Throwable unused) {
                    }
                } else if (obj instanceof StringBuilder) {
                    StringBuilder sb = (StringBuilder) obj;
                    sb.append(";");
                    sb.append(key);
                    sb.append(":");
                    sb.append(value);
                }
            }
        }

        public final synchronized c a() {
            if (this.e == null && !this.b.isEmpty() && !this.c.isEmpty() && !this.d.isEmpty()) {
                this.e = new c(this);
            }
            return this.e;
        }

        public final String a(int i) {
            return this.b.get(Integer.valueOf(i));
        }

        public final void a(int i, long j, boolean z) {
            if (j <= 0) {
                return;
            }
            (z ? this.d : this.c).put(Integer.valueOf(i), Long.valueOf(j));
        }

        public final void a(int i, String str) {
            if (StringUtils.isEmpty(str)) {
                return;
            }
            this.b.put(Integer.valueOf(i), str);
        }

        public final void a(String str, long j) {
            this.f23994a.put(str, String.valueOf(j));
        }

        public final long b(int i) {
            if (this.c.containsKey(Integer.valueOf(i))) {
                return this.c.get(Integer.valueOf(i)).longValue();
            }
            return 0L;
        }

        public final String b() {
            try {
                JSONObject jSONObject = new JSONObject();
                c a2 = a();
                a(jSONObject, a2 != null ? a2.a() : null);
                a(jSONObject, this.f23994a);
                return jSONObject.toString();
            } catch (Throwable th) {
                Log.w("u4perf", "toJson failed", th);
                return null;
            }
        }

        public final long c(int i) {
            if (this.d.containsKey(Integer.valueOf(i))) {
                return this.d.get(Integer.valueOf(i)).longValue();
            }
            return 0L;
        }

        public final String toString() {
            try {
                StringBuilder sb = new StringBuilder();
                c a2 = a();
                a(sb, a2 != null ? a2.a() : null);
                a(sb, this.f23994a);
                return sb.toString();
            } catch (Throwable th) {
                Log.w("u4perf", "toString failed", th);
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes9.dex */
    public static class c extends a.bb {
        private Map<String, String> Z;

        public c(C1045b c1045b) {
            try {
                String stringValue = GlobalSettings.getStringValue(186);
                if (!StringUtils.isEmpty(stringValue)) {
                    long longValue = Long.valueOf(stringValue).longValue();
                    a.c cVar = (a.c) com.uc.webview.base.timing.a.a((int) StartupTimingKeys.START);
                    if (cVar != null) {
                        long j = cVar.f23811a.f23812a - longValue;
                        if (j > 0) {
                            this.n = j;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
            this.b = c1045b.a(StartupTimingKeys.IS_REUSED);
            this.c = c1045b.a(StartupTimingKeys.IS_FIRST_USED);
            this.d = c1045b.a(StartupTimingKeys.INTEGRATION_TYPE);
            this.e = c1045b.a(StartupTimingKeys.INIT_FAILED_CODE);
            this.f = c1045b.a(StartupTimingKeys.INIT_FAILED_MESSAGE);
            this.g = c1045b.a(StartupTimingKeys.RE_EXTRACT_COUNT);
            this.h = c1045b.a(StartupTimingKeys.UPDATE_FAILED_CODE);
            this.i = c1045b.a(StartupTimingKeys.EXTRACTOR_7Z_FAILED_CODE);
            this.j = c1045b.a(StartupTimingKeys.DETECT_LIBS_MAYBE_DAMAGED);
            this.k = c1045b.a(StartupTimingKeys.USE_PRELOAD_CORE_DEX);
            this.l = c1045b.a(StartupTimingKeys.USE_PRELOAD_CORE_SO);
            this.m = c1045b.a(StartupTimingKeys.PRELOAD_CORE_DEX_LEAD_TIME);
            this.o = c1045b.b(StartupTimingKeys.INITIALIZER);
            this.p = c1045b.c(StartupTimingKeys.INITIALIZER);
            this.q = c1045b.b(StartupTimingKeys.CREATE_RUNNING_CORE_INFO);
            this.r = c1045b.c(StartupTimingKeys.CREATE_RUNNING_CORE_INFO);
            this.s = c1045b.b(StartupTimingKeys.UPDATE_START);
            this.t = c1045b.b(StartupTimingKeys.UPDATE_HEAD_VALIDITY);
            this.u = c1045b.b(StartupTimingKeys.UPDATE_EXISTS);
            this.v = c1045b.b(StartupTimingKeys.UPDATE_SUCCESS);
            this.w = c1045b.b(StartupTimingKeys.EXTRACTOR_START);
            this.x = c1045b.b(StartupTimingKeys.EXTRACTOR_EXISTS);
            this.y = c1045b.b(StartupTimingKeys.EXTRACTOR_SUCCESS);
            this.z = c1045b.b(StartupTimingKeys.CONTINUE_INIT_LIBS);
            this.A = c1045b.b(StartupTimingKeys.LOAD_DEX);
            this.B = c1045b.c(StartupTimingKeys.LOAD_DEX);
            this.C = c1045b.b(StartupTimingKeys.LOAD_SO);
            this.D = c1045b.c(StartupTimingKeys.LOAD_SO);
            this.E = c1045b.b(StartupTimingKeys.INIT_FINISHED);
            this.F = c1045b.b(StartupTimingKeys.INIT_CORE_FACTORY);
            this.G = c1045b.c(StartupTimingKeys.INIT_CORE_FACTORY);
            this.H = c1045b.b(StartupTimingKeys.INIT_CORE_ENGINE);
            this.I = c1045b.c(StartupTimingKeys.INIT_CORE_ENGINE);
            this.J = c1045b.b(StartupTimingKeys.INIT_NATIVE_LIBRARIES);
            this.K = c1045b.c(StartupTimingKeys.INIT_NATIVE_LIBRARIES);
            this.L = c1045b.b(StartupTimingKeys.FIRST_EXPORT_WEBVIEW);
            this.M = c1045b.c(StartupTimingKeys.FIRST_EXPORT_WEBVIEW);
            this.N = c1045b.b(StartupTimingKeys.FIRST_EXPORT_WEBVIEW_WAIT);
            this.O = c1045b.c(StartupTimingKeys.FIRST_EXPORT_WEBVIEW_WAIT);
            this.P = c1045b.b(StartupTimingKeys.FIRST_AOSP_WEBVIEW);
            this.Q = c1045b.c(StartupTimingKeys.FIRST_AOSP_WEBVIEW);
            this.R = c1045b.b(StartupTimingKeys.FIRST_AOSP_WEBVIEW);
            this.S = c1045b.c(StartupTimingKeys.FIRST_AOSP_WEBVIEW);
            this.T = c1045b.b(StartupTimingKeys.POST_INITIALIZER);
            this.U = c1045b.c(StartupTimingKeys.POST_INITIALIZER);
            this.V = c1045b.b(StartupTimingKeys.POST_CONTINUE_INIT_LIBS);
            this.W = c1045b.c(StartupTimingKeys.POST_CONTINUE_INIT_LIBS);
            this.X = c1045b.b(StartupTimingKeys.POST_UPDATE_START);
            this.Y = c1045b.b(StartupTimingKeys.POST_UPDATE_SUCCESS);
        }

        public final synchronized Map<String, String> a() {
            if (this.Z == null) {
                this.Z = e();
            }
            return this.Z;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes9.dex */
    public static class d extends com.uc.webview.base.task.c {
        boolean c = true;
        C1045b d = null;
        private final String e;
        private final a f;

        public d(String str, a aVar) {
            this.e = str;
            this.f = aVar;
        }

        @Override // com.uc.webview.base.task.c, java.util.concurrent.Callable
        public final /* synthetic */ c.C1036c call() throws Exception {
            return super.call();
        }

        @Override // com.uc.webview.base.task.c
        public final void d() {
            C1045b c1045b;
            if (this.c) {
                e eVar = new e(this.d);
                if (eVar.b == null) {
                    Log.w("u4perf", "no start time");
                    c1045b = null;
                } else {
                    eVar.a(StartupTimingKeys.IS_REUSED);
                    eVar.a(StartupTimingKeys.IS_FIRST_USED);
                    eVar.a(StartupTimingKeys.INTEGRATION_TYPE);
                    eVar.a(StartupTimingKeys.INIT_FAILED_CODE);
                    eVar.a(StartupTimingKeys.INIT_FAILED_MESSAGE);
                    eVar.a(StartupTimingKeys.RE_EXTRACT_COUNT);
                    eVar.a(StartupTimingKeys.UPDATE_FAILED_CODE);
                    eVar.a(StartupTimingKeys.EXTRACTOR_7Z_FAILED_CODE);
                    eVar.a(StartupTimingKeys.DETECT_LIBS_MAYBE_DAMAGED);
                    eVar.a(StartupTimingKeys.USE_PRELOAD_CORE_DEX);
                    eVar.a(StartupTimingKeys.USE_PRELOAD_CORE_SO);
                    eVar.a(StartupTimingKeys.PRELOAD_CORE_DEX_LEAD_TIME);
                    eVar.a(StartupTimingKeys.INITIALIZER, true);
                    eVar.a(StartupTimingKeys.CREATE_RUNNING_CORE_INFO, true);
                    eVar.a(StartupTimingKeys.UPDATE_START, false);
                    eVar.a(StartupTimingKeys.UPDATE_HEAD_VALIDITY, false);
                    eVar.a(StartupTimingKeys.UPDATE_EXISTS, false);
                    eVar.a(StartupTimingKeys.UPDATE_SUCCESS, false);
                    eVar.a(StartupTimingKeys.EXTRACTOR_START, false);
                    eVar.a(StartupTimingKeys.EXTRACTOR_EXISTS, false);
                    eVar.a(StartupTimingKeys.EXTRACTOR_SUCCESS, false);
                    eVar.a(StartupTimingKeys.CONTINUE_INIT_LIBS, false);
                    eVar.a(StartupTimingKeys.LOAD_DEX, true);
                    eVar.a(StartupTimingKeys.INIT_FINISHED, false);
                    eVar.a(StartupTimingKeys.INIT_CORE_FACTORY, true);
                    eVar.a(StartupTimingKeys.LOAD_SO, true);
                    eVar.a(StartupTimingKeys.INIT_CORE_ENGINE, true);
                    eVar.a(StartupTimingKeys.INIT_NATIVE_LIBRARIES, true);
                    eVar.a(StartupTimingKeys.FIRST_EXPORT_WEBVIEW, true);
                    eVar.a(StartupTimingKeys.FIRST_EXPORT_WEBVIEW_WAIT, true);
                    eVar.a(StartupTimingKeys.FIRST_AOSP_WEBVIEW, true);
                    eVar.a(StartupTimingKeys.FIRST_AOSP_WEBVIEW, true);
                    eVar.a(StartupTimingKeys.POST_INITIALIZER, true);
                    eVar.a(StartupTimingKeys.POST_CONTINUE_INIT_LIBS, true);
                    eVar.a(StartupTimingKeys.POST_UPDATE_START, false);
                    eVar.a(StartupTimingKeys.POST_UPDATE_SUCCESS, false);
                    c a2 = eVar.f23995a.a();
                    eVar.f23995a.a("s0", a2.o);
                    eVar.f23995a.a("s1", a2.p);
                    eVar.f23995a.a("s32", a2.p);
                    eVar.f23995a.a("s36", a2.J);
                    eVar.f23995a.a("s35", a2.K);
                    eVar.f23995a.a("ws0", a2.L);
                    eVar.f23995a.a("ws1", a2.M);
                    if (a2.y > 0) {
                        eVar.f23995a.a("sp4", 1L);
                        eVar.f23995a.a("s10", a2.w);
                        eVar.f23995a.a("s11", a2.y);
                    }
                    c1045b = eVar.f23995a;
                }
            } else {
                c1045b = this.d;
            }
            a aVar = this.f;
            if (aVar != null) {
                aVar.a(c1045b);
            }
        }

        @Override // com.uc.webview.base.task.c
        public final String e() {
            return this.e;
        }
    }

    /* loaded from: classes9.dex */
    static class e {

        /* renamed from: a  reason: collision with root package name */
        final C1045b f23995a;
        final a.c b;

        public e(C1045b c1045b) {
            this.f23995a = c1045b == null ? new C1045b() : c1045b;
            this.b = (a.c) com.uc.webview.base.timing.a.a((int) StartupTimingKeys.START);
        }

        private long a(a.c cVar, boolean z) {
            a.c.C1038a c1038a = this.b.f23811a;
            a.c.C1038a c1038a2 = z ? cVar.b : cVar.f23811a;
            if (c1038a == null || c1038a2 == null) {
                return 0L;
            }
            return c1038a2.f23812a - c1038a.f23812a;
        }

        private void b(int i, boolean z) {
            a.c cVar = (a.c) com.uc.webview.base.timing.a.a(i);
            if (cVar == null) {
                return;
            }
            this.f23995a.a(i, a(cVar, z), z);
        }

        final void a(int i) {
            this.f23995a.a(i, (String) com.uc.webview.base.timing.a.a(i));
        }

        final void a(int i, boolean z) {
            if (((a.c) com.uc.webview.base.timing.a.a(i)) == null) {
                return;
            }
            b(i, false);
            if (!z) {
                return;
            }
            b(i, true);
        }
    }

    public static void a(int i, int i2, final ValueCallback<String> valueCallback, UCExtension uCExtension) {
        if (valueCallback == null) {
            return;
        }
        boolean z = false;
        final boolean z2 = i2 == 0;
        final boolean z3 = (i & 1) != 0;
        if (z3 && (i ^ 1) == 0) {
            z = true;
        }
        final a aVar = new a() { // from class: com.uc.webview.internal.stats.b.2
            @Override // com.uc.webview.internal.stats.b.a
            public final void a(C1045b c1045b) {
                ValueCallback valueCallback2;
                String c1045b2;
                if (c1045b == null) {
                    valueCallback2 = valueCallback;
                    c1045b2 = null;
                } else {
                    valueCallback2 = valueCallback;
                    c1045b2 = z2 ? c1045b.toString() : c1045b.b();
                }
                b.a(valueCallback2, c1045b2);
            }
        };
        if (z) {
            a(aVar);
        } else {
            uCExtension.impl().serializeFirstScreenTimings(new ValueCallback<String>() { // from class: com.uc.webview.internal.stats.b.3
                @Override // android.webkit.ValueCallback
                public final /* synthetic */ void onReceiveValue(String str) {
                    String str2 = str;
                    if (StringUtils.isEmpty(str2)) {
                        b.a(valueCallback, str2);
                        return;
                    }
                    d dVar = new d("cmfss", aVar);
                    dVar.c = z3;
                    dVar.d = new C1045b(str2);
                    dVar.a();
                }
            });
        }
    }

    static /* synthetic */ void a(ValueCallback valueCallback, String str) {
        if (valueCallback != null) {
            try {
                valueCallback.onReceiveValue(str);
            } catch (Throwable th) {
                Log.w("u4perf", "doCallback falied", th);
            }
        }
    }

    private static void a(a aVar) {
        new d("cmsus", aVar).a();
    }

    static /* synthetic */ void a(C1045b c1045b) {
        c a2 = c1045b.a();
        if (a2 == null) {
            Log.w("u4perf", "no startup stats");
            return;
        }
        if (Log.a()) {
            StringBuilder sb = new StringBuilder();
            sb.append("sdk_init=");
            sb.append(a2.E - a2.o);
            sb.append(", first_create_webview=");
            sb.append(a2.M - a2.L);
            sb.append(", create_core_info=");
            sb.append(a2.r - a2.q);
            sb.append(", start_init_core=");
            sb.append(a2.z - a2.o);
            sb.append(", load_dex=");
            sb.append(a2.B - a2.A);
            sb.append(", load_so=");
            sb.append(a2.K - a2.J);
            sb.append(", init_native=");
            sb.append(a2.D - a2.C);
            sb.append(", init_core_engine=");
            sb.append(a2.I - a2.H);
            if (a2.y > 0) {
                sb.append(", extract=");
                sb.append(a2.y - a2.w);
            }
            if (a2.v > 0) {
                sb.append(", download=");
                sb.append(a2.v - a2.s);
            }
            if (a2.n > 0) {
                sb.append(", start_to_init=");
                sb.append(a2.n);
            }
            Log.rInfo("u4perf.startup_stats", sb.toString());
        }
        a2.k();
    }

    public static void a(boolean z) {
        if (f23991a.get()) {
            Log.b();
            return;
        }
        if (!z) {
            boolean b = com.uc.webview.base.timing.a.b(StartupTimingKeys.FIRST_EXPORT_WEBVIEW);
            boolean b2 = com.uc.webview.base.timing.a.b(StartupTimingKeys.SDK_INIT_READY);
            if (!b || !b2) {
                Log.d("u4perf", "commitStartup not ready " + b + ", " + b2);
                return;
            }
        }
        if (f23991a.getAndSet(true)) {
            return;
        }
        Log.b();
        a(new a() { // from class: com.uc.webview.internal.stats.b.1
            @Override // com.uc.webview.internal.stats.b.a
            public final void a(C1045b c1045b) {
                b.a(c1045b);
            }
        });
    }
}
