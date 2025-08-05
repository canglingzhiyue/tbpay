package com.taobao.taolive.dinamicext.dinamicx;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import tb.fuf;
import tb.kge;
import tb.pro;

/* loaded from: classes8.dex */
public class b extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_TBLTIMEFOMAT = -2434729127661136172L;

    static {
        kge.a(777672840);
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr != null && objArr.length >= 2) {
            return new SimpleDateFormat((String) objArr[0], Locale.getDefault()).format(new Date(pro.b((String) objArr[1])));
        }
        return null;
    }
}
