package com.taobao.weex.base;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import tb.kge;

/* loaded from: classes9.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String WX_V2_CONFIG = "weex_v2_config";

    static {
        kge.a(-1937827971);
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue() : "true".equals(OrangeConfig.getInstance().getConfig("weex_v2_config", "init_v2_sync", "false"));
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : OrangeConfig.getInstance().getConfig("android_weex_common_config", "loadingList", "['https://market.m.taobao.com/app/vip/receiver-address/pages/list','https://market.m.taobao.com/app/vip/receiver-address/pages/address','https://market.m.taobao.com/app/vip/receiver-address/pages/lbs-list','https://market.m.taobao.com/app/vip/receiver-address/pages/change','https://market.m.taobao.com/apps/market/shop/weex_v2.html']");
    }
}
