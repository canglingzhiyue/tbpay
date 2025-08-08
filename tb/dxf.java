package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.event.DXScrollEvent;
import com.taobao.android.dinamicx.h;
import java.util.Map;

/* loaded from: classes4.dex */
public class dxf extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_DETAILSKUSCROLLED = 6859889810308447919L;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, Integer> f27061a;

    static {
        kge.a(491365558);
    }

    public static /* synthetic */ Object ipc$super(dxf dxfVar, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public dxf(Map<String, Integer> map) {
        this.f27061a = map;
        emu.a("com.taobao.android.detail.core.aura.extension.event.sku.DXDetailSKUScrolledEventHandler");
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
        } else if (this.f27061a == null || dXRuntimeContext == null || dXRuntimeContext.m() == null || objArr == null || objArr.length <= 0 || objArr[0] == null) {
        } else {
            String obj = objArr[0].toString();
            if (StringUtils.isEmpty(obj) || !(dXEvent instanceof DXScrollEvent)) {
                return;
            }
            this.f27061a.put(obj, Integer.valueOf(gbg.c(dXRuntimeContext.m(), ((DXScrollEvent) dXEvent).getOffsetX())));
        }
    }
}
