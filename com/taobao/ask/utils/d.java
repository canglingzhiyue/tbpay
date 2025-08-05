package com.taobao.ask.utils;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.Window;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.vividsocial.utils.j;
import java.lang.reflect.Method;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-172601420);
    }

    public static boolean a(Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1e7de914", new Object[]{obj, new Boolean(z)})).booleanValue();
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.equalsIgnoreCase("true")) {
                return true;
            }
            if (str.equalsIgnoreCase("false")) {
                return false;
            }
            try {
                return Integer.parseInt((String) obj) > 0;
            } catch (Exception unused) {
            }
        } else if (obj instanceof Number) {
            return ((Number) obj).intValue() > 0;
        }
        return z;
    }

    public static String a(Object obj, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("93e4ff52", new Object[]{obj, str}) : obj != null ? obj.toString() : str;
    }

    public static boolean a(Window window, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("31d94639", new Object[]{window, new Boolean(z)})).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 21) {
            if (z) {
                window.clearFlags(201326592);
                window.getDecorView().setSystemUiVisibility(9472);
                window.addFlags(Integer.MIN_VALUE);
            } else {
                window.clearFlags(201334784);
                window.getDecorView().setSystemUiVisibility(1280);
                window.addFlags(Integer.MIN_VALUE);
            }
            window.setStatusBarColor(0);
        } else if (Build.VERSION.SDK_INT >= 19) {
            window.addFlags(67108864);
        }
        if (a()) {
            b(window, z);
        }
        return Build.VERSION.SDK_INT >= 21;
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : "Xiaomi".equals(Build.MANUFACTURER);
    }

    private static boolean b(Window window, boolean z) {
        try {
            Class<?> cls = Class.forName("android.view.MiuiWindowManager$LayoutParams");
            int i = cls.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE").getInt(cls);
            Method method = window.getClass().getMethod("setExtraFlags", Integer.TYPE, Integer.TYPE);
            if (z) {
                method.invoke(window, Integer.valueOf(i), Integer.valueOf(i));
            } else {
                method.invoke(window, 0, Integer.valueOf(i));
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static int a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821884b", new Object[]{new Float(f)})).intValue();
        }
        int a2 = (int) (((750.0f / j.a()) * f) + 0.5d);
        if (a2 == 0 && f > 0.0f) {
            return 1;
        }
        return a2;
    }

    public static int b(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9d660ea", new Object[]{new Float(f)})).intValue();
        }
        float a2 = ((j.a() / 750.0f) * f) + 0.5f;
        if (a2 == 0.0f && f > 0.0f) {
            return 1;
        }
        return (int) a2;
    }

    public static void a(Map<String, String> map, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38873cb1", new Object[]{map, str, str2});
        } else if (!TextUtils.isEmpty(map.get(str))) {
        } else {
            map.put(str, str2);
        }
    }

    public static void a(Context context, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a974c1b", new Object[]{context, str, map});
            return;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        Nav.from(context).toUri(buildUpon.build());
    }
}
