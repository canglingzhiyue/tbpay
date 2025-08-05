package com.taobao.android.behavir.fatigue;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.util.g;
import tb.kge;

/* loaded from: classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public long f9140a;
    public long b;
    public long c;
    public long d;
    public long e;

    static {
        kge.a(-749449384);
    }

    private a(JSONObject jSONObject) {
        if (!jSONObject.containsKey("materialDeliveryId") && !jSONObject.containsKey(com.alibaba.triver.triver_shop.newShop.event.ucp.a.MATERIAL_ID_KEY)) {
            jSONObject = g.a(jSONObject, "schemeId", "schemeNumId", "bizId", "bizNumId", "bizPlanNumId", "materialId", com.alibaba.triver.triver_shop.newShop.event.ucp.a.MATERIAL_ID_KEY);
        }
        this.f9140a = jSONObject.getLongValue("bizNumId");
        this.b = jSONObject.getLongValue("schemeNumId");
        this.c = jSONObject.getLongValue("bizPlanNumId");
        this.d = jSONObject.getLongValue(com.alibaba.triver.triver_shop.newShop.event.ucp.a.MATERIAL_ID_KEY);
        this.e = jSONObject.getLongValue("materialDeliveryId");
    }

    public static a a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("453f7f03", new Object[]{jSONObject});
        }
        if (jSONObject != null) {
            return new a(jSONObject);
        }
        return null;
    }
}
