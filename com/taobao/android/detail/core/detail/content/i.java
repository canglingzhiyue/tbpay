package com.taobao.android.detail.core.detail.content;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import tb.emu;
import tb.fuf;
import tb.kge;

/* loaded from: classes4.dex */
public class i extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_DETAILURLENCODE = -8818982858860180733L;

    /* renamed from: a  reason: collision with root package name */
    private static final String f9452a;

    static {
        kge.a(-1153230040);
        f9452a = i.class.getSimpleName();
    }

    public i() {
        emu.a("com.taobao.android.detail.core.detail.content.DXDataParserDetailUrlEncode");
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
        try {
            return (objArr[0] == null || !(objArr[0] instanceof String)) ? "" : URLEncoder.encode((String) objArr[0], "UTF-8");
        } catch (UnsupportedEncodingException e) {
            String str = f9452a;
            com.taobao.android.detail.core.utils.i.d(str, "DataParser DetailUrlEncode error : " + e.toString());
            return "";
        }
    }
}
