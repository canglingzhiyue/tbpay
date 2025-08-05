package com.taobao.weex.remote;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.WXSDKManager;
import com.taobao.weex.ui.action.GraphicActionAnimation;
import com.taobao.weex.utils.WXLogUtils;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes9.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Map<a, String> f23521a;

    static {
        kge.a(-1045381992);
        HashMap hashMap = new HashMap();
        f23521a = hashMap;
        hashMap.put(WXSDKEngine.getInstance(), "com.taobao.weex.WXSDKEngineImpl");
        f23521a.put(WXSDKManager.getInstance(), "com.taobao.weex.bridge.WXBridgeManager");
        f23521a.put(new GraphicActionAnimation(), "com.taobao.weex.ui.component.list.template.TemplateDom");
    }

    public static void a() {
        for (Map.Entry<a, String> entry : f23521a.entrySet()) {
            if (entry != null) {
                a key = entry.getKey();
                if (key.mo1589getImpl() == null) {
                    try {
                        key.setImpl(Class.forName(entry.getValue()).getMethod("getInstance", new Class[0]).invoke(null, new Object[0]));
                    } catch (Throwable th) {
                        WXLogUtils.e(WXLogUtils.WEEX_TAG, th);
                    }
                }
            }
        }
    }
}
