package com.taobao.tinct.impl.config;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Process;
import android.preference.PreferenceManager;
import android.taobao.mulitenv.EnvironmentSwitcher;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OConstant;
import com.taobao.tao.log.TLog;
import com.taobao.tao.log.statistics.d;
import com.taobao.tinct.impl.config.TinctConfig;
import com.taobao.tinct.model.CustomChangeInfo;
import com.taobao.tinct.model.InstantPatchChangeInfo;
import com.taobao.tinct.model.OrangeChangeInfo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CONFIG_IS_TINCT_ENABLE = "tinctEnable";
    public static final String CONFIG_IS_TINCT_LAUNCH_ENABLE = "tinctLaunchEnable";
    public static final String CONFIG_ORANGE_BIZ_MAP = "mtopMapper";
    public static final String CONFIG_TICNT_JSON = "tinct_json_config";

    /* renamed from: a  reason: collision with root package name */
    private static boolean f22956a = true;
    private static TinctConfig b;
    private static Map<String, BizMapperModel> c;
    private static int d;
    private static String e;
    private static String f;
    private static boolean g;

    public static boolean a(Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d511021d", new Object[]{context, str, new Integer(i)})).booleanValue();
        }
        try {
            SharedPreferences a2 = a(context);
            if (a2 != null) {
                boolean z2 = a2.getBoolean(CONFIG_IS_TINCT_ENABLE, true);
                f22956a = z2;
                if (!z2 || !a2.getBoolean(CONFIG_IS_TINCT_LAUNCH_ENABLE, false)) {
                    z = false;
                }
                if (z) {
                    b = new TinctConfig();
                    e = str;
                    d = i;
                    f = c(context);
                }
                return z;
            }
        } catch (Exception e2) {
            Log.e("TinctSP", "isLaunchTinchEnable exception", e2);
        }
        return false;
    }

    public static void a(Context context, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9591153", new Object[]{context, hashMap});
            return;
        }
        try {
            b(context, hashMap);
            SharedPreferences a2 = a(context);
            if (a2 != null) {
                a(a2.getString(CONFIG_TICNT_JSON, ""));
                c = b(a2.getString(CONFIG_ORANGE_BIZ_MAP, ""));
            }
            if (b == null) {
                b = new TinctConfig();
            }
            String.format("isTinctEnable=%b, orange=%b, abtest=%b, instant=%b, inline=%b, touchstone=%b", Boolean.valueOf(f22956a), Boolean.valueOf(b.orangeStatisticsConfig.isMonitorEnable), Boolean.valueOf(b.abTestStatisticsConfig.isMonitorEnable), Boolean.valueOf(b.instantStatisticsConfig.isMonitorEnable), Boolean.valueOf(b.inlineStatisticsConfig.isMonitorEnable), Boolean.valueOf(b.touchstoneConfig.isMonitorEnable));
            b.a(context);
        } catch (Exception e2) {
            e2.printStackTrace();
            TLog.loge("tinct", "TinctSP", "init failed: " + e2.getMessage());
        }
    }

    private static void b(Context context, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8e2ab54", new Object[]{context, hashMap});
            return;
        }
        f = (String) a(hashMap, "appVersion", c(context));
        e = (String) a(hashMap, "process", b(context));
        int intValue = ((Integer) a(hashMap, OConstant.LAUNCH_ENVINDEX, 0)).intValue();
        d = intValue;
        if (intValue == 0) {
            d = PreferenceManager.getDefaultSharedPreferences(context).getInt(EnvironmentSwitcher.SPKEY_ENV, 0);
        }
        g = ((Boolean) a(hashMap, d.PARAM_IS_INNER, false)).booleanValue();
        String.format("Process: %s, AppVe: %s, EvnIndex: %d", e, f, Integer.valueOf(d));
    }

    public static <T> T a(HashMap<String, Object> hashMap, String str, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("691e961", new Object[]{hashMap, str, t});
        }
        try {
            T t2 = (T) hashMap.get(str);
            return t2 != null ? t2 : t;
        } catch (Exception e2) {
            e2.printStackTrace();
            return t;
        }
    }

    private static String b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31400281", new Object[]{context});
        }
        try {
            long myPid = Process.myPid();
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
                if (runningAppProcessInfo.pid == myPid) {
                    return runningAppProcessInfo.processName;
                }
            }
            return "com.taobao.taobao";
        } catch (Exception e2) {
            e2.printStackTrace();
            return "com.taobao.taobao";
        }
    }

    private static String c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a6ba28c2", new Object[]{context});
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
            return "1.0.0";
        }
    }

    public static SharedPreferences a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("6ebdfd34", new Object[]{context});
        }
        if (context == null) {
            return null;
        }
        return context.getSharedPreferences("TinctSP", 0);
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else if (StringUtils.isEmpty(str)) {
            b = new TinctConfig();
        } else {
            try {
                b = (TinctConfig) JSON.parseObject(str, TinctConfig.class);
            } catch (Exception e2) {
                e2.printStackTrace();
                Log.e("TinctSP", "failed to parseTinctConfig!");
                b = new TinctConfig();
            }
        }
    }

    public static Map<String, BizMapperModel> b(String str) {
        BizMapperModel bizMapperModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d2e5f268", new Object[]{str});
        }
        try {
            if (StringUtils.isEmpty(str)) {
                return null;
            }
            HashMap hashMap = new HashMap();
            JSONArray parseArray = JSONArray.parseArray(str);
            for (int i = 0; i < parseArray.size(); i++) {
                String string = parseArray.getString(i);
                if (!StringUtils.isEmpty(string) && (bizMapperModel = (BizMapperModel) JSON.parseObject(string, BizMapperModel.class)) != null) {
                    hashMap.put(bizMapperModel.getBizName(), bizMapperModel);
                }
            }
            return hashMap;
        } catch (Exception e2) {
            e2.printStackTrace();
            Log.e("TinctSP", "failed to parseBizMapper!");
            return null;
        }
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : f22956a;
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : b.orangeStatisticsConfig.isMonitorEnable;
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : b.abTestStatisticsConfig.isMonitorEnable;
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue() : b.instantStatisticsConfig.isMonitorEnable;
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue() : b.inlineStatisticsConfig.isMonitorEnable;
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[0])).booleanValue() : b.touchstoneConfig.isMonitorEnable;
    }

    public static boolean a(OrangeChangeInfo orangeChangeInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("335aaf3", new Object[]{orangeChangeInfo})).booleanValue();
        }
        if (!b.orangeStatisticsConfig.isStatisticsEnable) {
            return false;
        }
        if ((b.orangeStatisticsConfig.onlyGray && !orangeChangeInfo.isGray()) || b.orangeStatisticsConfig.blackList.contains(orangeChangeInfo.getNameSpace())) {
            return false;
        }
        int i = b.orangeStatisticsConfig.sampling;
        return i == 10000 || i >= new Random().nextInt(10000);
    }

    public static boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{str})).booleanValue();
        }
        if (!b.abTestStatisticsConfig.isStatisticsEnable || !b.abTestStatisticsConfig.whiteList.contains(str)) {
            return false;
        }
        int i = b.abTestStatisticsConfig.sampling;
        return i == 10000 || i >= new Random().nextInt(10000);
    }

    public static boolean a(InstantPatchChangeInfo instantPatchChangeInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3839349a", new Object[]{instantPatchChangeInfo})).booleanValue();
        }
        if (!b.instantStatisticsConfig.isStatisticsEnable || instantPatchChangeInfo == null || !InstantPatchChangeInfo.TYPE_BETA.equals(instantPatchChangeInfo.getVerType())) {
            return false;
        }
        int i = b.instantStatisticsConfig.sampling;
        return i == 10000 || i >= new Random().nextInt(10000);
    }

    public static boolean a(com.taobao.tinct.model.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dbf50277", new Object[]{bVar})).booleanValue();
        }
        if (!b.inlineStatisticsConfig.isStatisticsEnable || bVar == null || !InstantPatchChangeInfo.TYPE_BETA.equals(bVar.getVerType())) {
            return false;
        }
        int i = b.inlineStatisticsConfig.sampling;
        return i == 10000 || i >= new Random().nextInt(10000);
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[0])).booleanValue();
        }
        if (!b.touchstoneConfig.isStatisticsEnable || b.touchstoneConfig.whiteList.size() <= 0) {
            return false;
        }
        int i = b.touchstoneConfig.sampling;
        return i == 10000 || i >= new Random().nextInt(10000);
    }

    public static long h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5cf10e3", new Object[0])).longValue() : b.orangeStatisticsConfig.orangeExpire * 86400000;
    }

    public static long i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5dd2864", new Object[0])).longValue() : b.orangeStatisticsConfig.grayExpire * 86400000;
    }

    public static List<String> j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("87269236", new Object[0]) : b.touchstoneConfig.whiteList;
    }

    public static List<String> d(String str) {
        BizMapperModel bizMapperModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4c7331b2", new Object[]{str});
        }
        Map<String, BizMapperModel> map = c;
        if (map != null && (bizMapperModel = map.get(str)) != null) {
            return bizMapperModel.getOrangeNamespace();
        }
        return null;
    }

    public static int k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5f95765", new Object[0])).intValue() : d;
    }

    public static String l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("77b5ea0d", new Object[0]) : e;
    }

    public static String m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fe3ba4ac", new Object[0]) : f;
    }

    public static boolean n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[0])).booleanValue() : g;
    }

    public static TinctConfig.CustomItemConfig a(CustomChangeInfo customChangeInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TinctConfig.CustomItemConfig) ipChange.ipc$dispatch("a778c329", new Object[]{customChangeInfo});
        }
        TinctConfig.CustomItemConfig customItemConfig = b.customConfig.config.get(customChangeInfo.getHashKey());
        return customItemConfig == null ? b.customConfig.config.get(customChangeInfo.getCustomType()) : customItemConfig;
    }

    public static boolean b(CustomChangeInfo customChangeInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("398cb82f", new Object[]{customChangeInfo})).booleanValue();
        }
        if (!b.customConfig.enable) {
            Log.e("TinctSP", "customConfig.enable = false");
            return false;
        }
        TinctConfig.CustomItemConfig a2 = a(customChangeInfo);
        if (a2 != null) {
            return customChangeInfo.getGrayFlag() == null ? a2.monitorType == 2 : a2.monitorType == 1;
        }
        Log.e("TinctSP", "Can't find the config for: " + customChangeInfo.getTinctTag());
        return false;
    }

    public static boolean c(CustomChangeInfo customChangeInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f30445ce", new Object[]{customChangeInfo})).booleanValue();
        }
        TinctConfig.CustomItemConfig a2 = a(customChangeInfo);
        if (a2 == null || !a2.statistics) {
            return false;
        }
        int i = a2.sampling;
        if (i != 10000 && i < new Random().nextInt(10000)) {
            return false;
        }
        return customChangeInfo.isGray();
    }

    public static boolean d(CustomChangeInfo customChangeInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac7bd36d", new Object[]{customChangeInfo})).booleanValue();
        }
        TinctConfig.CustomItemConfig a2 = a(customChangeInfo);
        if (a2 == null) {
            return false;
        }
        if (a2.monitorType != 2) {
            return a2.monitorType == 1 && Boolean.TRUE.equals(customChangeInfo.getGrayFlag()) && !a(a2.grayExpire, customChangeInfo.getUpdateTime());
        } else if (a2.monitor == null) {
            return false;
        } else {
            Iterator<TinctConfig.CustomMonitor> it = a2.monitor.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                TinctConfig.CustomMonitor next = it.next();
                if (StringUtils.equals(next.ver, customChangeInfo.getVersion())) {
                    if (!StringUtils.isEmpty(next.configType) ? StringUtils.equals(next.configType, customChangeInfo.getConfigType()) : true) {
                        if (next.isGray && !a(a2.grayExpire, customChangeInfo.getUpdateTime())) {
                            return true;
                        }
                        break;
                    }
                }
            }
            return false;
        }
    }

    public static boolean e(CustomChangeInfo customChangeInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65f3610c", new Object[]{customChangeInfo})).booleanValue();
        }
        TinctConfig.CustomItemConfig a2 = a(customChangeInfo);
        if (a2 == null) {
            return true;
        }
        if (a2.monitorType != 2) {
            return a2.monitorType != 1 || !Boolean.TRUE.equals(customChangeInfo.getGrayFlag());
        } else if (a2.monitor == null) {
            return true;
        } else {
            for (TinctConfig.CustomMonitor customMonitor : a2.monitor) {
                if (StringUtils.equals(customMonitor.ver, customChangeInfo.getVersion())) {
                    if (!StringUtils.isEmpty(customMonitor.configType) ? StringUtils.equals(customMonitor.configType, customChangeInfo.getConfigType()) : true) {
                        return !customMonitor.isGray;
                    }
                }
            }
            return true;
        }
    }

    public static boolean f(CustomChangeInfo customChangeInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1f6aeeab", new Object[]{customChangeInfo})).booleanValue();
        }
        TinctConfig.CustomItemConfig a2 = a(customChangeInfo);
        if (a2 != null) {
            return a2.launchStatistics;
        }
        return false;
    }

    private static boolean a(int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c11568d", new Object[]{new Integer(i), new Long(j)})).booleanValue();
        }
        if (i < 0) {
            return false;
        }
        return i == 0 || System.currentTimeMillis() - j > ((long) i) * 3600000;
    }

    public static int g(CustomChangeInfo customChangeInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d8e27c39", new Object[]{customChangeInfo})).intValue();
        }
        TinctConfig.CustomItemConfig a2 = a(customChangeInfo);
        if (a2 != null) {
            return a2.statisticsType;
        }
        return 0;
    }

    public static long h(CustomChangeInfo customChangeInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("925a09d9", new Object[]{customChangeInfo})).longValue();
        }
        long j = b.customConfig.fullExpire * 86400000;
        TinctConfig.CustomItemConfig a2 = a(customChangeInfo);
        return (a2 == null || a2.expire <= 0) ? j : a2.expire * 86400000;
    }

    public static long i(CustomChangeInfo customChangeInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4bd19778", new Object[]{customChangeInfo})).longValue();
        }
        TinctConfig.CustomItemConfig a2 = a(customChangeInfo);
        if (a2 != null && a2.grayExpire > 0) {
            return a2.grayExpire * 3600000;
        }
        return 4147200000L;
    }

    public static boolean o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[0])).booleanValue() : b.dynamicConfig.isMonitorEnable;
    }

    public static boolean a(com.taobao.tinct.model.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dbf48e18", new Object[]{aVar})).booleanValue();
        }
        if (!b.dynamicConfig.isStatisticsEnable || aVar == null || !aVar.a() || !aVar.b()) {
            return false;
        }
        int i = b.dynamicConfig.sampling;
        return i == 10000 || i >= new Random().nextInt(10000);
    }
}
