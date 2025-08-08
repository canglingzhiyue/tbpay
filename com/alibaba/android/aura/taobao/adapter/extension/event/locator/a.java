package com.alibaba.android.aura.taobao.adapter.extension.event.locator;

import android.os.Handler;
import android.os.Looper;
import android.support.v7.widget.RecyclerView;
import mtopsdk.common.util.StringUtils;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.aura.datamodel.rule.b;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.alibaba.android.aura.s;
import com.alibaba.android.umf.datamodel.service.rule.UMFRuleIO;
import com.alibaba.android.umf.node.service.data.rule.RuleType;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.infoflow.multitab.e;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import tb.aqs;
import tb.arc;
import tb.atg;
import tb.kge;

@AURAExtensionImpl(code = "aura.impl.render.scroll.component.blink")
/* loaded from: classes2.dex */
public final class a implements atg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String GLOBAL_DATA_BLINK_DATA = "global_data_Blink_data";

    /* renamed from: a  reason: collision with root package name */
    private AURAGlobalData f2196a;
    private q b;
    private Handler c;
    private Runnable d;

    /* renamed from: com.alibaba.android.aura.taobao.adapter.extension.event.locator.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0069a {

        /* renamed from: a  reason: collision with root package name */
        public AURARenderComponent f2198a;
        public JSONObject b;

        static {
            kge.a(-1387496299);
        }

        public C0069a(JSONObject jSONObject, AURARenderComponent aURARenderComponent) {
            this.f2198a = aURARenderComponent;
            this.b = jSONObject;
        }
    }

    static {
        kge.a(-1250245028);
        kge.a(836884500);
    }

    @Override // tb.atg
    public void a(RecyclerView recyclerView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2febb876", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
        }
    }

    public static /* synthetic */ void a(a aVar, s sVar, AURARenderComponent aURARenderComponent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5ca0412", new Object[]{aVar, sVar, aURARenderComponent, str});
        } else {
            aVar.a(sVar, aURARenderComponent, str);
        }
    }

    @Override // tb.ark
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, aqs aqsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21929b2a", new Object[]{this, aURAFlowData, aURAGlobalData, aqsVar});
        } else {
            this.f2196a = aURAGlobalData;
        }
    }

    @Override // tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
        } else {
            this.b = qVar;
        }
    }

    @Override // tb.atg
    public void a(RecyclerView recyclerView, int i) {
        AURAGlobalData aURAGlobalData;
        C0069a c0069a;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85acc02d", new Object[]{this, recyclerView, new Integer(i)});
        } else if (this.b == null || (aURAGlobalData = this.f2196a) == null || i != 0 || (c0069a = (C0069a) aURAGlobalData.get(GLOBAL_DATA_BLINK_DATA, C0069a.class)) == null) {
        } else {
            JSONObject jSONObject = c0069a.b;
            String string = jSONObject.getString("duration");
            String string2 = jSONObject.getString(e.KEY_BG_COLOR);
            String string3 = jSONObject.getString("originColor");
            if (StringUtils.isEmpty(string2)) {
                return;
            }
            a(this.b.b(), c0069a.f2198a, string, string3, string2);
            this.f2196a.update(GLOBAL_DATA_BLINK_DATA, null);
        }
    }

    private void a(final s sVar, final AURARenderComponent aURARenderComponent, String str, final String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f54946a", new Object[]{this, sVar, aURARenderComponent, str, str2, str3});
            return;
        }
        AURARenderComponentData aURARenderComponentData = aURARenderComponent.data;
        if (aURARenderComponentData == null || aURARenderComponentData.fields == null) {
            return;
        }
        a(sVar, aURARenderComponent, str3);
        long parseLong = StringUtils.isEmpty(str) ? 1000L : Long.parseLong(str);
        this.d = new Runnable() { // from class: com.alibaba.android.aura.taobao.adapter.extension.event.locator.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    a.a(a.this, sVar, aURARenderComponent, StringUtils.isEmpty(str2) ? "#ffffff" : str2);
                } catch (Throwable unused) {
                }
            }
        };
        this.c = new Handler(Looper.getMainLooper());
        this.c.postDelayed(this.d, parseLong);
    }

    private void a(s sVar, AURARenderComponent aURARenderComponent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47515256", new Object[]{this, sVar, aURARenderComponent, str});
            return;
        }
        com.alibaba.android.umf.datamodel.service.rule.a aVar = new com.alibaba.android.umf.datamodel.service.rule.a();
        aVar.f2839a = RuleType.PROPS_WRITE_BACK;
        aVar.b = aURARenderComponent.key;
        Map<String, Object> map = aURARenderComponent.data == null ? null : aURARenderComponent.data.fields;
        aVar.d = new b(map, aURARenderComponent.data == null ? null : aURARenderComponent.data.events, aURARenderComponent.data == null ? null : aURARenderComponent.data.localFields);
        HashMap hashMap = new HashMap();
        if (map != null) {
            hashMap.putAll(map);
        }
        hashMap.put(e.KEY_BG_COLOR, str);
        aVar.c = new b(hashMap, null, null);
        UMFRuleIO uMFRuleIO = new UMFRuleIO(Collections.singletonList(aVar));
        if (sVar != null) {
            sVar.a("aura.workflow.adjustRules", uMFRuleIO, null);
        } else {
            arc.a().b("modifyBgColor fail! auraInstance is null");
        }
    }

    @Override // tb.arl
    public void onDestroy() {
        Runnable runnable;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        Handler handler = this.c;
        if (handler == null || (runnable = this.d) == null) {
            return;
        }
        handler.removeCallbacks(runnable);
    }
}
