package com.taobao.android.order.bundle.base.parallelbiz;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.base.parallelbiz.ParallelBizValueHelper;
import com.ut.mini.l;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1377889489);
    }

    public static void a(Context context, ParallelBizValueHelper.PageType pageType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1db2bdd", new Object[]{context, pageType});
            return;
        }
        com.taobao.android.ultron.tracker.a.a(context, ParallelBizValueHelper.a(pageType));
        HashMap hashMap = new HashMap();
        hashMap.put("spm-cnt", ParallelBizValueHelper.b(pageType));
        com.taobao.android.ultron.tracker.a.a(context, hashMap);
    }

    public static void a(Context context, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8df32b25", new Object[]{context, map});
        } else {
            com.taobao.android.ultron.tracker.a.a(context, map);
        }
    }

    public static void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{str, map});
            return;
        }
        String currentPageName = l.getInstance().getCurrentPageName();
        if (currentPageName == null) {
            return;
        }
        if (!str.startsWith(currentPageName)) {
            str = currentPageName + str;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        if (!map.containsKey("orderId")) {
            map.put("orderId", a());
        }
        com.taobao.android.ultron.tracker.a.a(currentPageName, str, map);
    }

    public static void a(ParallelBizValueHelper.PageType pageType, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2863336", new Object[]{pageType, str, map});
            return;
        }
        String a2 = ParallelBizValueHelper.a(pageType);
        if (!str.startsWith(a2)) {
            str = a2 + str;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        if (!map.containsKey("orderId")) {
            map.put("orderId", a());
        }
        com.taobao.android.ultron.tracker.a.a(a2, str, map);
    }

    private static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        try {
            Map<String, String> pageProperties = l.getInstance().getPageProperties("");
            if (pageProperties != null && pageProperties.get("newOrderId") != null) {
                return pageProperties.get("newOrderId");
            }
        } catch (Throwable unused) {
        }
        return "";
    }
}
