package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.live.plugin.atype.flexalocal.good.a;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c;
import java.util.HashMap;

/* loaded from: classes5.dex */
public class hhp extends iot {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_TLOPENINTERACTIVECOMPONENT = -43294902442974275L;

    static {
        kge.a(-703079594);
    }

    public static /* synthetic */ Object ipc$super(hhp hhpVar, String str, Object... objArr) {
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
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cc53e1f", new Object[]{this, dXEvent, objArr, dXRuntimeContext, cVar});
        } else if (objArr == null || objArr.length <= 2 || !(objArr[0] instanceof String) || !(objArr[1] instanceof String) || !(objArr[2] instanceof JSONObject)) {
        } else {
            Context m = dXRuntimeContext.m();
            String str = (String) objArr[0];
            String str2 = (String) objArr[1];
            JSONObject jSONObject = (JSONObject) objArr[2];
            if (a.a().i() == null) {
                return;
            }
            a.a().i().a(cVar == null ? null : cVar.C(), m, str, str2, jSONObject);
            HashMap<String, String> hashMap = new HashMap<>();
            if (jSONObject != null) {
                hashMap.put("surpriseData", jSONObject.toJSONString());
                hashMap.put("dxAction", str);
                hashMap.put("componentName", str2);
            }
            if (a.a().j() == null) {
                return;
            }
            a.a().j().a("interactivelayeraction", hashMap);
        }
    }
}
