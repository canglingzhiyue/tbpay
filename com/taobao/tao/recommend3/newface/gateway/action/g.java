package com.taobao.tao.recommend3.newface.gateway.action;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.gateway.exception.GatewayException;
import com.taobao.tao.infoflow.commonsubservice.dataservice.HomeInfoFlowDataService;
import com.taobao.tao.recommend3.gateway.msgcenter.RecmdContainerMsg;
import tb.gkc;
import tb.gke;
import tb.kge;
import tb.lar;
import tb.ope;
import tb.oqc;

/* loaded from: classes.dex */
public class g implements gke {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ope f20940a;

    static {
        kge.a(87195754);
        kge.a(1464465151);
    }

    public g(ope opeVar) throws GatewayException {
        if (opeVar == null) {
            throw new GatewayException("RarecmdGatewayDataSource should not be null");
        }
        this.f20940a = opeVar;
    }

    @Override // tb.gke
    public void a(JSONObject jSONObject, gkc gkcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff35999", new Object[]{this, jSONObject, gkcVar});
            return;
        }
        lar.e("NewFaceScrollToTopAction");
        b(jSONObject, gkcVar);
        lar.f("NewFaceScrollToTopAction");
    }

    public void b(JSONObject jSONObject, gkc gkcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c96ae738", new Object[]{this, jSONObject, gkcVar});
        } else if (jSONObject == null || StringUtils.equals("download", jSONObject.getString("dataSourceType"))) {
        } else {
            String string = jSONObject.getString("containerId");
            if (!StringUtils.equals(oqc.a().m(), string)) {
                return;
            }
            jSONObject.put("_msgType", "scrollToTop");
            if (jSONObject.getBooleanValue("isSecondReturn")) {
                com.taobao.android.home.component.utils.e.e("gateway2.scrollToTop", "scrollToTopAction is SecondReturn");
                return;
            }
            HomeInfoFlowDataService a2 = a(string);
            if (a2 != null) {
                a2.processUiRefresh(this.f20940a, jSONObject);
            } else {
                com.taobao.tao.homepage.d.c(this.f20940a.a()).a(RecmdContainerMsg.getMessage(jSONObject));
            }
            com.taobao.android.home.component.utils.e.c("gateway2.scrollToTop", "end action");
        }
    }

    private HomeInfoFlowDataService a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HomeInfoFlowDataService) ipChange.ipc$dispatch("40701be3", new Object[]{this, str}) : com.taobao.tao.infoflow.commonsubservice.dataservice.a.a(str);
    }
}
