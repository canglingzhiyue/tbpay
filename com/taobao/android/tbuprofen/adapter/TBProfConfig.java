package com.taobao.android.tbuprofen.adapter;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tbuprofen.adapter.anr.TBAnrConfig;
import com.taobao.android.tbuprofen.log.TBPLogLevel;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import tb.kge;
import tb.kgo;

/* loaded from: classes.dex */
public class TBProfConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ANR_SP = "TBANRProfSP";
    public static final String CONFIG_ANR_PROFILER = "tbp_anr_profiler";
    public static final String CONFIG_BIG_MEM_MONITOR_SAMPLE = "tbp_bigmem_monitor_sample";
    public static final String CONFIG_BLACK_LIST = "tbp_black_list";
    public static final String CONFIG_CAPS_LIST = "tbp_caps_list";
    public static final String CONFIG_CHECK_MUTATOR = "tbp_check_mutator";
    public static final String CONFIG_DISABLE_ON_VIRTUAL = "tbp_virtual_disable";
    public static final String CONFIG_DUMP_HEAP = "tbp_dump_heap";
    public static final String CONFIG_IS_LOCAL = "tbp_is_local";
    public static final String CONFIG_IS_LOCAL_AUTO_START = "tbp_is_local_auto_start";
    public static final String CONFIG_IS_TBP_ENABLE = "tbp_is_enable";
    public static final String CONFIG_LAST_DUMP = "param_last_dump";
    public static final String CONFIG_LOG_LEVEL = "tbp_log_level";
    public static final String CONFIG_MAIN_WAIT_MONITOR_SAMPLE = "tbp_mainwait_monitor_sample";
    public static final String CONFIG_MONITOR_SAMPLE = "tbp_monitor_sample";
    public static final String CONFIG_PLUGIN_ARGS = "tbp_plugin_args";
    public static final String CONFIG_WAIT_PREVENT_GC = "tbp_wait_prevent_gc";
    public static final String TBP_SP = "TBProfSP";

    /* renamed from: a  reason: collision with root package name */
    private static boolean f15454a;
    private static boolean b;
    private static int c;
    private static String d;
    private static boolean e;
    private static String[] f;
    private static TBPLogLevel[] g;
    private static int h;
    private static int i;
    private static boolean j;
    private static boolean k;
    private static boolean l;
    private static boolean m;
    private static HeapDumpConfig n;
    private static TBAnrConfig o;

    /* loaded from: classes.dex */
    public static class HeapDumpConfig {
        public boolean isEnable = true;
        public boolean isDebug = false;
        public boolean processOnce = true;
        public int dumpInterval = 1440;
        public int minSDK = 29;
        public int maxSDK = 33;
        public int sample = 5;
        public int graySample = 2000;
        public int selfGraySample = 0;
        public int integrationSample = 10000;
        public int otherSample = 10000;
        public int oomSample = 0;
        public List<String> releaseVerList = new ArrayList();
        public int type = 2;
        public int hprofTimeout = 90;
        public int instanceTimeout = 60;
        public int referenceTimeout = 90;
        public int instanceMinCount = 1;
        public int instanceMinSize = 1;
        public int instanceTopCount = 0;
        public int zipLevel = 8;
        public int splitSize = 94371840;
        public boolean upload = true;
        public int expireDay = 7;
        public long minSpace = 1073741824;
        public boolean addHeaderInfo = true;
        public int stripFlag = 3;
        public boolean uploadData = false;

        static {
            kge.a(-1312962300);
        }
    }

    static {
        kge.a(-1194436254);
        f15454a = false;
        b = false;
        c = 0;
        d = "";
        e = false;
        f = new String[0];
        g = new TBPLogLevel[]{TBPLogLevel.INFO, TBPLogLevel.DEBUG, TBPLogLevel.DEBUG, TBPLogLevel.INFO};
        h = 0;
        i = 0;
        j = false;
        k = false;
        l = false;
        m = false;
        n = new HeapDumpConfig();
        o = new TBAnrConfig();
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016e A[Catch: Exception -> 0x01d8, TryCatch #0 {Exception -> 0x01d8, blocks: (B:6:0x0018, B:8:0x0020, B:10:0x0036, B:12:0x0080, B:14:0x0084, B:16:0x008a, B:18:0x0090, B:19:0x00a2, B:20:0x00a5, B:23:0x00d0, B:25:0x00db, B:27:0x00e8, B:28:0x00ed, B:30:0x00f0, B:32:0x00f5, B:69:0x015f, B:75:0x0170, B:70:0x0162, B:71:0x0165, B:72:0x0168, B:73:0x016b, B:74:0x016e, B:45:0x0118, B:48:0x0122, B:51:0x012c, B:54:0x0136, B:57:0x0140, B:60:0x014a, B:76:0x0174, B:77:0x0178, B:79:0x01b7, B:80:0x01c1, B:24:0x00d7, B:81:0x01d0, B:83:0x01d4), top: B:88:0x0018 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(android.content.Context r14) {
        /*
            Method dump skipped, instructions count: 485
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.tbuprofen.adapter.TBProfConfig.a(android.content.Context):void");
    }

    public static TBAnrConfig b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBAnrConfig) ipChange.ipc$dispatch("dcf65390", new Object[]{context});
        }
        try {
            Log.e("TBPConfig", "initAnrConfig");
            SharedPreferences a2 = a(ANR_SP, context);
            if (a2 != null) {
                String string = a2.getString(CONFIG_ANR_PROFILER, null);
                if (string != null) {
                    o = (TBAnrConfig) JSON.parseObject(string, TBAnrConfig.class);
                }
                o.isDebug = new File("/data/local/tmp/.tbp_anr_debug").exists();
                o.soVer = a2.getString("soVer", null);
                o.utilSoPath = a2.getString("utilSoPath", null);
            }
        } catch (Exception e2) {
            com.taobao.android.tbuprofen.log.c.a("TBPConfig", e2, "initAnrConfig failed", new Object[0]);
            e2.printStackTrace();
        }
        return o;
    }

    public static SharedPreferences a(String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("160b372a", new Object[]{str, context});
        }
        if (context == null) {
            return null;
        }
        return kgo.a(context, str, 0);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : com.taobao.android.tbuprofen.common.d.a() && f15454a && !b;
    }

    public static int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[0])).intValue() : c;
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[0]) : d;
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue() : e;
    }

    public static String[] e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("f0375b3b", new Object[0]) : f;
    }

    public static TBPLogLevel a(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBPLogLevel) ipChange.ipc$dispatch("16dcfb2c", new Object[]{new Integer(i2)});
        }
        if (i2 >= 0) {
            TBPLogLevel[] tBPLogLevelArr = g;
            if (i2 < tBPLogLevelArr.length) {
                return tBPLogLevelArr[i2];
            }
        }
        return TBPLogLevel.NONE;
    }

    public static int f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[0])).intValue() : h;
    }

    public static int g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f961", new Object[0])).intValue() : i;
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[0])).booleanValue() : j;
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[0])).booleanValue() : k;
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[0])).booleanValue() : l;
    }

    public static boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[0])).booleanValue() : m;
    }

    public static HeapDumpConfig l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HeapDumpConfig) ipChange.ipc$dispatch("a948dee", new Object[0]) : n;
    }

    public static long c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9f76bb92", new Object[]{context})).longValue();
        }
        SharedPreferences a2 = a(TBP_SP, context);
        if (a2 == null) {
            return Long.MAX_VALUE;
        }
        return a2.getLong(CONFIG_LAST_DUMP, 0L);
    }

    public static void a(Context context, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("258f9e64", new Object[]{context, new Long(j2)});
            return;
        }
        SharedPreferences a2 = a(TBP_SP, context);
        if (a2 == null) {
            return;
        }
        a2.edit().putLong(CONFIG_LAST_DUMP, j2).apply();
    }
}
