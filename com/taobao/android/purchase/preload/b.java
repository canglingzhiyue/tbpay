package com.taobao.android.purchase.preload;

import android.content.Context;
import com.alibaba.android.aura.AURAAliBuyCorePluginCenter;
import com.alibaba.android.aura.AURATaobaoPurchasePluginCenter;
import com.alibaba.android.aura.IAURAPluginCenter;
import com.alibaba.android.aura.w;
import com.alibaba.android.aura.x;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.buy.internal.c;
import java.util.ArrayList;
import java.util.HashMap;
import tb.arc;
import tb.ard;
import tb.baw;
import tb.bbh;
import tb.kge;

/* loaded from: classes6.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-365835308);
    }

    public static /* synthetic */ w b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (w) ipChange.ipc$dispatch("c46eecb0", new Object[0]) : a();
    }

    public static void a(final Context context, final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d18de974", new Object[]{context, str, str2});
            return;
        }
        arc.a().a("预加载AURA实例", arc.a.a().a("AURA/performance").a("from", str2).b());
        bbh.a(new Runnable() { // from class: com.taobao.android.purchase.preload.b.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                w a2 = c.a(str);
                if (a2 == null) {
                    return;
                }
                c.a("purchase", b.b());
                x.a().a(context, a2);
                ard a3 = arc.a();
                a3.a("预加载AURA实例完成，耗时 = " + (System.currentTimeMillis() - currentTimeMillis), arc.a.a().a("AURA/performance").a("from", str2).b());
            }
        });
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        arc.a().a("清理AURA实例缓存", arc.a.a().a("AURA/performance").b());
        x.a().b(str);
    }

    private static w a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w) ipChange.ipc$dispatch("3c3eacd1", new Object[0]);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new AURATaobaoPurchasePluginCenter());
        arrayList.add(new AURAAliBuyCorePluginCenter());
        arrayList.addAll(c.a());
        ArrayList arrayList2 = new ArrayList();
        if ("true".equals(com.taobao.android.purchase.aura.utils.e.a("enablePreloadWorkflowV2", "true"))) {
            arrayList2.add(com.taobao.android.buy.internal.a.DEFAULT_AURA_BUY_MAIN_FLOW);
            arrayList2.add("aura.workflow.event");
            arrayList2.add("aura.workflow.update");
            arrayList2.add(com.taobao.android.buy.internal.a.PRELOAD_MAIN_PAGE_FLOW);
            arrayList2.add("aura.workflow.adjustRules");
        }
        HashMap hashMap = new HashMap();
        if (baw.a()) {
            hashMap.put("enableExtendModules", true);
        }
        return new w.a().b(com.taobao.android.buy.internal.a.DEFAULT_AURA_BUY_CONFIG).a((IAURAPluginCenter[]) arrayList.toArray(new IAURAPluginCenter[0])).a("purchase").a(arrayList2).a(hashMap).a();
    }
}
