package com.alibaba.triver.triver_shop.wxmodule;

import android.os.Bundle;
import com.alibaba.ariver.kernel.RVStartParams;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.container.a;
import com.alibaba.triver.utils.CommonUtils;
import com.alibaba.triver.utils.b;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.bridge.JSCallback;
import com.taobao.weex.common.Destroyable;
import com.taobao.weex.common.WXModule;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes3.dex */
public class WXAriverShopModule extends WXModule implements Destroyable, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1584800888);
        kge.a(-1927357621);
        kge.a(1028243835);
    }

    @Override // com.taobao.weex.common.Destroyable
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        }
    }

    @JSMethod
    public void openBrandZone(String str, JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e817b3ce", new Object[]{this, str, jSCallback});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.mWXSDKInstance != null && this.mWXSDKInstance.O() != null) {
                JSONObject parseObject = JSON.parseObject(str);
                String string = parseObject.getString("appId");
                String string2 = parseObject.getString("path");
                String string3 = parseObject.getString("transition");
                String string4 = parseObject.getString(RVStartParams.KEY_SUPER_SPLASH);
                if (b.a(this.mWXSDKInstance.O(), string, string2, parseObject.getString("query"), string3, parseObject.getJSONObject("loadingParams"), string4, parseObject.getString("extQuery"), (Bundle) null)) {
                    jSONObject.put("success", (Object) true);
                } else {
                    jSONObject.put("success", (Object) false);
                }
                jSCallback.invoke(jSONObject);
                return;
            }
            jSONObject.put("success", (Object) false);
            jSCallback.invoke(jSONObject);
        } catch (Throwable unused) {
            jSONObject.put("success", (Object) false);
            jSCallback.invoke(jSONObject);
        }
    }

    @JSMethod
    public void preloadBrandZone(String str, JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff958fcd", new Object[]{this, str, jSCallback});
            return;
        }
        RVLogger.e("Triver::AppManager", "preloadBrandZone and subprocess");
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.mWXSDKInstance != null && this.mWXSDKInstance.O() != null) {
                if (CommonUtils.q()) {
                    jSONObject.put("success", (Object) false);
                    jSCallback.invoke(jSONObject);
                    return;
                }
                JSONObject jSONObject2 = JSON.parseObject(str).getJSONObject("loadingParams");
                if (jSONObject2 != null && !jSONObject2.isEmpty()) {
                    String string = jSONObject2.getString("loadingImage");
                    String string2 = jSONObject2.getString("loadingLogo");
                    Bundle bundle = new Bundle();
                    bundle.putString("loadingImage", string);
                    bundle.putString("loadingLogo", string2);
                    a.a().a(this.mWXSDKInstance.O(), bundle);
                    jSONObject.put("success", (Object) true);
                } else {
                    jSONObject.put("success", (Object) false);
                }
                jSONObject.put("success", (Object) true);
                jSCallback.invoke(jSONObject);
                return;
            }
            jSONObject.put("success", (Object) false);
            jSCallback.invoke(jSONObject);
        } catch (Throwable unused) {
            jSONObject.put("success", (Object) false);
            jSCallback.invoke(jSONObject);
        }
    }
}
