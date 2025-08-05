package com.taobao.desktop.widget.jsbridge;

import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.a$a;
import com.alibaba.ability.result.g;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsWidgetServiceAbility;
import com.taobao.android.abilityidl.ability.WidgetServiceEditSuccessResult;
import com.taobao.android.abilityidl.ability.ct;
import com.taobao.android.abilityidl.ability.en;
import com.taobao.android.abilityidl.ability.eo;
import com.taobao.android.abilityidl.ability.ep;
import com.taobao.android.abilityidl.ability.eq;
import tb.als;
import tb.kge;
import tb.khm;

/* loaded from: classes7.dex */
public class WidgetServiceNextAbility extends AbsWidgetServiceAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1628843870);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsWidgetServiceAbility
    public g<Boolean, ErrorResult> isSupported(als alsVar, eq eqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("98f155ae", new Object[]{this, alsVar, eqVar});
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("typeId", (Object) eqVar.f8849a);
            return new g<>(Boolean.valueOf(b.b(khm.a().b(), "isSupported", JSONObject.toJSONString(jSONObject), null)));
        } catch (Exception e) {
            return new g<>(null, a$a.b(e.getMessage()));
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsWidgetServiceAbility
    public void isInstalled(als alsVar, ep epVar, final ct ctVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a733bdcd", new Object[]{this, alsVar, epVar, ctVar});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("typeId", (Object) epVar.f8848a);
            jSONObject.put("widgetType", (Object) epVar.b);
            b.b(khm.a().b(), "isInstalled", JSONObject.toJSONString(jSONObject), new c() { // from class: com.taobao.desktop.widget.jsbridge.WidgetServiceNextAbility.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.desktop.widget.jsbridge.c
                public void a(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                        return;
                    }
                    WidgetServiceEditSuccessResult widgetServiceEditSuccessResult = new WidgetServiceEditSuccessResult();
                    widgetServiceEditSuccessResult.result = Boolean.valueOf(Boolean.parseBoolean(str));
                    ct ctVar2 = ctVar;
                    if (ctVar2 == null) {
                        return;
                    }
                    ctVar2.a(widgetServiceEditSuccessResult);
                }
            });
        } catch (Exception e) {
            if (ctVar == null) {
                return;
            }
            ctVar.a(a$a.b(e.getMessage()));
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsWidgetServiceAbility
    public g<Boolean, ErrorResult> addWidget(als alsVar, en enVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("c516b06a", new Object[]{this, alsVar, enVar});
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("typeId", (Object) enVar.f8846a);
            jSONObject.put("widgetType", (Object) enVar.b);
            jSONObject.put("channel", (Object) enVar.c);
            return new g<>(Boolean.valueOf(b.b(khm.a().b(), "addWidget", JSONObject.toJSONString(jSONObject), null)));
        } catch (Exception e) {
            return new g<>(null, a$a.b(e.getMessage()));
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsWidgetServiceAbility
    public void editWidget(als alsVar, eo eoVar, final ct ctVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26fad3ac", new Object[]{this, alsVar, eoVar, ctVar});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("typeId", (Object) eoVar.f8847a);
            jSONObject.put("widgetId", (Object) eoVar.b);
            b.b(khm.a().b(), "editWidget", JSONObject.toJSONString(jSONObject), new c() { // from class: com.taobao.desktop.widget.jsbridge.WidgetServiceNextAbility.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.desktop.widget.jsbridge.c
                public void a(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                        return;
                    }
                    WidgetServiceEditSuccessResult widgetServiceEditSuccessResult = new WidgetServiceEditSuccessResult();
                    widgetServiceEditSuccessResult.result = Boolean.valueOf(Boolean.parseBoolean(str));
                    ct ctVar2 = ctVar;
                    if (ctVar2 == null) {
                        return;
                    }
                    ctVar2.a(widgetServiceEditSuccessResult);
                }
            });
        } catch (Exception e) {
            if (ctVar == null) {
                return;
            }
            ctVar.a(a$a.b(e.getMessage()));
        }
    }
}
