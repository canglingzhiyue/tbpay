package com.taobao.android.order.core.dinamicX.parser;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import tb.fuf;
import tb.kge;

/* loaded from: classes6.dex */
public class j extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_SPLITSTRING = -6526178989024258130L;

    static {
        kge.a(852352808);
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length < 3) {
            return null;
        }
        Object obj = objArr[0];
        if (!(obj instanceof String)) {
            return null;
        }
        Object obj2 = objArr[1];
        if (!(obj2 instanceof String)) {
            return null;
        }
        String str = (String) objArr[2];
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = ((String) obj).split((String) obj2);
        if (Integer.parseInt(str) < split.length) {
            return split[Integer.parseInt(str)];
        }
        return null;
    }
}
