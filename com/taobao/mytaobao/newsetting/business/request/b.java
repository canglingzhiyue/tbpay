package com.taobao.mytaobao.newsetting.business.request;

import android.content.Context;
import android.taobao.windvane.util.m;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.verifyidentity.engine.VerifyIdentityEngine;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.tao.util.TaoHelper;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import tb.kge;

/* loaded from: classes7.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1845468294);
    }

    public static MtopRequest a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopRequest) ipChange.ipc$dispatch("c1e7e88b", new Object[]{context});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("userId", (Object) Login.getUserId());
        jSONObject.put("newSettingOpen", (Object) true);
        try {
            jSONObject.put("envData", (Object) VerifyIdentityEngine.getInstance(context).getEnvData(null));
        } catch (Exception unused) {
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName("mtop.taobao.mclaren.payment.list.get");
        mtopRequest.setVersion("1.0");
        mtopRequest.setData(JSONObject.toJSONString(jSONObject));
        return mtopRequest;
    }

    public static void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{context, str});
            return;
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName("mtop.taobao.mclaren.menue.reddot");
        mtopRequest.setVersion("1.0");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("aim", (Object) "settingClick");
        jSONObject.put("menuKey", (Object) str);
        mtopRequest.setData(JSONObject.toJSONString(jSONObject));
        MtopBusiness.build(Mtop.instance(Mtop.Id.INNER, context), mtopRequest, TaoHelper.getTTID()).registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.mytaobao.newsetting.business.request.SettingsRequest$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else {
                    m.e("SettingsRequest", "onSystemError: response of red dot occur system error!");
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                } else {
                    m.b("SettingsRequest", "onSuccess: response of red dot success.");
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else {
                    m.e("SettingsRequest", "onSystemError: response of red dot occur error!");
                }
            }
        }).startRequest();
    }
}
