package com.taobao.android.lightbuy.message.module;

import android.util.Log;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexMethod;
import com.taobao.android.weex.WeexModule;
import com.taobao.android.weex.b;
import com.taobao.android.weex.e;
import com.taobao.android.weex.i;
import tb.afe;
import tb.aff;
import tb.afh;
import tb.arc;
import tb.kge;

/* loaded from: classes5.dex */
public class LightBuyWeexModule implements WeexModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String MODULE_NAME = "LightBuyModule";
    private afe mMessageChannel;

    static {
        kge.a(-1883257204);
        kge.a(396540296);
    }

    public static void registerModule() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c7a6ff6", new Object[0]);
        } else {
            e.a().b(MODULE_NAME, LightBuyWeexModule.class);
        }
    }

    @Override // com.taobao.android.weex.WeexModule
    public void onInit(String str, i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6799e073", new Object[]{this, str, iVar});
            return;
        }
        Log.e(MODULE_NAME, "onInit ");
        this.mMessageChannel = new afe(new afh(iVar.a()));
    }

    @WeexMethod(uiThread = false)
    public void fireEventAsyncCall(JSONObject jSONObject, b bVar, b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c45f33", new Object[]{this, jSONObject, bVar, bVar2});
        } else {
            invokeOnReceiveMessage("fireEventAsyncCall", jSONObject, new aff(bVar));
        }
    }

    @WeexMethod(uiThread = true)
    public void fireEventCall(JSONObject jSONObject, b bVar, b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba181287", new Object[]{this, jSONObject, bVar, bVar2});
        } else {
            invokeOnReceiveMessage("fireEventCall", jSONObject, new aff(bVar));
        }
    }

    @WeexMethod(uiThread = false)
    public void sendRequest(JSONObject jSONObject, b bVar, b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cfdc02", new Object[]{this, jSONObject, bVar, bVar2});
            return;
        }
        afe afeVar = this.mMessageChannel;
        if (afeVar == null) {
            return;
        }
        afeVar.a(jSONObject, new aff(bVar), new aff(bVar2));
    }

    @WeexMethod(uiThread = false)
    public void refreshCart(JSONObject jSONObject, b bVar, b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8cd80ce", new Object[]{this, jSONObject, bVar, bVar2});
        } else {
            invokeOnReceiveMessage("refreshCart", jSONObject, new aff(bVar));
        }
    }

    @WeexMethod(uiThread = false)
    public void closePage(JSONObject jSONObject, b bVar, b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbae5d42", new Object[]{this, jSONObject, bVar, bVar2});
        } else {
            invokeOnReceiveMessage("closePage", jSONObject, new aff(bVar));
        }
    }

    @WeexMethod(uiThread = false)
    public void downgradeNative(JSONObject jSONObject, b bVar, b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92a479dd", new Object[]{this, jSONObject, bVar, bVar2});
        } else {
            invokeOnReceiveMessage("downgradeNative", jSONObject, new aff(bVar));
        }
    }

    @WeexMethod(uiThread = false)
    public void getPerformanceInfo(JSONObject jSONObject, b bVar, b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46846e81", new Object[]{this, jSONObject, bVar, bVar2});
        } else {
            invokeOnReceiveMessage("getPerformanceInfo", jSONObject, new aff(bVar));
        }
    }

    private void invokeOnReceiveMessage(String str, JSONObject jSONObject, aff affVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2709e13", new Object[]{this, str, jSONObject, affVar});
            return;
        }
        afe afeVar = this.mMessageChannel;
        if (afeVar == null) {
            return;
        }
        try {
            afeVar.a(str, jSONObject, affVar);
        } catch (Throwable th) {
            arc.a a2 = arc.a.a();
            a2.b(MODULE_NAME).a("LightBuy/common").a("info", th.toString());
            arc.a().b("invokeOnReceiveMessage exception", a2.b());
        }
    }

    @Override // com.taobao.android.weex.WeexModule
    public void onJSThreadDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5d6488f", new Object[]{this});
        } else {
            Log.e(MODULE_NAME, "onJSThreadDestroy ");
        }
    }

    @Override // com.taobao.android.weex.WeexModule
    public void onMainThreadDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e24a1dbf", new Object[]{this});
        } else {
            Log.e(MODULE_NAME, "onJSThreadDestroy ");
        }
    }
}
