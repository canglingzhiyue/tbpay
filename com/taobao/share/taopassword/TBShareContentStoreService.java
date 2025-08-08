package com.taobao.share.taopassword;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.globalmodel.TBShareContent;
import com.taobao.share.globalmodel.e;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.taobao.taobao.R;
import java.util.HashMap;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;

/* loaded from: classes8.dex */
public class TBShareContentStoreService implements IRemoteBaseListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int SAVE_TAOPASSWORD = 111;
    private String mChannelType;
    private RemoteBusiness remoteBusiness;

    static {
        kge.a(991314641);
        kge.a(-761806510);
        kge.a(-525336021);
    }

    public TBShareContentStoreService(String str) {
        this.mChannelType = str;
    }

    public void request() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("447a9796", new Object[]{this});
            return;
        }
        TBShareContent j = e.b().j();
        if (j == null || StringUtils.isEmpty(j.url) || StringUtils.isEmpty(j.businessId) || StringUtils.isEmpty(j.description)) {
            return;
        }
        MtopTaobaoSharepasswordStoresharecontentRequest mtopTaobaoSharepasswordStoresharecontentRequest = new MtopTaobaoSharepasswordStoresharecontentRequest();
        mtopTaobaoSharepasswordStoresharecontentRequest.setBizId(j.businessId);
        mtopTaobaoSharepasswordStoresharecontentRequest.setShareRequestId(j.shareId);
        mtopTaobaoSharepasswordStoresharecontentRequest.setShareChannelType(this.mChannelType);
        mtopTaobaoSharepasswordStoresharecontentRequest.setShareType(j.shareScene);
        mtopTaobaoSharepasswordStoresharecontentRequest.setShareDesc(j.description);
        mtopTaobaoSharepasswordStoresharecontentRequest.setSharePicUrl(j.imageUrl);
        mtopTaobaoSharepasswordStoresharecontentRequest.setShareUrl(j.url);
        mtopTaobaoSharepasswordStoresharecontentRequest.setMsgType("1");
        mtopTaobaoSharepasswordStoresharecontentRequest.setShareUniqueId(j.suId);
        HashMap hashMap = new HashMap();
        if (j.extraParams != null && !j.extraParams.isEmpty()) {
            hashMap.putAll(j.extraParams);
        }
        if (j.activityParams != null && !j.activityParams.isEmpty()) {
            String remove = j.activityParams.remove("contacts_sendName");
            if (!StringUtils.isEmpty(remove)) {
                mtopTaobaoSharepasswordStoresharecontentRequest.setShareSendName(remove);
            }
            String remove2 = j.activityParams.remove("contacts_remark");
            if (!StringUtils.isEmpty(remove2)) {
                mtopTaobaoSharepasswordStoresharecontentRequest.setShareRemark(remove2);
            }
            hashMap.putAll(j.activityParams);
        }
        if (!StringUtils.isEmpty(j.title)) {
            hashMap.put("title", j.title);
        }
        if (hashMap.size() > 0) {
            mtopTaobaoSharepasswordStoresharecontentRequest.setExtendInfo(JSON.toJSONString((Object) hashMap, true));
        } else {
            mtopTaobaoSharepasswordStoresharecontentRequest.setExtendInfo(null);
        }
        this.remoteBusiness = RemoteBusiness.build((IMTOPDataObject) mtopTaobaoSharepasswordStoresharecontentRequest).registeListener((MtopListener) this);
        this.remoteBusiness.mo1340setBizId(67);
        this.remoteBusiness.startRequest(111, BaseOutDo.class);
    }

    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
            return;
        }
        RemoteBusiness remoteBusiness = this.remoteBusiness;
        if (remoteBusiness == null) {
            return;
        }
        remoteBusiness.cancelRequest();
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        String errorCode = getErrorCode(mtopResponse);
        String str = "onError errorCode=" + errorCode;
        AppMonitor.Alarm.commitFail("share", "storesharecontent", errorCode, com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_18130), getMonitorArg());
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
        } else {
            AppMonitor.Alarm.commitSuccess("share", "storesharecontent", getMonitorArg());
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        String errorCode = getErrorCode(mtopResponse);
        String str = "onSystemError errorCode=" + errorCode;
        AppMonitor.Alarm.commitFail("share", "storesharecontent", errorCode, com.alibaba.ability.localization.b.a(R.string.taobao_app_1010_1_18130), getMonitorArg());
    }

    private String getErrorCode(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d4f0bf55", new Object[]{this, mtopResponse}) : mtopResponse == null ? "TPShareError_Others" : mtopResponse.isIllegelSign() ? "TPShareError_IllegelSign" : mtopResponse.isSessionInvalid() ? "TPShareError_SessionExpired" : mtopResponse.isNetworkError() ? "TPShareError_NetworkTimeout" : (mtopResponse.isMtopSdkError() || mtopResponse.isExpiredRequest() || mtopResponse.isSystemError()) ? "TPError_NetworkSysError" : (mtopResponse.is41XResult() || mtopResponse.isApiLockedResult()) ? "TPShareError_NetworkLimit" : mtopResponse.getRetCode();
    }

    private String getMonitorArg() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8fc297a7", new Object[]{this});
        }
        TBShareContent j = e.b().j();
        if (j == null) {
            return "";
        }
        return j.businessId + "," + j.url;
    }
}
