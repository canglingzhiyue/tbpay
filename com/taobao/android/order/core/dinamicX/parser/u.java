package com.taobao.android.order.core.dinamicX.parser;

import android.app.Activity;
import android.content.Intent;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.net.URLDecoder;
import tb.fuf;
import tb.kge;

/* loaded from: classes6.dex */
public class u extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_PARAMINPAGEURL = -4690200579901030266L;

    static {
        kge.a(246357233);
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        Intent intent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr != null && objArr.length != 0 && dXRuntimeContext != null && (dXRuntimeContext.m() instanceof Activity) && (intent = ((Activity) dXRuntimeContext.m()).getIntent()) != null && intent.getData() != null) {
            try {
                String queryParameter = intent.getData().getQueryParameter((String) objArr[0]);
                if (!StringUtils.isEmpty(queryParameter)) {
                    return URLDecoder.decode(queryParameter, "UTF-8");
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }
}
