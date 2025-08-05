package tb;

import android.taobao.windvane.util.m;
import com.alibaba.android.ultron.event.base.e;
import com.alibaba.android.ultron.event.q;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.proxy.f;
import com.taobao.android.ultron.datamodel.imp.DMEvent;

/* loaded from: classes8.dex */
public class phe extends q {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(605648854);
    }

    public static /* synthetic */ Object ipc$super(phe pheVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.alibaba.android.ultron.event.q
    public void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93d93503", new Object[]{this, eVar});
            return;
        }
        try {
            Object d = eVar.d("extraParams");
            JSONObject fields = ((DMEvent) eVar.i()).getFields();
            JSONObject jSONObject = fields.getJSONObject("params");
            String string = fields.getString("abilityName");
            String string2 = fields.getString("abilityApi");
            String string3 = fields.getString("dataIndex");
            jSONObject.put("ultronItemData", eVar.d().getData().get("ultronItemData"));
            pha.a(string, string2, a(string3, d, jSONObject), eVar.a(), null);
        } catch (Throwable th) {
            m.e("TBLiveAbilitySubscriber", th.toString());
        }
        m.c("TBLiveAbilitySubscriber", "On Handle Event");
    }

    private JSONObject a(String str, Object obj, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f44eb442", new Object[]{this, str, obj, jSONObject});
        }
        try {
            return (JSONObject) f.m().parseExpressionObj((JSONObject) ((Object[]) obj)[Integer.parseInt(str)], jSONObject, true);
        } catch (Throwable th) {
            m.c("TBLiveAbilitySubscriber", th.toString());
            return jSONObject;
        }
    }
}
