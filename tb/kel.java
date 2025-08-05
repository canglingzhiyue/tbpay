package tb;

import android.app.Application;
import android.content.SharedPreferences;
import com.alibaba.android.bindingx.core.internal.BindingXConstants;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.linked.h;
import com.taobao.orange.OrangeConfig;
import com.taobao.orange.d;
import java.util.Map;

/* loaded from: classes.dex */
public class kel {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String COLD_START_NEW_ENABLE = "coldStartNewEnable";
    public static final String COLD_START_SPLASH_SHOW_ENABLE = "ColdStartSplashShowEnable";
    public static final int DEFAULT_FREEZE_TIME = 30;
    public static final String FREEZETIME = "freezetime";
    public static final String IS_SHOW_JUMP = "isShowJump";
    public static final String SEND_BROADCAST_ENABLE = "sendBroadcastEnable";
    public static final String SPLASH_IS_COLD = "splash_is_cold";

    /* renamed from: a  reason: collision with root package name */
    public static boolean f30008a;
    public static boolean b;
    public static boolean c;
    public static boolean d;
    public static SharedPreferences e;
    public static boolean f;
    public static float g;
    public static float h;
    public static boolean i;
    public static boolean j;
    public static int k;
    public static boolean l;
    public static boolean m;
    public static boolean n;
    private static volatile boolean o;
    public static boolean p;
    private static boolean q;
    private static boolean r;
    private static boolean s;
    private static Boolean t;

