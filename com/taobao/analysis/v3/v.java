package com.taobao.analysis.v3;

import android.content.SharedPreferences;
import mtopsdk.common.util.StringUtils;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.v3.r;
import com.taobao.falco.FalcoLoadActionMonitor;
import com.taobao.falco.FalcoScreenshotMonitor;
import com.taobao.falco.FalcoScreenshotMonitorImpl;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import tb.myq;
import tb.myr;
import tb.mys;
import tb.myt;
import tb.myx;
import tb.myy;
import tb.myz;
import tb.mzm;
import tb.mzo;
import tb.nkw;
import tb.shc;
import tb.slo;
import tb.tgx;
import tb.tij;

/* loaded from: classes.dex */
public class v extends mzo implements r {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_ENV_CPU_REPORT_ENABLE = "env_cpu_report_enable";
    public static final String KEY_ENV_ENABLE = "falco_env_enable";
    public static final String KEY_ENV_INJECT_ENABLE = "env_inject_enable";
    public static final String KEY_ENV_REPORT_LIST = "env_report_whitelist";
    public static final String KEY_EXCEPTION_REPORTER_ENABLE = "falco_exception_reporter_enable";
    public static final String KEY_GC_MONITOR_ENABLE = "falco_gc_monitor_enable";
    public static final String KEY_LOAD_ENABLE = "falco_load_enable";
    public static final String KEY_LOAD_HOOK_ACTIVITY_ENABLE = "load_hook_activity_enable";
    public static final String KEY_LOAD_HOOK_WINDOW_ENABLE = "load_hook_window_enable";
    public static final String KEY_METRICS_SCENE_LIST = "ut_scene_whitelist";
    public static final String KEY_MODULE_LIST = "log_module_whitelist";
    public static final String KEY_SCENE_LIST = "log_scene_whitelist";
    public static final String KEY_SCREEN_SHOT_ENABLE = "screenshot_enable";
    public static final String KEY_SCROLL_GC_MONITOR_ENABLE = "falco_scroll_gc_enable";
    public static final String KEY_V3_ENABLE = "falco_enable";
    public static final String KEY_WEAK_GC_MONITOR_ENABLE = "falco_weak_gc_enable";

    /* renamed from: a  reason: collision with root package name */
    private boolean f8595a;
    private volatile boolean b;
    private CopyOnWriteArrayList<String> c;
    private CopyOnWriteArrayList<String> d;
    private CopyOnWriteArrayList<String> e;
    private j f;
    private s g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private FalcoLoadActionMonitor m;
    private FalcoScreenshotMonitorImpl n;
    private SharedPreferences o;
    private CopyOnWriteArrayList<String> p;
    private boolean q;

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final v f8596a = new v();

