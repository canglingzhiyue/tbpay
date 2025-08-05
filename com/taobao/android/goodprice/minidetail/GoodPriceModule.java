package com.taobao.android.goodprice.minidetail;

import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.ui.MUSMethod;
import tb.kge;

/* loaded from: classes5.dex */
public class GoodPriceModule extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-570905113);
    }

    @MUSMethod(uiThread = false)
    public boolean isGoodPriceContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9b42cb2a", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public GoodPriceModule(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
    }

    @MUSMethod(uiThread = true)
    public void popGoodPrice() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7df1642", new Object[]{this});
            return;
        }
        Intent intent = new Intent();
        intent.setAction("popGoodPricePage");
        LocalBroadcastManager.getInstance(getInstance().getUIContext()).sendBroadcast(intent);
    }
}
