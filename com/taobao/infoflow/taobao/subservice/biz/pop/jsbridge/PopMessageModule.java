package com.taobao.infoflow.taobao.subservice.biz.pop.jsbridge;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.p;
import com.taobao.android.weex_framework.ui.MUSMethod;
import java.lang.ref.WeakReference;
import tb.kge;
import tb.kyu;
import tb.lrb;

/* loaded from: classes7.dex */
public class PopMessageModule extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NAME = "popMessageModule";
    private static final String TAG = "PopMessageModule";

    static {
        kge.a(2028889836);
    }

    public static /* synthetic */ Object ipc$super(PopMessageModule popMessageModule, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public PopMessageModule(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
    }

    @MUSMethod(uiThread = true)
    public void postMessage(String str, JSONObject jSONObject, com.taobao.android.weex_framework.bridge.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f139c36f", new Object[]{this, str, jSONObject, bVar});
            return;
        }
        kyu engine = getEngine(getInstance());
        if (engine == null) {
            com.taobao.homepage.pop.utils.c.a(TAG, "can't found engine from instance");
            return;
        }
        String businessId = getBusinessId(getInstance());
        if (TextUtils.isEmpty(businessId)) {
            com.taobao.homepage.pop.utils.c.a(TAG, "can't found businessId from instance");
            return;
        }
        engine.a(str, businessId, jSONObject);
        com.taobao.homepage.pop.utils.c.a(TAG, "postMessage: " + str);
    }

    private kyu getEngine(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kyu) ipChange.ipc$dispatch("4bff68b1", new Object[]{this, pVar});
        }
        if (pVar == null) {
            return null;
        }
        Object tag = pVar.getTag(lrb.HOME_POP_ENGINE_KEY);
        if (!(tag instanceof WeakReference)) {
            return null;
        }
        Object obj = ((WeakReference) tag).get();
        if (!(obj instanceof kyu)) {
            return null;
        }
        return (kyu) obj;
    }

    private String getBusinessId(p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("66b4aab", new Object[]{this, pVar});
        }
        if (pVar == null) {
            return null;
        }
        Object tag = pVar.getTag(lrb.BUSINESS_ID_KEY);
        if (tag instanceof String) {
            return (String) tag;
        }
        return null;
    }
}
