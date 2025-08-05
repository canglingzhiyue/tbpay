package com.alibaba.triver.triver_shop.wvjsbridge;

import android.os.Bundle;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import com.alibaba.ariver.kernel.RVStartParams;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.data.h;
import com.alibaba.triver.utils.b;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes3.dex */
public class WVAriverShopBridge extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1878378175);
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (h.actionOpenBrandZone.equals(str)) {
            try {
                JSONObject parseObject = JSON.parseObject(str2);
                String string = parseObject.getString("appId");
                String string2 = parseObject.getString("path");
                String string3 = parseObject.getString("transition");
                String string4 = parseObject.getString(RVStartParams.KEY_SUPER_SPLASH);
                JSONObject jSONObject = parseObject.getJSONObject("loadingParams");
                String string5 = parseObject.getString("query");
                String string6 = parseObject.getString("extQuery");
                r rVar = new r();
                if (wVCallBackContext.getWebview() != null && b.a(wVCallBackContext.getWebview().getContext(), string, string2, string5, string3, jSONObject, string4, string6, (Bundle) null)) {
                    rVar.a("success", (Object) true);
                } else {
                    rVar.a("success", (Object) false);
                }
                wVCallBackContext.success(rVar);
                return true;
            } catch (JSONException unused) {
                wVCallBackContext.error();
            }
        }
        return false;
    }
}
