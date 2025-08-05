package com.alibaba.android.ultron.vfw.weex2.highPerformance.management.custom;

import android.app.Activity;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.management.k;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.TBMainHost;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Iterator;
import tb.bzu;
import tb.iro;
import tb.jqg;
import tb.jqh;
import tb.kge;

/* loaded from: classes2.dex */
public class a implements k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final HashSet<String> f2774a = new HashSet<>();

    static {
        kge.a(2064166787);
        kge.a(718836347);
        kge.a(1900527407);
    }

    public static /* synthetic */ HashSet a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashSet) ipChange.ipc$dispatch("fbb4e9e6", new Object[]{aVar}) : aVar.f2774a;
    }

    public a() {
        this.f2774a.add("com.taobao.android.order.bundle.weex2.TBRefundInstanceManager");
        this.f2774a.add("com.taobao.android.icart.engine.CartVEngineFactory");
        this.f2774a.add("com.taobao.android.purchase.preload.TBBuyPreloadFactory");
    }

    @Override // com.alibaba.android.ultron.vfw.weex2.highPerformance.management.k
    public void a(String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2bf4cf4", new Object[]{this, str, str2, jSONObject});
        } else {
            b(str, str2, jSONObject);
        }
    }

    public boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue() : iro.e(str);
    }

    private void b(final String str, final String str2, final JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d304613", new Object[]{this, str, str2, jSONObject});
        } else if (a(str2, null)) {
            jqh.a(new Runnable() { // from class: com.alibaba.android.ultron.vfw.weex2.highPerformance.management.custom.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    Method[] declaredMethods;
                    Activity activity = (Activity) TBMainHost.a().getContext();
                    if (activity == null) {
                        jqg.a("UltronTradeHybridCustomManager", "dispatchStage", "activity is null");
                        return;
                    }
                    Iterator it = a.a(a.this).iterator();
                    while (it.hasNext()) {
                        try {
                            for (Method method : Class.forName((String) it.next()).getDeclaredMethods()) {
                                if (method.isAnnotationPresent(TradeHybridCustomAnnotation.class)) {
                                    method.invoke(null, activity, str, str2, jSONObject);
                                }
                            }
                        } catch (Throwable th) {
                            bzu.a(bzu.a.b("dispatchStage").a(false).a(th.toString()).a(1.0E-4f));
                        }
                    }
                }
            });
        } else {
            jqg.a("UltronTradeHybridCustomManager", "dispatchStage:", str2 + " switcher is off");
        }
    }
}
