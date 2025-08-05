package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.utils.af;
import com.taobao.android.detail.ttdetail.utils.i;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.h;
import com.taobao.android.weex_framework.util.a;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class qup extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final long DX_EVENT_ID;

    /* renamed from: a  reason: collision with root package name */
    public Context f33062a;
    public eyx b;

    static {
        kge.a(1029278032);
        DX_EVENT_ID = fxa.a("xTap");
    }

    public qup(Context context, eyx eyxVar) {
        this.f33062a = context;
        this.b = eyxVar;
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (objArr == null || objArr.length <= 0) {
        } else {
            Object obj = objArr[0];
            if (!(obj instanceof JSONArray)) {
                return;
            }
            Iterator<Object> it = ((JSONArray) obj).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof JSONObject) {
                    JSONObject jSONObject = (JSONObject) next;
                    if ("false".equalsIgnoreCase(jSONObject.getString(a.ATOM_EXT_inline)) || "false".equalsIgnoreCase(jSONObject.getString("native"))) {
                        String string = jSONObject.getString("key");
                        i.a("HandleDinamicXTapEvent", "handleEvent encounter an accident with xTap key: " + string);
                    } else {
                        this.b.c().a(new com.taobao.android.detail.ttdetail.handler.event.a(jSONObject), af.a(objArr, dXRuntimeContext, this.b));
                    }
                }
            }
        }
    }
}
