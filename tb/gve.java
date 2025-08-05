package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.application.common.a;
import com.taobao.application.common.c;
import com.taobao.monitor.adapter.b;
import com.taobao.tao.log.TLog;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.gvb;

/* loaded from: classes.dex */
public class gve {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int HISTORY_MAXIMUM_COUNT = 15;
    public static final String MODULE = "next_launch";
    public static final String TAG = "statistic";
    private static volatile gvk b;

    /* renamed from: a  reason: collision with root package name */
    private static final String f28507a = String.valueOf(LauncherRuntime.f13108a);
    private static final AtomicBoolean c = new AtomicBoolean(false);

    public static gvk a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (gvk) ipChange.ipc$dispatch("f053f42", new Object[0]) : b;
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : c.get();
    }

    public static void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{application, hashMap});
        } else {
            a(new gvp(f28507a, "negative_feedback", 15));
        }
    }

    private static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[0]);
            return;
        }
        b.a("diagnoseSession", f28507a);
        gvk a2 = gvk.a();
        b = a2;
        TLog.loge(MODULE, TAG, "[stage] startup, " + a2);
        c.a(new a.c() { // from class: tb.gve.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.application.common.IAppLaunchListener
            public void a(int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
                } else if (i != 0 || i2 != 2) {
                } else {
                    gve.c();
                }
            }
        });
        a(new gvs(a2, f28507a, "negative_feedback"));
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
            return;
        }
        TLog.loge(MODULE, TAG, "[stage] startup, onCompleted");
        a("launchComplete");
        b("launchComplete");
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        int c2 = c(str);
        if (c2 == -1) {
            return;
        }
        if (c2 == 0) {
            d();
        }
        a(new gvr(f28507a, "negative_feedback", c2, currentTimeMillis));
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        int c2 = c(str);
        if (c2 == -1) {
            return;
        }
        if (c2 == 3) {
            c.compareAndSet(false, true);
        }
        a(new gvq(f28507a, "negative_feedback", c2, currentTimeMillis));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static int c(String str) {
        char c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("88097ea7", new Object[]{str})).intValue();
        }
        switch (str.hashCode()) {
            case -1610222413:
                if (str.equals("usingRsoExtractedKernel")) {
                    c2 = '\f';
                    break;
                }
                c2 = 65535;
                break;
            case -1140894196:
                if (str.equals("launchComplete")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case -980202207:
                if (str.equals("launchCompleteTimeout6")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case -527490869:
                if (str.equals("preExtractedUC")) {
                    c2 = 11;
                    break;
                }
                c2 = 65535;
                break;
            case -321497452:
                if (str.equals("launchCompleteTimeout10")) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case -1605823:
                if (str.equals("launchBackgroundDeepIdle")) {
                    c2 = '\t';
                    break;
                }
                c2 = 65535;
                break;
            case 102099095:
                if (str.equals("m-a-c")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 102103898:
                if (str.equals("m-f-a")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case 102116413:
                if (str.equals("m-s-w")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 797542700:
                if (str.equals("m-a-head")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 797896604:
                if (str.equals("m-a-tail")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 1160882451:
                if (str.equals("m-launch")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 1358200101:
                if (str.equals("scheduleBackgroundDeepIdle")) {
                    c2 = '\n';
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case '\b':
                return 8;
            case '\t':
            case '\n':
                return 9;
            case 11:
                return 10;
            case '\f':
                return 11;
            default:
                return -1;
        }
    }

    private static void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{runnable});
        } else {
            gvb.a.f28505a.submit(runnable);
        }
    }
}
