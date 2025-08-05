package com.taobao.android.detail.wrapper.ext.request.addon;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.trade.boost.request.mtop.b;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import tb.emu;
import tb.kge;

/* loaded from: classes5.dex */
public class AddonParams implements b, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String SOURCE_PAGE = "detailPage";
    private String mAddOnSession;
    private String mItemId;

    static {
        kge.a(534483746);
        kge.a(-1500195920);
        kge.a(1028243835);
    }

    public AddonParams(String str, String str2) {
        this.mItemId = str;
        this.mAddOnSession = str2;
        emu.a("com.taobao.android.detail.wrapper.ext.request.addon.AddonParams");
    }

    @Override // com.taobao.android.trade.boost.request.mtop.b
    public Map<String, String> toMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2dd9d11d", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        String str = this.mItemId;
        if (str != null) {
            hashMap.put("itemId", str);
        }
        String str2 = this.mAddOnSession;
        if (str2 != null) {
            hashMap.put("addOnSession", str2);
        }
        hashMap.put("sourcePage", SOURCE_PAGE);
        hashMap.put(com.taobao.android.detail.core.request.b.f9819a, com.taobao.android.detail.core.request.b.b);
        return hashMap;
    }
}
