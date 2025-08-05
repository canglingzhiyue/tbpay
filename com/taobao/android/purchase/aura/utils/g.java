package com.taobao.android.purchase.aura.utils;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PAGE_NAME = "Page_ConfirmOrder";
    public static final int TYPE_APPEAR = 2;
    public static final int TYPE_SKIP = 1;
    public static final int TYPE_UNKNOWN = 0;

    /* renamed from: a  reason: collision with root package name */
    private static int f14754a;

    static {
        kge.a(-1939295593);
        f14754a = 0;
    }

    public static void a(Context context, int i, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c23b4682", new Object[]{context, new Integer(i), map});
            return;
        }
        f14754a = i;
        a(context, map);
    }

    public static void a(Context context, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8df32b25", new Object[]{context, map});
        } else if (context == null) {
        } else {
            int i = f14754a;
            if (i != 2) {
                if (i != 1) {
                    return;
                }
                UTAnalytics.getInstance().getDefaultTracker().skipPage(context);
                return;
            }
            UTAnalytics.getInstance().getDefaultTracker().updatePageName(context, "Page_ConfirmOrder");
            UTAnalytics.getInstance().getDefaultTracker().pageAppearDonotSkip(context, "Page_ConfirmOrder");
            HashMap hashMap = new HashMap();
            hashMap.put("containerType", "confirmOrderV2");
            if (map != null && map.size() > 0) {
                hashMap.putAll(map);
            }
            UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(context, hashMap);
        }
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else if (context == null || f14754a != 2) {
        } else {
            UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(context);
        }
    }

    public static void b(Context context, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2893eda6", new Object[]{context, map});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(context, map);
        }
    }

    public static void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{context});
        } else {
            f14754a = 0;
        }
    }
}
