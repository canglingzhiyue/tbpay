package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.event.DXScrollEvent;
import com.taobao.android.dinamicx.h;
import java.util.Map;

/* loaded from: classes5.dex */
public class taj extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final long DX_EVENT_DETAILSKUSCROLLED;
    public static final long DX_EVENT_ID;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, Integer> f33986a;

    public static /* synthetic */ Object ipc$super(taj tajVar, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(1833153470);
        long a2 = fxa.a("detailSKUScrolled");
        DX_EVENT_ID = a2;
        DX_EVENT_DETAILSKUSCROLLED = a2;
    }

    public taj(Map<String, Integer> map) {
        this.f33986a = map;
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
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (this.f33986a == null || dXRuntimeContext == null || dXRuntimeContext.m() == null || objArr == null || objArr.length <= 0 || objArr[0] == null) {
        } else {
            String obj = objArr[0].toString();
            if (TextUtils.isEmpty(obj) || !(dXEvent instanceof DXScrollEvent)) {
                return;
            }
            this.f33986a.put(obj, Integer.valueOf(gbg.c(dXRuntimeContext.m(), ((DXScrollEvent) dXEvent).getOffsetX())));
        }
    }
}
