package com.taobao.android.detail.core.request.area;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.request.MtopRequestParams;
import java.util.HashMap;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class QuerySupportedAreaRequestParams implements MtopRequestParams {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String K_AREA_ID = "areaId";
    private static final String K_ITEM_ID = "itemId";
    private String mAreaId;
    private String mItemId;

    static {
        kge.a(-2137242843);
        kge.a(-1214933880);
    }

    public QuerySupportedAreaRequestParams(String str, String str2) {
        this.mItemId = str;
        this.mAreaId = str2;
        emu.a("com.taobao.android.detail.core.request.area.QuerySupportedAreaRequestParams");
    }

    @Override // com.taobao.android.detail.core.request.MtopRequestParams
    public HashMap<String, String> toMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("1c79404b", new Object[]{this});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        String str = this.mItemId;
        if (str != null) {
            hashMap.put("itemId", str);
        }
        String str2 = this.mAreaId;
        if (str2 != null) {
            hashMap.put("areaId", str2);
        }
        return hashMap;
    }
}
