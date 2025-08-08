package com.taobao.mytaobao.newsetting;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.mxo;

/* loaded from: classes7.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_SHOW_SEC_SCREEN_LIVE_SWITCH = "showSecScreenLiveSwitch";
    public static final String KEY_SHOW_SEC_SCREEN_SHOP_SWITCH = "showSecScreenShopSwitch";
    public static final String SWITCH_SEC_LIVE = "switch_sec_live";
    public static final String SWITCH_SEC_SHOP = "switch_sec_shop";

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, String> f18435a;

    static {
        kge.a(-1010270295);
        f18435a = new HashMap();
    }

    public static void a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ece2", new Object[]{str, new Boolean(z)});
        } else {
            f18435a.put(str, String.valueOf(z));
        }
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue() : Boolean.parseBoolean(f18435a.get(str));
    }

    public static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{str, str2})).booleanValue();
        }
        String str3 = f18435a.get(str);
        if (StringUtils.isEmpty(str3)) {
            str3 = mxo.a(str);
        }
        if (StringUtils.isEmpty(str3)) {
            f18435a.put(str, str2);
            mxo.a(str, str2);
        } else {
            str2 = str3;
        }
        return Boolean.parseBoolean(str2);
    }

    public static void b(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d257bc1", new Object[]{str, new Boolean(z)});
            return;
        }
        f18435a.put(str, String.valueOf(z));
        mxo.a(str, String.valueOf(z));
    }
}
