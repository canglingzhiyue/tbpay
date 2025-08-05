package com.taobao.share.taopassword.busniess.mtop.request;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.globalmodel.e;
import com.taobao.share.taopassword.busniess.model.ALCreatePassWordModel;
import com.taobao.share.taopassword.busniess.model.b;
import com.taobao.share.taopassword.busniess.mtop.response.MtopTaobaoWirelessSharePasswordGetpasswordshareinfoResponse;
import com.taobao.share.taopassword.busniess.mtop.response.MtopTaobaoWirelessSharePasswordGetpasswordshareinfoResponseData;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;
import tb.nzt;
import tb.nzw;
import tb.nzx;
import tb.oac;
import tb.obe;

/* loaded from: classes8.dex */
public class PasswordGenerateRequestI implements IRemoteBaseListener, nzw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int GET_TAOPASSWORD = 110;
    private static final String TAG = "ITaoPasswordGenerateRequest";
    private ALCreatePassWordModel inputContent;
    private RemoteBusiness remoteBusiness;
    private nzx rlistener;

    static {
        kge.a(-1030780031);
        kge.a(-525336021);
        kge.a(1017852983);
    }

    @Override // tb.nzw
    public void request(Context context, Object obj, oac oacVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3204f24d", new Object[]{this, context, obj, oacVar});
        } else if (oacVar == null || context == null) {
        } else {
            this.rlistener = (nzx) oacVar;
            this.inputContent = (ALCreatePassWordModel) obj;
            if (!obe.a(context)) {
                b bVar = new b();
                bVar.f19656a = this.inputContent;
                this.rlistener.a(bVar);
                return;
            }
            MtopGenPasswordRequest mtopGenPasswordRequest = new MtopGenPasswordRequest();
            mtopGenPasswordRequest.setBizId(this.inputContent.c);
            mtopGenPasswordRequest.setTitle(this.inputContent.b);
            mtopGenPasswordRequest.setTargetUrl(this.inputContent.f19654a);
            if (this.inputContent.j != null) {
                mtopGenPasswordRequest.setSourceType(this.inputContent.j);
            }
            if (this.inputContent.e != null) {
                mtopGenPasswordRequest.setTemplateId(this.inputContent.e);
            }
            if (this.inputContent.d != null) {
                mtopGenPasswordRequest.setPicUrl(this.inputContent.d);
            }
            if (this.inputContent.g != null) {
                mtopGenPasswordRequest.setPopType(this.inputContent.g);
            }
            if (this.inputContent.h != null) {
                mtopGenPasswordRequest.setPopUrl(this.inputContent.h);
            }
            if (this.inputContent.i != null) {
                mtopGenPasswordRequest.setTarget(this.inputContent.i);
            }
            if (this.inputContent.f != null && this.inputContent.f.size() > 0) {
                mtopGenPasswordRequest.setExtendInfo(JSONObject.toJSONString(this.inputContent.f));
            } else {
                mtopGenPasswordRequest.setExtendInfo(null);
            }
            this.remoteBusiness = ((RemoteBusiness) RemoteBusiness.build(context, mtopGenPasswordRequest, nzt.b()).mo1335useWua().mo1305reqMethod(MethodEnum.POST)).registeListener((MtopListener) this);
            this.remoteBusiness.mo1340setBizId(67);
            this.remoteBusiness.startRequest(110, MtopTaobaoWirelessSharePasswordGetpasswordshareinfoResponse.class);
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
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
        } else if (this.rlistener == null || i != 110) {
        } else {
            MtopTaobaoWirelessSharePasswordGetpasswordshareinfoResponseData mtopTaobaoWirelessSharePasswordGetpasswordshareinfoResponseData = (MtopTaobaoWirelessSharePasswordGetpasswordshareinfoResponseData) baseOutDo.mo2429getData();
            e.b().b(e.GENPASSWORD, mtopTaobaoWirelessSharePasswordGetpasswordshareinfoResponseData.shareDataTrack);
            b bVar = new b();
            bVar.f19656a = this.inputContent;
            bVar.b = mtopTaobaoWirelessSharePasswordGetpasswordshareinfoResponseData.getPassword();
            bVar.e = mtopTaobaoWirelessSharePasswordGetpasswordshareinfoResponseData.getContent();
            bVar.f = mtopTaobaoWirelessSharePasswordGetpasswordshareinfoResponseData.getUrl();
            bVar.d = mtopTaobaoWirelessSharePasswordGetpasswordshareinfoResponseData.getLongUrl();
            bVar.c = mtopTaobaoWirelessSharePasswordGetpasswordshareinfoResponseData.getValidDate();
            bVar.g = mtopTaobaoWirelessSharePasswordGetpasswordshareinfoResponseData.getSwitchNewWx();
            this.rlistener.a(bVar);
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
        } else if (this.rlistener == null) {
        } else {
            new b().f19656a = this.inputContent;
            if (mtopResponse == null) {
                this.rlistener.a("TPShareError_Others", mtopResponse.getRetMsg());
            }
            this.rlistener.a(getErrorCode(mtopResponse), mtopResponse.getRetMsg());
        }
    }
}
