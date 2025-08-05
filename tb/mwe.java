package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.event.DXPageChangeEvent;
import com.taobao.android.dinamicx.h;

/* loaded from: classes7.dex */
public class mwe extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_ONMTBEQUITYSLIDERFINISH = -5998667899133847972L;

    /* renamed from: a  reason: collision with root package name */
    private final mvx f31296a;

    static {
        kge.a(-2038931873);
    }

    public static /* synthetic */ Object ipc$super(mwe mweVar, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public mwe(mvx mvxVar) {
        this.f31296a = mvxVar;
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
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (dXRuntimeContext == null || !(objArr[0] instanceof String)) {
        } else {
            if ("write".equals(String.valueOf(objArr[0])) && objArr.length >= 4) {
                this.f31296a.a((String) objArr[1], (String) objArr[2], (String) objArr[3]);
            }
            if (!(dXEvent instanceof DXPageChangeEvent)) {
                return;
            }
            try {
                i = Integer.parseInt((String) objArr[0]);
            } catch (Exception unused) {
            }
            if (((DXPageChangeEvent) dXEvent).pageIndex != i - 1) {
                return;
            }
            final View v = dXRuntimeContext.v();
            v.postDelayed(new Runnable() { // from class: tb.mwe.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        v.setVisibility(8);
                    }
                }
            }, 150L);
        }
    }
}
