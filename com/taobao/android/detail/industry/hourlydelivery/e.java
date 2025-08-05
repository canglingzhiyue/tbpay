package com.taobao.android.detail.industry.hourlydelivery;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.Map;
import tb.fuf;
import tb.kge;

/* loaded from: classes4.dex */
public class e extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_HOURCITYINFOCALLBACK = -4474181924392604412L;

    /* renamed from: a  reason: collision with root package name */
    private a f10095a;

    /* loaded from: classes4.dex */
    public interface a {
        void a(Map map);
    }

    static {
        kge.a(2144174563);
    }

    public e(a aVar) {
        this.f10095a = aVar;
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr != null && objArr.length > 0 && (objArr[0] instanceof Map) && (aVar = this.f10095a) != null) {
            aVar.a((Map) objArr[0]);
        }
        return null;
    }
}
