package com.taobao.tao.relation;

import mtopsdk.common.util.StringUtils;
import android.util.Log;
import android.widget.Toast;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.statistic.TBS;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.taobao.taobao.R;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;

/* loaded from: classes8.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ void a(e eVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cfd1751", new Object[]{eVar, str});
        } else {
            eVar.a(str);
        }
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName("mtop.com.taobao.wireless.amp2.msg.getPaymentCard");
        mtopRequest.setNeedEcode(false);
        mtopRequest.setVersion("1.0");
        mtopRequest.setNeedSession(true);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("accessKey", (Object) "taobao-app");
        jSONObject2.put("accessSecret", (Object) "taobao-app-secret");
        jSONObject.put("contentType", "R");
        jSONObject.put("type", "U");
        jSONObject.put("cardBizId", "daifu");
        jSONObject.put("actionType", "startPayme");
        jSONObject.put("transfered", "true");
        jSONObject2.put("targetAccountId", (Object) jSONObject.getString("daifuUserId"));
        jSONObject2.put("extMap", (Object) jSONObject.toJSONString());
        TBS.Ext.commitEvent("Page_Daifu", 19999, "getPaymentCard", "", "", jSONObject2.toString());
        mtopRequest.setData(jSONObject2.toString());
        RemoteBusiness.build(mtopRequest).registeListener((MtopListener) new IRemoteBaseListener() { // from class: com.taobao.tao.relation.DaifuBusiness$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                org.json.JSONObject dataJsonObject = mtopResponse.getDataJsonObject();
                String optString = dataJsonObject.optString("targetAccountId");
                String optString2 = dataJsonObject.optString("targetAccountType");
                String optString3 = dataJsonObject.optString("bizType");
                if (StringUtils.isEmpty(optString) || StringUtils.isEmpty(optString2) || StringUtils.isEmpty(optString3)) {
                    e.a(e.this, mtopResponse.toString());
                } else {
                    g.b(optString, optString2, Integer.parseInt(optString3));
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else {
                    e.a(e.this, mtopResponse.toString());
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else {
                    e.a(e.this, mtopResponse.toString());
                }
            }
        }).startRequest(JSONObject.class);
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        Log.e(f.TAG, str);
        Toast.makeText(DaifuApplication.getApplication(), R.string.str_send_err_tips, 1).show();
    }
}
