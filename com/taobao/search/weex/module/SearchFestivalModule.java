package com.taobao.search.weex.module;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.common.WXModule;
import tb.kge;

/* loaded from: classes8.dex */
public class SearchFestivalModule extends WXModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MODULE_NAME = "searchFestival";

    static {
        kge.a(-1106389355);
    }

    @JSMethod(uiThread = false)
    public int getActionBarBackgroundColor(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("55a6ef6e", new Object[]{this, jSONObject})).intValue() : FestivalMgr.a().a("actionBarBackgroundColor", 0);
    }
}
