package com.taobao.android.dxv4common.model.node.event;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.bn;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dxv4common.exception.DXEventException;
import java.util.HashMap;
import tb.fxa;
import tb.ggz;
import tb.ghe;
import tb.kge;

/* loaded from: classes5.dex */
public class c extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f12244a;
    public int b;

    static {
        kge.a(103583196);
    }

    public c(int i, int i2) {
        this.f12244a = i;
        this.b = i2;
        this.eventType = (byte) 3;
    }

    @Override // tb.gfn
    public boolean executeEvent(DXEvent dXEvent, DXRuntimeContext dXRuntimeContext) {
        long x;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e2a1a4e3", new Object[]{this, dXEvent, dXRuntimeContext})).booleanValue();
        }
        if (dXRuntimeContext != null && dXRuntimeContext.d() != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(ghe.EXTRA_PARAMS_EVENT, dXEvent);
            ggz.a exeExprWithIndex = exeExprWithIndex(dXRuntimeContext.d(), this.f12244a, hashMap);
            if (exeExprWithIndex != null && exeExprWithIndex.f28327a) {
                if (exeExprWithIndex.c.k()) {
                    x = fxa.a(exeExprWithIndex.c.m());
                } else {
                    x = exeExprWithIndex.c.x();
                }
                bn a2 = dXRuntimeContext.a(x);
                if (a2 == null) {
                    return false;
                }
                if (this.b >= 0) {
                    ggz.a exeExprWithIndex2 = exeExprWithIndex(dXRuntimeContext.d(), this.b, hashMap);
                    if (exeExprWithIndex2 != null && exeExprWithIndex2.f28327a) {
                        if (exeExprWithIndex2.c.n()) {
                            a2.handleEvent(dXEvent, exeExprWithIndex2.c.o().toArray(), dXRuntimeContext);
                        } else {
                            a2.handleEvent(dXEvent, null, dXRuntimeContext);
                        }
                        return true;
                    }
                    throw new DXEventException("执行事件失败: " + x);
                }
                a2.handleEvent(dXEvent, null, dXRuntimeContext);
                return true;
            }
        }
        return false;
    }
}
