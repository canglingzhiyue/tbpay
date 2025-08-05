package com.taobao.android.sku.weex;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sku.utils.o;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSEngine;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.ui.MUSMethod;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class SkuPreloadModule extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MODULE_NAME = "Sku_Weex_Preload";
    private static boolean sHasRegistered;
    private static final Map<String, Boolean> sPreloadReadyMap;

    static {
        kge.a(1037803841);
        sHasRegistered = false;
        sPreloadReadyMap = new HashMap();
    }

    public SkuPreloadModule(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
    }

    public static void registerModule() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c7a6ff6", new Object[0]);
        } else if (sHasRegistered) {
        } else {
            MUSEngine.registerModule(MODULE_NAME, SkuPreloadModule.class);
            sHasRegistered = true;
        }
    }

    @MUSMethod
    public void notifyReadyStatus(JSONObject jSONObject, com.taobao.android.weex_framework.bridge.b bVar, com.taobao.android.weex_framework.bridge.b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9398590b", new Object[]{this, jSONObject, bVar, bVar2});
            return;
        }
        o.c(MODULE_NAME, "notifyMessage" + jSONObject);
        String b = c.b(jSONObject.getString("url"), jSONObject.getString("_sku_token_"));
        boolean parseBoolean = Boolean.parseBoolean(jSONObject.getString("success"));
        if (!TextUtils.isEmpty(b)) {
            sPreloadReadyMap.put(b, Boolean.valueOf(parseBoolean));
        }
        if (!parseBoolean) {
            c.a();
        }
        if (bVar == null) {
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("success", (Object) "true");
        bVar.a(jSONObject2);
    }

    public static boolean isInstanceReady(String str) {
        Boolean bool;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d6252099", new Object[]{str})).booleanValue() : !TextUtils.isEmpty(str) && (bool = sPreloadReadyMap.get(str)) != null && bool.booleanValue();
    }

    public static void clearPreloadInstanceStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dbf0a0a", new Object[0]);
        } else {
            sPreloadReadyMap.clear();
        }
    }

    public static int cacheSize() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ae85ed9d", new Object[0])).intValue() : sPreloadReadyMap.size();
    }
}
