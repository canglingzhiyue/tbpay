package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.ba;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.h;

/* loaded from: classes8.dex */
public abstract class sig extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-827549724);
    }

    public abstract void a(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext, a aVar);

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
            return;
        }
        a a2 = a(dXRuntimeContext, getClass().getSimpleName());
        Log.e("AbstractGoodDXHandler", "handleEvent | className=" + getClass().getSimpleName());
        a(dXEvent, objArr, dXRuntimeContext, a2);
    }

    private static a a(DXRuntimeContext dXRuntimeContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("2cded998", new Object[]{dXRuntimeContext, str});
        }
        if (dXRuntimeContext == null) {
            return null;
        }
        ba b = dXRuntimeContext.b();
        if (b instanceof quf) {
            return ((quf) b).a();
        }
        Log.e("AbstractGoodDXHandler", "getContextFromDX | no_match, className=" + str);
        return null;
    }
}
