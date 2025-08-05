package com.taobao.accs.utl;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.asp.APreferencesManager;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.artc.api.AConstants;
import com.taobao.media.MediaConstant;
import com.taobao.orange.OrangeConfig;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.dco;
import tb.jzv;
import tb.kge;
import tb.suq;

/* loaded from: classes.dex */
public class l {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NAMESPACE = "accs";

    /* renamed from: a  reason: collision with root package name */
    public static boolean f8312a;
    private static final Map<Integer, List<String>> b;
    private static Boolean c;
    private static volatile Boolean d;
    private static volatile Long e;
    private static volatile Integer f;
    private static volatile String g;
    private static volatile String h;
    private static String i;
    private static Boolean j;
    private static SharedPreferences k;

    public static boolean j(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a42f6cfb", new Object[]{context})).booleanValue();
        }
        return true;
    }

    static {
        kge.a(-998030987);
        f8312a = false;
        b = new HashMap();
        k = null;
        try {
            Class.forName("com.taobao.orange.OrangeConfig");
            f8312a = true;
        } catch (Exception unused) {
            f8312a = false;
        }
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = null;
        j = null;
    }

    public static void a(String[] strArr, com.taobao.orange.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7a10751", new Object[]{strArr, gVar});
        } else if (f8312a) {
            OrangeConfig.getInstance().registerListener(strArr, gVar);
        } else {
            ALog.w("OrangeAdapter", "no orange sdk", new Object[0]);
        }
    }

    public static String a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("457cf91a", new Object[]{str, str2, str3});
        }
        if (f8312a) {
            return OrangeConfig.getInstance().getConfig(str, str2, str3);
        }
        ALog.w("OrangeAdapter", "no orange sdk", new Object[0]);
        return str3;
    }

    public static boolean a() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        try {
            z = Boolean.parseBoolean(a("accs", "main_function_enable", "true"));
        } catch (Throwable th) {
            ALog.e("OrangeAdapter", "isAccsEnabled", th, new Object[0]);
            z = true;
        }
        ALog.i("OrangeAdapter", "isAccsEnabled", "enable", Boolean.valueOf(z));
        return z;
    }

    public static boolean a(Context context) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        try {
            z = b(context, "switch", false);
        } catch (Throwable th) {
            ALog.e("OrangeAdapter", "isEventCollectEnable", th, new Object[0]);
            z = false;
        }
        Boolean bool = c;
        if (bool == null || bool.booleanValue() != z) {
            ALog.e("OrangeAdapter", "isEventCollectEnable", "result", Boolean.valueOf(z));
            c = Boolean.valueOf(z);
        }
        return z;
    }

    public static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{context})).booleanValue();
        }
        if (d == null) {
            try {
                d = Boolean.valueOf(b(context, Constants.KEY_CONTROL, false));
            } catch (Throwable th) {
                ALog.e("OrangeAdapter", "isTriggerEnable", th, new Object[0]);
                d = false;
            }
        }
        ALog.e("OrangeAdapter", "isTriggerEnable", "result", d);
        return d.booleanValue();
    }

    public static boolean c(Context context) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f76bba2", new Object[]{context})).booleanValue();
        }
        try {
            z = k(context).getBoolean(Constants.SP_KEY_ASP_ENABLE, true);
        } catch (Throwable th) {
            ALog.e("OrangeAdapter", "isAspEnable", th, new Object[0]);
            z = false;
        }
        ALog.d("OrangeAdapter", "isAspEnable", "result", Boolean.valueOf(z));
        return z;
    }

    public static int d(Context context) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a0236730", new Object[]{context})).intValue();
        }
        try {
            i2 = APreferencesManager.getSharedPreferences(context, "adaemon", 4).getInt(suq.REFRESH_BROWSER_BADGE_DATA_ARGS_TRIGGER_TYPE, 0);
        } catch (Throwable th) {
            ALog.e("OrangeAdapter", "getADaemonTriggerType", th, new Object[0]);
            i2 = 0;
        }
        ALog.d("OrangeAdapter", "getADaemonTriggerType", "result", Integer.valueOf(i2));
        return i2;
    }

    public static void e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0d012dc", new Object[]{context});
            return;
        }
        try {
            SharedPreferences.Editor edit = APreferencesManager.getSharedPreferences(context, "adaemon", 4).edit();
            edit.putInt(suq.REFRESH_BROWSER_BADGE_DATA_ARGS_TRIGGER_TYPE, 0);
            edit.apply();
        } catch (Throwable th) {
            ALog.e("OrangeAdapter", "setADaemonTriggerType", th, new Object[0]);
        }
    }

    public static void f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a17cbe7b", new Object[]{context});
            return;
        }
        try {
            SharedPreferences.Editor edit = APreferencesManager.getSharedPreferences(context, Constants.SP_FILE_NAME, 0).edit();
            edit.putInt("version", b() ? 302 : AConstants.ArtcErrorServerErrorDropByMobility);
            edit.apply();
        } catch (Throwable th) {
            ALog.e("OrangeAdapter", "setDefaultVersion fail:", th, new Object[0]);
        }
    }

    public static int g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a2296a0d", new Object[]{context})).intValue();
        }
        int i2 = Constants.SDK_VERSION_CODE;
        try {
            i2 = b(context, "version", b() ? 302 : Constants.SDK_VERSION_CODE);
        } catch (Throwable th) {
            ALog.e("OrangeAdapter", "getCurrentVersion", th, new Object[0]);
        }
        ALog.d("OrangeAdapter", "getCurrentVersion", "result", Integer.valueOf(i2));
        return i2;
    }

    public static long h(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a2d615ad", new Object[]{context})).longValue();
        }
        if (e == null) {
            try {
                e = Long.valueOf(APreferencesManager.getSharedPreferences(context, Constants.SP_FILE_NAME, 0).getLong(Constants.SP_KEY_LAST_LAUNCH_TIME, 0L));
            } catch (Throwable th) {
                ALog.e("OrangeAdapter", "getLastActiveTime", th, new Object[0]);
            }
            ALog.d("OrangeAdapter", "getLastActiveTime", "result", e);
        }
        return e.longValue();
    }

    public static long i(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a382c14c", new Object[]{context})).longValue();
        }
        if (f == null) {
            try {
                f = Integer.valueOf(APreferencesManager.getSharedPreferences(context, Constants.SP_FILE_NAME, 0).getInt(Constants.SP_KEY_CONNECT_TIMEOUT, 10000));
            } catch (Throwable th) {
                ALog.e("OrangeAdapter", "getConnectTimeout", th, new Object[0]);
            }
            ALog.d("OrangeAdapter", "getConnectTimeout", "result", f);
        }
        return f.intValue();
    }

    public static String l(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c805810b", new Object[]{context});
        }
        String str = "2";
        try {
            str = APreferencesManager.getSharedPreferences(context, Constants.SP_FILE_NAME, 0).getString(Constants.SP_KEY_CONN_SERVICE_TYPE, str);
        } catch (Throwable th) {
            ALog.e("OrangeAdapter", "getConnectionServiceType", th, new Object[0]);
        }
        ALog.d("OrangeAdapter", "getConnectionServiceType", "type", str);
        return str;
    }

    public static boolean a(Context context, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("74de81b1", new Object[]{context, new Integer(i2), str})).booleanValue();
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                if (b(context, i2, Constants.SP_FILE_NAME).contains(str)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e2) {
            ALog.e("OrangeAdapter", "isServiceIdEnabledWithType err", e2, new Object[0]);
            return false;
        }
    }

    public static List<String> b(Context context, int i2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("22a924d9", new Object[]{context, new Integer(i2), str});
        }
        String str2 = null;
        String str3 = "";
        switch (i2) {
            case 0:
                str2 = Constants.SP_KEY_UP_RETRY_IDS;
                str3 = "powermsg3";
                break;
            case 1:
                str2 = Constants.SP_KEY_NEW_WV_IDS;
                str3 = Constants.HD_DDZ;
                break;
            case 2:
                str2 = Constants.SP_KEY_DOWN_RTT;
                break;
            case 3:
                str2 = Constants.SP_KEY_DOWN_MESSAGE;
                str3 = "powermsg";
                break;
            case 4:
                str2 = Constants.SP_KEY_CB_LISTENER;
                str3 = "powermsg";
                break;
            case 5:
                str2 = Constants.SP_KEY_BG_MSG_FILTER;
                str3 = Constants.TARGET_SERVICE_EVENT_COLLECT;
                break;
            case 6:
                str2 = Constants.SP_KEY_IPC_SVC_TO_LISTENER;
                break;
            case 7:
                str2 = m.KEY_CONN_TO_PULL;
                str3 = "powermsg,powermsg3";
                break;
            case 8:
                str2 = m.KEY_BLOCK_SERVICE;
                str3 = "powermsg3";
                break;
        }
        if (TextUtils.isEmpty(str2)) {
            ALog.d("OrangeAdapter", "getServiceIdsByType, empty key", "type", Integer.valueOf(i2));
            return Collections.emptyList();
        }
        synchronized (b) {
            List<String> list = b.get(Integer.valueOf(i2));
            if (list != null && list.size() > 0) {
                return list;
            }
            String string = APreferencesManager.getSharedPreferences(context, str, 0).getString(str2, str3);
            if (!TextUtils.isEmpty(string)) {
                List<String> asList = Arrays.asList(string.split(","));
                b.put(Integer.valueOf(i2), asList);
                ALog.e("OrangeAdapter", "getServiceIdsByType content", "key", str2, "serviceIdMap", b, "list", asList);
                ALog.d("OrangeAdapter", "getServiceIdsByType", "type", Integer.valueOf(i2), "ids", string);
                return asList;
            }
            ALog.d("OrangeAdapter", "getServiceIdsByType", "type", Integer.valueOf(i2), "ids", string);
            return Collections.emptyList();
        }
    }

    public static void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{context, str});
            return;
        }
        try {
            g = str;
            SharedPreferences.Editor edit = APreferencesManager.getSharedPreferences(context, Constants.SP_FILE_NAME, 0).edit();
            edit.putString(Constants.KEY_EVENT_COLLECT_STRATEGY, str);
            edit.apply();
            ALog.i("OrangeAdapter", "saveEventCollectStrategy", "strategy", str, null);
        } catch (Throwable th) {
            ALog.e("OrangeAdapter", "saveEventCollectStrategy fail:", th, "strategy", str);
        }
    }

    public static String n(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b2f9cd8d", new Object[]{context});
        }
        if (g == null) {
            try {
                g = APreferencesManager.getSharedPreferences(context, Constants.SP_FILE_NAME, 0).getString(Constants.KEY_EVENT_COLLECT_STRATEGY, "");
            } catch (Throwable th) {
                ALog.e("OrangeAdapter", "getEventCollectStrategy", th, new Object[0]);
                g = "";
            }
        }
        ALog.d("OrangeAdapter", "getEventCollectStrategy", "result", g);
        return g;
    }

    public static void b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b80d809", new Object[]{context, str});
            return;
        }
        try {
            h = str;
            SharedPreferences.Editor edit = APreferencesManager.getSharedPreferences(context, Constants.SP_FILE_NAME, 0).edit();
            edit.putString("strategy", str);
            edit.apply();
        } catch (Throwable th) {
            ALog.e("OrangeAdapter", "saveStrategy fail:", th, "strategy", str);
        }
    }

    public static String o(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2873f3ce", new Object[]{context});
        }
        if (h == null) {
            try {
                h = APreferencesManager.getSharedPreferences(context, Constants.SP_FILE_NAME, 0).getString("strategy", MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264);
            } catch (Throwable th) {
                ALog.e("OrangeAdapter", "getStrategy", th, new Object[0]);
                h = MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264;
            }
        }
        ALog.d("OrangeAdapter", "getStrategy", "result", h);
        return h;
    }

    public static void c(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d54b79e8", new Object[]{context, str});
            return;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            i = str;
            SharedPreferences.Editor edit = APreferencesManager.getSharedPreferences(context, Constants.SP_FILE_NAME, 4).edit();
            edit.putString(Constants.SP_KEY_REG_ID, str);
            edit.commit();
        } catch (Throwable th) {
            ALog.e("OrangeAdapter", "saveRegId fail:", th, "regId", str);
        }
    }

    public static void p(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a83b72b1", new Object[]{context});
            return;
        }
        try {
            SharedPreferences.Editor edit = APreferencesManager.getSharedPreferences(context, Constants.SP_FILE_NAME, 0).edit();
            edit.remove(Constants.SP_KEY_REG_ID);
            edit.apply();
        } catch (Throwable th) {
            ALog.e("OrangeAdapter", "clearRegId fail:", th, "regId", i);
        }
    }

    public static String q(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13684050", new Object[]{context});
        }
        if (context == null) {
            context = jzv.a();
        }
        if (TextUtils.isEmpty(i)) {
            try {
                i = APreferencesManager.getSharedPreferences(context, Constants.SP_FILE_NAME, 4).getString(Constants.SP_KEY_REG_ID, "");
            } catch (Throwable th) {
                ALog.e("OrangeAdapter", "getRegId", th, new Object[0]);
            }
            ALog.d("OrangeAdapter", "getRegId", "result", i);
        }
        return i;
    }

    public static boolean r(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a994c9f3", new Object[]{context})).booleanValue() : TextUtils.isEmpty(q(context));
    }

    public static void a(Context context, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("258f9e64", new Object[]{context, new Long(j2)});
            return;
        }
        try {
            e = Long.valueOf(j2);
            SharedPreferences.Editor edit = APreferencesManager.getSharedPreferences(context, Constants.SP_FILE_NAME, 0).edit();
            edit.putLong(Constants.SP_KEY_LAST_LAUNCH_TIME, j2);
            edit.apply();
        } catch (Throwable th) {
            ALog.e("OrangeAdapter", "saveLastActiveTime fail:", th, "lastLaunchTime", Long.valueOf(j2));
        }
    }

    public static boolean s(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aa417592", new Object[]{context})).booleanValue() : !r(context);
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        if (UtilityImpl.isDualApp(GlobalClientInfo.getContext())) {
            return false;
        }
        if (j == null) {
            j = true;
            try {
                File file = new File(GlobalClientInfo.getContext().getDir("accs", 0), dco.FILE_SCS);
                if (file.exists()) {
                    file.delete();
                }
            } catch (Throwable th) {
                ALog.e("OrangeAdapter", "isGlobalChannelEnable", th, new Object[0]);
            }
        }
        return j.booleanValue();
    }

    public static boolean d() {
        Throwable th;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue();
        }
        try {
            z = b(GlobalClientInfo.getContext(), Constants.SP_KEY_MASS_SWITCH, true);
            try {
                ALog.d("OrangeAdapter", "optMassEnabled", "enabled", Boolean.valueOf(z));
            } catch (Throwable th2) {
                th = th2;
                ALog.e("OrangeAdapter", "optMassEnabled", th, new Object[0]);
                return z;
            }
        } catch (Throwable th3) {
            th = th3;
            z = true;
        }
        return z;
    }

    public static Pair<Integer, Integer> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("61579b6", new Object[0]);
        }
        try {
            String b2 = b(GlobalClientInfo.getContext(), Constants.SP_KEY_KEEP_ALIVE_RANGE, "3,96");
            String[] split = b2.split(",");
            if (split.length == 2) {
                ALog.e("OrangeAdapter", "getKeepAliveIdRange", "range", b2);
                return Pair.create(Integer.valueOf(Integer.parseInt(split[0])), Integer.valueOf(Integer.parseInt(split[1])));
            }
        } catch (Throwable th) {
            ALog.e("OrangeAdapter", "getKeepAliveIdRange err", th, new Object[0]);
        }
        return Pair.create(2, 96);
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[0])).booleanValue();
        }
        boolean z = true;
        try {
            z = b(GlobalClientInfo.getContext(), Constants.SP_KEY_BG_LIMIT_SWITCH, true);
        } catch (Throwable th) {
            ALog.e("OrangeAdapter", "bgLimitEnabled err", th, new Object[0]);
        }
        ALog.d("OrangeAdapter", "bgLimitEnabled = " + z, new Object[0]);
        return z;
    }

    private static boolean b(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d49adbef", new Object[]{context, str, new Boolean(z)})).booleanValue();
        }
        try {
            return APreferencesManager.getSharedPreferences(context, Constants.SP_FILE_NAME, 4).getBoolean(str, z);
        } catch (Exception e2) {
            ALog.e("OrangeAdapter", "getConfigFromSP fail:", e2, "key", str);
            return z;
        }
    }

    public static SharedPreferences k(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("5e8823ea", new Object[]{context});
        }
        if (k == null) {
            synchronized (l.class) {
                if (k == null) {
                    k = context.getSharedPreferences(Constants.SP_FILE_NAME, 0);
                }
            }
        }
        return k;
    }

    private static int b(Context context, String str, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d49a9c0d", new Object[]{context, str, new Integer(i2)})).intValue();
        }
        try {
            return APreferencesManager.getSharedPreferences(context, Constants.SP_FILE_NAME, 4).getInt(str, i2);
        } catch (Exception e2) {
            ALog.e("OrangeAdapter", "getConfigFromSP fail:", e2, "key", str);
            return i2;
        }
    }

    private static String b(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a3b17b6d", new Object[]{context, str, str2});
        }
        try {
            return APreferencesManager.getSharedPreferences(context, Constants.SP_FILE_NAME, 4).getString(str, str2);
        } catch (Exception e2) {
            ALog.e("OrangeAdapter", "getConfigFromSP fail:", e2, "key", str);
            return str2;
        }
    }

    public static void a(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d51141ea", new Object[]{context, str, new Boolean(z)});
            return;
        }
        try {
        } catch (Exception e2) {
            ALog.e("OrangeAdapter", "saveConfigToSP fail:", e2, "key", str, "value", Boolean.valueOf(z));
        }
        if (context == null) {
            ALog.e("OrangeAdapter", "saveTLogOffToSP context null", new Object[0]);
            return;
        }
        SharedPreferences.Editor edit = APreferencesManager.getSharedPreferences(context, Constants.SP_FILE_NAME, 4).edit();
        edit.putBoolean(str, z);
        edit.apply();
        ALog.i("OrangeAdapter", "saveConfigToSP", "key", str, "value", Boolean.valueOf(z));
    }

    public static void a(Context context, String str, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5110219", new Object[]{context, str, new Integer(i2)});
            return;
        }
        try {
        } catch (Exception e2) {
            ALog.e("OrangeAdapter", "saveConfigToSP fail:", e2, "key", str, "value", Integer.valueOf(i2));
        }
        if (context == null) {
            ALog.e("OrangeAdapter", "saveTLogOffToSP context null", new Object[0]);
            return;
        }
        SharedPreferences.Editor edit = APreferencesManager.getSharedPreferences(context, Constants.SP_FILE_NAME, 4).edit();
        edit.putInt(str, i2);
        edit.apply();
        ALog.i("OrangeAdapter", "saveConfigToSP", "key", str, "value", Integer.valueOf(i2));
    }

    public static void a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d18de974", new Object[]{context, str, str2});
            return;
        }
        try {
        } catch (Exception e2) {
            ALog.e("OrangeAdapter", "saveConfigToSP fail:", e2, "key", str, "value", str2);
        }
        if (context == null) {
            ALog.e("OrangeAdapter", "saveTLogOffToSP context null", new Object[0]);
            return;
        }
        SharedPreferences.Editor edit = APreferencesManager.getSharedPreferences(context, Constants.SP_FILE_NAME, 4).edit();
        edit.putString(str, str2);
        edit.apply();
        ALog.i("OrangeAdapter", "saveConfigToSP", "key", str, "value", str2);
    }

    private static void a(Context context, Map<String, Boolean> map) {
        SharedPreferences k2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8df32b25", new Object[]{context, map});
        } else if (map != null) {
            try {
            } catch (Exception e2) {
                ALog.e("OrangeAdapter", "saveConfigsToSP fail:", e2, "configs", map.toString());
            }
            if (map.size() == 0) {
                return;
            }
            Boolean bool = map.get(Constants.SP_KEY_ASP_ENABLE);
            if (bool != null && bool.booleanValue()) {
                k2 = APreferencesManager.getSharedPreferences(context, Constants.SP_FILE_NAME, 4);
            } else {
                k2 = k(context);
            }
            SharedPreferences.Editor edit = k2.edit();
            for (Map.Entry<String, Boolean> entry : map.entrySet()) {
                edit.putBoolean(entry.getKey(), entry.getValue().booleanValue());
            }
            edit.apply();
            ALog.i("OrangeAdapter", "saveConfigsToSP-accs", "configs", map.toString());
        }
    }

    public static void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[0]);
            return;
        }
        c.a(GlobalClientInfo.getContext());
        HashMap hashMap = new HashMap();
        hashMap.put(Constants.SP_KEY_KEEP_ALIVE_INIT_ENABLE, Boolean.valueOf(a("accs", Constants.SP_KEY_KEEP_ALIVE_INIT_ENABLE, "true")));
        hashMap.put(Constants.SP_KEY_NORMAL_SWITCH, Boolean.valueOf(a("accs", Constants.SP_KEY_NORMAL_SWITCH, "true")));
        hashMap.put(Constants.SP_KEY_MASS_SWITCH, Boolean.valueOf(a("accs", Constants.SP_KEY_MASS_SWITCH, "true")));
        hashMap.put(Constants.SP_KEY_BG_LIMIT_SWITCH, Boolean.valueOf(a("accs", Constants.SP_KEY_BG_LIMIT_SWITCH, "true")));
        hashMap.put(Constants.SP_KEY_ASP_ENABLE, Boolean.valueOf(a("accs", Constants.SP_KEY_ASP_ENABLE, "true")));
        a(GlobalClientInfo.getContext(), Constants.SP_KEY_CONN_SERVICE_TYPE, a("accs", Constants.SP_KEY_CONN_SERVICE_TYPE, "2"));
        a(GlobalClientInfo.getContext(), Constants.SP_KEY_UP_RETRY_IDS, a("accs", Constants.SP_KEY_UP_RETRY_IDS, "powermsg3"));
        a(GlobalClientInfo.getContext(), Constants.SP_KEY_NEW_WV_IDS, a("accs", Constants.SP_KEY_NEW_WV_IDS, Constants.HD_DDZ));
        a(GlobalClientInfo.getContext(), Constants.SP_KEY_DOWN_RTT, a("accs", Constants.SP_KEY_DOWN_RTT, ""));
        a(GlobalClientInfo.getContext(), Constants.SP_KEY_KEEP_ALIVE_RANGE, a("accs", Constants.SP_KEY_KEEP_ALIVE_RANGE, "3,96"));
        a(GlobalClientInfo.getContext(), Constants.SP_KEY_DOWN_MESSAGE, a("accs", Constants.SP_KEY_DOWN_MESSAGE, "powermsg"));
        a(GlobalClientInfo.getContext(), Constants.SP_KEY_CB_LISTENER, a("accs", Constants.SP_KEY_CB_LISTENER, "powermsg"));
        a(GlobalClientInfo.getContext(), Constants.SP_KEY_BG_MSG_FILTER, a("accs", Constants.SP_KEY_BG_MSG_FILTER, Constants.TARGET_SERVICE_EVENT_COLLECT));
        a(GlobalClientInfo.getContext(), Constants.SP_KEY_IPC_SVC_TO_LISTENER, a("accs", Constants.SP_KEY_IPC_SVC_TO_LISTENER, Constants.IMPAAS));
        try {
            a(GlobalClientInfo.getContext(), Constants.SP_KEY_CONNECT_TIMEOUT, Integer.parseInt(a("accs", Constants.SP_KEY_CONNECT_TIMEOUT, String.valueOf(10000))));
        } catch (NumberFormatException unused) {
            a(GlobalClientInfo.getContext(), Constants.SP_KEY_CONNECT_TIMEOUT, 10000);
        }
        a(GlobalClientInfo.getContext(), hashMap);
    }

    /* loaded from: classes.dex */
    public static class a implements com.taobao.orange.g {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-201718735);
            kge.a(-498751155);
        }

        @Override // com.taobao.orange.g
        public void onConfigUpdate(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9458c0f9", new Object[]{this, str, new Boolean(z)});
            } else if (GlobalClientInfo.getContext() == null) {
                ALog.e("OrangeAdapter", "onConfigUpdate context null", new Object[0]);
            } else {
                try {
                    ALog.i("OrangeAdapter", "onConfigUpdate", "namespace", str);
                    if ("accs".equals(str)) {
                        l.h();
                        l.g();
                    } else if (!m.NAMESPACE.equals(str)) {
                    } else {
                        m.o();
                        m.a(OrangeConfig.getInstance().getConfigs(str), m.SP_NAME_ORI);
                    }
                } catch (Throwable th) {
                    ALog.e("OrangeAdapter", "onConfigUpdate", th, new Object[0]);
                }
            }
        }
    }

    public static void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[0]);
        } else if (a()) {
            if (!UtilityImpl.getFocusDisableStatus(GlobalClientInfo.getContext())) {
                return;
            }
            ALog.i("OrangeAdapter", "force enable service", new Object[0]);
            ACCSManager.forceEnableService(GlobalClientInfo.getContext());
        } else {
            ALog.e("OrangeAdapter", "force disable service", new Object[0]);
            ACCSManager.forceDisableService(GlobalClientInfo.getContext());
        }
    }
}
