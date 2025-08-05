package com.taobao.android.detail.wrapper.request;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.request.MtopRequestParams;
import java.util.HashMap;
import tb.emu;
import tb.kge;

/* loaded from: classes5.dex */
public class KAPRemoveLikeRequestParams implements MtopRequestParams {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String itemId;
    private String userId;

    static {
        kge.a(-2021471257);
        kge.a(-1214933880);
    }

    public KAPRemoveLikeRequestParams(String str, String str2) {
        this.userId = str;
        this.itemId = str2;
        emu.a("com.taobao.android.detail.wrapper.request.KAPRemoveLikeRequestParams");
    }

    @Override // com.taobao.android.detail.core.request.MtopRequestParams
    public HashMap<String, String> toMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("1c79404b", new Object[]{this});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("userId", this.userId);
        hashMap.put("itemId", this.itemId);
        return hashMap;
    }
}
