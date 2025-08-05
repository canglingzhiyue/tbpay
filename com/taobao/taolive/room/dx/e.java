package com.taobao.taolive.room.dx;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.taolive.room.utils.n;
import java.util.Arrays;
import tb.ddw;
import tb.kge;
import tb.pmd;
import tb.qmv;

/* loaded from: classes8.dex */
public class e extends com.taobao.android.dinamicx.h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_TBLGTAP = 5360605235400031797L;

    static {
        kge.a(-1034824645);
    }

    public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
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
            return;
        }
        pmd.a().m().a("handleEvent", Arrays.toString(objArr));
        if (objArr == null || objArr.length < 2) {
            return;
        }
        if (!"event".equals(objArr[0]) && !"custom".equals(objArr[0])) {
            return;
        }
        ddw a2 = ddw.a();
        if (dXRuntimeContext != null) {
            i = dXRuntimeContext.i();
        }
        a2.a("com.taobao.taolive.room.dxmanager.event", new qmv.a(objArr, i), n.c());
    }
}
