package com.taobao.avplayer;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.core.model.DWRequest;
import com.taobao.avplayer.core.model.DWResponse;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.taobao.taobaoavsdk.CodeUsageCounter;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.JsonTypeEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.util.ReflectUtil;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes6.dex */
public class DWNetworkAdapter implements com.taobao.avplayer.common.v, IMTOPDataObject {
    static {
        kge.a(-1665027206);
        kge.a(-1012071265);
        kge.a(-350052935);
    }

    @Override // com.taobao.avplayer.common.v
    public boolean sendRequest(final com.taobao.avplayer.common.w wVar, DWRequest dWRequest) {
        CodeUsageCounter.a().a(CodeUsageCounter.componentName.dw_adapter_DWNetworkAdapter);
        if (dWRequest == null) {
            return false;
        }
        RemoteBusiness registeListener = RemoteBusiness.build(buildRequest(dWRequest)).registeListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.avplayer.DWNetworkAdapter.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                } else if (mtopResponse == null) {
                    com.taobao.avplayer.common.w wVar2 = wVar;
                    if (wVar2 == null) {
                        return;
                    }
                    wVar2.onError(null);
                } else {
                    com.taobao.avplayer.common.w wVar3 = wVar;
                    if (wVar3 == null) {
                        return;
                    }
                    wVar3.onSuccess(DWNetworkAdapter.this.buildResponse(mtopResponse));
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                com.taobao.avplayer.common.w wVar2 = wVar;
                if (wVar2 == null) {
                    return;
                }
                wVar2.onError(DWNetworkAdapter.this.buildResponse(mtopResponse));
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                com.taobao.avplayer.common.w wVar2 = wVar;
                if (wVar2 == null) {
                    return;
                }
                wVar2.onError(DWNetworkAdapter.this.buildResponse(mtopResponse));
            }
        });
        registeListener.mo1315setJsonType(JsonTypeEnum.ORIGINALJSON);
        if (dWRequest.useWua) {
            registeListener.mo1335useWua();
        }
        registeListener.mo1312setConnectionTimeoutMilliSecond(3000);
        registeListener.mo1326setSocketTimeoutMilliSecond(3000);
        registeListener.startRequest(0, dWRequest.responseClass);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public DWResponse buildResponse(MtopResponse mtopResponse) {
        if (mtopResponse == null) {
            return null;
        }
        DWResponse dWResponse = new DWResponse();
        dWResponse.httpCode = mtopResponse.getResponseCode();
        if (mtopResponse.getBytedata() != null) {
            try {
                dWResponse.data = new JSONObject(new String(mtopResponse.getBytedata())).optJSONObject("data");
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        dWResponse.errorCode = mtopResponse.getRetCode();
        dWResponse.errorMsg = mtopResponse.getRetMsg();
        dWResponse.mappingCode = mtopResponse.getMappingCode();
        return dWResponse;
    }

    private MtopRequest buildRequest(DWRequest dWRequest) {
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName(dWRequest.apiName);
        mtopRequest.setVersion(dWRequest.apiVersion);
        mtopRequest.setNeedEcode(dWRequest.needLogin);
        mtopRequest.dataParams = dWRequest.paramMap;
        mtopRequest.setData(ReflectUtil.converMapToDataStr(mtopRequest.dataParams));
        return mtopRequest;
    }
}
