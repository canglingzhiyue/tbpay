package com.taobao.android.lightbuy.prefetch;

import android.content.Context;
import android.taobao.mulitenv.EnvironmentSwitcher;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.management.a;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.c;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.p;
import tb.afi;
import tb.afk;
import tb.arc;
import tb.kge;

/* loaded from: classes5.dex */
public class LightBuyWeexPrefetch {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1919156108);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : EnvironmentSwitcher.a() == 0 ? afi.a() : afi.c();
    }

    public static p a(Context context, String str) {
        p pVar;
        c b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p) ipChange.ipc$dispatch("d69076a7", new Object[]{context, str});
        }
        Object a2 = a.a().a(str);
        if (!(a2 instanceof MUSDKInstance) || (b = c.b((pVar = (p) a2))) == null || !b.a() || b.b()) {
            pVar = null;
        }
        String str2 = "未命中实例预热";
        arc.a().b("命中实例预热", arc.a.a().b("LightBuyWeexPrefetch").a("LightBuy/common").a("info", pVar == null ? str2 : "命中实例预热").a("lightbuyUrl", str).b());
        if (pVar != null) {
            str2 = "命中实例预热";
        }
        afk.c(str2, null);
        return pVar;
    }
}
