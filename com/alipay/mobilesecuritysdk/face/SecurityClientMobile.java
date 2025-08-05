package com.alipay.mobilesecuritysdk.face;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.cju;
import tb.cjw;

/* loaded from: classes3.dex */
public class SecurityClientMobile {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static synchronized String GetApdid(Context context, Map<String, String> map) {
        synchronized (SecurityClientMobile.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("1cbb6ac2", new Object[]{context, map});
            }
            HashMap hashMap = new HashMap();
            hashMap.put("utdid", cjw.a(map, "utdid", ""));
            hashMap.put("tid", cjw.a(map, "tid", ""));
            hashMap.put("userId", cjw.a(map, "userId", ""));
            APSecuritySdk.getInstance(context).initToken(0, hashMap, null);
            return cju.a(context);
        }
    }
}
