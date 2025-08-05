package com.taobao.android.purchase;

import android.app.Application;
import android.util.Log;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.purchase.preload.TBBuyPreloadFactory;
import com.taobao.android.weex_framework.util.a;
import java.util.HashMap;
import tb.arc;
import tb.kge;

/* loaded from: classes6.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1525855824);
    }

    public c() {
        Log.e("PurchaseIdleLauncher", a.ATOM_constructor);
    }

    public void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{this, application, hashMap});
            return;
        }
        arc.a().a("下单闲时预加载开始", arc.a.a().a("AURA/performance").a("time", System.currentTimeMillis()).b());
        TBBuyPreloadFactory.a(application.getApplicationContext(), "idle", "tbBuy", (JSONObject) null);
    }
}
