package com.taobao.android.lightbuy.message.module;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSEngine;
import com.taobao.android.weex_framework.bridge.b;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.ui.MUSMethod;
import tb.afe;
import tb.aff;
import tb.afh;
import tb.arc;
import tb.kge;

/* loaded from: classes5.dex */
public class LightBuyMUSModule extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String MODULE_NAME = "LightBuyModule";
    private final afe mMessageChannel;

    static {
        kge.a(-583662216);
    }

    public static /* synthetic */ Object ipc$super(LightBuyMUSModule lightBuyMUSModule, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.weex_framework.module.MUSModule
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    public static void registerModule() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c7a6ff6", new Object[0]);
            return;
        }
        arc.a().b("LightBuyMUSModule register!!", arc.a.a().b(MODULE_NAME).a("LightBuy/common").a("message", "LightBuyMUSModule register!!").b());
        MUSEngine.registerModule(MODULE_NAME, LightBuyMUSModule.class);
    }

    public LightBuyMUSModule(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
        this.mMessageChannel = new afe(new afh(getInstance()));
    }

    @MUSMethod
    public void fireEventSyncCall(JSONObject jSONObject, b bVar, b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f9f595a", new Object[]{this, jSONObject, bVar, bVar2});
        } else {
            invokeOnReceiveMessage("fireEventAsyncCall", jSONObject, new aff(bVar));
        }
    }

    @MUSMethod
    public void fireEventCall(JSONObject jSONObject, b bVar, b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cec1feb5", new Object[]{this, jSONObject, bVar, bVar2});
        } else {
            invokeOnReceiveMessage("fireEventCall", jSONObject, new aff(bVar));
        }
    }

    @MUSMethod
    public void sendRequest(JSONObject jSONObject, b bVar, b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96ba970", new Object[]{this, jSONObject, bVar, bVar2});
        } else {
            this.mMessageChannel.a(jSONObject, new aff(bVar), new aff(bVar2));
        }
    }

    @MUSMethod
    public void refreshCart(JSONObject jSONObject, b bVar, b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78b91b3c", new Object[]{this, jSONObject, bVar, bVar2});
        } else {
            invokeOnReceiveMessage("refreshCart", jSONObject, new aff(bVar));
        }
    }

    @MUSMethod
    public void closePage(JSONObject jSONObject, b bVar, b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c299dab0", new Object[]{this, jSONObject, bVar, bVar2});
        } else {
            invokeOnReceiveMessage("closePage", jSONObject, new aff(bVar));
        }
    }

    @MUSMethod
    public void viewDidAppear(JSONObject jSONObject, b bVar, b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca557288", new Object[]{this, jSONObject, bVar, bVar2});
        } else {
            invokeOnReceiveMessage("viewDidAppear", jSONObject, new aff(bVar));
        }
    }

    @MUSMethod
    public void downgradeNative(JSONObject jSONObject, b bVar, b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4645108b", new Object[]{this, jSONObject, bVar, bVar2});
        } else {
            invokeOnReceiveMessage("downgradeNative", jSONObject, new aff(bVar));
        }
    }

    @MUSMethod
    public void getPerformanceInfo(JSONObject jSONObject, b bVar, b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc02dc2f", new Object[]{this, jSONObject, bVar, bVar2});
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
        try {
            this.mMessageChannel.a(str, jSONObject, affVar);
        } catch (Throwable th) {
            arc.a a2 = arc.a.a();
            a2.b(MODULE_NAME).a("LightBuy/common").a("info", th.toString());
            arc.a().b("invokeOnReceiveMessage exception", a2.b());
        }
    }
}
