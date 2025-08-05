package com.taobao.unit.center.mdc.dinamicx.dataParse;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import tb.fuf;
import tb.kge;

/* loaded from: classes9.dex */
public class DXDataParserMpWidgetSupported extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_MPWIDGETSUPPORTED = -6683306849755808744L;

    static {
        kge.a(1457094979);
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length == 0) {
            return null;
        }
        if ((objArr[0] instanceof String) && "MsgVideoPlayer".equals((String) objArr[0])) {
            return true;
        }
        return false;
    }
}
