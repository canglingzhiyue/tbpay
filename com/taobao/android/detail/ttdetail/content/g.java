package com.taobao.android.detail.ttdetail.content;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.net.URLEncoder;
import tb.fuf;
import tb.fxa;
import tb.kge;

/* loaded from: classes4.dex */
public class g extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final long DX_PARSER_DETAILURLENCODE;

    static {
        kge.a(1977343918);
        DX_PARSER_DETAILURLENCODE = fxa.a("detailUrlEncode");
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
        } catch (Throwable th) {
            com.taobao.android.detail.ttdetail.utils.i.a("DXDataParserDetailUrlEncode", "DataParser DetailUrlEncode error : ", th);
            return "";
        }
    }
}
