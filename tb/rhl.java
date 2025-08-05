package tb;

import android.content.Context;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.h;
import com.taobao.android.home.component.utils.e;
import com.taobao.android.home.component.utils.o;

/* loaded from: classes5.dex */
public class rhl extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_HSAVEDATA = 8511541151937722234L;

    static {
        kge.a(-548203973);
    }

    public static /* synthetic */ Object ipc$super(rhl rhlVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (!a(objArr, dXRuntimeContext)) {
        } else {
            a(dXRuntimeContext.m(), objArr);
        }
    }

    private boolean a(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad925d7e", new Object[]{this, objArr, dXRuntimeContext})).booleanValue();
        }
        if (objArr == null || objArr.length == 0) {
            e.e("HSaveDataEventHandler", "args == null || args.length == 0");
            return false;
        } else if (objArr.length % 2 != 0) {
            e.e("HSaveDataEventHandler", "args error. UnExcepted length.");
            return false;
        } else if (dXRuntimeContext != null) {
            return dXRuntimeContext.m() != null;
        } else {
            e.e("HSaveDataEventHandler", "runtimeContext == null");
            return false;
        }
    }

    private void a(Context context, Object[] objArr) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1e8ad1", new Object[]{this, context, objArr});
            return;
        }
        while (true) {
            int i2 = i + 1;
            if (i2 >= objArr.length) {
                return;
            }
            Object obj = objArr[i];
            Object obj2 = objArr[i2];
            if (!(obj instanceof String)) {
                e.e("HSaveDataEventHandler", "args error. UnExcepted type of key.");
            } else if (obj2 == null) {
                e.e("HSaveDataEventHandler", "args error. UnExcepted value is null.");
            } else {
                o.a(context, (String) obj, obj2 instanceof JSON ? ((JSON) obj2).toJSONString() : obj2.toString());
            }
            i += 2;
        }
    }
}
