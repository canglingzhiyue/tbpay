package com.alipay.mobile.verifyidentity.log.utils;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.util.Base64;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class EncryptUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f5880a = TriDesCBC.class.getSimpleName();
    private static String b;

    public static String generateLocalStorageDesKey(Context context) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d7a3f211", new Object[]{context});
        }
        if (StringUtils.isEmpty(b)) {
            String str2 = "";
            try {
                str2 = context.getApplicationContext().getPackageName();
                str = Base64.encodeToString(str2.getBytes(), 10);
            } catch (Throwable th) {
                VerifyLogCat.e(f5880a, th);
                str = str2;
            }
            if (StringUtils.isEmpty(str)) {
                str = "unknow";
            }
            b = (str + "0000000000000000000000000000").substring(0, 24);
        }
        return b;
    }
}
