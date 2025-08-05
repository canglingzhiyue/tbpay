package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.aura.utils.d;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.datasdk.factory.manager.a;
import com.taobao.android.detail.datasdk.model.datamodel.node.b;
import com.taobao.android.detail.datasdk.model.datamodel.template.ActionModel;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.h;
import com.taobao.android.trade.event.Event;
import com.taobao.android.trade.event.f;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public class iek extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_UTAP = 38447420286L;

    static {
        kge.a(-1245206402);
    }

    public static /* synthetic */ Object ipc$super(iek iekVar, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public iek() {
        emu.a("com.taobao.android.detail.core.standard.mainscreen.barrage.DXUTapEventHandler");
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void prepareBindEventWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a67c4e2", new Object[]{this, objArr, dXRuntimeContext});
        } else {
            super.prepareBindEventWithArgs(objArr, dXRuntimeContext);
        }
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
            return;
        }
        Context m = dXRuntimeContext.m();
        if (objArr == null || objArr.length <= 0 || objArr[0] == null || !(m instanceof DetailCoreActivity)) {
            return;
        }
        b bVar = ((DetailCoreActivity) m).C().f10055a;
        Iterator<Object> it = dXRuntimeContext.e().getJSONObject("events").getJSONArray((String) objArr[0]).iterator();
        while (it.hasNext()) {
            f.a(dXRuntimeContext.m(), a(m, bVar, it.next(), d.ROUTE_TABLE));
        }
    }

    public static Event a(Context context, b bVar, Object obj, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Event) ipChange.ipc$dispatch("978275af", new Object[]{context, bVar, obj, map});
        }
        emw a2 = emx.a(context);
        if (a2 == null || a2.b() == null || a2.b().n() == null || !(obj instanceof JSONObject)) {
            return null;
        }
        JSONObject jSONObject = (JSONObject) obj;
        if (!map.containsKey(jSONObject.getString("type"))) {
            return null;
        }
        String str = map.get(jSONObject.getString("type"));
        JSONObject jSONObject2 = jSONObject.getJSONObject("fields");
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("type", (Object) str);
        jSONObject3.put("fields", (Object) jSONObject2);
        ActionModel actionModel = new ActionModel(jSONObject3);
        a n = emx.a(context).b().n();
        if ("user_track".equals(str)) {
            ecf.a(context, jSONObject2.getString("arg1"), jSONObject2.getJSONObject("args").getInnerMap());
        }
        return n.a(actionModel, bVar, null, null);
    }
}
