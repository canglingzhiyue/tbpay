package com.taobao.search.jarvis;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.xsearchplugin.jarvis.utils.JarvisConstant;
import com.taobao.android.xsearchplugin.weex.weex.d;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.common.WXModule;
import tb.kge;

/* loaded from: classes7.dex */
public class JarvisKitModule extends WXModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MODULE_NAME = "JarvisKit";
    private static final String TAG = "JarviskitModule";

    static {
        kge.a(-1710212313);
    }

    @JSMethod
    public void recordItemClick(JSONObject jSONObject) {
        d.a a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2f854e5", new Object[]{this, jSONObject});
        } else if (!(this.mWXSDKInstance instanceof d) || (a2 = ((d) this.mWXSDKInstance).a()) == null) {
        } else {
            a2.a(JarvisConstant.EVENT_RECORD_ITME_CLICk, jSONObject, null, null);
        }
    }
}
