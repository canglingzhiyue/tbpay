package tb;

import android.app.Application;
import com.alibaba.android.nextrpc.bridge.NextRpcJsModule;
import com.alibaba.android.nextrpc.bridge.NextRpcWeex2Module;
import com.alibaba.android.nextrpc.internal.utils.UnifyLog;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSEngine;
import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.common.WXException;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class bfl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{application, hashMap});
            return;
        }
        try {
            boolean registerModule = WXSDKEngine.registerModule("nextrpc", NextRpcJsModule.class);
            MUSEngine.registerModule("nextrpc", NextRpcWeex2Module.class);
            UnifyLog.a("InitNextRpc", "nextRpc register module result=" + registerModule, new Object[0]);
        } catch (WXException unused) {
            UnifyLog.c("InitNextRpc", "nextRpc js module init error", new Object[0]);
        }
    }
}
