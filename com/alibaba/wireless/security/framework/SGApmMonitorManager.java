package com.alibaba.wireless.security.framework;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import mtopsdk.common.util.StringUtils;
import android.util.Base64;
import android.util.Log;
import com.alibaba.ariver.kernel.RVStartParams;
import com.alibaba.wireless.security.framework.utils.UserTrackMethodJniBridge;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.Constants;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes.dex */
public class SGApmMonitorManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static volatile SGApmMonitorManager q = null;
    private static boolean r = false;
    private static int s = 5000;
    private static ScheduledExecutorService t;
    private static ScheduledExecutorService u;
    private static JSONObject v;
    private static long w;
    private com.alibaba.wireless.security.framework.d e;

    /* renamed from: a  reason: collision with root package name */
    private ConcurrentHashMap<String, Number> f4263a = new ConcurrentHashMap<>();
    private ConcurrentHashMap<String, Number> b = new ConcurrentHashMap<>();
    private volatile int c = 0;
    private Context d = null;
    private String f = null;
    private volatile boolean g = false;
    private boolean h = false;
    private int i = 0;
    private boolean j = true;
    private long k = 0;
    private long l = 0;
    private long m = 0;
    private long n = 0;
    private boolean o = false;
    private String p = null;

    /* loaded from: classes.dex */
    public class a implements Application.ActivityLifecycleCallbacks {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(642684010);
            kge.a(-1894394539);
        }

        public a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
                return;
            }
            SGApmMonitorManager.b(SGApmMonitorManager.this);
            if (SGApmMonitorManager.a(SGApmMonitorManager.this) != 1) {
                return;
            }
            SGApmMonitorManager.a(SGApmMonitorManager.this, true);
            if (SGApmMonitorManager.j(SGApmMonitorManager.this) > 0) {
                SGApmMonitorManager sGApmMonitorManager = SGApmMonitorManager.this;
                SGApmMonitorManager.b(sGApmMonitorManager, SGApmMonitorManager.m(sGApmMonitorManager) + (System.currentTimeMillis() - SGApmMonitorManager.j(SGApmMonitorManager.this)));
            }
            SGApmMonitorManager.c(SGApmMonitorManager.this, System.currentTimeMillis());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
                return;
            }
            SGApmMonitorManager.c(SGApmMonitorManager.this);
            if (SGApmMonitorManager.a(SGApmMonitorManager.this) != 0) {
                return;
            }
            SGApmMonitorManager.a(SGApmMonitorManager.this, false);
            if (SGApmMonitorManager.n(SGApmMonitorManager.this) == 0) {
                SGApmMonitorManager.c(SGApmMonitorManager.this, SGApmMonitorManager.e());
            }
            SGApmMonitorManager sGApmMonitorManager = SGApmMonitorManager.this;
            SGApmMonitorManager.d(sGApmMonitorManager, SGApmMonitorManager.o(sGApmMonitorManager) + (System.currentTimeMillis() - SGApmMonitorManager.n(SGApmMonitorManager.this)));
            SGApmMonitorManager.a(SGApmMonitorManager.this, System.currentTimeMillis());
        }
    }

    /* loaded from: classes.dex */
    public class b implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(642684011);
            kge.a(-1938806936);
        }

        public b(SGApmMonitorManager sGApmMonitorManager) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable}) : new Thread(runnable, "SGApmMonitor-1");
        }
    }

    /* loaded from: classes.dex */
    public class c implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(642684012);
            kge.a(-1938806936);
        }

        public c(SGApmMonitorManager sGApmMonitorManager) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable}) : new Thread(runnable, "SGApmMonitor-2");
        }
    }

    /* loaded from: classes.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(642684013);
            kge.a(-1390502639);
        }

        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                SGApmMonitorManager.p(SGApmMonitorManager.this);
            }
        }
    }

    /* loaded from: classes.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(642684014);
            kge.a(-1390502639);
        }

        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                SGApmMonitorManager.q(SGApmMonitorManager.this);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f4267a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        static {
            kge.a(642684015);
            kge.a(-1390502639);
        }

        public f(boolean z, String str, String str2) {
            this.f4267a = z;
            this.b = str;
            this.c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            String r = SGApmMonitorManager.r(SGApmMonitorManager.this);
            String d = SGApmMonitorManager.d(SGApmMonitorManager.this);
            UserTrackMethodJniBridge.addUtRecord("100171", 0, 1, r, 0L, null, d, "" + this.f4267a, this.b, this.c);
        }
    }

    /* loaded from: classes3.dex */
    public class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f4268a;

        static {
            kge.a(642684016);
            kge.a(-1390502639);
        }

        public g(String str, int i) {
            this.f4268a = Base64.encodeToString(SGApmMonitorManager.a(SGApmMonitorManager.this, str, i).getBytes(), 2);
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            String str = this.f4268a;
            if (str == null) {
                return;
            }
            SGApmMonitorManager.a(SGApmMonitorManager.this, str);
        }
    }

    /* loaded from: classes.dex */
    public class h implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* loaded from: classes3.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            static {
                kge.a(-855949074);
                kge.a(-1390502639);
            }

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                SGApmMonitorManager.b(SGApmMonitorManager.this, false);
                SGApmMonitorManager.a((JSONObject) null);
                SGApmMonitorManager.d().shutdown();
                SGApmMonitorManager.c().shutdown();
            }
        }

        static {
            kge.a(642684017);
            kge.a(-1390502639);
        }

        public h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (SGApmMonitorManager.k(SGApmMonitorManager.this)) {
                SGApmMonitorManager.c().submit(new g(RVStartParams.TRANSPARENT_TITLE_ALWAYS, 1));
            }
            if (SGApmMonitorManager.h(SGApmMonitorManager.this) == 0 && SGApmMonitorManager.this.isAllPluginLoaded()) {
                SGApmMonitorManager.l(SGApmMonitorManager.this);
            }
            SGApmMonitorManager.c().schedule(new a(), 20L, TimeUnit.SECONDS);
        }
    }

    /* loaded from: classes.dex */
    public class i implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f4271a;
        private int b;
        private int c;

        /* loaded from: classes3.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            static {
                kge.a(-855948113);
                kge.a(-1390502639);
            }

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    SGApmMonitorManager.g(SGApmMonitorManager.this);
                }
            }
        }

        static {
            kge.a(642684018);
            kge.a(-1390502639);
        }

        public i(String str, int i, int i2) {
            this.f4271a = str;
            this.b = i;
            this.c = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.f4271a == null || !SGApmMonitorManager.e(SGApmMonitorManager.this) || SGApmMonitorManager.b() == null || this.b > 5 || StringUtils.equals("1004", this.f4271a)) {
            } else {
                if (StringUtils.equals(com.alibaba.ut.abtest.internal.util.b.TRACK_PAGE_COUNTER_TYPE_PLUGIN, this.f4271a) && this.b == 1) {
                    return;
                }
                try {
                    if (((Number) SGApmMonitorManager.f(SGApmMonitorManager.this).get(this.f4271a)) != null) {
                        if (this.b <= 1) {
                            return;
                        }
                        ScheduledExecutorService c = SGApmMonitorManager.c();
                        SGApmMonitorManager sGApmMonitorManager = SGApmMonitorManager.this;
                        c.submit(new g(this.f4271a + "_s", this.b));
                        return;
                    }
                    SGApmMonitorManager.c().submit(new a());
                    ScheduledExecutorService c2 = SGApmMonitorManager.c();
                    SGApmMonitorManager sGApmMonitorManager2 = SGApmMonitorManager.this;
                    c2.submit(new g(this.f4271a + "_f", this.b));
                    synchronized (SGApmMonitorManager.class) {
                        SGApmMonitorManager.i(SGApmMonitorManager.this);
                    }
                    SGApmMonitorManager.d().schedule(new i(this.f4271a, this.b + 1, this.c), this.c, TimeUnit.MILLISECONDS);
                } catch (Exception unused) {
                }
            }
        }
    }

    static {
        kge.a(1243125485);
        v = new JSONObject();
    }

    public static /* synthetic */ int a(SGApmMonitorManager sGApmMonitorManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e5b24abf", new Object[]{sGApmMonitorManager})).intValue() : sGApmMonitorManager.i;
    }

    public static /* synthetic */ long a(SGApmMonitorManager sGApmMonitorManager, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d097856c", new Object[]{sGApmMonitorManager, new Long(j)})).longValue();
        }
        sGApmMonitorManager.n = j;
        return j;
    }

    private String a(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{this, context});
        }
        int myPid = Process.myPid();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            return null;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == myPid) {
                return runningAppProcessInfo.processName;
            }
        }
        return null;
    }

    public static /* synthetic */ String a(SGApmMonitorManager sGApmMonitorManager, String str, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8eb36813", new Object[]{sGApmMonitorManager, str, new Integer(i2)}) : sGApmMonitorManager.a(str, i2);
    }

    private String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        Context context = this.d;
        if (context == null) {
            return null;
        }
        try {
            return this.d.getResources().getString(context.getResources().getIdentifier(str, "string", this.d.getPackageName()));
        } catch (Exception unused) {
            return null;
        }
    }

    private String a(String str, int i2) {
        String str2 = "";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("75f5ebaf", new Object[]{this, str, new Integer(i2)});
        }
        String packageName = this.d.getPackageName();
        try {
            str2 = this.d.getPackageManager().getPackageInfo(packageName, 0).versionName;
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e("SGApmMonitor", str2, e2);
        }
        long j = this.k;
        long j2 = this.m;
        if (this.l == 0) {
            this.l = w;
        }
        if (this.j) {
            j += System.currentTimeMillis() - this.l;
        } else if (this.n > 0) {
            j2 += System.currentTimeMillis() - this.n;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("utdid", j());
            jSONObject.put("sysver", Build.VERSION.RELEASE);
            jSONObject.put("model", Build.MODEL);
            jSONObject.put("brand", Build.BRAND);
            jSONObject.put("reason", str);
            jSONObject.put("wsv", this.f);
            jSONObject.put("wsd", k());
            jSONObject.put("foreground", this.j);
            jSONObject.put("foregroundtime", j);
            jSONObject.put("backgroundtime", j2);
            jSONObject.put("fulltrack", this.o);
            jSONObject.put("sample", this.h);
            jSONObject.put("tryround", i2);
            jSONObject.put("initts", w);
            jSONObject.put("timestamp", System.currentTimeMillis());
            jSONObject.put("appver", str2);
            jSONObject.put("pkgname", packageName);
            jSONObject.put(MspDBHelper.BizEntry.COLUMN_NAME_PID, Process.myPid());
            jSONObject.put("process", a(this.d));
            jSONObject.put("tracklog", v);
            jSONObject.put("avgcostlog", c((String) this.e.getRouter().doCommand(11155, new Object[0])));
            jSONObject.put("costlog", a(this.b));
            jSONObject.put("nt", this.e.getRouter().doCommand(11154, new Object[0]));
        } catch (Exception unused) {
        }
        return jSONObject.toString();
    }

    private JSONObject a(ConcurrentHashMap<String, Number> concurrentHashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("649f8126", new Object[]{this, concurrentHashMap});
        }
        try {
            ArrayList<String> arrayList = new ArrayList(concurrentHashMap.keySet());
            Collections.sort(arrayList);
            JSONObject jSONObject = new JSONObject();
            for (String str : arrayList) {
                jSONObject.put(str, concurrentHashMap.get(str));
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public static /* synthetic */ JSONObject a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("bff20044", new Object[]{jSONObject});
        }
        v = jSONObject;
        return jSONObject;
    }

    public static /* synthetic */ void a(SGApmMonitorManager sGApmMonitorManager, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43fed996", new Object[]{sGApmMonitorManager, str});
        } else {
            sGApmMonitorManager.b(str);
        }
    }

    private void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        try {
            if (!StringUtils.equals(str2, "7L2OvtRdxzOJAe7ImU+4I2bAxvq1oDLyTCzRgSPGufNIb7ZY5FsHDFaEzD98Mn7K")) {
                return;
            }
            boolean delete = new File(b(this.d), "init.config").delete();
            this.e.a(k());
            u.schedule(new f(delete, str, str2), 5L, TimeUnit.SECONDS);
        } catch (Exception unused) {
        }
    }

    private boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        if (n()) {
            return true;
        }
        double d2 = 0.001d;
        File b2 = b(this.d);
        File file = new File(b2, "." + i());
        if (file.exists()) {
            String a2 = com.alibaba.wireless.security.framework.utils.a.a(file);
            try {
                if (!StringUtils.isEmpty(a2)) {
                    d2 = Double.parseDouble(a2);
                }
            } catch (Exception unused) {
            }
        }
        return new Random().nextDouble() < d2;
    }

    public static /* synthetic */ boolean a(SGApmMonitorManager sGApmMonitorManager, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d097c18c", new Object[]{sGApmMonitorManager, new Boolean(z)})).booleanValue();
        }
        sGApmMonitorManager.j = z;
        return z;
    }

    public static /* synthetic */ int b(SGApmMonitorManager sGApmMonitorManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fe1d2de", new Object[]{sGApmMonitorManager})).intValue();
        }
        int i2 = sGApmMonitorManager.i;
        sGApmMonitorManager.i = i2 + 1;
        return i2;
    }

    public static /* synthetic */ long b(SGApmMonitorManager sGApmMonitorManager, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ac59012d", new Object[]{sGApmMonitorManager, new Long(j)})).longValue();
        }
        sGApmMonitorManager.m = j;
        return j;
    }

    private File b(Context context) {
        String str;
        File dir;
        String str2;
        File file;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("5755eb6e", new Object[]{this, context});
        }
        if (context == null) {
            return null;
        }
        try {
            str2 = context.getApplicationInfo().sourceDir;
        } catch (Throwable unused) {
        }
        if (str2 != null) {
            if (new File(str2).exists()) {
                str = (file.lastModified() / 1000) + "";
                if (str != null || (dir = context.getDir("SGLib", 0)) == null) {
                    return null;
                }
                return new File(dir, "app_" + str);
            }
        }
        str = null;
        if (str != null) {
            return null;
        }
        return new File(dir, "app_" + str);
    }

    public static /* synthetic */ JSONObject b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("ed42e657", new Object[0]) : v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0111 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x011b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010e  */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.io.OutputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void b(java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.wireless.security.framework.SGApmMonitorManager.b(java.lang.String):void");
    }

    public static /* synthetic */ boolean b(SGApmMonitorManager sGApmMonitorManager, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac593d4d", new Object[]{sGApmMonitorManager, new Boolean(z)})).booleanValue();
        }
        sGApmMonitorManager.g = z;
        return z;
    }

    public static /* synthetic */ int c(SGApmMonitorManager sGApmMonitorManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ba115afd", new Object[]{sGApmMonitorManager})).intValue();
        }
        int i2 = sGApmMonitorManager.i;
        sGApmMonitorManager.i = i2 - 1;
        return i2;
    }

    public static /* synthetic */ long c(SGApmMonitorManager sGApmMonitorManager, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("881a7cee", new Object[]{sGApmMonitorManager, new Long(j)})).longValue();
        }
        sGApmMonitorManager.l = j;
        return j;
    }

    public static /* synthetic */ ScheduledExecutorService c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScheduledExecutorService) ipChange.ipc$dispatch("161a80e", new Object[0]) : u;
    }

    private JSONObject c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f9db8da2", new Object[]{this, str});
        }
        JSONObject jSONObject = new JSONObject();
        if (str == null) {
            return jSONObject;
        }
        try {
            return new JSONObject(str);
        } catch (JSONException unused) {
            return jSONObject;
        }
    }

    private void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f76bb9e", new Object[]{this, context});
            return;
        }
        if (!(context instanceof Application)) {
            context = context.getApplicationContext();
        }
        ((Application) context).registerActivityLifecycleCallbacks(new a());
    }

    public static /* synthetic */ long d(SGApmMonitorManager sGApmMonitorManager, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("63dbf8af", new Object[]{sGApmMonitorManager, new Long(j)})).longValue();
        }
        sGApmMonitorManager.k = j;
        return j;
    }

    public static /* synthetic */ String d(SGApmMonitorManager sGApmMonitorManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3d8a897", new Object[]{sGApmMonitorManager}) : sGApmMonitorManager.p;
    }

    public static /* synthetic */ ScheduledExecutorService d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScheduledExecutorService) ipChange.ipc$dispatch("44ecc5cf", new Object[0]) : t;
    }

    public static /* synthetic */ long e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca60", new Object[0])).longValue() : w;
    }

    public static /* synthetic */ boolean e(SGApmMonitorManager sGApmMonitorManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8e706b4c", new Object[]{sGApmMonitorManager})).booleanValue() : sGApmMonitorManager.g;
    }

    public static /* synthetic */ ConcurrentHashMap f(SGApmMonitorManager sGApmMonitorManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConcurrentHashMap) ipChange.ipc$dispatch("13ce869f", new Object[]{sGApmMonitorManager}) : sGApmMonitorManager.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void f() {
        /*
            r12 = this;
            java.lang.String r0 = "securityguard_orange_namespace"
            boolean r1 = r12.m()
            java.lang.String r2 = "1"
            if (r1 == 0) goto Ld
            r1 = r2
            goto Lf
        Ld:
            java.lang.String r1 = "0"
        Lf:
            java.lang.String r3 = "com.alibaba.wireless.security.open.securityguardaccsadapter.OrangeListener"
            r4 = 0
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> L55
            if (r3 == 0) goto L55
            java.lang.String r5 = "getOrangeConfig"
            r6 = 3
            java.lang.Class[] r7 = new java.lang.Class[r6]     // Catch: java.lang.Throwable -> L55
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r9 = 0
            r7[r9] = r8     // Catch: java.lang.Throwable -> L55
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r10 = 1
            r7[r10] = r8     // Catch: java.lang.Throwable -> L55
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r11 = 2
            r7[r11] = r8     // Catch: java.lang.Throwable -> L55
            java.lang.reflect.Method r5 = r3.getMethod(r5, r7)     // Catch: java.lang.Throwable -> L55
            if (r5 == 0) goto L55
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L55
            r7[r9] = r0     // Catch: java.lang.Throwable -> L55
            java.lang.String r8 = "128"
            r7[r10] = r8     // Catch: java.lang.Throwable -> L55
            r7[r11] = r1     // Catch: java.lang.Throwable -> L55
            java.lang.Object r1 = r5.invoke(r3, r7)     // Catch: java.lang.Throwable -> L55
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L55
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L56
            r6[r9] = r0     // Catch: java.lang.Throwable -> L56
            java.lang.String r0 = "129"
            r6[r10] = r0     // Catch: java.lang.Throwable -> L56
            r6[r11] = r2     // Catch: java.lang.Throwable -> L56
            java.lang.Object r0 = r5.invoke(r3, r6)     // Catch: java.lang.Throwable -> L56
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L56
            r4 = r0
            goto L56
        L55:
            r1 = r4
        L56:
            java.io.File r0 = new java.io.File     // Catch: java.lang.Exception -> Lc0
            android.content.Context r3 = r12.d     // Catch: java.lang.Exception -> Lc0
            java.io.File r3 = r12.b(r3)     // Catch: java.lang.Exception -> Lc0
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lc0
            r5.<init>()     // Catch: java.lang.Exception -> Lc0
            java.lang.String r6 = ".pma_"
            r5.append(r6)     // Catch: java.lang.Exception -> Lc0
            java.lang.String r6 = r12.i()     // Catch: java.lang.Exception -> Lc0
            r5.append(r6)     // Catch: java.lang.Exception -> Lc0
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> Lc0
            r0.<init>(r3, r5)     // Catch: java.lang.Exception -> Lc0
            boolean r3 = r0.exists()     // Catch: java.lang.Exception -> Lc0
            boolean r1 = r2.equals(r1)     // Catch: java.lang.Exception -> Lc0
            if (r1 == 0) goto L86
            if (r3 != 0) goto L8b
            r0.createNewFile()     // Catch: java.lang.Exception -> Lc0
            goto L8b
        L86:
            if (r3 == 0) goto L8b
            r0.delete()     // Catch: java.lang.Exception -> Lc0
        L8b:
            java.io.File r0 = new java.io.File     // Catch: java.lang.Exception -> Lc0
            android.content.Context r1 = r12.d     // Catch: java.lang.Exception -> Lc0
            java.io.File r1 = r12.b(r1)     // Catch: java.lang.Exception -> Lc0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lc0
            r3.<init>()     // Catch: java.lang.Exception -> Lc0
            java.lang.String r5 = ".istbg_"
            r3.append(r5)     // Catch: java.lang.Exception -> Lc0
            java.lang.String r5 = r12.i()     // Catch: java.lang.Exception -> Lc0
            r3.append(r5)     // Catch: java.lang.Exception -> Lc0
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> Lc0
            r0.<init>(r1, r3)     // Catch: java.lang.Exception -> Lc0
            boolean r1 = r0.exists()     // Catch: java.lang.Exception -> Lc0
            boolean r2 = r2.equals(r4)     // Catch: java.lang.Exception -> Lc0
            if (r2 == 0) goto Lbb
            if (r1 != 0) goto Lc0
            r0.createNewFile()     // Catch: java.lang.Exception -> Lc0
            goto Lc0
        Lbb:
            if (r1 == 0) goto Lc0
            r0.delete()     // Catch: java.lang.Exception -> Lc0
        Lc0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.wireless.security.framework.SGApmMonitorManager.f():void");
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        Context context = this.d;
        if (context == null) {
            return;
        }
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences("sgloadfailed", 0);
            int i2 = sharedPreferences.getInt(Constants.KEY_TIMES, 0);
            if (i2 > 5) {
                File file = new File(this.d.getDir("SGLib", 0), ".nt");
                if (file.exists()) {
                    file.delete();
                }
            } else {
                sharedPreferences.edit().putInt(Constants.KEY_TIMES, i2 + 1).commit();
            }
        } catch (Exception unused) {
        }
    }

    public static /* synthetic */ void g(SGApmMonitorManager sGApmMonitorManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62cf7b86", new Object[]{sGApmMonitorManager});
        } else {
            sGApmMonitorManager.h();
        }
    }

    public static SGApmMonitorManager getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SGApmMonitorManager) ipChange.ipc$dispatch("5a5c23f6", new Object[0]);
        }
        if (q == null) {
            synchronized (SGApmMonitorManager.class) {
                if (q == null) {
                    q = new SGApmMonitorManager();
                }
            }
        }
        return q;
    }

    public static /* synthetic */ int h(SGApmMonitorManager sGApmMonitorManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ccff0398", new Object[]{sGApmMonitorManager})).intValue() : sGApmMonitorManager.c;
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        Context context = this.d;
        if (context == null) {
            return;
        }
        File file = new File(context.getDir("SGLib", 0), ".nt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
        try {
            SharedPreferences sharedPreferences = this.d.getSharedPreferences("sgloadfailed", 0);
            if (sharedPreferences.getInt(Constants.KEY_TIMES, 0) == 0) {
                return;
            }
            sharedPreferences.edit().putInt(Constants.KEY_TIMES, 0).commit();
        } catch (Exception unused) {
        }
    }

    public static /* synthetic */ int i(SGApmMonitorManager sGApmMonitorManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("372e8bb7", new Object[]{sGApmMonitorManager})).intValue();
        }
        int i2 = sGApmMonitorManager.c;
        sGApmMonitorManager.c = i2 + 1;
        return i2;
    }

    private String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this});
        }
        try {
            return this.d.getPackageManager().getPackageInfo(this.d.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            return null;
        }
    }

    public static /* synthetic */ long j(SGApmMonitorManager sGApmMonitorManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a15e13d7", new Object[]{sGApmMonitorManager})).longValue() : sGApmMonitorManager.n;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0032, code lost:
        if (r3.contains("?") == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String j() {
        /*
            r11 = this;
            java.lang.String r0 = "getUtdid"
            java.lang.String r1 = ""
            android.content.Context r2 = r11.d
            java.lang.String r3 = "com.ut.device.UTDevice"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Exception -> L59
            r4 = 1
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.Exception -> L59
            java.lang.Class<android.content.Context> r6 = android.content.Context.class
            r7 = 0
            r5[r7] = r6     // Catch: java.lang.Exception -> L59
            java.lang.reflect.Method r3 = r3.getMethod(r0, r5)     // Catch: java.lang.Exception -> L59
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> L59
            r5[r7] = r2     // Catch: java.lang.Exception -> L59
            r6 = 0
            java.lang.Object r3 = r3.invoke(r6, r5)     // Catch: java.lang.Exception -> L59
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> L59
            java.lang.String r5 = "?"
            if (r3 == 0) goto L37
            boolean r8 = r3.isEmpty()     // Catch: java.lang.Exception -> L35
            if (r8 != 0) goto L37
            boolean r8 = r3.contains(r5)     // Catch: java.lang.Exception -> L35
            if (r8 == 0) goto L35
            goto L37
        L35:
            r1 = r3
            goto L59
        L37:
            java.lang.String r8 = "com.ta.utdid2.device.UTDevice"
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch: java.lang.Exception -> L35
            java.lang.Class[] r9 = new java.lang.Class[r4]     // Catch: java.lang.Exception -> L35
            java.lang.Class<android.content.Context> r10 = android.content.Context.class
            r9[r7] = r10     // Catch: java.lang.Exception -> L35
            java.lang.reflect.Method r0 = r8.getMethod(r0, r9)     // Catch: java.lang.Exception -> L35
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> L35
            r4[r7] = r2     // Catch: java.lang.Exception -> L35
            java.lang.Object r0 = r0.invoke(r6, r4)     // Catch: java.lang.Exception -> L35
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L35
            boolean r2 = r0.contains(r5)     // Catch: java.lang.Exception -> L58
            if (r2 == 0) goto L58
            goto L59
        L58:
            r1 = r0
        L59:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.wireless.security.framework.SGApmMonitorManager.j():java.lang.String");
    }

    private String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f1302f6e", new Object[]{this});
        }
        if (this.p == null) {
            try {
                com.alibaba.wireless.security.framework.b a2 = com.alibaba.wireless.security.framework.b.a(new File(b(this.d), "init.config"));
                if (a2 != null) {
                    this.p = "" + a2.b();
                }
            } catch (Exception unused) {
            }
        }
        return this.p;
    }

    public static /* synthetic */ boolean k(SGApmMonitorManager sGApmMonitorManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b8d9c06", new Object[]{sGApmMonitorManager})).booleanValue() : sGApmMonitorManager.h;
    }

    public static /* synthetic */ void l(SGApmMonitorManager sGApmMonitorManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75bd2421", new Object[]{sGApmMonitorManager});
        } else {
            sGApmMonitorManager.g();
        }
    }

    private boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue();
        }
        File b2 = b(this.d);
        StringBuilder sb = new StringBuilder();
        sb.append(".pma_");
        sb.append(i());
        return new File(b2, sb.toString()).exists();
    }

    public static /* synthetic */ long m(SGApmMonitorManager sGApmMonitorManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("dfecac34", new Object[]{sGApmMonitorManager})).longValue() : sGApmMonitorManager.m;
    }

    private boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6158678", new Object[]{this})).booleanValue();
        }
        if (this.d == null) {
            return false;
        }
        String a2 = a("ttid");
        if (StringUtils.equals(a2, "10004868") || StringUtils.equals(a2, "212200")) {
            return false;
        }
        String packageName = this.d.getPackageName();
        return "com.taobao.taobao".equals(packageName) || "com.alibaba.wireless.securityguard".equals(packageName);
    }

    public static /* synthetic */ long n(SGApmMonitorManager sGApmMonitorManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4a1c3453", new Object[]{sGApmMonitorManager})).longValue() : sGApmMonitorManager.l;
    }

    private boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[]{this})).booleanValue();
        }
        if (!m() || !o()) {
            return false;
        }
        return i().split("\\.").length == 4;
    }

    public static /* synthetic */ long o(SGApmMonitorManager sGApmMonitorManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b44bbc72", new Object[]{sGApmMonitorManager})).longValue() : sGApmMonitorManager.k;
    }

    private boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[]{this})).booleanValue();
        }
        File b2 = b(this.d);
        StringBuilder sb = new StringBuilder();
        sb.append(".istbg_");
        sb.append(i());
        return new File(b2, sb.toString()).exists();
    }

    private void p() {
        String str;
        HttpURLConnection httpURLConnection;
        String str2 = "";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
            return;
        }
        Context context = this.d;
        if (context == null) {
            return;
        }
        String packageName = context.getPackageName();
        try {
            str = this.d.getPackageManager().getPackageInfo(packageName, 0).versionName;
            try {
                str2 = URLDecoder.decode(new String(Base64.decode("aHR0cCUzQS8vY2RuLW11bS5hbGliYWJhY2hlbmdkdW4uY29tL3NnN3NYMS9yWXhVL3BERHcv", 0)), "utf-8");
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            str = str2;
        }
        String k = k();
        if (k == null) {
            return;
        }
        String str3 = str2 + k + "?pn=" + packageName + "&pv=" + str;
        BufferedReader bufferedReader = null;
        try {
            httpURLConnection = (HttpURLConnection) new URL(str3).openConnection();
            try {
                httpURLConnection.setConnectTimeout(20000);
                httpURLConnection.setReadTimeout(20000);
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setDoInput(true);
                httpURLConnection.setRequestProperty("Content-Type", "text/plain;charset=UTF-8");
                httpURLConnection.setRequestProperty("Accept-Charset", "UTF-8");
                if (httpURLConnection.getResponseCode() == 200) {
                    BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                    try {
                        char[] cArr = new char[1100];
                        StringBuffer stringBuffer = new StringBuffer();
                        int read = bufferedReader2.read(cArr);
                        if (read < 1024) {
                            stringBuffer.append(cArr, 0, read);
                        }
                        a(str3, stringBuffer.toString());
                        bufferedReader = bufferedReader2;
                    } catch (Exception unused3) {
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e2) {
                                e2.printStackTrace();
                            }
                        }
                        if (httpURLConnection == null) {
                            return;
                        }
                        httpURLConnection.disconnect();
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e3) {
                                e3.printStackTrace();
                            }
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        throw th;
                    }
                }
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                }
                if (httpURLConnection == null) {
                    return;
                }
            } catch (Exception unused4) {
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception unused5) {
            httpURLConnection = null;
        } catch (Throwable th3) {
            th = th3;
            httpURLConnection = null;
        }
        httpURLConnection.disconnect();
    }

    public static /* synthetic */ void p(SGApmMonitorManager sGApmMonitorManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e7b449d", new Object[]{sGApmMonitorManager});
        } else {
            sGApmMonitorManager.f();
        }
    }

    public static /* synthetic */ void q(SGApmMonitorManager sGApmMonitorManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88aaccbc", new Object[]{sGApmMonitorManager});
        } else {
            sGApmMonitorManager.p();
        }
    }

    public static /* synthetic */ String r(SGApmMonitorManager sGApmMonitorManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2c9e9125", new Object[]{sGApmMonitorManager}) : sGApmMonitorManager.f;
    }

    public synchronized void addTrackInfo(String str) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2920a989", new Object[]{this, str});
        } else if (str == null || !this.g) {
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("@");
            sb.append(this.j ? "1" : "0");
            String sb2 = sb.toString();
            String str2 = "" + Process.myPid() + "_" + Process.myTid();
            try {
                jSONArray = (JSONArray) v.get(str2);
            } catch (Exception unused) {
                jSONArray = new JSONArray();
                try {
                    v.put(str2, jSONArray);
                } catch (Exception unused2) {
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("key", sb2);
                jSONObject.put("ts", System.currentTimeMillis());
                jSONArray.put(jSONObject);
            } catch (Exception unused3) {
            }
        }
    }

    public void init(Context context) {
        ScheduledExecutorService scheduledExecutorService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        synchronized (SGApmMonitorManager.class) {
            if (r) {
                return;
            }
            r = true;
            this.d = context;
            w = System.currentTimeMillis();
            Context context2 = this.d;
            if (context2 == null || !com.alibaba.wireless.security.framework.utils.e.b(context2)) {
                return;
            }
            t = Executors.newSingleThreadScheduledExecutor(new b(this));
            u = Executors.newSingleThreadScheduledExecutor(new c(this));
            if (t == null || (scheduledExecutorService = u) == null) {
                return;
            }
            scheduledExecutorService.schedule(new d(), 5L, TimeUnit.SECONDS);
            boolean l = l();
            this.h = a();
            if (!l) {
                return;
            }
            this.g = true;
            this.o = isEnableFullTrackRecord();
            c(this.d);
            t.schedule(new h(), s * 5, TimeUnit.MILLISECONDS);
            u.submit(new e());
        }
    }

    public boolean isAllPluginLoaded() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a6ef73da", new Object[]{this})).booleanValue() : this.b.containsKey("getInstance") && this.b.containsKey("securitybody") && this.b.containsKey("middletier");
    }

    public boolean isEnableFullTrackRecord() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1ca35ceb", new Object[]{this})).booleanValue();
        }
        if (this.d == null) {
            return false;
        }
        return n() || new File(this.d.getDir("SGLib", 0), ".nt").exists();
    }

    public boolean isForeground() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("845d1c18", new Object[]{this})).booleanValue() : this.j;
    }

    public void monitorEnd(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d10058f2", new Object[]{this, str});
        } else if (str == null || !this.g) {
        } else {
            addTrackInfo("j_" + str + "_e");
            Number number = this.f4263a.get(str);
            if (number == null || this.b.get(str) != null) {
                return;
            }
            this.b.put(str, Long.valueOf(System.currentTimeMillis() - number.longValue()));
        }
    }

    public void monitorStart(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54534bb9", new Object[]{this, str});
        } else {
            monitorStartWithTimeout(str, s);
        }
    }

    public void monitorStartWithTimeout(String str, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("560defbf", new Object[]{this, str, new Integer(i2)});
        } else if (str == null || !this.g) {
        } else {
            addTrackInfo("j_" + str + "_s");
            if (this.f4263a.get(str) != null) {
                return;
            }
            this.f4263a.put(str, Long.valueOf(System.currentTimeMillis()));
            t.schedule(new i(str, 1, i2), i2, TimeUnit.MILLISECONDS);
        }
    }

    public void setMainPluginVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c51e7bb", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }

    public void setSGPluginManager(com.alibaba.wireless.security.framework.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("138b09a2", new Object[]{this, dVar});
        } else {
            this.e = dVar;
        }
    }
}
