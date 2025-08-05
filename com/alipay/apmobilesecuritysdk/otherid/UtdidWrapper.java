package com.alipay.apmobilesecuritysdk.otherid;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ckn;

/* loaded from: classes3.dex */
public class UtdidWrapper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String getUtdid(Context context) {
        try {
            return (String) Class.forName("com.ut.device.UTDevice").getMethod("getUtdid", Context.class).invoke(null, context);
        } catch (Exception e) {
            ckn.a("[-] UTDID error.");
            ckn.a(e);
            return "";
        }
    }
}
