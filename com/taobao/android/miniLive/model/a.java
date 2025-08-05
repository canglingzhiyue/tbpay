package com.taobao.android.miniLive.model;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.sdk.model.common.QualitySelectItem;
import com.taobao.taolive.sdk.ui.media.MediaData;
import java.util.ArrayList;
import tb.kge;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1917658242);
    }

    public static MediaData a(SimpleLiveInfo simpleLiveInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaData) ipChange.ipc$dispatch("d9e8c50c", new Object[]{simpleLiveInfo});
        }
        if (simpleLiveInfo == null || simpleLiveInfo.liveUrlList == null || simpleLiveInfo.liveUrlList.size() <= 0) {
            return null;
        }
        MediaData mediaData = new MediaData();
        if (simpleLiveInfo.roomStatus == 1) {
            int size = simpleLiveInfo.liveUrlList.size();
            mediaData.h265 = simpleLiveInfo.h265;
            if (simpleLiveInfo.broadCaster != null) {
                mediaData.anchorId = simpleLiveInfo.broadCaster.accountId;
            }
            mediaData.liveId = simpleLiveInfo.liveId;
            mediaData.mediaSourceType = simpleLiveInfo.pushFeature;
            mediaData.liveUrlList = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                QualitySelectItem qualitySelectItem = simpleLiveInfo.liveUrlList.get(i);
                MediaData.QualityLiveItem qualityLiveItem = new MediaData.QualityLiveItem();
                qualityLiveItem.artpUrl = qualitySelectItem.artpUrl;
                qualityLiveItem.definition = qualitySelectItem.definition;
                qualityLiveItem.flvUrl = qualitySelectItem.flvUrl;
                qualityLiveItem.h265Url = qualitySelectItem.h265Url;
                qualityLiveItem.hlsUrl = qualitySelectItem.hlsUrl;
                qualityLiveItem.name = qualitySelectItem.name;
                qualityLiveItem.bfrtcUrl = qualitySelectItem.bfrtcUrl;
                qualityLiveItem.rtcLiveUrl = qualitySelectItem.rtcLiveUrl;
                qualityLiveItem.wholeH265FlvUrl = qualitySelectItem.wholeH265FlvUrl;
                qualityLiveItem.wholeH265ArtpUrl = qualitySelectItem.wholeH265ArtpUrl;
                qualityLiveItem.liveUrlMiniBfrtc = qualitySelectItem.liveUrlMiniBfrtc;
                qualityLiveItem.newDefinition = qualitySelectItem.newDefinition;
                qualityLiveItem.recomm = qualitySelectItem.recomm;
                qualityLiveItem.newName = qualitySelectItem.newName;
                mediaData.liveUrlList.add(qualityLiveItem);
            }
        }
        return mediaData;
    }

    public static String a(ArrayList<QualitySelectItem> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5852829e", new Object[]{arrayList});
        }
        JSONArray jSONArray = new JSONArray();
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                JSONObject jSONObject = new JSONObject();
                QualitySelectItem qualitySelectItem = arrayList.get(i);
                jSONObject.put("artpUrl", (Object) qualitySelectItem.artpUrl);
                jSONObject.put("definition", (Object) qualitySelectItem.definition);
                jSONObject.put("flvUrl", (Object) qualitySelectItem.flvUrl);
                jSONObject.put("h265Url", (Object) qualitySelectItem.h265Url);
                jSONObject.put("hlsUrl", (Object) qualitySelectItem.hlsUrl);
                jSONObject.put("name", (Object) qualitySelectItem.name);
                jSONObject.put("wholeH265FlvUrl", (Object) qualitySelectItem.wholeH265FlvUrl);
                jSONObject.put(aw.PARAM_MEDIA_INFO_wholeH265ArtpUrl, (Object) qualitySelectItem.wholeH265ArtpUrl);
                jSONObject.put("newDefinition", (Object) qualitySelectItem.newDefinition);
                jSONObject.put("recomm", (Object) qualitySelectItem.recomm);
                jSONObject.put("newName", (Object) qualitySelectItem.newName);
                jSONArray.add(jSONObject);
            }
        }
        return jSONArray.toJSONString();
    }
}
