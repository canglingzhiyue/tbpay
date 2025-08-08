package com.taobao.android.editionswitcher;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.taobao.windvane.jsbridge.q;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.ability.localization.constants.Location;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.request.HomeLocationResult;
import com.taobao.android.revisionswitch.TBRevisionSwitchManager;
import com.taobao.location.client.TBLocationClient;
import com.taobao.location.common.TBLocationDTO;
import com.taobao.location.common.TBLocationOption;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.intf.MtopParamType;
import mtopsdk.mtop.intf.MtopSetting;
import tb.gho;
import tb.ivm;
import tb.kge;

/* loaded from: classes.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_EDITION_CODE_CHANGED = "EDITON_SWITCHER_EDITTION_CODE_CHANGED";
    public static final String ACTION_LOCATION_CHANGED = "EDITON_SWITCHER_LOCATION_CHANGED";
    public static final String ACTION_LOCATION_RECEIVE = "EDITON_SWITCHER_LOCATION_RECEIVE";
    public static final String CHINA_MAINLAND = "CN";
    public static final String CHINA_VILLIAGE = "CUN";
    public static final String EDITION_OLD = "OLD";
    public static final String KEY_LOCATION_RESULT = "EDITON_SWITCHER_LOCATION_RESULT";
    public static final String PREF_KEY_LAST_REAL_EDITION_CODE = "PREF_KEY_LAST_REAL_EDITION_CODE";
    public static final String PREF_KEY_OVS_EXT = "PREF_KEY_OVS_EXT";
    public static final String PREF_KEY_REAL_EDITION_CODE = "PREF_KEY_REAL_EDITION_CODE";
    public static final String PREF_KEY_REAL_EXT = "PREF_KEY_REAL_EXT";
    public static final String REFRESH_SOURCE_COLD_START = "coldStart";
    public static final String REFRESH_SOURCE_HOT_START = "hotStart";
    public static final String REFRESH_SOURCE_LOGIN_SUCCESS = "loginSuccess";
    public static final String REFRESH_SOURCE_OLD_USER_BIND = "oldUserBind";
    public static final String REFRESH_SOURCE_OTHERS = "others";

    static {
        kge.a(-1944400059);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else {
            q.a("TBEditionPositionSwitcherWVPlugin", (Class<? extends android.taobao.windvane.jsbridge.e>) TBEditionPositionSwitcherWVPlugin.class, true);
        }
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else {
            a(context, "others");
        }
    }

    public static void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{context, str});
            return;
        }
        try {
            TBLocationOption tBLocationOption = new TBLocationOption();
            tBLocationOption.setTimeLimit(TBLocationOption.TimeLimit.valueOf(f()));
            tBLocationOption.setAccuracy(g());
            tBLocationOption.setTimeout(TBLocationOption.Timeout.DEFAULT);
            final LocationCallBack locationCallBack = new LocationCallBack(context, str);
            TBLocationClient.a(context).a(tBLocationOption, locationCallBack, Looper.getMainLooper());
            new Handler().postDelayed(new Runnable() { // from class: com.taobao.android.editionswitcher.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    TLog.loge("EditionPositionSwitcher", "location timeout， callback location");
                    LocationCallBack.this.onLocationChanged(new TBLocationDTO());
                }
            }, 5000L);
        } catch (Throwable th) {
            TLog.loge("EditionPositionSwitcher", "refresh position error", th);
        }
    }

    public static void a(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d51141ea", new Object[]{context, str, new Boolean(z)});
            return;
        }
        try {
            final LocationCallBack locationCallBack = new LocationCallBack(context, str);
            if (z) {
                TBLocationOption tBLocationOption = new TBLocationOption();
                tBLocationOption.setTimeLimit(TBLocationOption.TimeLimit.valueOf(f()));
                tBLocationOption.setAccuracy(g());
                tBLocationOption.setTimeout(TBLocationOption.Timeout.DEFAULT);
                TBLocationClient.a(context).a(tBLocationOption, locationCallBack, Looper.getMainLooper());
            }
            new Handler().postDelayed(new Runnable() { // from class: com.taobao.android.editionswitcher.b.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    TLog.loge("EditionPositionSwitcher", "location timeout， callback location");
                    LocationCallBack.this.onLocationChanged(new TBLocationDTO());
                }
            }, 5000L);
        } catch (Throwable th) {
            TLog.loge("EditionPositionSwitcher", "refresh position error", th);
        }
    }

    public static PositionInfo b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PositionInfo) ipChange.ipc$dispatch("6c9fea16", new Object[]{context});
        }
        PositionInfo a2 = d.a(m(context));
        a2.area = a(context, "PREF_KEY_LOCATION_AREA", "");
        return a2;
    }

    public static PositionInfo c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PositionInfo) ipChange.ipc$dispatch("85a13bb5", new Object[]{context});
        }
        SharedPreferences a2 = com.taobao.android.editionswitcher.homepage.c.a();
        String string = a2.getString(PREF_KEY_REAL_EDITION_CODE, null);
        if (StringUtils.isEmpty(string)) {
            PositionInfo b = d.b();
            b.ovsPopExt = new OvsPopExt();
            return b;
        }
        String string2 = a2.getString("PREF_KEY_REAL_CITY_CODE", null);
        String string3 = a2.getString("PREF_KEY_REAL_CITY_NAME", null);
        String string4 = a2.getString("PREF_KEY_IS_VILLAGER", null);
        String string5 = a2.getString(PREF_KEY_REAL_EXT, null);
        String string6 = a2.getString(PREF_KEY_OVS_EXT, null);
        PositionInfo a3 = d.a(string);
        a3.cityId = string2;
        a3.cityName = string3;
        a3.isVillageUser = string4;
        a3.area = a(context, "PREF_KEY_LOCATION_AREA", "");
        if (!StringUtils.isEmpty(string5)) {
            a3.ext = (PositionInfoExt) JSON.parseObject(string5, PositionInfoExt.class);
        }
        if (!StringUtils.isEmpty(string6)) {
            a3.ovsPopExt = (OvsPopExt) JSON.parseObject(string6, OvsPopExt.class);
        } else {
            a3.ovsPopExt = new OvsPopExt();
        }
        return a3;
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
            return;
        }
        try {
            SharedPreferences a2 = com.taobao.android.editionswitcher.homepage.c.a();
            SharedPreferences.Editor edit = a2.edit();
            edit.putString(PREF_KEY_LAST_REAL_EDITION_CODE, a2.getString(PREF_KEY_REAL_EDITION_CODE, ""));
            edit.apply();
        } catch (Exception unused) {
        }
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[0]) : com.taobao.android.editionswitcher.homepage.c.a().getString(PREF_KEY_LAST_REAL_EDITION_CODE, "CN");
    }

    public static boolean d(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a0236741", new Object[]{context})).booleanValue() : !f(context) && !g(context) && !e(context);
    }

    public static boolean e(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a0d012e0", new Object[]{context})).booleanValue() : StringUtils.equals("OLD", m(context));
    }

    public static boolean f(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a17cbe7f", new Object[]{context})).booleanValue() : b(m(context));
    }

    public static boolean g(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a2296a1e", new Object[]{context})).booleanValue() : StringUtils.equals("CUN", m(context));
    }

    public static boolean h(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a2d615bd", new Object[]{context})).booleanValue() : StringUtils.equals("OLD", c(context).editionCode);
    }

    public static boolean i(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a382c15c", new Object[]{context})).booleanValue() : b(c(context).editionCode);
    }

    private static boolean b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue() : StringUtils.isEmpty(str) || StringUtils.equals("CN", str);
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue() : !StringUtils.isEmpty(str) && !StringUtils.equals("CN", str) && !StringUtils.equals("CUN", str) && !StringUtils.equals("OLD", str);
    }

    public static boolean j(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a42f6cfb", new Object[]{context})).booleanValue() : StringUtils.equals("CUN", c(context).editionCode);
    }

    public static boolean k(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a4dc189a", new Object[]{context})).booleanValue() : StringUtils.equals(b(context).isVillageUser, "y") || StringUtils.equals(c(context).isVillageUser, "y");
    }

    public static void b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b80d809", new Object[]{context, str});
        } else if ((l(context) && StringUtils.equals(m(context), str)) || StringUtils.isEmpty(str)) {
        } else {
            MtopSetting.setParam(Mtop.Id.INNER, MtopParamType.HEADER, "x-region-channel", str);
            e(context, str);
            String c = TBRevisionSwitchManager.i().c(LocationCallBack.ORIGIN_ELDER_HOME);
            String a2 = TBRevisionSwitchManager.i().a(LocationCallBack.ORIGIN_ELDER_HOME, true);
            if (c != null && a2 != null) {
                i.a(str, "elderHome", a2, 1);
            } else if (c == null && a2 != null) {
                i.a(str, "elderHome", a2, 0);
            }
            if (f.a().b()) {
                f.a().a(false);
                HashMap hashMap = new HashMap();
                hashMap.put("elderHome", "0");
                TBRevisionSwitchManager.i().a(hashMap, false, 1);
            }
            String str2 = "editionCode 切换到 " + str;
            try {
                com.alibaba.ability.localization.b.a(Location.cast2Enum(str));
                context.sendBroadcast(new Intent("EDITON_SWITCHER_EDITTION_CODE_CHANGED"));
                com.taobao.android.editionswitcher.core.b.a().a(null, new gho(com.taobao.android.editionswitcher.core.b.EDITION_CODE_CHANGED));
                TLog.loge("EditionPositionSwitcher", "发送地区切换广播");
            } catch (Exception unused) {
            }
            l.m(context);
        }
    }

    public static void a(Context context, String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("742d5b91", new Object[]{context, str, str2, map});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("elderHome", str2);
        TBRevisionSwitchManager.i().a(hashMap, false, 1);
        TBRevisionSwitchManager.i().a(map, false, 1);
        if ((l(context) && StringUtils.equals(m(context), str)) || StringUtils.isEmpty(str)) {
            return;
        }
        MtopSetting.setParam(Mtop.Id.INNER, MtopParamType.HEADER, "x-region-channel", str);
        e(context, str);
        String str3 = "editionCode 切换到 " + str;
        try {
            SharedPreferences.Editor edit = com.taobao.android.editionswitcher.homepage.c.a().edit();
            edit.putString("PREF_KEY_SELECTED_EDITION_CODE", str);
            edit.apply();
            com.alibaba.ability.localization.b.a(Location.cast2Enum(str));
        } catch (Exception unused) {
        }
    }

    public static boolean l(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a588c439", new Object[]{context})).booleanValue();
        }
        try {
            SharedPreferences a2 = com.taobao.android.editionswitcher.homepage.c.a();
            return (a2.getString("PREF_KEY_CHECKED_COUNTRY_CODE", null) == null && a2.getString("PREF_KEY_SELECTED_EDITION_CODE", null) == null) ? false : true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static String m(Context context) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3d7fa74c", new Object[]{context});
        }
        try {
            str = com.alibaba.ability.localization.b.d();
            try {
                if (StringUtils.isEmpty(str)) {
                    str = n(context);
                }
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            str = "CN";
        }
        MtopSetting.setParam(Mtop.Id.INNER, MtopParamType.HEADER, "x-region-channel", str);
        e(context, str);
        return str;
    }

    public static String n(Context context) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b2f9cd8d", new Object[]{context});
        }
        try {
            SharedPreferences a2 = com.taobao.android.editionswitcher.homepage.c.a();
            String string = a2.getString("PREF_KEY_SELECTED_EDITION_CODE", null);
            try {
                return StringUtils.isEmpty(string) ? a2.getString("PREF_KEY_CHECKED_COUNTRY_CODE", "CN") : string;
            } catch (Exception unused) {
                return str;
            }
        } catch (Exception unused2) {
            return "CN";
        }
    }

    public static long c(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d54b79dc", new Object[]{context, str})).longValue();
        }
        try {
            String string = com.taobao.android.editionswitcher.homepage.c.a().getString("PREF_KEY_LAST_REMIND_EDITION_CODE_TIME", null);
            if (string == null) {
                return 0L;
            }
            return JSON.parseObject(string).getLong(str).longValue();
        } catch (Exception unused) {
            return 0L;
        }
    }

    public static void d(Context context, String str) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f161bc7", new Object[]{context, str});
            return;
        }
        try {
            SharedPreferences a2 = com.taobao.android.editionswitcher.homepage.c.a();
            SharedPreferences.Editor edit = a2.edit();
            String string = a2.getString("PREF_KEY_LAST_REMIND_EDITION_CODE_TIME", null);
            if (string == null) {
                jSONObject = new JSONObject();
            } else {
                try {
                    jSONObject = JSON.parseObject(string);
                } catch (Exception unused) {
                    jSONObject = new JSONObject();
                }
            }
            TLog.loge("EditionPositionSwitcher", str + "弹窗时间记录：" + System.currentTimeMillis());
            jSONObject.put(str, (Object) Long.valueOf(System.currentTimeMillis()));
            edit.putString("PREF_KEY_LAST_REMIND_EDITION_CODE_TIME", jSONObject.toJSONString());
            edit.apply();
        } catch (Exception unused2) {
        }
        l.m(context);
    }

    public static void a(Context context, HomeLocationResult homeLocationResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d772a0d", new Object[]{context, homeLocationResult});
            return;
        }
        try {
            SharedPreferences.Editor edit = com.taobao.android.editionswitcher.homepage.c.a().edit();
            edit.putString("PREF_KEY_REAL_CITY_CODE", homeLocationResult.cityId);
            edit.putString("PREF_KEY_REAL_CITY_NAME", homeLocationResult.cityName);
            edit.putString(PREF_KEY_REAL_EDITION_CODE, homeLocationResult.editionCode);
            edit.putString("PREF_KEY_IS_VILLAGER", homeLocationResult.isVillageUser);
            edit.putString(PREF_KEY_REAL_EXT, JSON.toJSONString(new PositionInfoExt(homeLocationResult.hTaoContentImg, homeLocationResult.oldDialogTitle, homeLocationResult.oldDialogSubTitle, homeLocationResult.oldDialogContentImg)));
            if (homeLocationResult.ovsPopExt == null) {
                edit.putString(PREF_KEY_OVS_EXT, JSON.toJSONString(new OvsPopExt()));
            } else {
                edit.putString(PREF_KEY_OVS_EXT, JSON.toJSONString(homeLocationResult.ovsPopExt));
            }
            edit.apply();
        } catch (Exception unused) {
        }
        l.m(context);
    }

    public static void a(Context context, PositionInfo positionInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("462ea3c7", new Object[]{context, positionInfo});
            return;
        }
        try {
            SharedPreferences.Editor edit = com.taobao.android.editionswitcher.homepage.c.a().edit();
            edit.putString("PREF_KEY_REAL_CITY_CODE", positionInfo.cityId);
            edit.putString("PREF_KEY_REAL_CITY_NAME", positionInfo.cityName);
            edit.putString(PREF_KEY_REAL_EDITION_CODE, positionInfo.editionCode);
            edit.putString("PREF_KEY_IS_VILLAGER", positionInfo.isVillageUser);
            edit.putString(PREF_KEY_REAL_EXT, JSON.toJSONString(positionInfo.ext));
            edit.putString(PREF_KEY_OVS_EXT, JSON.toJSONString(positionInfo.ovsPopExt));
            edit.apply();
        } catch (Exception unused) {
        }
        l.m(context);
    }

    public static String a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fc35a1ac", new Object[]{context, str, str2});
        }
        try {
            return com.taobao.android.editionswitcher.homepage.c.a().getString(str, str2);
        } catch (Exception unused) {
            return str2;
        }
    }

    public static void b(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bbd7193", new Object[]{context, str, str2});
            return;
        }
        try {
            SharedPreferences.Editor edit = com.taobao.android.editionswitcher.homepage.c.a().edit();
            edit.putString(str, str2);
            edit.apply();
        } catch (Exception unused) {
        }
    }

    public static void e(Context context, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48e0bda6", new Object[]{context, str});
        } else if (b(str) || h(context) || j(context)) {
            MtopSetting.removeParam(Mtop.Id.INNER, MtopParamType.HEADER, "x-system-lang");
        } else {
            if (Build.VERSION.SDK_INT >= 21) {
                str2 = Locale.getDefault().toLanguageTag();
            } else {
                str2 = Locale.getDefault().getLanguage() + "-" + Locale.getDefault().getCountry();
            }
            MtopSetting.setParam(Mtop.Id.INNER, MtopParamType.HEADER, "x-system-lang", str2);
        }
    }

    private static int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[0])).intValue();
        }
        String config = OrangeConfig.getInstance().getConfig("edition_switcher", "LocationLimitTimeSwitcher", "12");
        if (!StringUtils.isEmpty(config)) {
            try {
                return Integer.valueOf(config).intValue();
            } catch (Throwable unused) {
                Log.e("EditionPositionSwitcher", "time limit NumberFormatException");
            }
        }
        return 12;
    }

    private static TBLocationOption.Accuracy g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBLocationOption.Accuracy) ipChange.ipc$dispatch("b5d2c98f", new Object[0]);
        }
        if ("true".equals(OrangeConfig.getInstance().getConfig("edition_switcher", "LocationAccuracySwitcher", "false"))) {
            return TBLocationOption.Accuracy.TENMETER;
        }
        return TBLocationOption.Accuracy.DEFAULT;
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue() : "true".equals(OrangeConfig.getInstance().getConfig("mtop_app_edition", "openConfigMapping", "true"));
    }

    public static JSONObject e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("bf3ec58c", new Object[0]);
        }
        try {
            return JSONObject.parseObject(OrangeConfig.getInstance().getConfig("mtop_app_edition", "configMapping", "{\"standard_version\":\"ST\",\"new_user_minimalist_version\":\"NW\",\"elder_version\":\"ED\",\"goodprice_version\":\"GP\"}"));
        } catch (Exception unused) {
            return JSONObject.parseObject("{\"standard_version\":\"ST\",\"new_user_minimalist_version\":\"NW\",\"elder_version\":\"ED\",\"goodprice_version\":\"GP\"}");
        }
    }

    public static void a(com.taobao.android.editionswitcher.boarding.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29b12945", new Object[]{dVar});
            return;
        }
        boolean b = com.taobao.android.autosize.l.b(Globals.getApplication());
        boolean d = Build.VERSION.SDK_INT >= 19 ? com.taobao.android.autosize.l.d(Globals.getApplication()) : false;
        if (b || d) {
            TLog.loge("EditionSwitcher", "i18nboarding request is Tablet or FoldDevice");
            if (dVar == null) {
                return;
            }
            dVar.a(false);
            return;
        }
        TLog.loge("EditionSwitcher", "i18nboarding request start");
        new ivm().a(dVar);
    }
}
