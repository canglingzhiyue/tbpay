package com.android.dingtalk.share.ddsharemodule.plugin;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.dingtalk.share.ddsharemodule.algorithm.MD5;
import tb.kge;

/* loaded from: classes3.dex */
public class SignatureCheck {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-207169855);
    }

    public static String getMD5Signature(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("12e13a85", new Object[]{context, str});
        }
        Signature[] rawSignature = getRawSignature(context, str);
        if (rawSignature == null || rawSignature.length == 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (Signature signature : rawSignature) {
            stringBuffer.append(MD5.getMessageDigest(signature.toByteArray()));
        }
        return stringBuffer.toString();
    }

    private static Signature[] getRawSignature(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Signature[]) ipChange.ipc$dispatch("8a8e40fd", new Object[]{context, str});
        }
        if (str != null && str.length() != 0 && context != null) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 64);
                if (packageInfo != null) {
                    return packageInfo.signatures;
                }
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return null;
    }
}
