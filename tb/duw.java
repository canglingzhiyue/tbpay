package tb;

import android.content.Intent;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import com.alibaba.android.aura.b;
import com.alibaba.android.aura.datamodel.c;
import com.alibaba.android.aura.datamodel.linkage.UMFLinkageTrigger;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.q;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.alibaba.android.aura.service.event.d;
import com.alibaba.android.umf.datamodel.protocol.ultron.base.Event;
import com.alibaba.android.umf.datamodel.service.rule.UMFRuleIO;
import com.alibaba.android.umf.datamodel.service.rule.a;
import com.alibaba.android.umf.node.service.data.rule.RuleType;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public class duw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(403954181);
    }

    public static /* synthetic */ void a(q qVar, UMFLinkageTrigger uMFLinkageTrigger) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d51bfc4", new Object[]{qVar, uMFLinkageTrigger});
        } else {
            b(qVar, uMFLinkageTrigger);
        }
    }

    public static UMFRuleIO a(AURARenderComponent aURARenderComponent, AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UMFRuleIO) ipChange.ipc$dispatch("7cac8edd", new Object[]{aURARenderComponent, aURAEventIO}) : a(aURARenderComponent, aURAEventIO, null);
    }

    public static UMFRuleIO a(AURARenderComponent aURARenderComponent, AURAEventIO aURAEventIO, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UMFRuleIO) ipChange.ipc$dispatch("d37e1496", new Object[]{aURARenderComponent, aURAEventIO, map});
        }
        d eventModel = aURAEventIO.getEventModel();
        Event event = new Event();
        event.fields = eventModel.c();
        event.id = eventModel.a();
        event.tag = eventModel.b();
        event.type = aURAEventIO.getEventType();
        a aVar = new a();
        aVar.b = aURARenderComponent.key;
        aVar.f2839a = RuleType.PROPS_WRITE_BACK;
        aVar.d.f2137a = aURARenderComponent.data.fields;
        aVar.d.b = aURARenderComponent.data.events;
        HashMap hashMap = new HashMap();
        hashMap.put(aURAEventIO.getEventModel().b(), Collections.singletonList(event));
        aVar.c.b = hashMap;
        if (map != null) {
            aVar.c.f2137a = map;
        }
        return new UMFRuleIO(Collections.singletonList(aVar));
    }

    public static JSONObject a(Intent intent) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c4801345", new Object[]{intent});
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return null;
        }
        Set<String> keySet = extras.keySet();
        JSONObject jSONObject = new JSONObject();
        for (String str : keySet) {
            if (!StringUtils.isEmpty(str) && (obj = extras.get(str)) != null) {
                jSONObject.put(str, (Object) String.valueOf(obj));
            }
        }
        return jSONObject;
    }

    public static void a(final q qVar, AURARenderComponent aURARenderComponent, final AURAEventIO aURAEventIO, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d80d734f", new Object[]{qVar, aURARenderComponent, aURAEventIO, map});
        } else {
            qVar.b().a("aura.workflow.adjustRules", a(aURARenderComponent, aURAEventIO, map), new aqq() { // from class: tb.duw.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.aqq, tb.aqs
                public void a(b bVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("2c671180", new Object[]{this, bVar});
                    }
                }

                @Override // tb.aqq
                public void a(c cVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6b8a7af", new Object[]{this, cVar});
                    } else {
                        duw.a(qVar, aym.a(AURAEventIO.this));
                    }
                }
            });
        }
    }

    private static void b(q qVar, UMFLinkageTrigger uMFLinkageTrigger) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95980005", new Object[]{qVar, uMFLinkageTrigger});
        } else {
            qVar.b().a("aura.workflow.adjust", uMFLinkageTrigger, null);
        }
    }
}
