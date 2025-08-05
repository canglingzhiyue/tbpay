package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.event.DXScrollEvent;
import com.taobao.android.dinamicx.h;
import java.util.Map;

/* loaded from: classes6.dex */
public class ixx extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final long DX_WIDGET_ID;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, Integer> f29401a;

    static {
        kge.a(10264856);
        DX_WIDGET_ID = fxa.a("xskuOnScrolled");
    }

    public ixx(Map<String, Integer> map) {
        this.f29401a = map;
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (this.f29401a == null || dXRuntimeContext == null) {
        } else {
            Context m = dXRuntimeContext.m();
            if (!(dXEvent instanceof DXScrollEvent)) {
                return;
            }
            int offsetX = ((DXScrollEvent) dXEvent).getOffsetX();
            if (objArr == null || objArr.length <= 0 || objArr[0] == null) {
                return;
            }
            this.f29401a.put(objArr[0].toString(), Integer.valueOf(gbg.c(m, offsetX)));
        }
    }
}
