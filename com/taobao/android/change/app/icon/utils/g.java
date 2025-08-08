package com.taobao.android.change.app.icon.utils;

import android.os.Build;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.change.app.icon.biz.ChangeAppIconBridge;
import com.taobao.android.change.app.icon.model.AppIconComponentName;
import com.taobao.login4android.Login;
import com.ut.device.UTDevice;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import java.util.Map;
import tb.igc;
import tb.kge;
import tb.riy;

/* loaded from: classes4.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int EVENT_ID_19999 = 19999;
    public static final int EVENT_ID_CLICK = 2101;
    public static final int EVENT_ID_UI_SHOW = 2201;
    public static final String PAGE_NAME = "Page_ChangeAppIcon";

    static {
        kge.a(-1346316072);
    }

    public static void a(String str, String str2, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb3d74f5", new Object[]{str, str2, str3, str4, map});
        } else {
            a(str, 2201, str2, str3, str4, map);
        }
    }

    public static void b(String str, String str2, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba640454", new Object[]{str, str2, str3, str4, map});
        } else {
            a(str, 2101, str2, str3, str4, map);
        }
    }

    public static void c(String str, String str2, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b98a93b3", new Object[]{str, str2, str3, str4, map});
        } else {
            a(str, 19999, str2, str3, str4, map);
        }
    }

    public static void a(String str, int i, String str2, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b903f76", new Object[]{str, new Integer(i), str2, str3, str4, map});
        } else if (!UTAnalytics.getInstance().isInit()) {
        } else {
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(str, i, str2, str3, str4, a(map)).build());
        }
    }

    private static Map<String, String> a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4fc7ad92", new Object[]{map});
        }
        if (map == null) {
            try {
                map = new HashMap();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        String utdid = UTDevice.getUtdid(igc.b());
        map.put("utdid_hash", String.valueOf(Math.abs(Math.abs(utdid.hashCode())) % 10000));
        map.put("utdid", utdid);
        map.put("userId", Login.getOldUserId());
        StringBuilder sb = new StringBuilder();
        sb.append(riy.ARRAY_START_STR);
        int i2 = 0;
        int i3 = 0;
        for (Map.Entry<String, AppIconComponentName> entry : igc.c().entrySet()) {
            AppIconComponentName value = entry.getValue();
            sb.append(value.iconName);
            sb.append(":");
            sb.append(value.state);
            sb.append(";");
            if (value.state == 0) {
                i++;
            } else if (value.state == 1) {
                i2++;
            } else {
                i3++;
            }
        }
        sb.append(riy.ARRAY_END_STR);
        map.put("AppIcons", sb.toString());
        map.put("defaultSize", String.valueOf(i));
        map.put("enableSize", String.valueOf(i2));
        map.put("otherSize", String.valueOf(i3));
        AppIconComponentName d = igc.d(igc.b());
        map.put("currentAppIcon", d.toString());
        AppIconComponentName a2 = igc.a();
        map.put("expectAppIcon", a2.toString());
        map.put("current_eq_expect", String.valueOf(StringUtils.equals(d.clzPath, a2.clzPath)));
        map.put("deviceBrand", Build.BRAND);
        map.put(ChangeAppIconBridge.KEY_DEVICEMODEL, Build.MODEL);
        map.put("osVersion", Build.VERSION.RELEASE);
        map.put("harmonyVersion", h.c());
        return map;
    }
}
