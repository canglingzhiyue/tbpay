package com.taobao.android.weex_ability.page;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.ui.MUSMethod;
import tb.kge;

/* loaded from: classes6.dex */
public class MUSEventModule extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NAME = "event";

    static {
        kge.a(-537157717);
    }

    public MUSEventModule(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
    }

    @MUSMethod(uiThread = true)
    public void openURL(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2792af96", new Object[]{this, str});
        } else if (getInstance() == null) {
        } else {
            MUSDKInstance mUSDKInstance = (MUSDKInstance) getInstance();
            if (mUSDKInstance.getActivityNav() == null) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("url", (Object) str);
            mUSDKInstance.getActivityNav().a(getInstance().getUIContext(), getInstance(), jSONObject.toString());
        }
    }
}
