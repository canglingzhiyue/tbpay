package com.taobao.mytaobao.newsetting;

import android.app.Application;
import android.taobao.windvane.jsbridge.q;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.common.WXException;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1611881224);
    }

    public void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{this, application, hashMap});
            return;
        }
        try {
            q.a(FontSettingJSBridge.NAME, (Class<? extends android.taobao.windvane.jsbridge.e>) FontSettingJSBridge.class, true);
        } catch (Exception unused) {
        }
        try {
            WXSDKEngine.registerModule(FontSettingModule.MODULE_NAME, FontSettingModule.class, true);
        } catch (WXException unused2) {
        }
    }
}
