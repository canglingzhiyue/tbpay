package com.taobao.android.live.plugin.atype.flexalocal.smartlanding.business;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import com.taobao.taolive.sdk.adapter.network.d;
import com.taobao.taolive.sdk.business.b;
import tb.kge;

/* loaded from: classes6.dex */
public class a extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1045508984);
    }

    public a(d dVar) {
        super(dVar);
    }

    public void a(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54b86a6e", new Object[]{this, str, str2, str3, str4, str5, str6, str7});
            return;
        }
        MtopTbliveGrowthApiPopCheckPopRequest mtopTbliveGrowthApiPopCheckPopRequest = new MtopTbliveGrowthApiPopCheckPopRequest();
        mtopTbliveGrowthApiPopCheckPopRequest.setBizCode(str);
        mtopTbliveGrowthApiPopCheckPopRequest.setEntryLiveSource(str2);
        mtopTbliveGrowthApiPopCheckPopRequest.setUrlParams(str3);
        mtopTbliveGrowthApiPopCheckPopRequest.setLiveSource(str4);
        mtopTbliveGrowthApiPopCheckPopRequest.setLiveId(str5);
        mtopTbliveGrowthApiPopCheckPopRequest.setAnchorId(str6);
        mtopTbliveGrowthApiPopCheckPopRequest.setAppVersion(str7);
        a(0, (INetDataObject) mtopTbliveGrowthApiPopCheckPopRequest, MtopTbliveGrowthApiPopCheckPopResponse.class, false, true);
    }

    public void a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, String str9, JSONObject jSONObject, String str10, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("772ee25c", new Object[]{this, str, str2, str3, str4, str5, str6, str7, str8, new Boolean(z), str9, jSONObject, str10, jSONObject2});
            return;
        }
        MtopRoomstudioLiveDisplayDetailRequest mtopRoomstudioLiveDisplayDetailRequest = new MtopRoomstudioLiveDisplayDetailRequest();
        mtopRoomstudioLiveDisplayDetailRequest.setBizCode(str);
        mtopRoomstudioLiveDisplayDetailRequest.setEntryLiveSource(str2);
        mtopRoomstudioLiveDisplayDetailRequest.setUrlParams(str3);
        mtopRoomstudioLiveDisplayDetailRequest.setLiveSource(str4);
        mtopRoomstudioLiveDisplayDetailRequest.setContentId(str5);
        mtopRoomstudioLiveDisplayDetailRequest.setAnchorId(str6);
        mtopRoomstudioLiveDisplayDetailRequest.setAppVersion(str7);
        mtopRoomstudioLiveDisplayDetailRequest.setSjsdParams(jSONObject.toJSONString());
        mtopRoomstudioLiveDisplayDetailRequest.setHasSjsdParams(!jSONObject.isEmpty());
        mtopRoomstudioLiveDisplayDetailRequest.setChannel(str8);
        mtopRoomstudioLiveDisplayDetailRequest.setTargetAliveId(str9);
        mtopRoomstudioLiveDisplayDetailRequest.setIsRecommendLive(z);
        mtopRoomstudioLiveDisplayDetailRequest.setQueryCheckPop(true);
        mtopRoomstudioLiveDisplayDetailRequest.setDisplayExtParams(str10);
        mtopRoomstudioLiveDisplayDetailRequest.setFeatures(jSONObject2 == null ? "{}" : jSONObject2.toJSONString());
        a(0, (INetDataObject) mtopRoomstudioLiveDisplayDetailRequest, MtopRoomstudioLiveDisplayDetailResponse.class, false, true);
    }

    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
            return;
        }
        MtopTbliveGrowthApiPopExposureRequest mtopTbliveGrowthApiPopExposureRequest = new MtopTbliveGrowthApiPopExposureRequest();
        mtopTbliveGrowthApiPopExposureRequest.setPopId(str);
        mtopTbliveGrowthApiPopExposureRequest.setScene(str2);
        mtopTbliveGrowthApiPopExposureRequest.setExParams(str3);
        a(0, mtopTbliveGrowthApiPopExposureRequest, MtopTbliveGrowthApiPopExposureResponse.class);
    }
}
