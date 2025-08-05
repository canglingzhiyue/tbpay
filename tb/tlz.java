package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.h;
import com.taobao.themis.kernel.container.ui.titlebar.c;

/* loaded from: classes9.dex */
public class tlz extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_HTAP = 34696035233L;

    /* renamed from: a  reason: collision with root package name */
    private c.a f34205a;

    static {
        kge.a(1947841851);
    }

    public static /* synthetic */ Object ipc$super(tlz tlzVar, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public void a(c.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5e0c39a", new Object[]{this, aVar});
        } else {
            this.f34205a = aVar;
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
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        int intValue;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (objArr == null) {
        } else {
            try {
                if (objArr.length <= 0) {
                    return;
                }
                Object obj = objArr[0];
                if (obj instanceof Integer) {
                    intValue = ((Integer) obj).intValue();
                } else {
                    intValue = ((Long) obj).intValue();
                }
                if (this.f34205a == null) {
                    return;
                }
                this.f34205a.a(intValue);
            } catch (Exception unused) {
            }
        }
    }
}
