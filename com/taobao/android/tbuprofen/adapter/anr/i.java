package com.taobao.android.tbuprofen.adapter.anr;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static g b;
    private static e c;

    static {
        kge.a(-961764803);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0065 A[Catch: all -> 0x0111, TryCatch #2 {, blocks: (B:4:0x0003, B:6:0x000c, B:9:0x0019, B:11:0x005b, B:17:0x0065, B:18:0x0068, B:20:0x0080, B:21:0x008b, B:27:0x00ae, B:29:0x00b2, B:31:0x00b6, B:34:0x00c1, B:36:0x00c9, B:38:0x00cd, B:40:0x00d1, B:43:0x00dc, B:48:0x00e6, B:50:0x00f5, B:51:0x0103, B:23:0x0094), top: B:57:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0080 A[Catch: all -> 0x0111, TryCatch #2 {, blocks: (B:4:0x0003, B:6:0x000c, B:9:0x0019, B:11:0x005b, B:17:0x0065, B:18:0x0068, B:20:0x0080, B:21:0x008b, B:27:0x00ae, B:29:0x00b2, B:31:0x00b6, B:34:0x00c1, B:36:0x00c9, B:38:0x00cd, B:40:0x00d1, B:43:0x00dc, B:48:0x00e6, B:50:0x00f5, B:51:0x0103, B:23:0x0094), top: B:57:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0094 A[Catch: Throwable -> 0x00a4, TRY_ENTER, TRY_LEAVE, TryCatch #2 {, blocks: (B:4:0x0003, B:6:0x000c, B:9:0x0019, B:11:0x005b, B:17:0x0065, B:18:0x0068, B:20:0x0080, B:21:0x008b, B:27:0x00ae, B:29:0x00b2, B:31:0x00b6, B:34:0x00c1, B:36:0x00c9, B:38:0x00cd, B:40:0x00d1, B:43:0x00dc, B:48:0x00e6, B:50:0x00f5, B:51:0x0103, B:23:0x0094), top: B:57:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e2 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized void a(android.content.Context r11, java.util.Map<java.lang.String, java.lang.Object> r12) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.tbuprofen.adapter.anr.i.a(android.content.Context, java.util.Map):void");
    }

    private static boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue() : TextUtils.equals(str, "com.taobao.taobao");
    }

    public static synchronized void a(Context context, com.taobao.android.tbuprofen.adapter.a aVar) {
        synchronized (i.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e1337167", new Object[]{context, aVar});
            }
        }
    }

    private static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        try {
            System.loadLibrary("tbuprofen-util");
            return true;
        } catch (Throwable th) {
            com.taobao.android.tbuprofen.log.c.a("TBAnrProfiler", th, "Failed to load utils lib.", new Object[0]);
            return false;
        }
    }

    private static boolean a(Context context, TBAnrConfig tBAnrConfig) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a44617d", new Object[]{context, tBAnrConfig})).booleanValue();
        }
        if (tBAnrConfig.isDebug) {
            return true;
        }
        if (!tBAnrConfig.isEnable) {
            com.taobao.android.tbuprofen.log.c.a("TBAnrProfiler", "Anr monitor is disabled.", new Object[0]);
            return false;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < tBAnrConfig.minSDK || i2 > tBAnrConfig.maxSDK || "VanillaIceCream".equals(Build.VERSION.CODENAME)) {
            com.taobao.android.tbuprofen.log.c.a("TBAnrProfiler", "Unsupported sdk ver: %d", Integer.valueOf(i2));
            return false;
        }
        int a2 = com.taobao.android.tbuprofen.common.a.a(context);
        if (a2 == 1) {
            i = tBAnrConfig.releaseSample;
        } else {
            i = (a2 == 2 || a2 == 3 || a2 == 4) ? tBAnrConfig.graySample : 0;
        }
        if (com.taobao.android.tbuprofen.common.a.d(i)) {
            return true;
        }
        com.taobao.android.tbuprofen.log.c.a("TBAnrProfiler", "Can't start anr monitor. sample: %d, PackageType:%d", Integer.valueOf(i), Integer.valueOf(a2));
        return false;
    }

    public static void a(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a21a9f2", new Object[]{hVar});
        } else {
            g.a(hVar);
        }
    }
}
