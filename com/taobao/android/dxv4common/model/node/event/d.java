package com.taobao.android.dxv4common.model.node.event;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.bn;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dxv4common.exception.DXEventException;
import java.util.HashMap;
import tb.ggz;
import tb.ghe;
import tb.kge;

/* loaded from: classes5.dex */
public class d extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public long f12245a;
    public int b;

    static {
        kge.a(-209551929);
    }

    public d(long j, int i) {
        this.b = -1;
        this.f12245a = j;
        this.b = i;
        this.eventType = (byte) 2;
    }

    @Override // tb.gfn
    public boolean executeEvent(DXEvent dXEvent, DXRuntimeContext dXRuntimeContext) {
        bn a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e2a1a4e3", new Object[]{this, dXEvent, dXRuntimeContext})).booleanValue();
        }
        if (dXRuntimeContext == null || (a2 = dXRuntimeContext.a(this.f12245a)) == null) {
            return false;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(ghe.EXTRA_PARAMS_EVENT, dXEvent);
        if (this.b >= 0) {
            ggz.a exeExprWithIndex = exeExprWithIndex(dXRuntimeContext.d(), this.b, hashMap);
            if (exeExprWithIndex != null && exeExprWithIndex.f28327a) {
                if (exeExprWithIndex.c.n()) {
                    a2.handleEvent(dXEvent, exeExprWithIndex.c.o().toArray(), dXRuntimeContext);
                } else {
                    a2.handleEvent(dXEvent, null, dXRuntimeContext);
                }
                return true;
            }
            throw new DXEventException("执行事件失败: " + this.f12245a);
        }
        a2.handleEvent(dXEvent, null, dXRuntimeContext);
        return true;
    }
}
