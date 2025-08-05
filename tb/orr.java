package tb;

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
public class orr extends orn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2098865621);
    }

    public static /* synthetic */ Object ipc$super(orr orrVar, String str, Object... objArr) {
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
    public void c(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f44560", new Object[]{this, bVar});
        }
    }

    @Override // tb.orn
    public /* bridge */ /* synthetic */ void a(f fVar) {
        super.a(fVar);
    }

    @Override // tb.orn
    public JSONObject b(b bVar) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("307f303f", new Object[]{this, bVar});
        }
        f fVar = bVar.f16946a;
        if (fVar == null || fVar.d == null) {
            return null;
        }
        try {
            jSONObject = JSONObject.parseObject(fVar.d.getString("config"));
        } catch (Throwable th) {
            th.printStackTrace();
            jSONObject = null;
        }
        if (jSONObject == null) {
            a(bVar, e.FUNNEL_STEP_LAUNCH_WIDGET, "paramContentEmpty", "");
            return null;
        } else if (jSONObject.getLongValue("validTimestamp") < System.currentTimeMillis() / 1000) {
            a(bVar, e.FUNNEL_STEP_LAUNCH_WIDGET, "validTimestampCheckFail", "");
            return null;
        } else if (!b(fVar)) {
            return null;
        } else {
            JSONObject jSONObject2 = jSONObject.getJSONObject("context");
            JSONObject jSONObject3 = new JSONObject();
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            jSONObject3.put("context", (Object) jSONObject2);
            jSONObject3.put("notifyEnable", (Object) kgy.d(khm.a().b()));
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("androidFloatWindow", (Object) jSONObject3.toJSONString());
            return jSONObject4;
        }
    }

    @Override // tb.orn
    public void a(b bVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dfc91d2", new Object[]{this, bVar, jSONObject});
            return;
        }
        f fVar = bVar.f16946a;
        JSONObject jSONObject2 = jSONObject.getJSONObject(com.taobao.android.abilitykit.ability.pop.model.b.TAK_ABILITY_MATCH_CONTENT);
        if (jSONObject2 == null) {
            a(bVar, e.FUNNEL_STEP_AFTER_REQUEST, "mtopFailed.NoMatchContent", "");
            return;
        }
        String string = jSONObject2.getString("bizCode");
        String string2 = jSONObject2.getString("dslContent");
        String string3 = jSONObject2.getString("dataContent");
        fVar.c = string;
        if (!d.a().a(bVar)) {
            kgz.a("OnceEventTaskProcessor.onDataFetchSuccess.addNewRequestFailed.sameBizCode.alreadyPopping.cancel.bizCode=%s", string);
            a(fVar, e.FUNNEL_STEP_LAUNCH_WIDGET, "OnceEventTaskProcessor.triggerFailed.onDataFetchSuccess.AlreadyPopping", "");
            return;
        }
        this.f32326a.a(bVar, string2, string3, (WindowStyleModel) jSONObject2.getObject("style", WindowStyleModel.class), (a.InterfaceC0651a) null);
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
