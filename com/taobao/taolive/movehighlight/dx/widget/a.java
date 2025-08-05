package com.taobao.taolive.movehighlight.dx.widget;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.taolive.sdk.utils.l;
import tb.fuf;
import tb.kge;
import tb.pmd;

/* loaded from: classes8.dex */
public class a extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_HIGHLIGHTABCONFIG = 6406211530535040674L;

    static {
        kge.a(1894027210);
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
        if (objArr.length > 2) {
            String obj = objArr[0].toString();
            String obj2 = objArr[1].toString();
            String obj3 = objArr[2].toString();
            if (pmd.a().d() != null && l.d(pmd.a().d().a("tblive", obj, "true")) && pmd.a().t() != null) {
                return Boolean.valueOf(l.d(pmd.a().t().a("taolive", obj, obj2, obj3)));
            }
        }
        return false;
    }
}
