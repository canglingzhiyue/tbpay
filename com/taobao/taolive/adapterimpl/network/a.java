package com.taobao.taolive.adapterimpl.network;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetRequest;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.adapter.network.c;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;

/* loaded from: classes8.dex */
public class a implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1161692802);
        kge.a(581458272);
    }

    private NetBaseOutDo a(BaseOutDo baseOutDo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetBaseOutDo) ipChange.ipc$dispatch("fd2a358e", new Object[]{this, baseOutDo});
        }
        if (baseOutDo == null) {
            return null;
        }
        String jSONString = JSON.toJSONString(baseOutDo);
        if (StringUtils.isEmpty(jSONString)) {
            return null;
        }
        return (NetBaseOutDo) JSON.parseObject(jSONString, NetBaseOutDo.class);
    }

    @Override // com.taobao.taolive.sdk.adapter.network.c
    public NetResponse a(NetRequest netRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetResponse) ipChange.ipc$dispatch("920d5d14", new Object[]{this, netRequest});
        }
        RemoteBusiness build = RemoteBusiness.build(b(netRequest));
        a(netRequest, build);
        MtopResponse syncRequest = build.syncRequest();
        if (syncRequest == null) {
            return null;
        }
        return a(syncRequest);
    }

    private void a(NetRequest netRequest, MtopBusiness mtopBusiness) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e694b4db", new Object[]{this, netRequest, mtopBusiness});
            return;
        }
        if (netRequest.isUseWua()) {
            mtopBusiness.mo1335useWua();
        }
        if (netRequest.isPost()) {
            mtopBusiness.mo1305reqMethod(MethodEnum.POST);
        }
        if (!StringUtils.equals("-1", netRequest.getBizId())) {
            String bizId = netRequest.getBizId();
            if (!StringUtils.isEmpty(bizId) && StringUtils.isDigitsOnly(bizId)) {
                mtopBusiness.mo1309setBizId(bizId);
            }
        } else {
            mtopBusiness.mo1309setBizId("59");
        }
        if (StringUtils.isEmpty(netRequest.getTtid())) {
            mtopBusiness.mo1332ttid(netRequest.getTtid());
        }
        if (netRequest.getRequestHeaders() != null) {
            mtopBusiness.mo1297headers(netRequest.getRequestHeaders());
        }
        if (netRequest.getRequestContext() != null) {
            mtopBusiness.mo1338reqContext(netRequest.getRequestContext());
        }
        if (netRequest.getRequestHeaders() != null) {
            mtopBusiness.mo1297headers(netRequest.getRequestHeaders());
        }
        if (netRequest.getRequestNotifyHandler() == null) {
            return;
        }
        mtopBusiness.mo1296handler(netRequest.getRequestNotifyHandler());
    }

    private NetResponse a(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NetResponse) ipChange.ipc$dispatch("83d3e064", new Object[]{this, mtopResponse});
        }
        NetResponse netResponse = new NetResponse();
        netResponse.setApi(mtopResponse.getApi());
        netResponse.setV(mtopResponse.getV());
        netResponse.setRetCode(mtopResponse.getRetCode());
        netResponse.setRetMsg(mtopResponse.getRetMsg());
        netResponse.setDataJsonObject(mtopResponse.getDataJsonObject());
        netResponse.setHeaderFields(mtopResponse.getHeaderFields());
        netResponse.setBytedata(mtopResponse.getBytedata());
        netResponse.setResponseCode(String.valueOf(mtopResponse.getResponseCode()));
        return netResponse;
    }

    private MtopRequest b(NetRequest netRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopRequest) ipChange.ipc$dispatch("2422d687", new Object[]{this, netRequest});
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName(netRequest.getApiName());
        mtopRequest.setNeedEcode(netRequest.isNeedEcode());
        mtopRequest.setNeedSession(netRequest.isNeedSession());
        mtopRequest.setVersion(netRequest.getVersion());
        mtopRequest.setData(netRequest.getData());
        mtopRequest.dataParams = netRequest.getDataParams();
        return mtopRequest;
    }
}
