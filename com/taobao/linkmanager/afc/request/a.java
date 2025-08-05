package com.taobao.linkmanager.afc.request;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.flowcustoms.afc.AfcCustomSdk;
import com.taobao.flowcustoms.afc.utils.c;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.util.ReflectUtil;
import org.json.JSONObject;
import tb.kge;
import tb.koe;

/* loaded from: classes7.dex */
public class a extends TBLinkRequest {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2044970873);
    }

    @Override // com.taobao.linkmanager.afc.request.TBLinkRequest
    public void sendRequest(String str, String str2, Map<String, String> map, boolean z, final koe koeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27d15340", new Object[]{this, str, str2, map, new Boolean(z), koeVar});
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || map == null) {
        } else {
            addCheckParams(map);
            MtopRequest mtopRequest = new MtopRequest();
            mtopRequest.setApiName(str);
            mtopRequest.setVersion(str2);
            mtopRequest.setNeedEcode(z);
            mtopRequest.setData(ReflectUtil.converMapToDataStr(map));
            MtopBusiness.build(Mtop.instance(AfcCustomSdk.a().f, AfcCustomSdk.a().f17167a), mtopRequest).mo1312setConnectionTimeoutMilliSecond(5000).mo1326setSocketTimeoutMilliSecond(5000).registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.linkmanager.afc.request.TBMtopRequest$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    koe koeVar2 = koeVar;
                    if (koeVar2 == null || mtopResponse == null) {
                        return;
                    }
                    JSONObject dataJsonObject = mtopResponse.getDataJsonObject();
                    koeVar2.a(dataJsonObject, "错误信息：" + mtopResponse.getRetMsg() + " === 错误映射码：" + mtopResponse.getMappingCode() + " === 网络请求状态码：" + mtopResponse.getResponseCode());
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    } else if (koeVar == null || mtopResponse == null) {
                    } else {
                        mtopResponse.getDataJsonObject();
                        koeVar.a(mtopResponse.getDataJsonObject());
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    koe koeVar2 = koeVar;
                    if (koeVar2 == null || mtopResponse == null) {
                        return;
                    }
                    JSONObject dataJsonObject = mtopResponse.getDataJsonObject();
                    koeVar2.a(dataJsonObject, "错误信息：" + mtopResponse.getRetMsg() + " === 错误映射码：" + mtopResponse.getMappingCode() + " === 网络请求状态码：" + mtopResponse.getResponseCode());
                }
            }).startRequest();
            c.a("linkx", "TBMtopRequest === sendRequest: 开始进行接口请求：" + str);
        }
    }
}
