package com.taobao.android.order.core.dinamicX.parser;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import tb.fuf;
import tb.kge;

/* loaded from: classes6.dex */
public class k extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_STRTOJSONOBJECT = 6340342113390734364L;

    static {
        kge.a(1384155344);
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr != null && objArr.length != 0) {
            String str = (String) objArr[0];
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            try {
                return JSON.parse(str);
            } catch (Throwable unused) {
            }
        }
        return null;
    }
}
