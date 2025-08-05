package com.taobao.unit.center.mdc.dinamicx.dataParse;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.festival.FestivalMgr;
import tb.fuf;
import tb.kge;

/* loaded from: classes9.dex */
public class DXDataParserMpCurrentThemeStatus extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_MPCURRENTTHEMESTATUS = -8436613677671194293L;

    static {
        kge.a(-445705527);
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        try {
            if (FestivalMgr.a().f()) {
                return 2;
            }
            if (FestivalMgr.a().d()) {
                return 1;
            }
            return 0;
        } catch (Throwable unused) {
            return null;
        }
    }
}
