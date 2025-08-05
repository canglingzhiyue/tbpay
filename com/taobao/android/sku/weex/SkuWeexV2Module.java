package com.taobao.android.sku.weex;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSEngine;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.ui.MUSMethod;
import tb.kge;

/* loaded from: classes6.dex */
public class SkuWeexV2Module extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MODULE_NAME = "NewBuy_Detail";

    static {
        kge.a(-1697964483);
    }

    public SkuWeexV2Module(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
    }

    public static boolean registerCurrentModule() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b4ab6ed", new Object[0])).booleanValue();
        }
        try {
            return MUSEngine.registerModule("NewBuy_Detail", SkuWeexV2Module.class);
        } catch (Throwable unused) {
            return false;
        }
    }

    @MUSMethod(uiThread = true)
    public void dispatchMessage(JSONObject jSONObject, final com.taobao.android.weex_framework.bridge.b bVar, final com.taobao.android.weex_framework.bridge.b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c595aea", new Object[]{this, jSONObject, bVar, bVar2});
        } else {
            e.a(3, jSONObject, new a() { // from class: com.taobao.android.sku.weex.SkuWeexV2Module.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.sku.weex.a
                public void a(Object... objArr) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b63135c9", new Object[]{this, objArr});
                        return;
                    }
                    com.taobao.android.weex_framework.bridge.b bVar3 = bVar;
                    if (bVar3 == null) {
                        return;
                    }
                    bVar3.a(e.a(objArr));
                }

                @Override // com.taobao.android.sku.weex.a
                public void b(Object... objArr) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b232c4a8", new Object[]{this, objArr});
                        return;
                    }
                    com.taobao.android.weex_framework.bridge.b bVar3 = bVar;
                    if (bVar3 == null) {
                        return;
                    }
                    bVar3.b(e.a(objArr));
                }
            }, new a() { // from class: com.taobao.android.sku.weex.SkuWeexV2Module.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.sku.weex.a
                public void a(Object... objArr) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b63135c9", new Object[]{this, objArr});
                        return;
                    }
                    com.taobao.android.weex_framework.bridge.b bVar3 = bVar2;
                    if (bVar3 == null) {
                        return;
                    }
                    bVar3.a(e.a(objArr));
                }

                @Override // com.taobao.android.sku.weex.a
                public void b(Object... objArr) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b232c4a8", new Object[]{this, objArr});
                        return;
                    }
                    com.taobao.android.weex_framework.bridge.b bVar3 = bVar2;
                    if (bVar3 == null) {
                        return;
                    }
                    bVar3.b(e.a(objArr));
                }
            });
        }
    }
}
