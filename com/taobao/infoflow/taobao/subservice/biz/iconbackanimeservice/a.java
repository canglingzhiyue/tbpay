package com.taobao.infoflow.taobao.subservice.biz.iconbackanimeservice;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.infoflow.protocol.subservice.biz.IIconService;
import tb.fuf;
import tb.kge;
import tb.lfq;
import tb.ljs;

/* loaded from: classes7.dex */
public class a extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_HICONPAGENUM = 7875544783591054506L;

    static {
        kge.a(1305810636);
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IIconService iIconService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        ljs a2 = lfq.a(dXRuntimeContext);
        if (a2 != null && (iIconService = (IIconService) a2.a(IIconService.class)) != null) {
            return Integer.valueOf(iIconService.getPageIndex());
        }
        return 0;
    }
}
