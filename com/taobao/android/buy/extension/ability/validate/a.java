package com.taobao.android.buy.extension.ability.validate;

import android.app.Activity;
import android.content.Context;
import android.text.Editable;
import mtopsdk.common.util.StringUtils;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.aura.s;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.alibaba.android.aura.service.event.d;
import com.alibaba.android.umf.datamodel.service.rule.UMFRuleIO;
import com.alibaba.android.umf.node.service.data.rule.RuleType;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.event.DXTextInputEvent;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import tb.arc;
import tb.arv;
import tb.bat;
import tb.dtk;
import tb.kge;

@AURAExtensionImpl(code = "alibuy.impl.event.validateData")
/* loaded from: classes4.dex */
public final class a extends arv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1229755591);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.arw
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : "validateData";
    }

    @Override // tb.arv
    public void b(AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("186833d5", new Object[]{this, aURAEventIO});
            return;
        }
        d eventModel = aURAEventIO.getEventModel();
        JSONObject c = eventModel.c();
        if (c == null) {
            arc.a().a("validateData事件eventFields为null");
            return;
        }
        String string = c.getString("actionParams");
        String string2 = c.getString("passValue");
        String string3 = c.getString("noPassValue");
        if (StringUtils.isEmpty(string) || StringUtils.isEmpty(string2) || StringUtils.isEmpty(string3)) {
            arc.a().a("validateData事件缺少actionParams|passValue|passValue 参数");
            return;
        }
        AURARenderComponent d = eventModel.d();
        if (d == null) {
            arc.a().a("validateData事件AURARenderComponent为null");
            return;
        }
        AURARenderComponentData aURARenderComponentData = d.data;
        if (aURARenderComponentData == null) {
            arc.a().a("validateData事件AURARenderComponentData为null");
            return;
        }
        String a2 = a(eventModel);
        if (a2 != null) {
            Map map = aURARenderComponentData.fields;
            if (map == null) {
                map = new HashMap();
                aURARenderComponentData.fields = map;
            }
            map.put("text", a2);
        }
        dtk a3 = b.a(aURARenderComponentData.fields, b.a(aURARenderComponentData.features));
        if (!a3.b()) {
            a(b().e(), a3.c());
        }
        HashMap hashMap = new HashMap();
        hashMap.put("validateState", a3.b() ? "true" : "false");
        if (a3.b()) {
            string3 = string2;
        }
        hashMap.put(string, string3);
        a(b().b(), d, hashMap);
    }

    private static void a(s sVar, AURARenderComponent aURARenderComponent, final Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d56d5e79", new Object[]{sVar, aURARenderComponent, map});
            return;
        }
        com.alibaba.android.umf.datamodel.service.rule.a aVar = new com.alibaba.android.umf.datamodel.service.rule.a();
        aVar.f2839a = RuleType.PROPS_WRITE_BACK;
        aVar.b = aURARenderComponent.key;
        AURARenderComponentData aURARenderComponentData = aURARenderComponent.data;
        if (aURARenderComponentData == null) {
            arc.a().a("validateData事件refreshComponentData函数AURARenderComponentData为null");
            return;
        }
        aVar.d = new com.alibaba.android.aura.datamodel.rule.b(aURARenderComponentData.fields, aURARenderComponentData.events, aURARenderComponentData.localFields);
        aVar.c = new com.alibaba.android.aura.datamodel.rule.b(new HashMap<String, Object>(aURARenderComponentData.fields) { // from class: com.taobao.android.buy.extension.ability.validate.AlibuyValidateExtension$1
            {
                putAll(map);
            }
        }, null, null);
        sVar.a("aura.workflow.adjustRules", new UMFRuleIO(Collections.singletonList(aVar)), null);
    }

    private String a(d dVar) {
        Editable text;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("38de8993", new Object[]{this, dVar});
        }
        DXEvent g = dVar.g();
        if ((g instanceof DXTextInputEvent) && (text = ((DXTextInputEvent) g).getText()) != null) {
            return text.toString();
        }
        return null;
    }

    private void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{this, context, str});
        } else if (StringUtils.isEmpty(str) || !(context instanceof Activity)) {
        } else {
            bat.a((Activity) context, str);
        }
    }
}
