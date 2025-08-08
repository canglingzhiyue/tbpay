package com.taobao.tbpoplayer.nativerender;

import mtopsdk.common.util.StringUtils;
import anetwork.channel.Response;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.entity.RequestImpl;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.PopLayer;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.TaoPackageInfo;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.tbpoplayer.nativerender.dsl.DSLData;
import com.taobao.tbpoplayer.nativerender.dsl.DSLModel;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import tb.kge;
import tb.rrv;

/* loaded from: classes8.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes8.dex */
    public interface a {
        void a(DSLModel dSLModel);

        void a(String str);
    }

    static {
        kge.a(424066014);
    }

    public void a(h hVar, a aVar) {
        JSONArray jSONArray;
        DSLModel dSLModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60cd5666", new Object[]{this, hVar, aVar});
        } else if (aVar == null || hVar == null) {
        } else {
            try {
                if (hVar.a()) {
                    Response syncSend = new DegradableNetwork(hVar.k().a()).syncSend(new RequestImpl(hVar.d()), null);
                    if (syncSend == null) {
                        aVar.a("fetchDSL.responseIsNull");
                        return;
                    }
                    com.alibaba.poplayer.utils.c.a("DSLFetcher.fetchDSL.%s", syncSend);
                    if (syncSend.getStatusCode() < 0) {
                        aVar.a("fetchDSL.responseIsNull");
                        return;
                    }
                    String str = new String(syncSend.getBytedata(), "UTF-8");
                    com.alibaba.poplayer.utils.c.a("DSLFetcher.fetchDSL.dsl=%s", str);
                    DSLData dSLData = (DSLData) JSONObject.parseObject(str, DSLData.class);
                    if (dSLData != null && dSLData.enable && dSLData.configData != null) {
                        aVar.a(dSLData.configData);
                    } else {
                        aVar.a("DSLFetcher.fetchDSL.isUnable.");
                    }
                } else if (StringUtils.isEmpty(hVar.h())) {
                } else {
                    MtopRequest mtopRequest = new MtopRequest();
                    mtopRequest.setApiName("mtop.taobao.poplayer.xdsl");
                    mtopRequest.setVersion("1.0");
                    mtopRequest.setNeedEcode(false);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("id", (Object) Long.valueOf(Long.parseLong(hVar.h())));
                    jSONObject.put("mock", (Object) "true");
                    mtopRequest.setData(jSONObject.toJSONString());
                    MtopResponse syncRequest = MtopBusiness.build(Mtop.instance(Mtop.Id.INNER, PopLayer.getReference().getApp()), mtopRequest, TaoPackageInfo.getTTID()).mo1342showLoginUI(false).mo1305reqMethod(MethodEnum.GET).syncRequest();
                    if (syncRequest != null && syncRequest.isApiSuccess() && syncRequest.getBytedata() != null) {
                        String str2 = new String(syncRequest.getBytedata(), "UTF-8");
                        if (!StringUtils.isEmpty(str2)) {
                            com.alibaba.poplayer.utils.c.a("DSLFetcher.fetchDSL.Mtop.dsl=%s", str2);
                            JSONObject jSONObject2 = JSON.parseObject(str2).getJSONObject("data");
                            if (jSONObject2 != null && jSONObject2.getBooleanValue("success") && (jSONArray = jSONObject2.getJSONArray("data")) != null && !jSONArray.isEmpty() && (dSLModel = (DSLModel) jSONArray.getJSONObject(0).getObject(rrv.PAGE_CONTENT, DSLModel.class)) != null) {
                                aVar.a(dSLModel);
                                return;
                            }
                        }
                    }
                    aVar.a("DSLFetcher.fetchDSL.MTOP.getDSLModelFailed.");
                }
            } catch (Throwable th) {
                com.alibaba.poplayer.utils.c.a("DSLFetcher.fetchDSL.error.", th);
                aVar.a("DSLFetcher.fetchDSL.error.");
            }
        }
    }
}
