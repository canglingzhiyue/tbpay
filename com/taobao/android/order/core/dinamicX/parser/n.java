package com.taobao.android.order.core.dinamicX.parser;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import tb.fuf;
import tb.kge;
import tb.rrv;

/* loaded from: classes6.dex */
public class n extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_ULTRONLOCALDATA = 1578205113308587288L;

    static {
        kge.a(1482015998);
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        Context i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr != null && objArr.length != 0 && (i = DinamicXEngine.i()) != null && (objArr[0] instanceof String)) {
            if (rrv.APDIDTOKEN.equals(objArr[0])) {
                try {
                    return APSecuritySdk.getInstance(i).getTokenResult().apdidToken;
                } catch (Exception unused) {
                    return null;
                }
            } else if ("websiteLanguage".equals(objArr[0])) {
                try {
                    return i.getResources().getConfiguration().locale.toString();
                } catch (Exception unused2) {
                }
            }
        }
        return null;
    }
}
