package com.ut.mini.behavior.config;

import android.content.Context;
import com.alibaba.analytics.core.sync.d;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.input.InputFrame3;
import java.io.File;
import java.util.Random;
import tb.any;
import tb.anz;
import tb.aob;
import tb.apl;
import tb.apr;
import tb.aqc;
import tb.aqe;
import tb.kge;

/* loaded from: classes.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static long f24088a;
    private static boolean b;
    private static int c;
    private static boolean d;

    public static /* synthetic */ String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : f();
    }

    public static /* synthetic */ boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue() : c(str);
    }

    public static /* synthetic */ boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{new Boolean(z)})).booleanValue();
        }
        b = z;
        return z;
    }

    public static /* synthetic */ void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
        } else {
            d(str);
        }
    }

    public static /* synthetic */ boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : b;
    }

    public static /* synthetic */ void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
        } else {
            e();
        }
    }

    public static /* synthetic */ long d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2df", new Object[0])).longValue() : f24088a;
    }

    static {
        kge.a(24122399);
        f24088a = 0L;
        b = false;
        d = false;
    }

    public static synchronized void initConfig() {
        synchronized (b.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6811c3f9", new Object[0]);
            } else if (d) {
            } else {
                d = true;
                apr.b("UTBehaviorConfigMgr", "init");
                c = new Random().nextInt(10000);
                aqe.a().a(new Runnable() { // from class: com.ut.mini.behavior.config.b.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        String a2 = b.a();
                        if (a2 != null) {
                            b.a(apl.b(a2));
                        }
                        a.a();
                    }
                });
            }
        }
    }

    private static boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{str})).booleanValue();
        }
        if (aqc.e(str)) {
            e();
            return false;
        }
        try {
            UTBehaviorConfig uTBehaviorConfig = (UTBehaviorConfig) JSON.parseObject(str, UTBehaviorConfig.class);
            if (uTBehaviorConfig != null && uTBehaviorConfig.v == 1) {
                f24088a = uTBehaviorConfig.timestamp;
                com.ut.mini.behavior.module.a.getInstance().init(uTBehaviorConfig.modulesConfig);
                com.ut.mini.behavior.trigger.a.getInstance().init(uTBehaviorConfig.triggerConfig);
                apr.b("UTBehaviorConfigMgr", "init config timestamp", Long.valueOf(f24088a));
                return true;
            }
        } catch (Exception e) {
            apr.b("UTBehaviorConfigMgr", e, new Object[0]);
        }
        e();
        return false;
    }

    private static void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[0]);
            return;
        }
        f24088a = 0L;
        com.ut.mini.behavior.module.a.getInstance().init(null);
        com.ut.mini.behavior.trigger.a.getInstance().init(null);
        apr.b("UTBehaviorConfigMgr", "init null config");
    }

    private static String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50938a53", new Object[0]);
        }
        Context k = aob.a().k();
        if (k == null) {
            k = any.d().e();
        }
        if (k == null) {
            return null;
        }
        String str = k.getFilesDir().getAbsolutePath() + File.separator + anz.UT_FILE_DIR;
        apl.a(str);
        return str + File.separator + "3c080a1447baf9ff";
    }

    public static void a(final String str, final long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123b0d2", new Object[]{str, new Long(j)});
        } else {
            aqe.a().a(new Runnable() { // from class: com.ut.mini.behavior.config.b.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (b.b()) {
                        apr.b("UTBehaviorConfigMgr", "Config is updating...");
                    } else {
                        b.a(true);
                        apr.b("UTBehaviorConfigMgr", "updateConfig host", str, "timestamp", Long.valueOf(j));
                        if (aqc.e(str)) {
                            b.c();
                            String a2 = b.a();
                            if (a2 == null) {
                                return;
                            }
                            apl.c(a2);
                            return;
                        }
                        apr.b("UTBehaviorConfigMgr", "File Timestamp", Long.valueOf(b.d()));
                        if (j > b.d()) {
                            b.b(str);
                        } else {
                            apr.b("UTBehaviorConfigMgr", "Do not need update Config");
                        }
                        b.a(false);
                    }
                }
            });
        }
    }

    private static void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{str});
        } else if (aqc.e(str)) {
        } else {
            String str2 = str + "/v1.json";
            d.a a2 = new d().a(str2);
            apr.b("UTBehaviorConfigMgr", "downloadConfig url", str2, InputFrame3.TYPE_RESPONSE, a2);
            if (a2 == null || a2.b == null) {
                return;
            }
            try {
                String str3 = new String(a2.b, 0, a2.b.length);
                if (!c(str3)) {
                    return;
                }
                apl.a(f(), str3);
            } catch (Throwable th) {
                apr.b("UTBehaviorConfigMgr", th, new Object[0]);
            }
        }
    }

    public static boolean enableSample(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("54d00a34", new Object[]{new Long(j)})).booleanValue() : ((long) c) < j;
    }
}
