package com.taobao.android.detail.ttdetail.handler.bizhandlers;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import tb.eyx;
import tb.ezm;
import tb.kge;

/* loaded from: classes5.dex */
public class ao implements ezm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "buyNow_touchdown";

    /* renamed from: a  reason: collision with root package name */
    private final Context f10690a;
    private final eyx b;
    private com.taobao.android.detail.ttdetail.c c;

    static {
        kge.a(-1379143584);
        kge.a(1967244270);
    }

    public static /* synthetic */ void a(ao aoVar, com.taobao.android.detail.ttdetail.handler.event.a aVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dd4c2f5", new Object[]{aoVar, aVar, jSONObject});
        } else {
            aoVar.a(aVar, jSONObject);
        }
    }

    public ao(Context context, eyx eyxVar, com.taobao.android.detail.ttdetail.c cVar) {
        this.f10690a = context;
        this.b = eyxVar;
        this.c = cVar;
    }

    @Override // tb.ezm
    public boolean a(final com.taobao.android.detail.ttdetail.handler.event.a aVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbeca8d7", new Object[]{this, aVar, runtimeAbilityParamArr})).booleanValue();
        }
        if (aVar == null) {
            return false;
        }
        if (!com.taobao.android.detail.ttdetail.utils.ao.c()) {
            return true;
        }
        this.b.a().c(new com.taobao.android.detail.ttdetail.request.stream.a() { // from class: com.taobao.android.detail.ttdetail.handler.bizhandlers.ao.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.ttdetail.request.stream.a
            public void a(JSONObject jSONObject) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
                } else {
                    ao.a(ao.this, aVar, jSONObject);
                }
            }

            @Override // com.taobao.android.detail.ttdetail.request.stream.a
            public void a(String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                    return;
                }
                com.taobao.android.detail.ttdetail.utils.i.a("BuyNowTouchDownImplementor", "streamDataListener onFailure retCode=" + str + ", retMsg=" + str2);
            }
        });
        return true;
    }

    private void a(com.taobao.android.detail.ttdetail.handler.event.a aVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5ebe22d", new Object[]{this, aVar, jSONObject});
        } else if (jSONObject == null) {
        } else {
            this.c.a(jSONObject);
            this.c.a();
            com.taobao.android.detail.ttdetail.utils.i.a("BuyNowTouchDownImplementor", "TouchDown preShowSku");
            this.c.e("BUYNOW");
        }
    }
}
