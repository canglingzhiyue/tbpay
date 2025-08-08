package com.taobao.android.festival;

import android.content.SharedPreferences;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.Globals;
import java.util.Map;
import tb.kge;

/* loaded from: classes.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_FOREIGN_SKIN_CODE = "foreignSkinCode";
    public static final String SP_KEY_ENABLE_MTOP = "enableMtop";

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f12342a;
    private static Boolean b;
    private static volatile SharedPreferences c;

    public static /* synthetic */ SharedPreferences b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SharedPreferences) ipChange.ipc$dispatch("811fa7d", new Object[0]) : e();
    }

    static {
        kge.a(-6269904);
        f12342a = null;
        b = null;
        OrangeConfig.getInstance().registerListener(new String[]{"festivalskin_switch"}, new com.taobao.orange.d() { // from class: com.taobao.android.festival.d.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.orange.d
            public void onConfigUpdate(String str, Map<String, String> map) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                    return;
                }
                SharedPreferences.Editor edit = d.b().edit();
                edit.putString(d.SP_KEY_ENABLE_MTOP, d.b(d.SP_KEY_ENABLE_MTOP, "false"));
                edit.putBoolean("enableFestival", Boolean.parseBoolean(d.b("enableFestival", "false")));
                edit.apply();
            }
        }, true);
    }

    public static long a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[0])).longValue();
        }
        String b2 = b("festivalRequestInterval", "-1");
        if (StringUtils.isEmpty(b2)) {
            return -1L;
        }
        try {
            return Long.valueOf(b2).longValue();
        } catch (Throwable unused) {
            return -1L;
        }
    }

    public static int a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{new Integer(i)})).intValue();
        }
        String b2 = b("skinMaxSize", String.valueOf(i));
        if (StringUtils.isEmpty(b2)) {
            return i;
        }
        try {
            int intValue = Integer.valueOf(b2).intValue();
            if (intValue <= 5) {
                return intValue;
            }
            return 5;
        } catch (Throwable unused) {
            return i;
        }
    }

    public static String[] c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("5bd428b9", new Object[0]);
        }
        String b2 = b("skinBlackList", "");
        if (!StringUtils.isEmpty(b2)) {
            return b2.split(",");
        }
        return null;
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue();
        }
        if (b == null) {
            b = Boolean.valueOf(e().getBoolean("enableFestival", false));
        }
        return b.booleanValue();
    }

    public static String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4204a5c3", new Object[]{str, str2});
        }
        try {
            return OrangeConfig.getInstance().getConfig("festivalskin_switch", str, str2);
        } catch (Exception e) {
            e.printStackTrace();
            return str2;
        }
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[0])).booleanValue();
        }
        Boolean bool = f12342a;
        if (bool != null) {
            return bool.booleanValue();
        }
        Boolean valueOf = Boolean.valueOf("true".equalsIgnoreCase(b("enableSkinAnimation", "false")));
        f12342a = valueOf;
        return valueOf.booleanValue();
    }

    private static SharedPreferences e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("6314e040", new Object[0]);
        }
        if (c == null) {
            synchronized (d.class) {
                if (c == null) {
                    c = Globals.getApplication().getSharedPreferences("festivalSP", 0);
                }
            }
        }
        return c;
    }

    public static String c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b82f346c", new Object[]{str}) : e().getString(str, "");
    }
}
