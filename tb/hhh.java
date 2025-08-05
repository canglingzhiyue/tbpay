package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.live.plugin.atype.flexalocal.good.a;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c;
import com.taobao.taolive.sdk.goodlist.e;
import java.util.HashMap;

/* loaded from: classes5.dex */
public class hhh extends iot {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_TBLIVESENDDYNAMICMESSAGE = -1436568498127284814L;

    static {
        kge.a(-1687547837);
    }

    public static /* synthetic */ Object ipc$super(hhh hhhVar, String str, Object... objArr) {
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
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cc53e1f", new Object[]{this, dXEvent, objArr, dXRuntimeContext, cVar});
        } else if (objArr == null || objArr.length == 0 || !(objArr[0] instanceof JSONObject) || a.a().i() == null) {
        } else {
            JSONObject jSONObject = (JSONObject) objArr[0];
            e i = a.a().i();
            com.taobao.alilive.aliliveframework.frame.a C = cVar == null ? null : cVar.C();
            JSONObject jSONObject2 = jSONObject.getJSONObject("clientInteracts");
            if (!hir.b() || "true".equals(jSONObject.getString("platformCouponNewEntranceDegrade"))) {
                z = false;
            }
            i.a(C, jSONObject2, z);
            if (a.a().j() == null) {
                return;
            }
            a.a().j().a("entryquanyi", new HashMap<>());
        }
    }
}
