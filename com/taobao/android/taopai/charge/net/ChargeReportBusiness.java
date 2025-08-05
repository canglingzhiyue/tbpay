package com.taobao.android.taopai.charge.net;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.taopai.charge.data.TpChargeBean;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import java.util.List;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.MtopResponse;
import tb.izk;
import tb.kge;

/* loaded from: classes6.dex */
public class ChargeReportBusiness implements IRemoteBaseListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CODE_ERROR_SYSTEM = "MtopSystemError";
    private final List<TpChargeBean> mChargeBeanList;
    private final a mListener;
    private RemoteBusiness mRemoteBusiness;

    static {
        kge.a(-1873873553);
        kge.a(-525336021);
    }

    public ChargeReportBusiness(List<TpChargeBean> list, a aVar) {
        this.mChargeBeanList = list;
        this.mListener = aVar;
    }

    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        ChargeReportRequest chargeReportRequest = new ChargeReportRequest();
        chargeReportRequest.setClientVersion("1");
        chargeReportRequest.setBillList(JSON.toJSONString(this.mChargeBeanList));
        chargeReportRequest.setNEED_SESSION(true);
        this.mRemoteBusiness = RemoteBusiness.build((IMTOPDataObject) chargeReportRequest);
        this.mRemoteBusiness.registeListener((IRemoteListener) this);
        this.mRemoteBusiness.startRequest(ChargeReportResponse.class);
        if (izk.d()) {
            return;
        }
        String str = "Send Content = " + chargeReportRequest.getBillList();
    }

    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
            return;
        }
        RemoteBusiness remoteBusiness = this.mRemoteBusiness;
        if (remoteBusiness == null) {
            return;
        }
        remoteBusiness.cancelRequest();
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
        } else if (baseOutDo instanceof ChargeReportResponse) {
            this.mListener.a(((ChargeReportResponse) baseOutDo).mo2429getData().traceId);
        } else {
            this.mListener.a(this.mChargeBeanList, mtopResponse != null ? mtopResponse.getRetCode() : "", mtopResponse != null ? mtopResponse.getRetMsg() : "data error");
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
        } else {
            this.mListener.a(this.mChargeBeanList, CODE_ERROR_SYSTEM, mtopResponse != null ? mtopResponse.getRetMsg() : "onSystemError");
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
        } else {
            this.mListener.a(this.mChargeBeanList, mtopResponse != null ? mtopResponse.mappingCode : "", mtopResponse != null ? mtopResponse.getRetMsg() : "onError");
        }
    }
}
