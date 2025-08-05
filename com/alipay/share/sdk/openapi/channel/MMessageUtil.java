package com.alipay.share.sdk.openapi.channel;

import com.alipay.share.sdk.Constant;
import com.alipay.share.sdk.openapi.algorithm.MD5;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class MMessageUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static byte[] a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("4dba22e1", new Object[]{str, str2});
        }
        StringBuffer stringBuffer = new StringBuffer();
        if (str != null) {
            stringBuffer.append(str);
        }
        stringBuffer.append(Constant.SDK_VERSION);
        stringBuffer.append(str2);
        stringBuffer.append("alipay");
        return MD5.getMessageDigest(stringBuffer.toString().substring(1, 9).getBytes()).getBytes();
    }
}
