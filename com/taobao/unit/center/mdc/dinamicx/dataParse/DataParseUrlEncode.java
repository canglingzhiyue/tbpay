package com.taobao.unit.center.mdc.dinamicx.dataParse;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import tb.fut;
import tb.kge;

/* loaded from: classes9.dex */
public class DataParseUrlEncode implements fut {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1602931261);
        kge.a(1343895002);
    }

    @Override // tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length != 1) {
            return null;
        }
        String str = "" + objArr[0];
        try {
            return URLEncoder.encode(str, "utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return str;
        }
    }
}
