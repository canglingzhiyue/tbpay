package com.taobao.android.layoutmanager.module;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.setup.WindvanePluginRegister;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.bridge.b;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.ui.MUSMethod;
import com.taobao.tao.flexbox.layoutmanager.component.ae;
import java.util.Map;
import tb.kge;
import tb.ogg;

/* loaded from: classes5.dex */
public class WeexModule extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2009252465);
    }

    public WeexModule(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
    }

    @MUSMethod(uiThread = true)
    public void postMessage(String str, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec4982af", new Object[]{this, str, bVar});
            return;
        }
        ogg.a("WeexComponent", "WeexModule postMessage msg = " + str);
        try {
            JSONObject parseObject = JSONObject.parseObject(str);
            ae aeVar = (ae) getInstance().getTag("WeexComponent");
            if (aeVar != null) {
                aeVar.a("onmessage", (Map) parseObject);
            } else {
                ogg.a("WeexComponent", "weexComponent is null, message didn't send to TNode");
            }
        } catch (Throwable th) {
            ogg.c(WindvanePluginRegister.WVTNodeCachePlugin.ACTION_POST_NOTIFY, th.getMessage());
        }
        bVar.a(new Object[0]);
    }
}
