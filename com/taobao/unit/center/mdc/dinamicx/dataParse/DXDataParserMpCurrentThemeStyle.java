package com.taobao.unit.center.mdc.dinamicx.dataParse;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.tbtheme.kit.j;
import tb.fuf;
import tb.kge;

/* loaded from: classes9.dex */
public class DXDataParserMpCurrentThemeStyle extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_MPCURRENTTHEMESTYLE = -3951641106224964137L;

    static {
        kge.a(-707091462);
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr != null && objArr.length != 0) {
            try {
                if ("1".equals(j.a().b("mytaobao").naviStyle)) {
                    i = 0;
                }
                return Integer.valueOf(i);
            } catch (Throwable unused) {
            }
        }
        return null;
    }
}
