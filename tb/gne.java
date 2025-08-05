package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.h;
import java.util.Map;

/* loaded from: classes5.dex */
public class gne extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_GO_BACK = "goBack";

    static {
        kge.a(538841857);
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        Object obj;
        bbz bbzVar;
        Activity m;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (dXRuntimeContext == null || dXRuntimeContext.a() == null || !(dXRuntimeContext.a() instanceof Map) || (obj = ((Map) dXRuntimeContext.a()).get("ViewEngine")) == null || !(obj instanceof bny) || (bbzVar = (bbz) ((bny) obj).a(bbz.class)) == null || (m = bbzVar.m()) == null) {
        } else {
            m.finish();
        }
    }
}
