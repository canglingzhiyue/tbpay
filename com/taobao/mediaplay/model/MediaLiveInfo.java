package com.taobao.mediaplay.model;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.MediaConstant;
import com.taobao.taobaoavsdk.AVSDKLog;
import com.taobao.taolive.room.utils.aw;
import java.io.Serializable;
import java.util.ArrayList;
import tb.kge;
import tb.nog;

/* loaded from: classes7.dex */
public class MediaLiveInfo implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String anchorId;
    public boolean edgePcdn;
    public boolean h265;
    public String liveId;
    public ArrayList<QualityLiveItem> liveUrlList;
    public JSONArray liveUrlListJson;
    public MediaConfig mMediaConfigData;
    public String mediaConfig;
    public String mediaSourceType;
    public boolean rateAdapte;

    static {
        kge.a(773701230);
        kge.a(1028243835);
    }

    public void updateLiveUrlList(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c03bd47", new Object[]{this, jSONArray});
        } else if (jSONArray != null) {
            try {
                this.liveUrlList = new ArrayList<>();
                if (jSONArray != null) {
                    int size = jSONArray.size();
                    for (int i = 0; i < size; i++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        QualityLiveItem qualityLiveItem = new QualityLiveItem();
                        qualityLiveItem.artpUrl = jSONObject.getString("artpUrl");
                        qualityLiveItem.definition = jSONObject.getString("definition");
                        qualityLiveItem.flvUrl = jSONObject.getString("flvUrl");
                        qualityLiveItem.h265Url = jSONObject.getString("h265Url");
                        qualityLiveItem.hlsUrl = jSONObject.getString("hlsUrl");
                        qualityLiveItem.name = jSONObject.getString("name");
                        qualityLiveItem.wholeH265FlvUrl = jSONObject.getString("wholeH265FlvUrl");
                        qualityLiveItem.wholeH265ArtpUrl = jSONObject.getString(aw.PARAM_MEDIA_INFO_wholeH265ArtpUrl);
                        qualityLiveItem.bfrtcUrl = jSONObject.getString(MediaConstant.BFRTC_URL_NAME);
                        qualityLiveItem.liveUrlMiniBfrtc = jSONObject.getString("liveUrlMiniBfrtc");
                        qualityLiveItem.rtcLiveUrl = jSONObject.getString(MediaConstant.RTCLIVE_URL_NAME);
                        qualityLiveItem.unit = jSONObject.getString(nog.PRICE_UNIT);
                        qualityLiveItem.unitType = jSONObject.getString("unitType");
                        qualityLiveItem.newDefinition = jSONObject.getString("newDefinition");
                        qualityLiveItem.recomm = jSONObject.getString("recomm");
                        qualityLiveItem.newName = jSONObject.getString("newName");
                        if (jSONObject.getString("liveStreamStatsInfo") != null) {
                            qualityLiveItem.liveStreamStatsInfo = (LiveStreamStatsInfo) JSON.parseObject(jSONObject.getString("liveStreamStatsInfo"), LiveStreamStatsInfo.class);
                        }
                        if (jSONObject.getString("additionUrlMap") != null) {
                            qualityLiveItem.additionUrlMap = jSONObject.getString("additionUrlMap");
                        }
                        if (jSONObject.getString("extInfo") != null) {
                            qualityLiveItem.extInfo = jSONObject.getString("extInfo");
                        }
                        this.liveUrlList.add(qualityLiveItem);
                    }
                }
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "updateMediaLiveInfo success.");
            } catch (Exception e) {
                AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "updateMediaLiveInfoWithPCResult failed!" + e.toString());
            }
        }
    }
}
