package com.taobao.android.detail.wrapper.request.size.model;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.request.MtopRequestParams;
import java.util.HashMap;
import tb.emu;
import tb.kge;

/* loaded from: classes5.dex */
public class KAPThumbUpRequestParams implements MtopRequestParams {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String itemId;
    private String optionKey;
    private String userId;

    static {
        kge.a(-163872431);
        kge.a(-1214933880);
    }

    public KAPThumbUpRequestParams(String str, String str2, String str3) {
        this.userId = str;
        this.itemId = str2;
        this.optionKey = str3;
        emu.a("com.taobao.android.detail.wrapper.request.KAPThumbUpRequestParams");
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
        hashMap.put("optionKey", this.optionKey);
        return hashMap;
    }
}
