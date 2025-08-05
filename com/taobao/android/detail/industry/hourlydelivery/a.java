package com.taobao.android.detail.industry.hourlydelivery;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.industry.hourlydelivery.c;
import com.taobao.android.dinamicx.DXRuntimeContext;
import tb.fqr;
import tb.fuf;
import tb.kge;

/* loaded from: classes4.dex */
public class a extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_HOURDELIVERYROCKETSTATUS = 6535844000612060678L;

    /* renamed from: a  reason: collision with root package name */
    private c.a f10079a;

    static {
        kge.a(1443515711);
    }

    public a(c.a aVar) {
        this.f10079a = aVar;
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr != null && objArr.length >= 2) {
            boolean a2 = fqr.a(objArr[1]);
            c.a aVar = this.f10079a;
            if (aVar != null) {
                aVar.a(false, a2);
            }
        }
        return null;
    }
}
