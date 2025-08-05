package com.taobao.android.purchase.aura.plugin;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSEngine;
import com.taobao.android.weex_framework.bridge.b;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.ui.MUSMethod;
import tb.arc;
import tb.kge;

/* loaded from: classes6.dex */
public class TBBuyCommonWeexModule extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String MODULE_NAME = "AliBuyCommonModule";
    private final a mMessageChannel;

    static {
        kge.a(-1926152123);
    }

    public static /* synthetic */ Object ipc$super(TBBuyCommonWeexModule tBBuyCommonWeexModule, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static void registerModule() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c7a6ff6", new Object[0]);
        } else {
            MUSEngine.registerModule(MODULE_NAME, TBBuyCommonWeexModule.class);
        }
    }

    public TBBuyCommonWeexModule(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
        this.mMessageChannel = new a(getInstance().getUIContext());
    }

    @MUSMethod
    public void verifyRP(JSONObject jSONObject, b bVar, b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eab30ce0", new Object[]{this, jSONObject, bVar, bVar2});
        } else {
            invokeOnReceiveMessage("verifyRP", jSONObject, bVar, bVar2);
        }
    }

    private void invokeOnReceiveMessage(String str, JSONObject jSONObject, b bVar, b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f8f5d2", new Object[]{this, str, jSONObject, bVar, bVar2});
            return;
        }
        a aVar = this.mMessageChannel;
        if (aVar == null) {
            return;
        }
        try {
            aVar.a(str, jSONObject, bVar, bVar2);
        } catch (Throwable th) {
            arc.a a2 = arc.a.a();
            a2.b(MODULE_NAME).a("LightBuy/common").a("info", th.toString());
            arc.a().b("invokeOnReceiveMessage exception", a2.b());
        }
    }
}
