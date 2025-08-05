package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.event.DXScrollEvent;
import com.taobao.android.dinamicx.expression.event.DXViewEvent;
import com.taobao.android.dinamicx.h;
import com.taobao.android.home.component.utils.e;
import com.taobao.android.home.component.utils.k;

/* loaded from: classes.dex */
public class kvn extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_SCROLLEXPOSE = -4629410644348754929L;

    static {
        kge.a(-1288770697);
    }

    public static /* synthetic */ Object ipc$super(kvn kvnVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        int measuredWidth;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (objArr == null || objArr.length < 3 || !(objArr[0] instanceof JSONObject) || !(objArr[1] instanceof String) || !(objArr[2] instanceof String)) {
        } else {
            JSONObject jSONObject = (JSONObject) objArr[0];
            String str = (String) objArr[1];
            String str2 = (String) objArr[2];
            if (dXRuntimeContext == null) {
                return;
            }
            try {
                float a2 = gbg.a(dXRuntimeContext.D(), dXRuntimeContext.m(), Float.valueOf(str).floatValue());
                float a3 = gbg.a(dXRuntimeContext.D(), dXRuntimeContext.m(), Float.valueOf(str2).floatValue());
                float f = 0.0f;
                if (dXEvent instanceof DXScrollEvent) {
                    DXScrollEvent dXScrollEvent = (DXScrollEvent) dXEvent;
                    measuredWidth = dXScrollEvent.getScrollerSize().f11827a + dXScrollEvent.getOffsetX();
                } else {
                    if (dXEvent instanceof DXViewEvent) {
                        measuredWidth = dXRuntimeContext.d().getMeasuredWidth();
                    }
                    a(jSONObject, f - a3, a2, dXRuntimeContext.m());
                }
                f = measuredWidth;
                a(jSONObject, f - a3, a2, dXRuntimeContext.m());
            } catch (Throwable th) {
                e.e("DXScrollExposeEventHandler", th.getMessage());
            }
        }
    }

    private void a(JSONObject jSONObject, float f, float f2, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fc8a340", new Object[]{this, jSONObject, new Float(f), new Float(f2), context});
        } else if (f2 > 0.0f && jSONObject != null) {
            int ceil = (int) Math.ceil(f / f2);
            for (int i = 0; i < ceil; i++) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(String.valueOf(i));
                if (jSONObject2 != null) {
                    k.a(jSONObject2, context);
                    if (jqm.a()) {
                        e.b("DXScrollExposeEventHandler", "expose position = " + i);
                    }
                }
            }
        }
    }
}
