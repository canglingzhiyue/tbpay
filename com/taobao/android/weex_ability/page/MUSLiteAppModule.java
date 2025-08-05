package com.taobao.android.weex_ability.page;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.ui.MUSMethod;
import org.json.JSONArray;
import tb.kge;

/* loaded from: classes6.dex */
public class MUSLiteAppModule extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NAME = "liteApp";

    static {
        kge.a(-882275420);
    }

    public MUSLiteAppModule(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
    }

    @MUSMethod(uiThread = true)
    public void getRecentlyApps(com.taobao.android.weex_framework.bridge.b bVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            Class<?> cls = Class.forName("tb.cdi");
            JSONArray jSONArray = (JSONArray) com.taobao.android.weex_framework.util.h.a(cls, "getRecentlyItem", new Class[0]).invoke(com.taobao.android.weex_framework.util.h.a(cls, "getInstance", new Class[0]).invoke(null, new Object[0]), new Object[0]);
            if (jSONArray != null) {
                jSONObject.put("result", (Object) jSONArray);
                jSONObject.put("success", (Object) true);
            } else {
                jSONObject.put("success", (Object) false);
            }
        } catch (Throwable unused) {
            jSONObject.put("success", (Object) false);
        }
        if (bVar != null) {
            bVar.a(jSONObject);
        }
    }
}
