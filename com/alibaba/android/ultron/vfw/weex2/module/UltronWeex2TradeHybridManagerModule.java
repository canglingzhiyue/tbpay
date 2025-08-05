package com.alibaba.android.ultron.vfw.weex2.module;

import android.text.TextUtils;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.management.a;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.ui.MUSMethod;
import tb.kge;

/* loaded from: classes2.dex */
public class UltronWeex2TradeHybridManagerModule extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MODULE_NAME = "TradeHybridManager";

    static {
        kge.a(-566582253);
    }

    public UltronWeex2TradeHybridManagerModule(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
    }

    @MUSMethod(uiThread = true)
    public void onStage(String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb77c2b6", new Object[]{this, str, str2, jSONObject});
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            UnifyLog.d("UltronWeex2TradeHybridManagerModule.onStage", "stage or sceneName is empty");
        } else {
            JSONObject jSONObject2 = new JSONObject();
            if (getInstance() != null && getInstance().getUIContext() != null) {
                jSONObject2.put("context", (Object) getInstance().getUIContext());
            }
            if (jSONObject != null) {
                jSONObject2.putAll(jSONObject);
            }
            a.a().a(str, str2, jSONObject2);
        }
    }
}
