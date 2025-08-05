package com.taobao.android.detail.ttdetail.handler.bizhandlers;

import android.content.Context;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import tb.eyx;
import tb.ezm;
import tb.kge;

/* loaded from: classes5.dex */
public class af implements ezm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "titleExpandOrFold";

    /* renamed from: a  reason: collision with root package name */
    private Context f10677a;
    private eyx b;

    static {
        kge.a(-965478853);
        kge.a(1967244270);
    }

    public af(Context context, eyx eyxVar) {
        this.f10677a = context;
        this.b = eyxVar;
    }

    @Override // tb.ezm
    public boolean a(com.taobao.android.detail.ttdetail.handler.event.a aVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        JSONObject d;
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbeca8d7", new Object[]{this, aVar, runtimeAbilityParamArr})).booleanValue();
        }
        com.taobao.android.detail.ttdetail.component.module.d a2 = com.taobao.android.detail.ttdetail.utils.a.a(runtimeAbilityParamArr);
        if (a2 == null || (d = a2.getComponentData().d()) == null || (obj = d.get(com.alibaba.triver.triver_shop.newShop.ext.g.KEY_HEADER_EXPANDED)) == null) {
            return false;
        }
        boolean z = !"true".equals(obj.toString());
        d.put(com.alibaba.triver.triver_shop.newShop.ext.g.KEY_HEADER_EXPANDED, (Object) String.valueOf(z));
        a(d.get("title"), z);
        a2.updateComponent();
        return true;
    }

    private void a(Object obj, boolean z) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e7de910", new Object[]{this, obj, new Boolean(z)});
        } else if (obj != null && (obj instanceof JSONArray)) {
            JSONArray jSONArray = (JSONArray) obj;
            int size = jSONArray.size();
            for (int i = 0; i < size; i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                if (jSONObject2 != null && (jSONObject = jSONObject2.getJSONObject("style")) != null) {
                    jSONObject.put("tailIndent", (Object) String.valueOf(z));
                }
            }
        }
    }
}
