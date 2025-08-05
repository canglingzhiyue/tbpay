package com.taobao.android.weex_ability.mtop;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_ability.mtop.a;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.ui.MUSMethod;
import tb.jyx;
import tb.kge;

/* loaded from: classes6.dex */
public class MUSMtopModule extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NAME = "mtop";

    /* loaded from: classes6.dex */
    public enum MTOP_VERSION {
        V1,
        V2
    }

    static {
        kge.a(-1415908568);
    }

    public MUSMtopModule(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
    }

    @MUSMethod(uiThread = false)
    public void send(String str, com.taobao.android.weex_framework.bridge.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("954eb2b0", new Object[]{this, str, bVar});
        } else if (getInstance() == null || getInstance().isDestroyed()) {
        } else {
            new MUSMtopRequest(MTOP_VERSION.V1).a(getInstance(), str, bVar, (com.taobao.android.weex_framework.bridge.b) null);
        }
    }

    @MUSMethod(uiThread = false)
    public void request(JSONObject jSONObject, final com.taobao.android.weex_framework.bridge.b bVar, com.taobao.android.weex_framework.bridge.b bVar2) {
        JSONObject jSONObject2;
        a.b a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ce9e9c8", new Object[]{this, jSONObject, bVar, bVar2});
        } else if (getInstance() == null || getInstance().isDestroyed()) {
        } else {
            if (getInstance() instanceof MUSDKInstance) {
                String instanceEnv = ((MUSDKInstance) getInstance()).getInstanceEnv("bundleUrl");
                if (!TextUtils.isEmpty(instanceEnv) && jSONObject != null && (jSONObject2 = jSONObject.getJSONObject("data")) != null && jyx.MODULE_NAME.equals(jSONObject2.getString("__prefetch")) && (a2 = a.a().a(instanceEnv, jSONObject)) != null) {
                    if (a2.f15946a != null) {
                        bVar.a(a2.f15946a);
                        return;
                    } else {
                        a2.a(new a.c() { // from class: com.taobao.android.weex_ability.mtop.MUSMtopModule.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.taobao.android.weex_ability.mtop.a.c
                            public void a(JSONObject jSONObject3) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("266fb88", new Object[]{this, jSONObject3});
                                } else {
                                    bVar.a(jSONObject3);
                                }
                            }
                        });
                        return;
                    }
                }
            }
            new MUSMtopRequest(MTOP_VERSION.V2).a(getInstance(), jSONObject, bVar, bVar2);
        }
    }
}
