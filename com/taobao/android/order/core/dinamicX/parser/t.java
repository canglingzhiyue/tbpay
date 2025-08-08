package com.taobao.android.order.core.dinamicX.parser;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.HashMap;
import tb.bnv;
import tb.bny;
import tb.fuf;
import tb.kge;

/* loaded from: classes6.dex */
public class t extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_ULTRON_SUBMIT_DATA = -4626671980340984670L;

    static {
        kge.a(-362704455);
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        bnv d;
        com.taobao.android.ultron.datamodel.imp.b a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (dXRuntimeContext == null) {
            return null;
        }
        Object a3 = dXRuntimeContext.a();
        if (!(a3 instanceof HashMap)) {
            return null;
        }
        Object obj = ((HashMap) a3).get("ViewEngine");
        if (!(obj instanceof bny) || (d = ((bny) obj).d()) == null || (a2 = d.a()) == null) {
            return null;
        }
        String a4 = a2.t().a(a2);
        if (!StringUtils.isEmpty(a4)) {
            return a4;
        }
        return null;
    }
}
