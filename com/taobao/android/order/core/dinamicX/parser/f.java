package com.taobao.android.order.core.dinamicX.parser;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import tb.fuf;
import tb.kge;

/* loaded from: classes6.dex */
public class f extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_OBJECTTOJSONSTR = 5632889263478863900L;

    static {
        kge.a(184555916);
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr != null && objArr.length != 0) {
            try {
                return JSON.toJSONString(objArr[0]);
            } catch (Throwable unused) {
            }
        }
        return null;
    }
}
