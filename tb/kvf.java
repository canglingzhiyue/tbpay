package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.h;
import com.taobao.homepage.utils.j;
import com.taobao.tao.topmultitab.c;

/* loaded from: classes.dex */
public class kvf extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_HTABCLICK = 9099102174121718126L;

    static {
        kge.a(1464863125);
    }

    public static /* synthetic */ Object ipc$super(kvf kvfVar, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void a(kvf kvfVar, DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebaa3b23", new Object[]{kvfVar, dXEvent, objArr, dXRuntimeContext});
        } else {
            kvfVar.a(dXEvent, objArr, dXRuntimeContext);
        }
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
    public void handleEvent(final DXEvent dXEvent, final Object[] objArr, final DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else {
            j.a(dXRuntimeContext.m(), new j.a() { // from class: tb.kvf.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.homepage.utils.j.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        kvf.a(kvf.this, dXEvent, objArr, dXRuntimeContext);
                    }
                }
            });
        }
    }

    private void a(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dd72af8", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (objArr == null || objArr.length == 0 || !(objArr[0] instanceof JSONObject)) {
        } else {
            JSONObject jSONObject = (JSONObject) objArr[0];
            kss.b(dXRuntimeContext.e(), jSONObject);
            c.a().c(jSONObject);
        }
    }
}
