package com.taobao.android.order.core.dinamicX.parser;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.Map;
import tb.fuf;
import tb.gbg;
import tb.hzy;
import tb.iaa;
import tb.ibm;
import tb.kge;

/* loaded from: classes6.dex */
public class e extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_GETSCREENHEIGHT = -2819398366088431864L;

    /* renamed from: a  reason: collision with root package name */
    private final String f14612a = "DXDataParserGetScreenHeight";

    static {
        kge.a(-1342403578);
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        Context m = dXRuntimeContext.m();
        if (m == null) {
            return "0";
        }
        try {
            int a2 = (int) gbg.a(m, ibm.a(m));
            hzy.a("DXDataParserGetScreenHeight", "ScreenHeightDp = " + a2, new String[0]);
            return String.valueOf(a2);
        } catch (Throwable th) {
            iaa.a(m, "DXDataParserGetScreenHeight", "get screenHeight error = " + th.toString(), (Map<String, String>) null);
            return 0;
        }
    }
}