        public static /* synthetic */ v a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (v) ipChange.ipc$dispatch("d5f3cb9", new Object[0]) : f8596a;
        }
    }

    public static /* synthetic */ Object ipc$super(v vVar, String str, Object... objArr) {
        if (str.hashCode() == 1026680243) {
            return super.g();
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.mzo
    public /* synthetic */ myq g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (myq) ipChange.ipc$dispatch("3d31e5b3", new Object[]{this}) : f();
    }

    private v() {
        super(new m());
        this.f8595a = true;
        this.h = false;
        this.j = true;
        this.q = true;
        this.l = false;
        this.k = false;
        this.i = false;
        this.b = false;
        this.c = new CopyOnWriteArrayList<>();
        this.d = new CopyOnWriteArrayList<>();
        this.e = new CopyOnWriteArrayList<>();
        this.p = new CopyOnWriteArrayList<>();
    }

    public static v b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (v) ipChange.ipc$dispatch("e0be858", new Object[0]) : a.a();
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        SharedPreferences sharedPreferences = this.o;
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().putBoolean(KEY_V3_ENABLE, z).apply();
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        SharedPreferences sharedPreferences = this.o;
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().putBoolean(KEY_LOAD_ENABLE, z).apply();
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
            return;
        }
        SharedPreferences sharedPreferences = this.o;
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().putBoolean(KEY_LOAD_HOOK_ACTIVITY_ENABLE, z).apply();
    }

    public void g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25ee726", new Object[]{this, new Boolean(z)});
            return;
        }
        SharedPreferences sharedPreferences = this.o;
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().putBoolean(KEY_LOAD_HOOK_WINDOW_ENABLE, z).apply();
    }

    public void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0aa0e87", new Object[]{this, new Boolean(z)});
            return;
        }
        SharedPreferences sharedPreferences = this.o;
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().putBoolean(KEY_ENV_ENABLE, z).apply();
    }

    public void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb017cf9", new Object[]{this, str});
        } else {
            this.p.addAll(g(str));
        }
    }

    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
            return;
        }
        SharedPreferences sharedPreferences = this.o;
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().putBoolean(KEY_ENV_INJECT_ENABLE, z).apply();
    }

    public void h(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b413bfc5", new Object[]{this, new Boolean(z)});
            return;
        }
        SharedPreferences sharedPreferences = this.o;
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().putBoolean(KEY_ENV_CPU_REPORT_ENABLE, z).apply();
    }

    public void i(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5c89864", new Object[]{this, new Boolean(z)});
            return;
        }
        SharedPreferences sharedPreferences = this.o;
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().putBoolean(KEY_EXCEPTION_REPORTER_ENABLE, z).apply();
    }

    public void j(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b77d7103", new Object[]{this, new Boolean(z)});
            return;
        }
        SharedPreferences sharedPreferences = this.o;
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().putBoolean(KEY_GC_MONITOR_ENABLE, z).apply();
    }

    public void k(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b93249a2", new Object[]{this, new Boolean(z)});
            return;
        }
        SharedPreferences sharedPreferences = this.o;
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().putBoolean(KEY_SCROLL_GC_MONITOR_ENABLE, z).apply();
    }

    public void l(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bae72241", new Object[]{this, new Boolean(z)});
            return;
        }
        SharedPreferences sharedPreferences = this.o;
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().putBoolean(KEY_WEAK_GC_MONITOR_ENABLE, z).apply();
    }

    public void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef535e8", new Object[]{this, new Boolean(z)});
            return;
        }
        SharedPreferences sharedPreferences = this.o;
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().putBoolean(KEY_SCREEN_SHOT_ENABLE, z).apply();
    }

    public void b(String str, String str2) {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
        } else if (StringUtils.isEmpty(str) || (sharedPreferences = this.o) == null) {
        } else {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            if (!StringUtils.isEmpty(str2)) {
                edit.putString(str, str2).apply();
            } else {
                edit.remove(str).apply();
            }
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        SharedPreferences sharedPreferences = this.o;
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().remove(KEY_V3_ENABLE).apply();
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        SharedPreferences sharedPreferences = this.o;
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().remove(KEY_LOAD_ENABLE).apply();
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        SharedPreferences sharedPreferences = this.o;
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().remove(KEY_LOAD_HOOK_ACTIVITY_ENABLE).apply();
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
            return;
        }
        SharedPreferences sharedPreferences = this.o;
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().remove(KEY_LOAD_HOOK_WINDOW_ENABLE).apply();
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        SharedPreferences sharedPreferences = this.o;
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().remove(KEY_ENV_ENABLE).apply();
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        SharedPreferences sharedPreferences = this.o;
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().remove(KEY_ENV_INJECT_ENABLE).apply();
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
            return;
        }
        SharedPreferences sharedPreferences = this.o;
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().remove(KEY_ENV_CPU_REPORT_ENABLE).apply();
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
            return;
        }
        SharedPreferences sharedPreferences = this.o;
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().remove(KEY_EXCEPTION_REPORTER_ENABLE).apply();
    }

    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
            return;
        }
        SharedPreferences sharedPreferences = this.o;
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().remove(KEY_GC_MONITOR_ENABLE).apply();
    }

    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6782afb", new Object[]{this});
            return;
        }
        SharedPreferences sharedPreferences = this.o;
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().remove(KEY_SCROLL_GC_MONITOR_ENABLE).apply();
    }

    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686427c", new Object[]{this});
            return;
        }
        SharedPreferences sharedPreferences = this.o;
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().remove(KEY_WEAK_GC_MONITOR_ENABLE).apply();
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        SharedPreferences sharedPreferences = this.o;
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().remove(KEY_SCREEN_SHOT_ENABLE).apply();
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.c.addAll(g(str));
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.d.addAll(g(str));
        }
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else {
            this.e.addAll(g(str));
        }
    }

    public boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d23b17f9", new Object[]{this, str})).booleanValue();
        }
        if (!StringUtils.isEmpty(str) && this.d.size() > 0) {
            return this.d.contains(str);
        }
        return false;
    }

    public boolean e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c6cb13a", new Object[]{this, str})).booleanValue();
        }
        if (!StringUtils.isEmpty(str) && this.c.size() > 0) {
            return this.c.contains(str);
        }
        return false;
    }

    private CopyOnWriteArrayList<String> g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CopyOnWriteArrayList) ipChange.ipc$dispatch("4bd960e5", new Object[]{this, str});
        }
        CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        if (StringUtils.isEmpty(str)) {
            return copyOnWriteArrayList;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                String string = jSONArray.getString(i);
                if (!string.isEmpty()) {
                    copyOnWriteArrayList.add(string);
                }
            }
        } catch (Exception e) {
            ALog.e("falco.Tracer", "parse failed", null, e, new Object[0]);
        }
        return copyOnWriteArrayList;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            a(i.a());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0125 A[Catch: all -> 0x01ee, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0009, B:8:0x0017, B:15:0x0021, B:17:0x003d, B:19:0x0043, B:22:0x0050, B:26:0x0066, B:28:0x00d3, B:31:0x010a, B:33:0x0115, B:38:0x011f, B:40:0x0125, B:42:0x013b, B:47:0x0145, B:49:0x0150, B:54:0x015a, B:56:0x0163, B:61:0x016d, B:63:0x0176, B:68:0x0180, B:69:0x0197, B:71:0x01d0, B:72:0x01e7, B:30:0x00d9, B:23:0x0053), top: B:78:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0163 A[Catch: all -> 0x01ee, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0009, B:8:0x0017, B:15:0x0021, B:17:0x003d, B:19:0x0043, B:22:0x0050, B:26:0x0066, B:28:0x00d3, B:31:0x010a, B:33:0x0115, B:38:0x011f, B:40:0x0125, B:42:0x013b, B:47:0x0145, B:49:0x0150, B:54:0x015a, B:56:0x0163, B:61:0x016d, B:63:0x0176, B:68:0x0180, B:69:0x0197, B:71:0x01d0, B:72:0x01e7, B:30:0x00d9, B:23:0x0053), top: B:78:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0176 A[Catch: all -> 0x01ee, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0009, B:8:0x0017, B:15:0x0021, B:17:0x003d, B:19:0x0043, B:22:0x0050, B:26:0x0066, B:28:0x00d3, B:31:0x010a, B:33:0x0115, B:38:0x011f, B:40:0x0125, B:42:0x013b, B:47:0x0145, B:49:0x0150, B:54:0x015a, B:56:0x0163, B:61:0x016d, B:63:0x0176, B:68:0x0180, B:69:0x0197, B:71:0x01d0, B:72:0x01e7, B:30:0x00d9, B:23:0x0053), top: B:78:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01d0 A[Catch: all -> 0x01ee, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0009, B:8:0x0017, B:15:0x0021, B:17:0x003d, B:19:0x0043, B:22:0x0050, B:26:0x0066, B:28:0x00d3, B:31:0x010a, B:33:0x0115, B:38:0x011f, B:40:0x0125, B:42:0x013b, B:47:0x0145, B:49:0x0150, B:54:0x015a, B:56:0x0163, B:61:0x016d, B:63:0x0176, B:68:0x0180, B:69:0x0197, B:71:0x01d0, B:72:0x01e7, B:30:0x00d9, B:23:0x0053), top: B:78:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void a(android.content.Context r11) {
        /*
            Method dump skipped, instructions count: 497
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.analysis.v3.v.a(android.content.Context):void");
    }

    public s e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (s) ipChange.ipc$dispatch("1011ead8", new Object[]{this}) : this.g;
    }

    @Override // com.taobao.analysis.v3.r
    public r.a a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (r.a) ipChange.ipc$dispatch("1a1da90c", new Object[]{this, str, str2}) : new b(str, str2);
    }

    @Override // com.taobao.analysis.v3.r
    public Map<String, String> a(mys mysVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("726a35a6", new Object[]{this, mysVar});
        }
        HashMap hashMap = new HashMap();
        a(mysVar, myx.a.TEXT_MAP, new myz(hashMap));
        return hashMap;
    }

    @Override // com.taobao.analysis.v3.r
    public mys a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (mys) ipChange.ipc$dispatch("24b37a62", new Object[]{this, map}) : a((myx<myx<myy>>) myx.a.TEXT_MAP, (myx<myy>) new myz(map));
    }

    public l f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (l) ipChange.ipc$dispatch("10be959e", new Object[]{this}) : (l) super.g();
    }

    public void a(j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d5155ff", new Object[]{this, jVar});
        } else {
            this.f = jVar;
        }
    }

    @Override // com.taobao.analysis.v3.r
    public j a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (j) ipChange.ipc$dispatch("d5f3b45", new Object[]{this}) : this.f;
    }

    @Override // com.taobao.analysis.v3.r
    public shc h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (shc) ipChange.ipc$dispatch("44e603c9", new Object[]{this});
        }
        FalcoLoadActionMonitor falcoLoadActionMonitor = this.m;
        if (falcoLoadActionMonitor == null) {
            return null;
        }
        return falcoLoadActionMonitor.a();
    }

    @Override // com.taobao.analysis.v3.r
    public void a(shc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3649910d", new Object[]{this, aVar});
            return;
        }
        FalcoLoadActionMonitor falcoLoadActionMonitor = this.m;
        if (falcoLoadActionMonitor == null) {
            return;
        }
        falcoLoadActionMonitor.a(aVar);
    }

    @Override // com.taobao.analysis.v3.r
    public void a(tgx.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d1a47b6", new Object[]{this, aVar});
            return;
        }
        FalcoLoadActionMonitor falcoLoadActionMonitor = this.m;
        if (falcoLoadActionMonitor == null) {
            return;
        }
        falcoLoadActionMonitor.a(aVar);
    }

    @Override // com.taobao.analysis.v3.r
    public tgx l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tgx) ipChange.ipc$dispatch("63ad0c6e", new Object[]{this});
        }
        FalcoLoadActionMonitor falcoLoadActionMonitor = this.m;
        if (falcoLoadActionMonitor == null) {
            return null;
        }
        return falcoLoadActionMonitor.b();
    }

    @Override // com.taobao.analysis.v3.r
    public FalcoExceptionReporter o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FalcoExceptionReporter) ipChange.ipc$dispatch("22d340c2", new Object[]{this}) : new nkw();
    }

    public FalcoScreenshotMonitor v() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FalcoScreenshotMonitor) ipChange.ipc$dispatch("fa75bc72", new Object[]{this}) : this.n;
    }

    public boolean i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4533163e", new Object[]{this, str})).booleanValue();
        }
        if (!StringUtils.isEmpty(str)) {
            return this.p.contains(str);
        }
        return false;
    }

    public boolean f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("669e4a7b", new Object[]{this, str})).booleanValue();
        }
        if (!StringUtils.isEmpty(str)) {
            return this.e.contains(str);
        }
        return false;
    }

    /* loaded from: classes.dex */
    public class b extends mzo.a implements r.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f8597a;
        public String b;

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            switch (str.hashCode()) {
                case 390728175:
                    return super.b((mys) objArr[0]);
                case 684131182:
                    return super.b((myr) objArr[0]);
                case 1105112485:
                    return super.b((String) objArr[0], (mys) objArr[1]);
                case 1114828742:
                    return super.b(((Number) objArr[0]).longValue());
                default:
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
        }

        @Override // tb.mzo.a
        public /* synthetic */ myt.a b(long j) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (myt.a) ipChange.ipc$dispatch("4272efc6", new Object[]{this, new Long(j)}) : a(j);
        }

        @Override // tb.mzo.a
        public /* synthetic */ myt.a b(String str, mys mysVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (myt.a) ipChange.ipc$dispatch("41deada5", new Object[]{this, str, mysVar}) : a(str, mysVar);
        }

        @Override // tb.mzo.a
        public /* synthetic */ myt.a b(myr myrVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (myt.a) ipChange.ipc$dispatch("28c7036e", new Object[]{this, myrVar}) : a(myrVar);
        }

        @Override // tb.mzo.a, com.taobao.analysis.v3.r.a
        public /* synthetic */ myt.a b(mys mysVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (myt.a) ipChange.ipc$dispatch("174a09ef", new Object[]{this, mysVar}) : a(mysVar);
        }

        public b(String str, String str2) {
            super(str2);
            this.b = str2;
            this.f8597a = str;
        }

        @Override // com.taobao.analysis.v3.r.a
        public f a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (f) ipChange.ipc$dispatch("d5f3ac9", new Object[]{this});
            }
            long h = h();
            if (h() <= 0) {
                h = mzm.n();
            }
            j();
            return new com.taobao.analysis.v3.a(v.this, this.b, this.f8597a, h, g(), f());
        }

        @Override // com.taobao.analysis.v3.r.a
        public h b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (h) ipChange.ipc$dispatch("e0be6a6", new Object[]{this});
            }
            long h = h();
            if (h() <= 0) {
                h = mzm.n();
            }
            j();
            return new c(v.this, this.b, this.f8597a, h, g(), f());
        }

        @Override // com.taobao.analysis.v3.r.a
        public g c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (g) ipChange.ipc$dispatch("eb89226", new Object[]{this});
            }
            long h = h();
            if (h() <= 0) {
                h = mzm.n();
            }
            j();
            return new com.taobao.analysis.v3.b(v.this, this.b, this.f8597a, h, g(), f());
        }

        @Override // com.taobao.analysis.v3.r.a
        public k d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (k) ipChange.ipc$dispatch("f653e41", new Object[]{this});
            }
            long h = h();
            if (h() <= 0) {
                h = mzm.n();
            }
            j();
            return new t(v.this, this.b, this.f8597a, h, g(), f());
        }

        @Override // com.taobao.analysis.v3.r.a
        public shc av_() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (shc) ipChange.ipc$dispatch("85159827", new Object[]{this});
            }
            long h = h();
            if (h() <= 0) {
                h = mzm.n();
            }
            j();
            return new slo(v.this, this.b, this.f8597a, h, g(), f());
        }

        @Override // com.taobao.analysis.v3.r.a
        public tgx aw_() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (tgx) ipChange.ipc$dispatch("739911d1", new Object[]{this});
            }
            long h = h();
            if (h() <= 0) {
                h = mzm.n();
            }
            j();
            return new tij(v.this, this.b, this.f8597a, h, g(), f());
        }

        public r.a a(String str, mys mysVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (r.a) ipChange.ipc$dispatch("5648bc2d", new Object[]{this, str, mysVar}) : (r.a) super.b(str, mysVar);
        }

        @Override // com.taobao.analysis.v3.r.a
        public r.a a(myr myrVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (r.a) ipChange.ipc$dispatch("963bb7f6", new Object[]{this, myrVar}) : (r.a) super.b(myrVar);
        }

        @Override // com.taobao.analysis.v3.r.a
        public r.a a(mys mysVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (r.a) ipChange.ipc$dispatch("ab248037", new Object[]{this, mysVar}) : (r.a) super.b(mysVar);
        }

        @Override // com.taobao.analysis.v3.r.a
        public r.a a(long j) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (r.a) ipChange.ipc$dispatch("591c732c", new Object[]{this, new Long(j)}) : (r.a) super.b(j);
        }

        @Override // com.taobao.analysis.v3.r.a
        public n e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (n) ipChange.ipc$dispatch("1011ea3d", new Object[]{this});
            }
            long h = h();
            if (h() <= 0) {
                h = mzm.n();
            }
            j();
            return new o(v.this, this.b, this.f8597a, h, g(), f(), "");
        }

        private void j() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            } else if (!f().isEmpty() || i() || v.this.f().a() == null) {
            } else {
                a(v.this.f().a());
            }
        }
    }
}
