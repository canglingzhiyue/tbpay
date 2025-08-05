package com.taobao.android.detail.wrapper.ext.request.size;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.request.MtopRequestParams;
import com.taobao.android.detail.core.request.b;
import java.util.HashMap;
import tb.emu;
import tb.kge;

/* loaded from: classes5.dex */
public class TBSizeChartParams implements MtopRequestParams {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String K_ITEM_ID = "itemId";
    private static final String K_SELLER_ID = "sellerId";
    private static final String K_USER_ID = "userId";
    public String itemId;
    public String sellerId;
    public String userId;

    static {
        kge.a(895161244);
        kge.a(-1214933880);
    }

    public TBSizeChartParams(String str, String str2, String str3) {
        this.userId = str;
        this.itemId = str2;
        this.sellerId = str3;
        emu.a("com.taobao.android.detail.wrapper.ext.request.size.TBSizeChartParams");
    }

    @Override // com.taobao.android.detail.core.request.MtopRequestParams
    public HashMap<String, String> toMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("1c79404b", new Object[]{this});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (!TextUtils.isEmpty(this.userId)) {
            hashMap.put("userId", this.userId);
        }
        if (!TextUtils.isEmpty(this.itemId)) {
            hashMap.put("itemId", this.itemId);
        }
        if (!TextUtils.isEmpty(this.sellerId)) {
            hashMap.put("sellerId", this.sellerId);
        }
        hashMap.put("detail_v", b.b);
        return hashMap;
    }
}
