package com.etao.feimagesearch.videosearch.result;

import android.os.Build;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.quicksearch.c;
import com.etao.feimagesearch.result.IrpMuiseModule;
import com.etao.feimagesearch.util.ah;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.ui.MUSMethod;
import tb.kge;

/* loaded from: classes4.dex */
public class NewIrpMuiseModule extends IrpMuiseModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(857944129);
    }

    public NewIrpMuiseModule(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
    }

    @MUSMethod(uiThread = true)
    public void metaCardJumpToResultView(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddd4e9e9", new Object[]{this, jSONObject});
            return;
        }
        try {
            com.etao.feimagesearch.intelli.realtime.a.Companion.a(Integer.parseInt(jSONObject.getString("imageId")));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @MUSMethod
    public void addQuickSearch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18d3dd1b", new Object[]{this});
        } else if (Build.VERSION.SDK_INT < 33) {
            ah.a(getInstance().getUIContext());
        } else {
            c.a(getInstance().getUIContext());
        }
    }
}
