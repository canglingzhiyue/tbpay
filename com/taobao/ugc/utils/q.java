package com.taobao.ugc.utils;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.util.ap;
import com.taobao.android.litecreator.util.at;
import com.taobao.android.litecreator.util.f;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.Globals;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import mtopsdk.mtop.domain.EnvModeEnum;
import mtopsdk.mtop.global.MtopConfig;
import mtopsdk.mtop.intf.Mtop;
import tb.kge;

/* loaded from: classes9.dex */
public class q {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_AP_FULL_SIZE = 375;
    public static final int DEFAULT_VISION_SIZE = 750;

    static {
        kge.a(-929522142);
    }

    public static int a(Context context, float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("258f8f53", new Object[]{context, new Float(f)})).intValue() : f.a(f);
    }

    public static int a(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a821884b", new Object[]{new Float(f)})).intValue() : f.a(f);
    }

    public static int b(Context context, float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3a785794", new Object[]{context, new Float(f)})).intValue() : Math.round((context.getResources().getDisplayMetrics().widthPixels / 750.0f) * f);
    }

    public static int c(Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4f611fd5", new Object[]{context, new Float(f)})).intValue();
        }
        if (f > 0.0f) {
            return Math.round((f * context.getResources().getDisplayMetrics().widthPixels) / 375.0f);
        }
        return 0;
    }

    public static int b(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a9d660ea", new Object[]{new Float(f)})).intValue() : c(Globals.getApplication(), f);
    }

    public static int a(boolean z, String str, String str2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e40c82d3", new Object[]{new Boolean(z), str, str2, new Integer(i), new Integer(i2)})).intValue();
        }
        if (!z) {
            str = str2;
        }
        if (!z) {
            i = i2;
        }
        return at.b(str, i);
    }

    public static int a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{new Integer(i)})).intValue() : Globals.getApplication().getResources().getColor(i);
    }

    public static int a(String str, String str2) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d9378d6f", new Object[]{str, str2})).intValue();
        }
        int i2 = 0;
        while (true) {
            int indexOf = str.indexOf(str2, i);
            if (indexOf == -1) {
                return i2;
            }
            i = str2.length() + indexOf;
            i2++;
        }
    }

    public static void a(Context context, BroadcastReceiver broadcastReceiver, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aaffb2f1", new Object[]{context, broadcastReceiver, str});
        } else {
            LocalBroadcastManager.getInstance(context).registerReceiver(broadcastReceiver, new IntentFilter(str));
        }
    }

    public static void a(Context context, BroadcastReceiver broadcastReceiver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3a954e7", new Object[]{context, broadcastReceiver});
        } else {
            LocalBroadcastManager.getInstance(context).unregisterReceiver(broadcastReceiver);
        }
    }

    public static void a(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c9cc1d", new Object[]{context, intent});
        } else {
            LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
        }
    }

    public static Map<String, String> a(Uri uri) {
        Set<String> queryParameterNames;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e82965d4", new Object[]{uri});
        }
        HashMap hashMap = new HashMap();
        if (uri != null && (queryParameterNames = uri.getQueryParameterNames()) != null && queryParameterNames.size() != 0) {
            for (String str : queryParameterNames) {
                hashMap.put(str, uri.getQueryParameter(str));
            }
        }
        return hashMap;
    }

    public static String a(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4dcf7ed", new Object[]{str, map});
        }
        StringBuilder sb = new StringBuilder(str);
        for (String str2 : map.keySet()) {
            String str3 = "?";
            if (sb.indexOf(str3) != -1) {
                str3 = "&";
            }
            sb.append(str3);
            sb.append(URLEncoder.encode(str2));
            sb.append("=");
            Object obj = map.get(str2);
            if (obj instanceof String) {
                sb.append(URLEncoder.encode((String) obj));
            } else {
                sb.append(URLEncoder.encode(JSON.toJSONString(obj)));
            }
        }
        return sb.toString();
    }

    public static void a(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f32d068", new Object[]{jSONObject, jSONObject2});
        } else if (jSONObject != null) {
            Set<String> keySet = jSONObject.keySet();
            if (a.a(keySet)) {
                return;
            }
            for (String str : keySet) {
                jSONObject2.put(str, jSONObject.get(str));
            }
        }
    }

    public static int a(Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("61b6361d", new Object[]{context, str})).intValue() : context.getResources().getIdentifier(str, "anim", context.getPackageName());
    }

    public static int a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e1d6453", new Object[]{context})).intValue();
        }
        if (Build.VERSION.SDK_INT >= 17) {
            try {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                ((WindowManager) context.getSystemService(com.taobao.android.weex_framework.util.a.ATOM_EXT_window)).getDefaultDisplay().getRealMetrics(displayMetrics);
                return displayMetrics.heightPixels;
            } catch (Exception unused) {
                return 0;
            }
        }
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    public static int a(Context context, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("258f9a96", new Object[]{context, new Integer(i)})).intValue() : (int) ((i / 1624.0d) * a(context));
    }

    public static String a(Map<String, String> map, String str, String str2) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("696f900f", new Object[]{map, str, str2});
        }
        if (map == null || map.isEmpty()) {
            return "";
        }
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            str2 = "";
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (!z) {
                sb.append(str2);
            }
            sb.append(entry.getKey());
            sb.append(str);
            sb.append(entry.getValue());
            z = false;
        }
        return sb.toString();
    }

    public static String a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1a4c023", new Object[]{map}) : a(map, "=", ";");
    }

    public static Map<String, String> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bf3e1ee7", new Object[]{str});
        }
        HashMap hashMap = new HashMap();
        if (TextUtils.isEmpty(str)) {
            return hashMap;
        }
        for (String str2 : str.split(",")) {
            String[] split = str2.split(":");
            if (split.length == 2) {
                hashMap.put(split[0], split[1]);
            }
        }
        return hashMap;
    }

    public static void a(Activity activity) {
        int a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{activity});
        } else if (activity == null || (a2 = a(activity, "abc_slide_in_bottom")) == 0) {
        } else {
            activity.overridePendingTransition(a2, 17432577);
        }
    }

    public static void c(Activity activity) {
        int a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("792c473c", new Object[]{activity});
        } else if (activity == null || (a2 = a(activity, "abc_slide_out_bottom")) == 0) {
        } else {
            activity.overridePendingTransition(17432576, a2);
        }
    }

    public static void a(Activity activity, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ca63f6b", new Object[]{activity, new Integer(i), new Boolean(z)});
        } else {
            ap.a(activity, i, z);
        }
    }

    public static void b(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fdb367b", new Object[]{activity});
        } else {
            ap.d(activity);
        }
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        MtopConfig mtopConfig = Mtop.instance((String) null, Globals.getApplication()).getMtopConfig();
        return (mtopConfig == null || mtopConfig.envMode == null || mtopConfig.envMode != EnvModeEnum.PREPARE) ? false : true;
    }

    public static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{context})).booleanValue() : (!f(context) || context == null || context.getResources() == null || context.getResources().getConfiguration() == null || (context.getResources().getConfiguration().uiMode & 48) != 32) ? false : true;
    }

    public static boolean c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f76bba2", new Object[]{context})).booleanValue();
        }
        if (Build.VERSION.SDK_INT < 19) {
            return false;
        }
        return com.taobao.android.autosize.l.d(context);
    }

    public static boolean d(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a0236741", new Object[]{context})).booleanValue() : com.taobao.android.autosize.l.b(context);
    }

    public static boolean e(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a0d012e0", new Object[]{context})).booleanValue() : d(context) || c(context);
    }

    private static boolean f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a17cbe7f", new Object[]{context})).booleanValue();
        }
        String str = Build.MANUFACTURER;
        String b = b("dark_mode_black_brands", "huawei, honor");
        return str == null || b == null || !b.contains(str.toLowerCase());
    }

    private static String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4204a5c3", new Object[]{str, str2});
        }
        try {
            String config = OrangeConfig.getInstance().getConfig("tb_ratepublish_android", str, "");
            return TextUtils.isEmpty(config) ? str2 : config;
        } catch (Throwable unused) {
            return str2;
        }
    }
}
