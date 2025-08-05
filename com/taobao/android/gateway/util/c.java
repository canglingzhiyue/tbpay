package com.taobao.android.gateway.util;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.speed.TBSpeed;
import com.taobao.orange.OrangeConfig;
import tb.gkb;
import tb.kge;

/* loaded from: classes.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_ORANGE = "hOrange";
    public static final String ORANGE_GROUP_NAME = "homepage_switch";

    static {
        kge.a(1712175006);
    }

    public static String a(Context context, String str, String str2) {
        String config;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fc35a1ac", new Object[]{context, str, str2});
        }
        try {
            if (TBSpeed.isSpeedEdition(context, KEY_ORANGE)) {
                config = gkb.a().a("homepage_switch", str, str2);
            } else {
                config = OrangeConfig.getInstance().getConfig("homepage_switch", str, str2);
            }
            a.a(str + "=" + config);
            return config;
        } catch (Exception e) {
            e.printStackTrace();
            return str2;
        }
    }

    public static boolean a(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d51141ee", new Object[]{context, str, new Boolean(z)})).booleanValue();
        }
        String a2 = a(context, str, z + "");
        return TextUtils.isEmpty(a2) ? z : a2.trim().toLowerCase().equals("true");
    }
}
