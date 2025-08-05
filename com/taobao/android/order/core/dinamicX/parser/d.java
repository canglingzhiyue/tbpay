package com.taobao.android.order.core.dinamicX.parser;

import android.app.Activity;
import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import tb.fuf;
import tb.kge;

/* loaded from: classes6.dex */
public class d extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_GETPAGEURL = -1385689482872492294L;

    static {
        kge.a(-1050880723);
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        Intent intent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (dXRuntimeContext != null && (dXRuntimeContext.m() instanceof Activity) && (intent = ((Activity) dXRuntimeContext.m()).getIntent()) != null && intent.getData() != null) {
            return intent.getData().toString();
        }
        return null;
    }
}
