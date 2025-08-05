package com.taobao.mytaobao.newsetting.business.request;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mytaobao.newsetting.business.response.DynamicSettingPageResponse;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.taobao.tao.util.TaoHelper;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.MtopRequest;
import tb.kge;

/* loaded from: classes7.dex */
public class c implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(850353439);
        kge.a(-1225974524);
    }

    @Override // com.taobao.mytaobao.newsetting.business.request.a
    public void a(String str, IRemoteBaseListener iRemoteBaseListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("934bf004", new Object[]{this, str, iRemoteBaseListener});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("menuKey", (Object) str);
        jSONObject.put("newSettingOpen", (Object) true);
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName("mtop.taobao.mclaren.menue.get");
        mtopRequest.setVersion("3.0");
        mtopRequest.setData(JSONObject.toJSONString(jSONObject));
        RemoteBusiness mo1337addListener = RemoteBusiness.build(mtopRequest, TaoHelper.getTTID()).mo1337addListener((MtopListener) iRemoteBaseListener);
        mo1337addListener.mo1328setUnitStrategy("UNIT_TRADE");
        mo1337addListener.startRequest(DynamicSettingPageResponse.class);
    }
}
