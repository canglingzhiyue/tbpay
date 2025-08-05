package com.taobao.android.detail.core.aura.extension.event.openUrl;

import android.content.Intent;
import com.alibaba.android.aura.q;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.alibaba.android.aura.taobao.adapter.extension.event.openUrl.b;
import com.alibaba.android.umf.datamodel.service.rule.UMFRuleIO;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.aqq;
import tb.arc;
import tb.aym;
import tb.bba;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class b implements b.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private q f9392a;
    private AURAEventIO b;

    static {
        kge.a(1318202737);
        kge.a(1925399435);
    }

    public static /* synthetic */ void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbdde16d", new Object[]{bVar});
        } else {
            bVar.b();
        }
    }

    public b(q qVar, AURAEventIO aURAEventIO) {
        this.b = aURAEventIO;
        this.f9392a = qVar;
        emu.a("com.taobao.android.detail.core.aura.extension.event.openUrl.AliDetailOpenUrlDelegate");
    }

    @Override // com.alibaba.android.aura.taobao.adapter.extension.event.openUrl.b.a
    public void a(String str, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c6cddef", new Object[]{this, str, intent});
        } else {
            a(intent);
        }
    }

    @Override // com.alibaba.android.aura.taobao.adapter.extension.event.openUrl.b.a
    public void b(String str, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1e70430", new Object[]{this, str, intent});
        } else {
            arc.a().b("AliDetailOpenUrlDelegate", "onFailure", "Activity onFailure");
        }
    }

    private void a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8033c25", new Object[]{this, intent});
            return;
        }
        JSONObject b = b(intent);
        if (b == null) {
            return;
        }
        JSONObject c = this.b.getEventModel().c();
        if (c == null) {
            arc.a().b("AliDetailOpenUrlDelegate", "handleNativeResult", "从Native返回的eventFields数据为null");
            return;
        }
        JSONObject jSONObject = c.getJSONObject("params");
        if (jSONObject == null) {
            arc.a().b("AliDetailOpenUrlDelegate", "handleNativeResult", "从Native返回的params数据为null");
            c.put("params", (Object) b);
        } else {
            jSONObject.putAll(b);
        }
        a();
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        UMFRuleIO a2 = d.a(this.b);
        if (a2 == null) {
            return;
        }
        this.f9392a.b().a("aura.workflow.adjustRules", a2, new aqq() { // from class: com.taobao.android.detail.core.aura.extension.event.openUrl.b.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.aqq, tb.aqs
            public void a(com.alibaba.android.aura.b bVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2c671180", new Object[]{this, bVar});
                }
            }

            @Override // tb.aqq
            public void a(com.alibaba.android.aura.datamodel.c cVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6b8a7af", new Object[]{this, cVar});
                } else {
                    b.a(b.this);
                }
            }
        });
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.f9392a.b().a("aura.workflow.adjust", aym.a(this.b), null);
        }
    }

    private JSONObject b(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7ef5b3c6", new Object[]{this, intent});
        }
        String stringExtra = intent.getStringExtra("data");
        if (stringExtra == null) {
            arc.a().b("AliDetailOpenUrlDelegate", "handleNativeResult", "从H5返回的数据为null");
            return null;
        }
        return bba.a(stringExtra);
    }
}
