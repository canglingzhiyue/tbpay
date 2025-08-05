package com.taobao.taolive.dinamicext.dinamicx;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import tb.fuf;
import tb.kge;

/* loaded from: classes8.dex */
public class a extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_TBLDEVICELEVEL = 8091045872268060824L;

    static {
        kge.a(1045811178);
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        int a2 = com.taobao.application.common.c.a().a("deviceLevel", -1);
        if (a2 > 0) {
            a2++;
        }
        return String.valueOf(a2);
    }
}
