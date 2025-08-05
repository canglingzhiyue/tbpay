package com.taobao.android.interactive_common.wxmodule;

import android.os.Bundle;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.interactive_common.CXCommonActivity;
import com.taobao.android.nav.Nav;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.common.WXModule;
import java.util.HashMap;
import tb.grr;

/* loaded from: classes5.dex */
public class CXNavModule extends WXModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @JSMethod
    public void openFloatLayer(HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e9178ad", new Object[]{this, hashMap});
        } else if (hashMap == null) {
        } else {
            try {
                if (this.mWXSDKInstance == null || this.mWXSDKInstance.O() == null) {
                    return;
                }
                String str = (String) hashMap.get("url");
                HashMap hashMap2 = new HashMap();
                hashMap2.put("url", str);
                grr.a("CXNavModule_openFloatLayer", hashMap2);
                Bundle bundle = new Bundle();
                bundle.putString("extraData", JSON.toJSONString(hashMap.get("extraData")));
                Nav.from(this.mWXSDKInstance.O()).withExtras(bundle).toUri(str);
            } catch (Exception unused) {
            }
        }
    }

    @JSMethod
    public void closeFloatLayer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("203a0674", new Object[]{this});
            return;
        }
        grr.a("CXNavModule_closeFloatLayer", null);
        if (this.mWXSDKInstance == null || this.mWXSDKInstance.O() == null || !(this.mWXSDKInstance.O() instanceof CXCommonActivity)) {
            return;
        }
        ((CXCommonActivity) this.mWXSDKInstance.O()).finish();
        ((CXCommonActivity) this.mWXSDKInstance.O()).overridePendingTransition(17432576, 17432577);
    }
}
