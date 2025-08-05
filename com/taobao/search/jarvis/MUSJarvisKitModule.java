package com.taobao.search.jarvis;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.p;
import com.taobao.android.weex_framework.ui.MUSMethod;
import com.taobao.android.xsearchplugin.jarvis.utils.JarvisConstant;
import com.taobao.android.xsearchplugin.muise.SFMuiseSDK;
import com.taobao.android.xsearchplugin.weex.weex.h;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes7.dex */
public final class MUSJarvisKitModule extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(365708744);
    }

    public MUSJarvisKitModule(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
    }

    @MUSMethod
    public final void recordItemClick(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2f854e5", new Object[]{this, jSONObject});
            return;
        }
        p instance = getInstance();
        q.a((Object) instance, "instance");
        if (instance.isDestroyed()) {
            return;
        }
        Object tag = getInstance().getTag(SFMuiseSDK.MUISE_EVENT_LISTENER);
        if (!(tag instanceof h)) {
            tag = null;
        }
        h hVar = (h) tag;
        if (hVar == null) {
            return;
        }
        hVar.a(JarvisConstant.EVENT_RECORD_ITME_CLICk, jSONObject, null, null);
    }
}
