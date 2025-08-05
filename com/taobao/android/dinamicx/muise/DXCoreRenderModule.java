package com.taobao.android.dinamicx.muise;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.p;
import com.taobao.android.weex_framework.ui.MUSMethod;

/* loaded from: classes5.dex */
public class DXCoreRenderModule extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public DXCoreRenderModule(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
    }

    @MUSMethod(uiThread = true)
    public void render(JSONObject jSONObject, com.taobao.android.weex_framework.bridge.b bVar) {
        DXRuntimeContext dXRuntimeContext;
        DXWidgetNode d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d448270a", new Object[]{this, jSONObject, bVar});
            return;
        }
        p dXCoreRenderModule = getInstance();
        if (dXCoreRenderModule == null) {
            return;
        }
        Object executeContext = dXCoreRenderModule.getExecuteContext();
        if (!(executeContext instanceof DXRuntimeContext) || (d = (dXRuntimeContext = (DXRuntimeContext) executeContext).d()) == null) {
            return;
        }
        b.a(jSONObject, d, false);
        if (bVar == null) {
            return;
        }
        JSONArray a2 = b.a(dXRuntimeContext);
        if (a2 != null && !a2.isEmpty()) {
            dXCoreRenderModule.register(a2, "__refs");
        }
        bVar.a(new Object[0]);
    }

    @MUSMethod(uiThread = true)
    public void refresh(JSONObject jSONObject, com.taobao.android.weex_framework.bridge.b bVar) {
        DXRuntimeContext dXRuntimeContext;
        DXWidgetNode d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7269065", new Object[]{this, jSONObject, bVar});
            return;
        }
        p dXCoreRenderModule = getInstance();
        if (dXCoreRenderModule == null) {
            return;
        }
        Object executeContext = dXCoreRenderModule.getExecuteContext();
        if (!(executeContext instanceof DXRuntimeContext) || (d = (dXRuntimeContext = (DXRuntimeContext) executeContext).d()) == null) {
            return;
        }
        b.b(jSONObject, d, false);
        if (bVar == null) {
            return;
        }
        JSONArray a2 = b.a(dXRuntimeContext);
        if (a2 != null && !a2.isEmpty()) {
            dXCoreRenderModule.register(a2, "__refs");
        }
        bVar.a(new Object[0]);
    }
}
