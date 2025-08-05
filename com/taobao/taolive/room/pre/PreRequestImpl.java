package com.taobao.taolive.room.pre;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.business.IRemoteExtendListener;
import com.taobao.taolive.sdk.core.impl.TBLiveDataProvider;
import com.taobao.taolive.sdk.model.common.FandomInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.utils.n;
import java.util.List;
import java.util.Map;
import tb.kge;
import tb.pmd;
import tb.ppq;

/* loaded from: classes8.dex */
public class PreRequestImpl implements IRemoteExtendListener, TBLiveDataProvider.b, ppq.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private TBLiveDataProvider.b mHeaderListener;
    private ppq.a mIGetVideoInfoListener;
    private PreRequestInfo mPreRequestInfo;

    static {
        kge.a(40618328);
        kge.a(600413623);
        kge.a(788651310);
        kge.a(-1941058775);
        kge.a(1829099657);
    }

    @Override // com.taobao.taolive.sdk.business.IRemoteExtendListener
    public void dataParseBegin(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a054be1d", new Object[]{this, new Long(j)});
        }
    }

    public void startRealRequest(PreRequestInfo preRequestInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23bedbdf", new Object[]{this, preRequestInfo});
            return;
        }
        this.mPreRequestInfo = preRequestInfo;
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(preRequestInfo.params.itemid)) {
            jSONObject.put("itemid", (Object) preRequestInfo.params.itemid);
        }
        jSONObject.put("guardAnchorSwitch", (Object) Boolean.valueOf(pmd.a().a("enableAnchorGuard")));
        jSONObject.put("version", (Object) "202107");
        if (preRequestInfo.params.extJson != null) {
            jSONObject.putAll(preRequestInfo.params.extJson);
        }
        preRequestInfo.tbLiveDataProvider.setIRemoteExtendListener(this);
        com.taobao.taolive.sdk.business.detail.a aVar = new com.taobao.taolive.sdk.business.detail.a(preRequestInfo.params.feedId, preRequestInfo.params.userId);
        aVar.c(preRequestInfo.params.timeMovingItemId).d(preRequestInfo.params.sjsdItemId).e(preRequestInfo.params.liveSource).f(jSONObject.toString()).a(preRequestInfo.params.itemIds, preRequestInfo.params.holdType).h(preRequestInfo.params.forceFandom).i(preRequestInfo.params.transParams).j(preRequestInfo.params.needRecommend);
        if (!TextUtils.isEmpty(preRequestInfo.params.productType)) {
            aVar.b(preRequestInfo.params.productType);
        }
        if (!TextUtils.isEmpty(preRequestInfo.params.timeMovingItemId)) {
            aVar.c(preRequestInfo.params.timeMovingItemId);
        }
        aVar.g(preRequestInfo.params.useLiveFandom);
        aVar.a(preRequestInfo.params.transMap);
        if (preRequestInfo.params != null && preRequestInfo.params.tcpParams != null) {
            aVar.f21798a = preRequestInfo.params.tcpParams;
        }
        preRequestInfo.tbLiveDataProvider.getVideoInfo(aVar, preRequestInfo.params.rcmd, this);
        if (!(preRequestInfo.tbLiveDataProvider instanceof TBLiveDataProvider)) {
            return;
        }
        preRequestInfo.tbLiveDataProvider.setResponseHeaderListener(this);
    }

    @Override // tb.ppq.a
    public void onGetVideoInfoSuccess(VideoInfo videoInfo, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889673f", new Object[]{this, videoInfo, str});
            return;
        }
        ppq.a aVar = this.mIGetVideoInfoListener;
        if (aVar != null) {
            aVar.onGetVideoInfoSuccess(videoInfo, str);
        }
        PreRequestInfo preRequestInfo = this.mPreRequestInfo;
        if (preRequestInfo == null) {
            return;
        }
        preRequestInfo.info = videoInfo;
        preRequestInfo.rawData = str;
        preRequestInfo.responseStatus = 1;
    }

    @Override // tb.ppq.a
    public void onGetFandomInfoSuccess(FandomInfo fandomInfo, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e52d6dd", new Object[]{this, fandomInfo, str});
            return;
        }
        n.b(a.TAG, "onGetFandomInfoSuccess");
        ppq.a aVar = this.mIGetVideoInfoListener;
        if (aVar != null) {
            aVar.onGetFandomInfoSuccess(fandomInfo, str);
        }
        PreRequestInfo preRequestInfo = this.mPreRequestInfo;
        if (preRequestInfo == null) {
            return;
        }
        preRequestInfo.fandomInfo = fandomInfo;
        preRequestInfo.fandomResponse = str;
    }

    @Override // tb.ppq.a
    public void onGetVideoInfoFail(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa662561", new Object[]{this, str});
            return;
        }
        n.b(a.TAG, "onGetVideoInfoFail errCode:" + str);
        ppq.a aVar = this.mIGetVideoInfoListener;
        if (aVar != null) {
            aVar.onGetVideoInfoFail(str);
        }
        PreRequestInfo preRequestInfo = this.mPreRequestInfo;
        if (preRequestInfo == null) {
            return;
        }
        preRequestInfo.errCode = str;
        preRequestInfo.responseStatus = 2;
    }

    @Override // com.taobao.taolive.sdk.core.impl.TBLiveDataProvider.b
    public void onGetHeaderFields(Map<String, List<String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dd45ac1", new Object[]{this, map});
            return;
        }
        TBLiveDataProvider.b bVar = this.mHeaderListener;
        if (bVar == null) {
            return;
        }
        bVar.onGetHeaderFields(map);
    }

    public void setResponseListener(ppq.a aVar, TBLiveDataProvider.b bVar) {
        ppq.a aVar2;
        TBLiveDataProvider.b bVar2;
        ppq.a aVar3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55096246", new Object[]{this, aVar, bVar});
            return;
        }
        this.mIGetVideoInfoListener = aVar;
        this.mHeaderListener = bVar;
        PreRequestInfo preRequestInfo = this.mPreRequestInfo;
        if (preRequestInfo == null) {
            return;
        }
        int i = preRequestInfo.responseStatus;
        if (i == 1) {
            ppq.a aVar4 = this.mIGetVideoInfoListener;
            if (aVar4 != null) {
                aVar4.onGetVideoInfoSuccess(this.mPreRequestInfo.info, this.mPreRequestInfo.rawData);
                if (this.mPreRequestInfo.info != null) {
                    n.b(a.TAG, "addResponseListener success feedId:" + this.mPreRequestInfo.info.liveId);
                }
            }
        } else if (i == 2 && (aVar3 = this.mIGetVideoInfoListener) != null) {
            aVar3.onGetVideoInfoFail(this.mPreRequestInfo.errCode);
            n.b(a.TAG, "addResponseListener fail feedId:" + this.mPreRequestInfo.errCode);
        }
        if (this.mPreRequestInfo.headerResponseStatus == 1 && (bVar2 = this.mHeaderListener) != null) {
            bVar2.onGetHeaderFields(this.mPreRequestInfo.headerMap);
            n.b(a.TAG, "addResponseListener headerResponseStatus success");
        }
        if (this.mPreRequestInfo.fandomInfo == null || TextUtils.isEmpty(this.mPreRequestInfo.fandomResponse) || (aVar2 = this.mIGetVideoInfoListener) == null) {
            return;
        }
        aVar2.onGetFandomInfoSuccess(this.mPreRequestInfo.fandomInfo, this.mPreRequestInfo.fandomResponse);
        n.b(a.TAG, "addResponseListener onGetFandomInfoSuccess success");
    }

    public void removeResponseListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c4a0c0", new Object[]{this});
            return;
        }
        this.mIGetVideoInfoListener = null;
        this.mHeaderListener = null;
    }
}
