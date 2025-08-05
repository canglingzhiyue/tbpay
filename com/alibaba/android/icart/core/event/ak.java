package com.alibaba.android.icart.core.event;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.bca;
import tb.bmz;
import tb.kge;

/* loaded from: classes2.dex */
public class ak extends bca {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2047030417);
    }

    public static /* synthetic */ Object ipc$super(ak akVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void a(ak akVar, JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef546109", new Object[]{akVar, jSONObject, str});
        } else {
            akVar.a(jSONObject, str);
        }
    }

    @Override // com.alibaba.android.ultron.trade.event.d
    public void b(bmz bmzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d08b596a", new Object[]{this, bmzVar});
            return;
        }
        JSONObject c = c();
        JSONObject jSONObject = c.getJSONObject("mtopConfig");
        if (jSONObject == null) {
            return;
        }
        String string = jSONObject.getString("apiMethod");
        String string2 = jSONObject.getString("apiVersion");
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        boolean booleanValue = jSONObject.getBooleanValue("isNeedWua");
        boolean booleanValue2 = jSONObject.getBooleanValue("usePost");
        String string3 = jSONObject.getString("unitStrategy");
        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
            return;
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName(string);
        mtopRequest.setVersion(string2);
        if (jSONObject2 != null) {
            mtopRequest.setData(jSONObject2.toJSONString());
        }
        MtopBusiness build = MtopBusiness.build(mtopRequest);
        build.mo1305reqMethod(booleanValue2 ? MethodEnum.POST : MethodEnum.GET);
        if (booleanValue) {
            build.mo1335useWua();
        }
        if ("UNIT_GUIDE".equals(string3) || "UNIT_TRADE".equals(string3)) {
            build.mo1328setUnitStrategy(string3);
        }
        final JSONObject jSONObject3 = c.getJSONObject("toastConfig");
        if (jSONObject3 != null) {
            build.mo1337addListener((MtopListener) new IRemoteBaseListener() { // from class: com.alibaba.android.icart.core.event.MTopRequestSubscriber$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    } else {
                        ak.a(ak.this, jSONObject3, "error");
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    } else {
                        ak.a(ak.this, jSONObject3, "success");
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    } else {
                        ak.a(ak.this, jSONObject3, "error");
                    }
                }
            });
        }
        build.startRequest();
    }

    private void a(JSONObject jSONObject, String str) {
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48075352", new Object[]{this, jSONObject, str});
        } else if (jSONObject == null || (string = jSONObject.getString(str)) == null) {
        } else {
            com.alibaba.android.icart.core.widget.d.a(this.e, string);
        }
    }
}
