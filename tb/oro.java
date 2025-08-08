package tb;

import android.app.Application;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.desktop.channel.desktoplinktask.floatwindow.a;
import com.taobao.desktop.channel.desktoplinktask.floatwindow.b;
import com.taobao.desktop.channel.desktoplinktask.floatwindow.model.WindowStyleModel;
import com.taobao.desktop.channel.desktoplinktask.trigger.e;
import com.taobao.desktop.channel.desktoplinktask.trigger.f;
import com.taobao.desktop.channel.desktoplinktask.widgetservice.d;

/* loaded from: classes7.dex */
public class oro extends orn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1914179779);
    }

    public static /* synthetic */ Object ipc$super(oro oroVar, String str, Object... objArr) {
        if (str.hashCode() == -1063446546) {
            super.a((f) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.orn
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "application";
    }

    @Override // tb.orn
    public boolean a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2d53ce2", new Object[]{this, bVar})).booleanValue();
        }
        return false;
    }

    @Override // tb.orn
    public /* bridge */ /* synthetic */ void a(f fVar) {
        super.a(fVar);
    }

    @Override // tb.orn
    public JSONObject b(b bVar) {
        JSONObject jSONObject;
        JSONObject parseObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("307f303f", new Object[]{this, bVar});
        }
        f fVar = bVar.f16946a;
        JSONObject jSONObject2 = null;
        if (fVar != null && fVar.d != null) {
            String string = fVar.d.getString("config");
            if (StringUtils.isEmpty(string)) {
                a(bVar, e.FUNNEL_STEP_LAUNCH_WIDGET, "paramContentEmpty", "");
                return null;
            }
            try {
                jSONObject = JSON.parseObject(string);
            } catch (Throwable th) {
                th.printStackTrace();
                jSONObject = null;
            }
            if (jSONObject == null) {
                a(bVar, e.FUNNEL_STEP_LAUNCH_WIDGET, "contentInvalid", "");
                return null;
            }
            JSONObject jSONObject3 = jSONObject.getJSONObject("displayCondition");
            if (jSONObject3 != null && jSONObject3.containsKey("notifyEnable")) {
                boolean booleanValue = jSONObject3.getBooleanValue("notifyEnable");
                String d = kgy.d(khm.a().b());
                if ((booleanValue && !"true".equals(d)) || (!booleanValue && !"false".equals(d))) {
                    a(bVar, e.FUNNEL_STEP_LAUNCH_WIDGET, "notifyEnableConditionNotPass", "");
                    return null;
                }
            }
            if (!b(fVar)) {
                return null;
            }
            try {
                JSONObject parseObject2 = JSON.parseObject(jSONObject.getString("context"));
                a(fVar.e, 1, null);
                String string2 = fVar.d.getString("localRecord");
                if (!StringUtils.isEmpty(string2) && (parseObject = JSONObject.parseObject(string2)) != null) {
                    jSONObject2 = parseObject.getJSONObject("displayFatigue");
                }
                Application b = khm.a().b();
                JSONObject jSONObject4 = new JSONObject();
                if (parseObject2 == null) {
                    parseObject2 = new JSONObject();
                }
                jSONObject4.put("context", (Object) parseObject2);
                if (jSONObject2 == null) {
                    jSONObject2 = new JSONObject();
                }
                jSONObject4.put("displayFatigue", (Object) jSONObject2);
                jSONObject4.put("notifyEnable", (Object) kgy.d(b));
                jSONObject4.put("floatWindowEnable", (Object) Boolean.valueOf(kgy.b(b)));
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("androidFloatWindow", (Object) jSONObject4.toJSONString());
                return jSONObject5;
            } catch (Throwable unused) {
                a(bVar, e.FUNNEL_STEP_LAUNCH_WIDGET, "paramContentInvalid", "");
            }
        }
        return null;
    }

    @Override // tb.orn
    public void c(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f44560", new Object[]{this, bVar});
        } else {
            a(bVar.f16946a.e, 3, null);
        }
    }

    @Override // tb.orn
    public void a(final b bVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dfc91d2", new Object[]{this, bVar, jSONObject});
            return;
        }
        final f fVar = bVar.f16946a;
        JSONObject jSONObject2 = jSONObject.getJSONObject(com.taobao.android.abilitykit.ability.pop.model.b.TAK_ABILITY_MATCH_CONTENT);
        final String string = jSONObject2.getString("bizCode");
        String string2 = jSONObject2.getString("dslContent");
        String string3 = jSONObject2.getString("dataContent");
        fVar.c = string;
        if (!d.a().a(bVar)) {
            kgz.a("LocalTaskProcessor.onDataFetchSuccess.addNewRequestFailed.sameBizCode.alreadyPopping.cancel.bizCode=%s", string);
            a(fVar, e.FUNNEL_STEP_LAUNCH_WIDGET, "LocalTaskProcessor.triggerFailed.onDataFetchSuccess.AlreadyPopping", "");
            return;
        }
        this.f32326a.a(bVar, string2, string3, (WindowStyleModel) jSONObject2.getObject("style", WindowStyleModel.class), new a.InterfaceC0651a() { // from class: tb.oro.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.desktop.channel.desktoplinktask.floatwindow.a.InterfaceC0651a
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putString("bizCode", string);
                oro.this.a(fVar.e, 2, bundle);
                oro.this.d(bVar);
            }

            @Override // com.taobao.desktop.channel.desktoplinktask.floatwindow.a.InterfaceC0651a
            public void a(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                } else {
                    oro.this.a(bVar, e.FUNNEL_STEP_VIEW_LOAD, str, "");
                }
            }
        });
        String string4 = jSONObject.getString("triggerConfig");
        if (StringUtils.isEmpty(string4)) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("newConfig", string4);
        a(fVar.e, 4, bundle);
    }

    @Override // tb.orn
    public void a(b bVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93042b28", new Object[]{this, bVar, str});
        } else {
            a(bVar, e.FUNNEL_STEP_AFTER_REQUEST, "mtopFailed.APIFailed", str);
        }
    }
}
