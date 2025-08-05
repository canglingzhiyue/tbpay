package com.taobao.android.detail2.core.framework.base.weex;

import android.content.Context;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.ui.MUSMethod;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes5.dex */
public class DetailWeexV2Module extends MUSModule implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public List<com.taobao.android.weex_framework.bridge.b> mCallbacks;

    static {
        kge.a(64300010);
        kge.a(-600857786);
    }

    public DetailWeexV2Module(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
        this.mCallbacks = new ArrayList();
    }

    @MUSMethod
    public void onMessage(com.taobao.android.weex_framework.bridge.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2655a746", new Object[]{this, bVar});
        } else {
            this.mCallbacks.add(bVar);
        }
    }

    @MUSMethod
    public void dispatchMessage(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f83b53c", new Object[]{this, jSONObject});
        } else {
            DetailWeexModule.dispatchMessage(jSONObject, this);
        }
    }

    @Override // com.taobao.android.detail2.core.framework.base.weex.d
    public Context getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        if (getInstance() == null) {
            return null;
        }
        return getInstance().getUIContext();
    }

    @Override // com.taobao.android.detail2.core.framework.base.weex.d
    public View getContainerView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("3268c19", new Object[]{this});
        }
        if (getInstance() == null) {
            return null;
        }
        return getInstance().getRenderRoot();
    }

    @Override // com.taobao.android.detail2.core.framework.base.weex.d
    public String getBundleUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("dee20482", new Object[]{this}) : getInstance() instanceof MUSDKInstance ? ((MUSDKInstance) getInstance()).getInstanceEnv("bundleUrl") : "";
    }

    @Override // com.taobao.android.detail2.core.framework.base.weex.d
    public void fireEvent(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63f0e3fb", new Object[]{this, str, jSONObject});
        } else if (getInstance() == null) {
        } else {
            getInstance().fireEvent(2, str, jSONObject);
        }
    }
}
