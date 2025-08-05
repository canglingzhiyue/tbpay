package com.taobao.android.detail.sdk.request.area;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.request.DetailVRequestParams;
import com.taobao.android.trade.boost.request.mtop.b;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.mrm;
import tb.tpc;

/* loaded from: classes4.dex */
public class BasicQuerySupportedAreaListRequestParams extends DetailVRequestParams implements b, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String areaId;
    public Map<String, String> extParam;
    public String id;

    static {
        kge.a(1667105304);
        kge.a(1028243835);
        kge.a(-1500195920);
    }

    public BasicQuerySupportedAreaListRequestParams(String str, String str2) {
        this.id = str;
        this.areaId = str2;
        tpc.a("com.taobao.android.detail.sdk.request.area.BasicQuerySupportedAreaListRequestParams");
    }

    @Override // com.taobao.android.trade.boost.request.mtop.b
    public Map<String, String> toMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2dd9d11d", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        Map<String, String> map = this.extParam;
        if (map != null && map.size() > 0) {
            hashMap.putAll(this.extParam);
        }
        if (!TextUtils.isEmpty(this.id)) {
            hashMap.put("id", this.id);
        }
        if (!TextUtils.isEmpty(this.areaId)) {
            hashMap.put(mrm.KEY_AREA_ID, this.areaId);
        }
        if (!TextUtils.isEmpty(this.detail_v)) {
            hashMap.put("detail_v", this.detail_v);
        }
        return hashMap;
    }
}
