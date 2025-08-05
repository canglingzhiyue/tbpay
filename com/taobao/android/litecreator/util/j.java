package com.taobao.android.litecreator.util;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.domain.EnvModeEnum;
import mtopsdk.mtop.global.MtopConfig;
import mtopsdk.mtop.intf.Mtop;
import tb.kge;

/* loaded from: classes5.dex */
public class j {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_FREE_MEM = 700;
    public static final int DEFAULT_THRESHOLD_MEM = 200;
    public static final int DEFAULT_TOTAL_MEM = -1;
    public static final int TIRAMISU = 33;

    /* renamed from: a  reason: collision with root package name */
    private static long f13501a;

    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public long f13502a = -1;
        public long b = 700;
        public long c = 200;

        static {
            kge.a(255283881);
        }
    }

    static {
        kge.a(-1006357018);
        f13501a = 1048576L;
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue() : b(context) >= 29;
    }

    public static int b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9eca0ff2", new Object[]{context})).intValue();
        }
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static boolean c(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9f76bba2", new Object[]{context})).booleanValue() : b(context) >= 33;
    }

    public static boolean d(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a0236741", new Object[]{context})).booleanValue() : Build.VERSION.SDK_INT >= 33;
    }

    public static boolean e(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a0d012e0", new Object[]{context})).booleanValue() : a(context) && (!s.v() || a());
    }

    private static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        String x = s.x();
        return x != null && x.contains(String.valueOf(Build.VERSION.SDK_INT));
    }

    public static a f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("ada097ce", new Object[]{context});
        }
        a aVar = new a();
        try {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
            aVar.f13502a = memoryInfo.totalMem / f13501a;
            aVar.b = memoryInfo.availMem / f13501a;
            aVar.c = memoryInfo.threshold / f13501a;
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return aVar;
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        MtopConfig mtopConfig = Mtop.instance(null).getMtopConfig();
        return (mtopConfig == null || mtopConfig.envMode == null || mtopConfig.envMode != EnvModeEnum.ONLINE) ? false : true;
    }

    public static void a(String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6e7fbd6", new Object[]{str, context});
            return;
        }
        a f = f(context);
        u.d(str, "printEnvMemInfo:  totalMem=" + f.f13502a + " freeMem=" + f.b + " thredhodMem=" + f.c);
    }

    public static boolean g(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a2296a1e", new Object[]{context})).booleanValue() : s.y() && bf.a(context) <= s.z();
    }
}
