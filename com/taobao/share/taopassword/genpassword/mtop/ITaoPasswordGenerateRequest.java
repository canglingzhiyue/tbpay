package com.taobao.share.taopassword.genpassword.mtop;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.taopassword.busniess.model.e;
import com.taobao.share.taopassword.busniess.mtop.response.MtopTaobaoWirelessSharePasswordGetpasswordshareinfoResponse;
import com.taobao.share.taopassword.busniess.mtop.response.MtopTaobaoWirelessSharePasswordGetpasswordshareinfoResponseData;
import com.taobao.share.taopassword.genpassword.model.a;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;
import tb.nzt;
import tb.nzw;
import tb.oab;
import tb.oac;
import tb.obe;

/* loaded from: classes8.dex */
public class ITaoPasswordGenerateRequest implements IRemoteBaseListener, nzw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int GET_TAOPASSWORD = 110;
    private static final String TAG = "ITaoPasswordGenerateRequest";
    private a inputContent;
    private RemoteBusiness remoteBusiness;
    private oab rlistener;

    static {
        kge.a(-1975938056);
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
            this.rlistener = (oab) oacVar;
            this.inputContent = (a) obj;
            if (!obe.a(context)) {
                e eVar = new e();
                eVar.f19659a = this.inputContent;
                eVar.e = "TPShareError_NetworkLimit";
                this.rlistener.a(eVar);
                return;
            }
            MtopTaobaoSharePasswordGenpasswordRequest mtopTaobaoSharePasswordGenpasswordRequest = new MtopTaobaoSharePasswordGenpasswordRequest();
            mtopTaobaoSharePasswordGenpasswordRequest.setBizId(this.inputContent.f19662a);
            if (this.inputContent.i > 0) {
                mtopTaobaoSharePasswordGenpasswordRequest.setExpireTime(this.inputContent.i);
            }
            if (this.inputContent.h != null) {
                mtopTaobaoSharePasswordGenpasswordRequest.setPassword(this.inputContent.h.f19663a);
            } else {
                mtopTaobaoSharePasswordGenpasswordRequest.setPassword("");
            }
            mtopTaobaoSharePasswordGenpasswordRequest.setSourceType(this.inputContent.f);
            mtopTaobaoSharePasswordGenpasswordRequest.setTitle(this.inputContent.c);
            mtopTaobaoSharePasswordGenpasswordRequest.setTemplateId(this.inputContent.o);
            mtopTaobaoSharePasswordGenpasswordRequest.setPicUrl(this.inputContent.e);
            mtopTaobaoSharePasswordGenpasswordRequest.setTargetUrl(this.inputContent.d);
            mtopTaobaoSharePasswordGenpasswordRequest.setPasswordType(this.inputContent.g);
            mtopTaobaoSharePasswordGenpasswordRequest.setPopType(this.inputContent.k);
            mtopTaobaoSharePasswordGenpasswordRequest.setPopUrl(this.inputContent.l);
            mtopTaobaoSharePasswordGenpasswordRequest.setTarget(this.inputContent.m);
            if (this.inputContent.j != null && this.inputContent.j.size() > 0) {
                mtopTaobaoSharePasswordGenpasswordRequest.setExtendInfo(JSONObject.toJSONString(this.inputContent.j));
            } else {
                mtopTaobaoSharePasswordGenpasswordRequest.setExtendInfo(null);
            }
            this.remoteBusiness = ((RemoteBusiness) RemoteBusiness.build(context, mtopTaobaoSharePasswordGenpasswordRequest, nzt.b()).mo1305reqMethod(MethodEnum.POST)).registeListener((MtopListener) this);
            this.remoteBusiness.mo1340setBizId(67);
            this.remoteBusiness.mo1335useWua();
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
            com.taobao.share.globalmodel.e.b().b(com.taobao.share.globalmodel.e.GENPASSWORD, mtopTaobaoWirelessSharePasswordGetpasswordshareinfoResponseData.shareDataTrack);
            e eVar = new e();
            eVar.f19659a = this.inputContent;
            eVar.c = mtopTaobaoWirelessSharePasswordGetpasswordshareinfoResponseData.getPassword();
            eVar.b = mtopTaobaoWirelessSharePasswordGetpasswordshareinfoResponseData.getContent();
            eVar.d = mtopTaobaoWirelessSharePasswordGetpasswordshareinfoResponseData.getUrl();
            String str = "request success 1: resultContent.passwordKey=" + eVar.c + " resultContent.passwordText=" + eVar.b + "  passwordUrl=" + eVar.d;
            if (this.inputContent.h != null && !StringUtils.isEmpty(this.inputContent.h.f19663a)) {
                String str2 = this.inputContent.h.b;
                if (!StringUtils.isEmpty(str2)) {
                    eVar.b = str2.replace(this.inputContent.h.f19663a, eVar.c);
                }
            }
            this.rlistener.a(eVar);
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
            e eVar = new e();
            eVar.f19659a = this.inputContent;
            if (mtopResponse == null) {
                eVar.e = "TPShareError_Others";
            }
            eVar.f = mtopResponse.getRetMsg();
            eVar.e = getErrorCode(mtopResponse);
            this.rlistener.a(eVar);
        }
    }
}
