package com.taobao.share.taopassword.busniess.mtop.request;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.taopassword.busniess.mtop.response.MtopTaobaoWirelessSharePasswordGetResponse;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import java.util.Map;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;
import tb.nzt;
import tb.nzw;
import tb.nzz;
import tb.oac;
import tb.obe;

/* loaded from: classes8.dex */
public class PasswordJudgeRequestI implements IRemoteBaseListener, nzw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int GET_TAOPASSWORD = 110;
    private static final String TAG = "PasswordJudgeRequestI";
    private nzz mListener;
    private RemoteBusiness remoteBusiness;

    static {
        kge.a(1002096063);
        kge.a(1017852983);
        kge.a(-525336021);
    }

    @Override // tb.nzw
    public void request(Context context, Object obj, oac oacVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3204f24d", new Object[]{this, context, obj, oacVar});
        } else if (!(oacVar instanceof nzz) || context == null) {
        } else {
            this.mListener = (nzz) oacVar;
            if (!obe.a(context)) {
                this.mListener.a(true);
                return;
            }
            MtopJudgePasswordRequest mtopJudgePasswordRequest = new MtopJudgePasswordRequest();
            mtopJudgePasswordRequest.setPasswordContent((String) obj);
            this.remoteBusiness = RemoteBusiness.build(context, mtopJudgePasswordRequest, nzt.b()).registeListener((MtopListener) this);
            this.remoteBusiness.mo1340setBizId(67);
            this.remoteBusiness.startRequest(110, MtopTaobaoWirelessSharePasswordGetResponse.class);
        }
    }

    @Override // tb.nzw
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
        this.remoteBusiness = null;
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
        } else {
            dealError(mtopResponse);
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        Map map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
        } else if (this.mListener == null || i != 110) {
        } else {
            String str = "result : " + map.get("result");
            this.mListener.a("true".equals(((Map) baseOutDo.mo2429getData()).get("result")));
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
        } else {
            dealError(mtopResponse);
        }
    }

    private String getErrorCode(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d4f0bf55", new Object[]{this, mtopResponse}) : mtopResponse == null ? "TPShareError_Others" : mtopResponse.isIllegelSign() ? "TPShareError_IllegelSign" : mtopResponse.isSessionInvalid() ? "TPShareError_SessionExpired" : mtopResponse.isNetworkError() ? "TPShareError_NetworkTimeout" : (mtopResponse.isMtopSdkError() || mtopResponse.isExpiredRequest() || mtopResponse.isSystemError()) ? "TPError_NetworkSysError" : (mtopResponse.is41XResult() || mtopResponse.isApiLockedResult()) ? "TPShareError_NetworkLimit" : mtopResponse.getRetCode();
    }

    private void dealError(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61d74a88", new Object[]{this, mtopResponse});
        } else if (this.mListener == null) {
        } else {
            this.mListener.a(getErrorCode(mtopResponse), mtopResponse != null ? mtopResponse.getRetMsg() : "respon is null");
        }
    }
}
