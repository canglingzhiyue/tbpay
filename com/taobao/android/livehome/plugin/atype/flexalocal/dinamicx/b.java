package com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import tb.fuf;
import tb.gbg;
import tb.kge;
import tb.sdt;

/* loaded from: classes6.dex */
public class b extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_TBLVIPADSCREENSIZE = 6916119436215133091L;

    static {
        kge.a(1477725445);
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (dXRuntimeContext != null && objArr != null && objArr.length != 0 && (objArr[0] instanceof String) && (dXRuntimeContext.m() instanceof Activity)) {
            String str = (String) objArr[0];
            if (com.taobao.android.livehome.plugin.atype.flexalocal.utils.l.a((CharSequence) str)) {
                return null;
            }
            if ("width".equals(str)) {
                return Float.valueOf(gbg.a(dXRuntimeContext.m(), com.taobao.android.autosize.h.a().a(dXRuntimeContext.m())));
            }
            if ("height".equals(str)) {
                int a2 = com.taobao.android.livehome.plugin.atype.flexalocal.utils.c.a((Activity) dXRuntimeContext.m());
                if (com.taobao.android.livehome.plugin.atype.flexalocal.utils.i.M()) {
                    a2 = com.taobao.android.livehome.plugin.atype.flexalocal.utils.c.a((Activity) dXRuntimeContext.m()) - sdt.f;
                }
                return Float.valueOf(gbg.a(dXRuntimeContext.m(), a2));
            }
        }
        return null;
    }
}
