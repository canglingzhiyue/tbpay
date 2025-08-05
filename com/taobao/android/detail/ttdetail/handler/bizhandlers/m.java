package com.taobao.android.detail.ttdetail.handler.bizhandlers;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.async.b;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.eyx;
import tb.eyy;
import tb.ezm;
import tb.kge;

/* loaded from: classes5.dex */
public class m implements ezm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "request";

    /* renamed from: a  reason: collision with root package name */
    private Context f10716a;
    private eyx b;
    private Map<Integer, String> c = new ConcurrentHashMap();

    static {
        kge.a(854592002);
        kge.a(1967244270);
    }

    public static /* synthetic */ Map a(m mVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("6ad7512a", new Object[]{mVar}) : mVar.c;
    }

    public m(Context context, eyx eyxVar) {
        this.f10716a = context;
        this.b = eyxVar;
    }

    @Override // tb.ezm
    public boolean a(com.taobao.android.detail.ttdetail.handler.event.a aVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        final com.taobao.android.detail.ttdetail.component.module.d a2;
        eyy componentData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbeca8d7", new Object[]{this, aVar, runtimeAbilityParamArr})).booleanValue();
        }
        if (aVar == null || aVar.b() == null || (a2 = com.taobao.android.detail.ttdetail.utils.a.a(runtimeAbilityParamArr)) == null || (componentData = a2.getComponentData()) == null) {
            return false;
        }
        final int hashCode = a2.hashCode();
        if (!com.taobao.android.detail.ttdetail.utils.a.b(componentData) && !"success".equalsIgnoreCase(this.c.get(Integer.valueOf(hashCode))) && !"blocking".equalsIgnoreCase(this.c.get(Integer.valueOf(hashCode)))) {
            this.c.put(Integer.valueOf(hashCode), "blocking");
            new com.taobao.android.detail.ttdetail.async.b(this.b).a(componentData, new b.a() { // from class: com.taobao.android.detail.ttdetail.handler.bizhandlers.m.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.detail.ttdetail.async.b.a
                public void a(JSONObject jSONObject, JSONObject jSONObject2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6f32d068", new Object[]{this, jSONObject, jSONObject2});
                        return;
                    }
                    m.a(m.this).put(Integer.valueOf(hashCode), "success");
                    a2.updateComponent();
                }

                @Override // com.taobao.android.detail.ttdetail.async.b.a
                public void a(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                        return;
                    }
                    m.a(m.this).put(Integer.valueOf(hashCode), "failure");
                    a2.updateComponent();
                }
            }, runtimeAbilityParamArr);
        }
        return true;
    }
}
