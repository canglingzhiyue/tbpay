package com.taobao.android.shop.weex;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.common.WXModule;
import tb.kge;

/* loaded from: classes6.dex */
public class ShopContainerMonitorModule extends WXModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1059595997);
    }

    @JSMethod(uiThread = false)
    public void shopPageRenderFinished(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9956d86", new Object[]{this, str, new Long(j)});
            return;
        }
        try {
            if (this.mWXSDKInstance == null) {
                return;
            }
            this.mWXSDKInstance.O();
        } catch (Throwable unused) {
        }
    }
}
