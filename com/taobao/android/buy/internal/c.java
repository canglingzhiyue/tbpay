package com.taobao.android.buy.internal;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.android.aura.IAURAPluginCenter;
import com.alibaba.android.aura.k;
import com.alibaba.android.aura.q;
import com.alibaba.android.aura.w;
import com.alibaba.android.aura.x;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.arc;
import tb.ifz;
import tb.jqh;
import tb.kge;

/* loaded from: classes4.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, w> f9234a;

    static {
        kge.a(-949510918);
        f9234a = new HashMap();
    }

    public static void a(String str, w wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c404a15", new Object[]{str, wVar});
        } else if (f9234a.containsKey(str)) {
        } else {
            f9234a.put(str, wVar);
        }
    }

    public static k a(Context context, final String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        final boolean z = true;
        if (ipChange instanceof IpChange) {
            return (k) ipChange.ipc$dispatch("946893ca", new Object[]{context, str, map});
        }
        k a2 = x.a().a("purchase");
        if (a2 == null) {
            z = false;
        }
        if (z) {
            q c = a2.c();
            c.a(context);
            if (map != null) {
                c.a().putAll(map);
            }
        }
        arc.a().a(z ? "[命中]aura预热实例" : "[未命中]aura预热实例", arc.a.a().a("AURA/performance").b());
        jqh.a(new Runnable() { // from class: com.taobao.android.buy.internal.c.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    ifz.a(ifz.a.b("preInitAura").c(z ? "命中aura预热实例" : "未命中aura预热实例").c("c1", StringUtils.isEmpty(str) ? "" : str).a(z).a(0.001f));
                }
            }
        });
        return a2;
    }

    public static List<IAURAPluginCenter> a() {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add((IAURAPluginCenter) Class.forName("com.alibaba.android.aura.AURATmgFrontCashierPluginCenter").newInstance());
        } catch (Throwable th) {
            th.printStackTrace();
            arc.a().b("registerPluginCenter AURATmgFrontCashierPluginCenter failed");
        }
        try {
            arrayList.add((IAURAPluginCenter) Class.forName("com.alibaba.android.aura.AURAAdamAndroidPluginCenter").newInstance());
        } catch (Throwable th2) {
            th2.printStackTrace();
            arc.a().b("registerPluginCenter AURAAdamAndroidPluginCenter failed");
        }
        return arrayList;
    }

    public static w a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (w) ipChange.ipc$dispatch("4cc13ec7", new Object[]{str}) : f9234a.get(str);
    }
}
