package com.taobao.android.detail.ttdetail.bridge;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.bizmessage.h;
import com.taobao.android.detail.ttdetail.communication.c;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.utils.i;
import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.common.WXModule;
import com.taobao.weex.common.WXModuleAnno;
import tb.kge;

/* loaded from: classes4.dex */
public class TTWXModule extends WXModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TTWXModule";

    static {
        kge.a(956355008);
    }

    public static void initBridge() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbdd68c0", new Object[0]);
            return;
        }
        try {
            WXSDKEngine.registerModule("detail_utils", TTWXModule.class);
        } catch (Throwable th) {
            i.a(TAG, "initBridge error", th);
        }
    }

    @WXModuleAnno
    public void openUrlByNav(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0f474d8", new Object[]{this, str});
        } else if (this.mWXSDKInstance == null) {
        } else {
            c.a(this.mWXSDKInstance.O(), new h("openUrl", new JSONObject() { // from class: com.taobao.android.detail.ttdetail.bridge.TTWXModule.1
                {
                    put("url", (Object) str);
                }
            }, new RuntimeAbilityParam[0]));
        }
    }
}