    public static /* synthetic */ boolean b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9d6ac0f", new Object[]{new Boolean(z)})).booleanValue();
        }
        r = z;
        return z;
    }

    public static /* synthetic */ boolean c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab8b84ae", new Object[]{new Boolean(z)})).booleanValue();
        }
        s = z;
        return z;
    }

    public static /* synthetic */ boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[0])).booleanValue() : r;
    }

    public static /* synthetic */ boolean i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[0])).booleanValue() : s;
    }

    static {
        kge.a(-1820997056);
        f30008a = false;
        b = false;
        c = true;
        d = true;
        o = false;
        f = false;
        g = 75.0f;
        i = false;
        j = true;
        p = true;
        l = false;
        m = true;
        n = true;
        q = false;
        t = null;
        r = true;
        s = false;
    }

    public static void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c56f77", new Object[]{application});
            return;
        }
        try {
            e = application.getSharedPreferences(tcs.BOOTIMAGE_GROUP_NAME, 0);
            h a2 = h.a("");
            kef g2 = a2.g();
            g2.d();
            if (g2.e()) {
                a2.h().a("CrashOccupied", "ColdStart", keq.CRASH_OCCUPIED, null, null, null);
                c = false;
                d = false;
                kej.a("BootImageColdStartConfigCenter", "isInFreezeTime ");
            } else {
                c = e.getBoolean(COLD_START_NEW_ENABLE, true);
                d = e.getBoolean(COLD_START_SPLASH_SHOW_ENABLE, true);
                f30008a = e.getBoolean(IS_SHOW_JUMP, false);
                b = e.getBoolean(SEND_BROADCAST_ENABLE, false);
            }
            f = e.getBoolean("disable_splash_interact", false);
            h = e.getFloat("splash_interact_slide_distance", g);
            i = e.getBoolean("enable_login_pre_init", false);
            j = e.getBoolean("enable_big_pop", true);
            k = e.getInt("splash_big_pop_max_lottie_duration", 5000);
            m = e.getBoolean("enable_show_pop", true);
            p = e.getBoolean("mamaCommercialEnable", true);
            l = e.getBoolean("ENABLE_INTERACTIVE_COMPATIBLE", false);
            n = e.getBoolean("enable_show_interact_view", true);
            r = e.getBoolean("enable_linked_texiu_ad", true);
            s = e.getBoolean("disableUserInfo", false);
            OrangeConfig.getInstance().registerListener(new String[]{tcs.BOOTIMAGE_GROUP_NAME}, new d() { // from class: tb.kel.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.orange.d
                public void onConfigUpdate(String str, Map<String, String> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                        return;
                    }
                    Map<String, String> configs = OrangeConfig.getInstance().getConfigs(tcs.BOOTIMAGE_GROUP_NAME);
                    if (configs == null) {
                        return;
                    }
                    try {
                        kel.c = Boolean.parseBoolean(kel.a(configs, kel.COLD_START_NEW_ENABLE, "true"));
                        kel.f = Boolean.parseBoolean(kel.a(configs, "disable_splash_interact", "false"));
                        kel.i = Boolean.parseBoolean(kel.a(configs, "enable_login_pre_init", "false"));
                        kel.j = Boolean.parseBoolean(kel.a(configs, "enable_big_pop", "true"));
                        kel.k = Integer.parseInt(kel.a(configs, "splash_big_pop_max_lottie_duration", String.valueOf(5000)));
                        kel.h = Float.parseFloat(kel.a(configs, "splash_interact_slide_distance", String.valueOf(kel.g)));
                        kel.m = Boolean.parseBoolean(kel.a(configs, "enable_show_pop", "true"));
                        kel.p = Boolean.parseBoolean(kel.a(configs, "mamaCommercialEnable", "true"));
                        kel.n = Boolean.parseBoolean(kel.a(configs, "enable_show_interact_view", "true"));
                        kel.l = Boolean.parseBoolean(kel.a(configs, "ENABLE_INTERACTIVE_COMPATIBLE", "false"));
                        kel.b(Boolean.parseBoolean(kel.a(configs, "enable_linked_texiu_ad", "true")));
                        kel.c(Boolean.parseBoolean(kel.a(configs, "disableUserInfo", "false")));
                        SharedPreferences.Editor edit = kel.e.edit();
                        edit.putBoolean(kel.COLD_START_NEW_ENABLE, kel.c);
                        edit.putBoolean(kel.COLD_START_SPLASH_SHOW_ENABLE, Boolean.parseBoolean(kel.a(configs, kel.COLD_START_SPLASH_SHOW_ENABLE, "true")));
                        edit.putBoolean(kel.IS_SHOW_JUMP, Boolean.parseBoolean(kel.a(configs, kel.IS_SHOW_JUMP, "false")));
                        edit.putInt(kel.FREEZETIME, Integer.parseInt(kel.a(configs, kel.FREEZETIME, String.valueOf(30))));
                        edit.putBoolean(kel.SEND_BROADCAST_ENABLE, Boolean.parseBoolean(kel.a(configs, kel.SEND_BROADCAST_ENABLE, "false")));
                        edit.putBoolean("disable_splash_interact", kel.f);
                        edit.putBoolean("enable_login_pre_init", kel.i);
                        edit.putBoolean("enable_big_pop", kel.j);
                        edit.putFloat("splash_interact_slide_distance", kel.h);
                        edit.putBoolean("enable_show_pop", kel.m);
                        edit.putBoolean("mamaCommercialEnable", kel.p);
                        edit.putBoolean("enable_show_interact_view", kel.n);
                        edit.putBoolean("ENABLE_INTERACTIVE_COMPATIBLE", kel.l);
                        edit.putBoolean("enable_linked_texiu_ad", kel.h());
                        edit.putBoolean("disableUserInfo", kel.i());
                        edit.apply();
                    } catch (Exception e2) {
                        kej.a("BootImageColdStartConfigCenter", "onOrangeError", e2);
                    }
                }
            }, false);
        } catch (Throwable th) {
            kej.a("BootImageColdStartConfigCenter", "init Error ", th);
        }
    }

    public static String a(Map<String, String> map, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("696f900f", new Object[]{map, str, str2});
        }
        String str3 = map.get(str);
        return str3 == null ? str2 : str3;
    }

    public static void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z)});
        } else {
            o = z;
        }
    }

    public static SharedPreferences a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SharedPreferences) ipChange.ipc$dispatch("3f11033c", new Object[0]) : e;
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        if (e == null) {
            kej.a("BootImageColdStartConfigCenter", "BootImageColdStartConfigCenter#isSharedPreferencesUsable sharedPreferences is null");
        }
        return e != null;
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue() : l;
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue();
        }
        kej.a("BootImageColdStartConfigCenter", "2ARCH isUpdateArch:" + q);
        return q;
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[0])).booleanValue();
        }
        if (t == null) {
            SharedPreferences sharedPreferences = e;
            if (sharedPreferences != null) {
                t = Boolean.valueOf(sharedPreferences.getBoolean("isAdBizUpdateArch", true));
            } else {
                t = true;
            }
        }
        kej.a("BootImageColdStartConfigCenter", "2ARCH 是否topshow架构升级:" + t);
        Boolean bool = t;
        return bool != null && bool.booleanValue();
    }

    private static boolean a(JSONObject jSONObject, String str) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("48075356", new Object[]{jSONObject, str})).booleanValue();
        }
        if (jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("ext")) != null) {
            return "true".equalsIgnoreCase(jSONObject2.getString(str));
        }
        return false;
    }

    public static void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[0]);
            return;
        }
        q = e.getBoolean("isUpdateArch", true);
        kej.a("BootImageColdStartConfigCenter", "2ARCH loadUpdateArchFlag: isUpdateArch=" + q);
    }

    public static void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{jSONObject});
            return;
        }
        boolean a2 = a(jSONObject, "isUpdateArch");
        boolean a3 = a(jSONObject, "isAdBizUpdateArch");
        kej.a("BootImageColdStartConfigCenter", "2ARCH updateArchFlag: isUpdateArch=" + a2 + ", isAdBizUpdateArch=" + a3);
        e.edit().putBoolean("isUpdateArch", a2).putBoolean("isAdBizUpdateArch", a3).apply();
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
            return;
        }
        boolean z = e.getBoolean("isUpdateArch", false);
        keq h2 = h.a("").h();
        h2.a(str, str2, "disArchFlag_" + z + "_updateArch_" + q, null, null, null);
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[0])).booleanValue() : e.getBoolean("isUpdateArch", false);
    }

    public static boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[0])).booleanValue();
        }
        kej.a("BootImageColdStartConfigCenter", "isEnableLinkedTexiuAd:" + r);
        return r;
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else {
            e.edit().putString(BindingXConstants.KEY_SCENE_TYPE, str).apply();
        }
    }

    public static String k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f1302f6e", new Object[0]) : e.getString(BindingXConstants.KEY_SCENE_TYPE, "");
    }
}
