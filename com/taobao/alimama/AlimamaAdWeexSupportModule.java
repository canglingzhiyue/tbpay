package com.taobao.alimama;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.utils.Global;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.bridge.JSCallback;
import com.taobao.weex.common.WXModule;
import java.util.Map;
import tb.kge;

/* loaded from: classes4.dex */
public class AlimamaAdWeexSupportModule extends WXModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String WEEX_MODULE_NAME = "AlimamaAdModule";

    static {
        kge.a(-1146539891);
    }

    @JSMethod(uiThread = true)
    public void commitIfsEvent(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f5686b6", new Object[]{this, str, str2});
        } else {
            AlimamaAdvertising.instance().buildIfsExposure(Global.getApplication(), str).withArgNamespace(str2).commit();
        }
    }

    @JSMethod(uiThread = true)
    public void genClickIdBy(String str, boolean z, JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39bbedcf", new Object[]{this, str, new Boolean(z), jSCallback});
            return;
        }
        String handleAdUrlForClickid = AlimamaAdvertising.instance().handleAdUrlForClickid(str, z);
        if (jSCallback == null) {
            return;
        }
        if (handleAdUrlForClickid == null) {
            handleAdUrlForClickid = "";
        }
        jSCallback.invoke(handleAdUrlForClickid);
    }

    @JSMethod(uiThread = true)
    public void commitTaokeInfo(String str, String str2, String str3, boolean z, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("605e7f69", new Object[]{this, str, str2, str3, new Boolean(z), map});
        } else {
            AlimamaAdvertising.instance().commitTaokeInfo(str, str2, str3, z, map);
        }
    }

    @JSMethod(uiThread = true)
    public void uploadUDTrack(String str, String str2, String str3, boolean z, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fabea071", new Object[]{this, str, str2, str3, new Boolean(z), map});
        } else {
            AlimamaAdvertising.instance().uploadUDTrack(str, str2, str3, z, map);
        }
    }
}
