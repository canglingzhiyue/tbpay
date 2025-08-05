package com.taobao.tao.flexbox.layoutmanager.actionservice.internalmodule;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.session.constants.SessionConstants;
import com.taobao.tao.flexbox.layoutmanager.actionservice.a;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.domain.ProtocolEnum;
import mtopsdk.mtop.util.ReflectUtil;
import tb.kge;

/* loaded from: classes8.dex */
public class MtopModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1401873119);
        kge.a(259975031);
    }

    public static void request(JSON json, final a.b bVar, final a.InterfaceC0830a interfaceC0830a, a aVar) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6d3fc13", new Object[]{json, bVar, interfaceC0830a, aVar});
        } else if (json instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) json;
            String string = jSONObject.getString("api");
            String string2 = jSONObject.getString("v");
            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
            int intValue = jSONObject.getIntValue(SessionConstants.ECODE);
            int intValue2 = jSONObject.getIntValue(MspGlobalDefine.SESSION);
            String string3 = jSONObject.getString("type");
            int intValue3 = jSONObject.getIntValue("timeout");
            MtopRequest mtopRequest = new MtopRequest();
            if (string != null) {
                mtopRequest.setApiName(string);
            }
            if (string2 != null) {
                mtopRequest.setVersion(string2);
            }
            mtopRequest.setNeedEcode(intValue > 0);
            if (intValue2 > 0) {
                z = true;
            }
            mtopRequest.setNeedSession(z);
            HashMap hashMap = new HashMap();
            for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                hashMap.put(entry.getKey(), entry.getValue().toString());
            }
            mtopRequest.dataParams = hashMap;
            mtopRequest.setData(ReflectUtil.convertMapToDataStr(hashMap));
            RemoteBusiness registeListener = RemoteBusiness.build(mtopRequest).registeListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.tao.flexbox.layoutmanager.actionservice.internalmodule.MtopModule.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    a.InterfaceC0830a interfaceC0830a2 = a.InterfaceC0830a.this;
                    if (interfaceC0830a2 == null) {
                        return;
                    }
                    interfaceC0830a2.a(bVar, new a.c(mtopResponse.getRetCode(), mtopResponse.getRetMsg(), null));
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                        return;
                    }
                    JSONObject parseObject = JSON.parseObject(new String(mtopResponse.getBytedata()));
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("data", (Object) parseObject);
                    a.InterfaceC0830a interfaceC0830a2 = a.InterfaceC0830a.this;
                    if (interfaceC0830a2 == null) {
                        return;
                    }
                    interfaceC0830a2.a(bVar, jSONObject3);
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    a.InterfaceC0830a interfaceC0830a2 = a.InterfaceC0830a.this;
                    if (interfaceC0830a2 == null) {
                        return;
                    }
                    interfaceC0830a2.a(bVar, new a.c(mtopResponse.getRetCode(), mtopResponse.getRetMsg(), null));
                }
            });
            registeListener.mo1303protocol(ProtocolEnum.HTTPSECURE);
            registeListener.mo1312setConnectionTimeoutMilliSecond(intValue3);
            registeListener.mo1326setSocketTimeoutMilliSecond(intValue3);
            registeListener.mo1340setBizId(82);
            if ("POST".equalsIgnoreCase(string3)) {
                registeListener.mo1305reqMethod(MethodEnum.POST);
            }
            registeListener.mo1334useCache();
            registeListener.mo1341setErrorNotifyAfterCache(true);
            registeListener.startRequest();
        }
    }
}
