package com.taobao.android.order.core.dinamicX.parser;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import tb.fuf;
import tb.kge;
import tb.tey;

/* loaded from: classes6.dex */
public class s extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_GETIMAGEBIZINFO = -7208833668935909149L;

    static {
        kge.a(1165665753);
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        Object d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr != null && objArr.length != 0) {
            Context m = dXRuntimeContext.m();
            if ((m instanceof tey) && (d = ((tey) m).d("isOLFirstScreen")) != null && ((Boolean) d).booleanValue()) {
                try {
                    String str = (String) objArr[0];
                    if ("bizId".equals(str)) {
                        return "66001";
                    }
                    if ("bizType".equals(str)) {
                        return "orderlist_001";
                    }
                } catch (Exception unused) {
                }
            }
        }
        return "0";
    }
}
