package com.taobao.android.shop.weex;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.shop.activity.ShopRenderActivity;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.bridge.JSCallback;
import com.taobao.weex.common.WXModule;
import tb.kge;

/* loaded from: classes6.dex */
public class ShopParallelRenderModule extends WXModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1295136121);
    }

    @JSMethod(uiThread = false)
    public void merge(String str, JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2f80f1f", new Object[]{this, str, jSCallback});
            return;
        }
        com.taobao.android.shop.utils.a.a("shop", "main-cost merge-cost 前端触发 merge 传递 ref 值 " + str);
        try {
            Context O = this.mWXSDKInstance.O();
            if (O instanceof ShopRenderActivity) {
                ((ShopRenderActivity) O).addToParent(str, jSCallback);
            } else {
                jSCallback.invoke("failed. not ShopRenderActivity");
            }
        } catch (Exception e) {
            jSCallback.invoke("exception " + e.getMessage());
        }
    }

    @JSMethod(uiThread = false)
    public void hookBackKey(boolean z, JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e738a90", new Object[]{this, new Boolean(z), jSCallback});
            return;
        }
        com.taobao.android.shop.utils.a.a("shop", "main-cost hookBackPress " + z);
        try {
            Context O = this.mWXSDKInstance.O();
            if (O instanceof ShopRenderActivity) {
                ((ShopRenderActivity) O).mHookBackPress = z;
            } else {
                jSCallback.invoke("failed. not ShopRenderActivity");
            }
        } catch (Exception e) {
            jSCallback.invoke("exception " + e.getMessage());
        }
    }
}
