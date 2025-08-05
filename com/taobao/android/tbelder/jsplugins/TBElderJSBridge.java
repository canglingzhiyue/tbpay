package com.taobao.android.tbelder.jsplugins;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tbelder.b;

/* loaded from: classes6.dex */
public class TBElderJSBridge extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String METHOD_GET_ELDER_FLAGS = "getElderFlags";
    public static final String NAME = "TBElder";

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (str == null || !METHOD_GET_ELDER_FLAGS.equals(str)) {
            return false;
        }
        r rVar = new r("HY_SUCCESS");
        rVar.a("isElderHome", Boolean.valueOf(b.b()));
        rVar.a("isElderFont", Boolean.valueOf(b.c()));
        wVCallBackContext.success(rVar);
        return true;
    }
}
