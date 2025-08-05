package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.live.plugin.atype.flexalocal.good.a;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c;
import java.util.HashMap;

/* loaded from: classes5.dex */
public class hhl extends iot {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_TBLIVE_GOODS_TOP_CARD = 4228114602560132033L;

    static {
        kge.a(883009455);
    }

    public static /* synthetic */ Object ipc$super(hhl hhlVar, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
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

    @Override // tb.iot
    public void a(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext, c cVar) {
        JSONObject jSONObject;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cc53e1f", new Object[]{this, dXEvent, objArr, dXRuntimeContext, cVar});
        } else if (objArr == null || objArr.length <= 0 || !(objArr[0] instanceof JSONObject) || !hiw.f() || (jSONObject = (JSONObject) objArr[0]) == null || !jSONObject.containsKey("url")) {
        } else {
            HashMap<String, String> hashMap = new HashMap<>();
            if (jSONObject.containsKey("type")) {
                str = "top_card_" + jSONObject.getString("type");
            } else {
                str = "";
            }
            hashMap.put("glOpenUrlRefer", str);
            if (a.a().j() != null) {
                a.a().j().a("SpecialSelectExplain", hashMap);
            }
            HashMap hashMap2 = new HashMap();
            hashMap2.put("x", "0");
            hashMap2.put("y", String.valueOf(0));
            hashMap2.put("width", String.valueOf(-1));
            hashMap2.put("height", String.valueOf(-1));
            hashMap2.put("modal", "true");
            a.a().i().a(cVar == null ? null : cVar.C(), dXRuntimeContext.m(), hashMap2, jSONObject.getString("url"), jSONObject.getString("type"));
        }
    }
}
