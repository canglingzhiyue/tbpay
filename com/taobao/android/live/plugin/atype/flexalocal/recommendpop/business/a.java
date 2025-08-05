package com.taobao.android.live.plugin.atype.flexalocal.recommendpop.business;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import com.taobao.taolive.sdk.adapter.network.d;
import com.taobao.taolive.sdk.business.b;
import java.util.HashMap;
import tb.kge;
import tb.pqj;

/* loaded from: classes6.dex */
public class a extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(893469115);
    }

    public a(d dVar) {
        super(dVar);
    }

    public void a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df59d1f4", new Object[]{this, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14});
            return;
        }
        MtopTbliveRecommendPopviewQueryRequest mtopTbliveRecommendPopviewQueryRequest = new MtopTbliveRecommendPopviewQueryRequest();
        mtopTbliveRecommendPopviewQueryRequest.setLiveId(str);
        mtopTbliveRecommendPopviewQueryRequest.setAccountId(str2);
        mtopTbliveRecommendPopviewQueryRequest.setItemIds(str7);
        mtopTbliveRecommendPopviewQueryRequest.setEntrySpm(str4);
        mtopTbliveRecommendPopviewQueryRequest.setLiveSource(str5);
        mtopTbliveRecommendPopviewQueryRequest.setEntryLiveSource(str6);
        mtopTbliveRecommendPopviewQueryRequest.setShareType(str8);
        mtopTbliveRecommendPopviewQueryRequest.setSpm(str3);
        mtopTbliveRecommendPopviewQueryRequest.setQuery(str9);
        mtopTbliveRecommendPopviewQueryRequest.setSwitchIndex(str10);
        mtopTbliveRecommendPopviewQueryRequest.setRecExtParams(str11);
        mtopTbliveRecommendPopviewQueryRequest.setS(str12);
        mtopTbliveRecommendPopviewQueryRequest.setN(str13);
        mtopTbliveRecommendPopviewQueryRequest.setExpInfoList(str14);
        a((HashMap<String, String>) null);
        a(0, (INetDataObject) mtopTbliveRecommendPopviewQueryRequest, MtopTbliveRecommendPopviewQueryResponse.class, false, true);
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        MtopTbliveRecommendPopviewClickRequest mtopTbliveRecommendPopviewClickRequest = new MtopTbliveRecommendPopviewClickRequest();
        mtopTbliveRecommendPopviewClickRequest.setType(str);
        mtopTbliveRecommendPopviewClickRequest.setBackParams(str2);
        JSONObject b = pqj.b(str2);
        if (b != null) {
            String string = b.getString("asac");
            mtopTbliveRecommendPopviewClickRequest.setAsac(string);
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("asac", string);
            a(hashMap);
        }
        a(0, (INetDataObject) mtopTbliveRecommendPopviewClickRequest, MtopTbliveRecommendPopviewClickResponse.class, true);
    }

    public void a(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dba9507", new Object[]{this, str, str2, new Integer(i)});
            return;
        }
        MtopTbliveRecommendPopviewStatusRequest mtopTbliveRecommendPopviewStatusRequest = new MtopTbliveRecommendPopviewStatusRequest();
        mtopTbliveRecommendPopviewStatusRequest.setType(str);
        mtopTbliveRecommendPopviewStatusRequest.setBackParams(str2);
        mtopTbliveRecommendPopviewStatusRequest.setIndex(i);
        a((HashMap<String, String>) null);
        a(0, mtopTbliveRecommendPopviewStatusRequest, MtopTbliveRecommendPopviewStatusResponse.class);
    }
}
