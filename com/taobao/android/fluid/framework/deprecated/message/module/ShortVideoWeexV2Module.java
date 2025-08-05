package com.taobao.android.fluid.framework.deprecated.message.module;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.deprecated.message.module.proxy.ShortVideoWeexV2ModuleProxy;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.bridge.b;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.ui.MUSMethod;
import tb.kge;
import tb.spz;

/* loaded from: classes5.dex */
public class ShortVideoWeexV2Module extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ShortVideoWeexV2Module";
    private final ShortVideoWeexV2ModuleProxy mFluidSDKProxy;

    static {
        kge.a(-745638896);
    }

    public ShortVideoWeexV2Module(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
        this.mFluidSDKProxy = new ShortVideoWeexV2ModuleProxy(this);
        spz.c(TAG, "初始化 ShortVideoWeexV2Module");
    }

    @MUSMethod(uiThread = true)
    public void sendMessage(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6326634a", new Object[]{this, jSONObject});
            return;
        }
        ShortVideoWeexV2ModuleProxy shortVideoWeexV2ModuleProxy = this.mFluidSDKProxy;
        if (shortVideoWeexV2ModuleProxy == null) {
            return;
        }
        shortVideoWeexV2ModuleProxy.sendMessage(jSONObject);
    }

    @MUSMethod(uiThread = true)
    public void sendMessageAsync(JSONObject jSONObject, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4eb05123", new Object[]{this, jSONObject, bVar});
            return;
        }
        ShortVideoWeexV2ModuleProxy shortVideoWeexV2ModuleProxy = this.mFluidSDKProxy;
        if (shortVideoWeexV2ModuleProxy == null) {
            return;
        }
        shortVideoWeexV2ModuleProxy.sendMessageAsync(jSONObject, bVar);
    }

    @MUSMethod(uiThread = true)
    public void postNotify(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54d380e0", new Object[]{this, jSONObject});
            return;
        }
        ShortVideoWeexV2ModuleProxy shortVideoWeexV2ModuleProxy = this.mFluidSDKProxy;
        if (shortVideoWeexV2ModuleProxy == null) {
            return;
        }
        shortVideoWeexV2ModuleProxy.postNotify(jSONObject);
    }

    @MUSMethod(uiThread = true)
    public void onNotify(JSONObject jSONObject, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4f5bcd8", new Object[]{this, jSONObject, bVar});
            return;
        }
        ShortVideoWeexV2ModuleProxy shortVideoWeexV2ModuleProxy = this.mFluidSDKProxy;
        if (shortVideoWeexV2ModuleProxy == null) {
            return;
        }
        shortVideoWeexV2ModuleProxy.onNotify(jSONObject, bVar);
    }

    @MUSMethod(uiThread = true)
    public void offNotify(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c4b20b1", new Object[]{this, jSONObject});
            return;
        }
        ShortVideoWeexV2ModuleProxy shortVideoWeexV2ModuleProxy = this.mFluidSDKProxy;
        if (shortVideoWeexV2ModuleProxy == null) {
            return;
        }
        shortVideoWeexV2ModuleProxy.offNotify(jSONObject);
    }

    @MUSMethod(uiThread = true)
    public void snapShotVideo(JSONObject jSONObject, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("502015c9", new Object[]{this, jSONObject, bVar});
            return;
        }
        ShortVideoWeexV2ModuleProxy shortVideoWeexV2ModuleProxy = this.mFluidSDKProxy;
        if (shortVideoWeexV2ModuleProxy == null) {
            return;
        }
        shortVideoWeexV2ModuleProxy.snapShotVideo(jSONObject, bVar);
    }
}
