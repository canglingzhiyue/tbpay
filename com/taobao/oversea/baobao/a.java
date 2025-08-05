package com.taobao.oversea.baobao;

import android.util.Log;
import com.alibaba.android.icart.core.QueryParamsManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.wrapper.ultronengine.event.s;
import com.taobao.android.editionswitcher.b;
import com.taobao.flowcustoms.afc.AfcCustomSdk;
import com.taobao.search.mmd.datasource.bean.PromotionFilterBean;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.tao.util.TaoHelper;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;

/* loaded from: classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public void a(IRemoteListener iRemoteListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57f3391f", new Object[]{this, iRemoteListener});
            return;
        }
        try {
            MtopRequest mtopRequest = new MtopRequest();
            mtopRequest.setApiName("mtop.ovs.guide.baobao.singe.get");
            mtopRequest.setVersion("1.0");
            mtopRequest.setNeedSession(false);
            mtopRequest.setNeedEcode(false);
            JSONObject jSONObject = new JSONObject();
            String g = BaobaoManager.a().g();
            if (!b.a(g)) {
                g = BaobaoManager.f18619a;
            }
            jSONObject.put("country", (Object) g);
            jSONObject.put("scene", (Object) PromotionFilterBean.SINGLE);
            mtopRequest.setData(jSONObject.toJSONString());
            MtopBusiness.build(mtopRequest, TaoHelper.getTTID()).registerListener(iRemoteListener).mo1335useWua().mo1328setUnitStrategy("UNIT_GUIDE").mo1305reqMethod(MethodEnum.POST).startRequest(BaoBaoDo.class);
        } catch (Exception e) {
            Log.e("xiangzhi", "baobaorequest" + e.toString());
        }
    }

    public void b(IRemoteListener iRemoteListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85cbd37e", new Object[]{this, iRemoteListener});
            return;
        }
        try {
            MtopRequest mtopRequest = new MtopRequest();
            mtopRequest.setApiName("mtop.trade.query.bag");
            mtopRequest.setVersion(AfcCustomSdk.SDK_VERSION);
            mtopRequest.setNeedSession(false);
            mtopRequest.setNeedEcode(false);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("extStatus", (Object) 0);
            jSONObject.put("netType", (Object) 1);
            jSONObject.put("isPage", (Object) false);
            jSONObject.put("cartFrom", (Object) QueryParamsManager.DEFAULT_CART_FROM);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(s.DIVISION_CODE, (Object) BaobaoManager.a().g());
            jSONObject2.put("sceneCartType", (Object) BaobaoManager.a().h());
            jSONObject2.put("addCartCheck", (Object) "true");
            jSONObject2.put("ovsCallHsf", (Object) "true");
            jSONObject.put("exParams", (Object) jSONObject2.toJSONString());
            mtopRequest.setData(jSONObject.toJSONString());
            MtopBusiness.build(mtopRequest, TaoHelper.getTTID()).registerListener(iRemoteListener).mo1335useWua().mo1328setUnitStrategy("UNIT_TRADE").mo1305reqMethod(MethodEnum.POST).startRequest();
        } catch (Exception e) {
            Log.e("xiangzhi", "requestCart" + e.toString());
        }
    }
}
