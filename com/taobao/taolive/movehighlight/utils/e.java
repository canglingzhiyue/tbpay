package com.taobao.taolive.movehighlight.utils;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.live.timemove.base.data.RecModel;
import com.taobao.taolive.movehighlight.bundle.timeshift.model.LiveTimemovingModel;
import com.taobao.taolive.room.openarchitecture.listener.AccessListenerEnum;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.OpenHiglightAccess;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import tb.kge;

/* loaded from: classes8.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(898918631);
    }

    public static void a(com.taobao.alilive.aliliveframework.frame.a aVar, TBLiveDataModel tBLiveDataModel, LiveTimemovingModel liveTimemovingModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("165cc76", new Object[]{aVar, tBLiveDataModel, liveTimemovingModel});
        } else if (aVar == null) {
        } else {
            try {
                if (aVar.o() == null || liveTimemovingModel == null) {
                    return;
                }
                OpenHiglightAccess openHiglightAccess = new OpenHiglightAccess();
                openHiglightAccess.liveId = liveTimemovingModel.liveId;
                if (tBLiveDataModel != null) {
                    VideoInfo a2 = com.taobao.taolive.sdk.controller.k.a(tBLiveDataModel);
                    if (a2.broadCaster != null) {
                        openHiglightAccess.accountId = a2.broadCaster.accountId;
                    }
                }
                OpenHiglightAccess.HighlightSkipParams highlightSkipParams = new OpenHiglightAccess.HighlightSkipParams();
                highlightSkipParams.id = liveTimemovingModel.liveId;
                highlightSkipParams.productType = RecModel.MEDIA_TYPE_TIMEMOVE;
                highlightSkipParams.sjsdItemId = liveTimemovingModel.itemId;
                highlightSkipParams.keyPointId = liveTimemovingModel.timeMovingId;
                openHiglightAccess.highlightSkipParams = highlightSkipParams;
                aVar.n.accessListener(AccessListenerEnum.onRecieveDetailResponse, openHiglightAccess);
            } catch (Exception unused) {
            }
        }
    }

    public static void a(com.taobao.alilive.aliliveframework.frame.a aVar, TBLiveDataModel tBLiveDataModel, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6b4149a", new Object[]{aVar, tBLiveDataModel, jSONObject});
        } else if (aVar == null) {
        } else {
            try {
                if (aVar.o() == null || jSONObject == null) {
                    return;
                }
                OpenHiglightAccess openHiglightAccess = new OpenHiglightAccess();
                if (tBLiveDataModel == null) {
                    return;
                }
                VideoInfo a2 = com.taobao.taolive.sdk.controller.k.a(tBLiveDataModel);
                openHiglightAccess.liveId = a2.liveId;
                if (a2.broadCaster != null) {
                    openHiglightAccess.accountId = a2.broadCaster.accountId;
                }
                OpenHiglightAccess.HighlightSkipParams highlightSkipParams = new OpenHiglightAccess.HighlightSkipParams();
                highlightSkipParams.id = a2.liveId;
                highlightSkipParams.productType = RecModel.MEDIA_TYPE_TIMEMOVE;
                highlightSkipParams.keyPointId = jSONObject.getString("timeMovingId");
                openHiglightAccess.highlightSkipParams = highlightSkipParams;
                aVar.n.accessListener(AccessListenerEnum.onRecieveDetailResponse, openHiglightAccess);
            } catch (Exception unused) {
            }
        }
    }
}
