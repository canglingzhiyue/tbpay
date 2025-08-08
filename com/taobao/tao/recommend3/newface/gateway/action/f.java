package com.taobao.tao.recommend3.newface.gateway.action;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.gateway.exception.GatewayException;
import com.taobao.tao.recommend3.gateway.msgcenter.RecmdContainerMsg;
import tb.gkc;
import tb.gke;
import tb.kge;
import tb.ope;

/* loaded from: classes.dex */
public class f implements gke {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ope f20939a;

    static {
        kge.a(734580640);
        kge.a(1464465151);
    }

    public f(ope opeVar) throws GatewayException {
        if (opeVar == null) {
            throw new GatewayException("RarecmdGatewayDataSource should not be null");
        }
        this.f20939a = opeVar;
    }

    @Override // tb.gke
    public void a(JSONObject jSONObject, gkc gkcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff35999", new Object[]{this, jSONObject, gkcVar});
        } else if (jSONObject == null || StringUtils.equals("download", jSONObject.getString("dataSourceType"))) {
        } else {
            jSONObject.put("_msgType", "scrollToPosition");
            com.taobao.tao.homepage.d.c(this.f20939a.a()).a(RecmdContainerMsg.getMessage(jSONObject));
            com.taobao.android.home.component.utils.e.c("gateway2.scrollToPostion", "end action");
        }
    }
}
