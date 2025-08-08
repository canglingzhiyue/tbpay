package com.taobao.android.order.core.dinamicX.parser;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import tb.fuf;
import tb.kge;

/* loaded from: classes6.dex */
public class q extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long MTOP_RETMSGDATA_PARSER = 6381452121775884442L;

    static {
        kge.a(-1375899593);
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length == 0 || !(objArr[0] instanceof String)) {
            return null;
        }
        String str = (String) objArr[0];
        if (!StringUtils.isEmpty(str) && (split = str.split("::")) != null && split.length > 1) {
            return split[split.length - 1];
        }
        return null;
    }
}
