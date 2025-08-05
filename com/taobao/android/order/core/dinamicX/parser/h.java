package com.taobao.android.order.core.dinamicX.parser;

import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import tb.fuf;
import tb.kge;

/* loaded from: classes6.dex */
public class h extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_ORDERURLENCODE = 811907624556400299L;

    static {
        kge.a(-581794758);
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr != null && objArr.length != 0) {
            return Uri.encode((String) objArr[0]);
        }
        return null;
    }
}
