package com.taobao.search.musie;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.ui.MUSMethod;
import com.taobao.android.xsearchplugin.muise.SFMuiseSDK;
import tb.kge;

/* loaded from: classes7.dex */
public class MUSCategoryModule extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2016608455);
    }

    public static /* synthetic */ Object ipc$super(MUSCategoryModule mUSCategoryModule, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public MUSCategoryModule(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
    }

    @MUSMethod(uiThread = true)
    public void switchHomeTabIcon(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5ad942e", new Object[]{this, jSONObject});
            return;
        }
        com.taobao.android.xsearchplugin.weex.weex.h actionPerformer = getActionPerformer();
        if (actionPerformer == null) {
            return;
        }
        actionPerformer.a("switchHomeTabIcon", jSONObject, null, null);
    }

    @MUSMethod(uiThread = true)
    public void hideLoadingView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7409c66", new Object[]{this});
            return;
        }
        com.taobao.android.xsearchplugin.weex.weex.h actionPerformer = getActionPerformer();
        if (actionPerformer == null) {
            return;
        }
        actionPerformer.a("hideLoadingView", null, null, null);
    }

    private com.taobao.android.xsearchplugin.weex.weex.h getActionPerformer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.xsearchplugin.weex.weex.h) ipChange.ipc$dispatch("1f0fdec3", new Object[]{this});
        }
        Object tag = getInstance().getTag(SFMuiseSDK.MUISE_EVENT_LISTENER);
        if (tag instanceof com.taobao.android.xsearchplugin.weex.weex.h) {
            return (com.taobao.android.xsearchplugin.weex.weex.h) tag;
        }
        return null;
    }
}
