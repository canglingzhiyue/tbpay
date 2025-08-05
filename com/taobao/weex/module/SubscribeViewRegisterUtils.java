package com.taobao.weex.module;

import com.alibaba.flexa.compat.c;
import com.alibaba.triver.triver_shop.tbsubscribe.EmbedSubscribeView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.ui.component.WXComponent;
import com.taobao.weex.utils.WXLogUtils;
import tb.kge;

/* loaded from: classes9.dex */
public class SubscribeViewRegisterUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String CLAZZ_NAME = "com.taobao.android.dinamicx.subscribe.protocol.shop.weex.ShopSubscribeWeexComponent";
    private static final String TAG = "SubscribeViewRegisterUtils";

    static {
        kge.a(356811783);
    }

    public static void tryRegister() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac0cff05", new Object[0]);
            return;
        }
        WXLogUtils.e(TAG, "tryRegister");
        c.a(CLAZZ_NAME, new c.a() { // from class: com.taobao.weex.module.SubscribeViewRegisterUtils.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.flexa.compat.c.a
            public void onClassLoaded(Class<?> cls) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5ad6f018", new Object[]{this, cls});
                    return;
                }
                try {
                    WXSDKEngine.registerComponent(EmbedSubscribeView.TYPE, (Class<? extends WXComponent>) cls);
                } catch (Throwable th) {
                    WXLogUtils.e(SubscribeViewRegisterUtils.TAG, th);
                }
            }

            @Override // com.alibaba.flexa.compat.c.a
            public void onClassNotFound() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ad9dd2ef", new Object[]{this});
                } else {
                    WXLogUtils.e(SubscribeViewRegisterUtils.TAG, "onClassNotFound");
                }
            }
        });
    }
}
