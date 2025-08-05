package com.taobao.unit.center.mdc.dinamicx.dataParse;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.message.uikit.util.DisplayUtil;
import tb.fuf;
import tb.kge;

/* loaded from: classes9.dex */
public class DXDataParserMpGetStatusBarHeight extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_MPGETSTATUSBARHEIGHT = -884601719778523901L;

    static {
        kge.a(383219705);
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        try {
            i = DisplayUtil.px2dip(dXRuntimeContext.m(), DisplayUtil.getStatusBarHeight(dXRuntimeContext.m()));
        } catch (Throwable unused) {
        }
        return Integer.valueOf(i);
    }
}
