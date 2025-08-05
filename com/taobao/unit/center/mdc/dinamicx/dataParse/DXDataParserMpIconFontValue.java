package com.taobao.unit.center.mdc.dinamicx.dataParse;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import kotlin.Metadata;
import kotlin.collections.g;
import tb.fut;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J+\u0010\b\u001a\u0004\u0018\u00010\t2\u0010\u0010\n\u001a\f\u0012\u0006\b\u0001\u0012\u00020\t\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0002\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/taobao/unit/center/mdc/dinamicx/dataParse/DXDataParserMpIconFontValue;", "Lcom/taobao/android/dinamicx/expression/parser/IDXDataParser;", "()V", "mProxy", "getMProxy", "()Lcom/taobao/android/dinamicx/expression/parser/IDXDataParser;", "setMProxy", "(Lcom/taobao/android/dinamicx/expression/parser/IDXDataParser;)V", "evalWithArgs", "", "operationList", "", "runtimeParam", "Lcom/taobao/android/dinamicx/DXRuntimeContext;", "([Ljava/lang/Object;Lcom/taobao/android/dinamicx/DXRuntimeContext;)Ljava/lang/Object;", "message_base_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes9.dex */
public final class DXDataParserMpIconFontValue implements fut {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final DXDataParserMpIconFontValue INSTANCE;
    private static fut mProxy;

    static {
        kge.a(-1155092830);
        kge.a(1343895002);
        INSTANCE = new DXDataParserMpIconFontValue();
    }

    private DXDataParserMpIconFontValue() {
    }

    public final fut getMProxy() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fut) ipChange.ipc$dispatch("b11475e3", new Object[]{this}) : mProxy;
    }

    public final void setMProxy(fut futVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("205b40d5", new Object[]{this, futVar});
        } else {
            mProxy = futVar;
        }
    }

    @Override // tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        Object evalWithArgs;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        fut futVar = mProxy;
        if (futVar != null && (evalWithArgs = futVar.evalWithArgs(objArr, dXRuntimeContext)) != null) {
            return evalWithArgs;
        }
        Object a2 = objArr != null ? g.a(objArr, 0) : null;
        if (!(a2 instanceof String)) {
            a2 = null;
        }
        return (String) a2;
    }
}
