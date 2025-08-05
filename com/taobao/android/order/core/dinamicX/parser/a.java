package com.taobao.android.order.core.dinamicX.parser;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import tb.fuf;
import tb.kge;

/* loaded from: classes6.dex */
public class a extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_GETCURRENTINDEX = -2979630098055998166L;

    static {
        kge.a(2113752620);
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext}) : (objArr == null || objArr.length == 0) ? null : 0;
    }
}
