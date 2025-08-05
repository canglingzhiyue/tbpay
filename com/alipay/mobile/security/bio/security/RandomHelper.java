package com.alipay.mobile.security.bio.security;

import com.android.alibaba.ip.runtime.IpChange;
import java.security.SecureRandom;

/* loaded from: classes3.dex */
public class RandomHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static byte[] random(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("9b8b7384", new Object[]{new Integer(i)});
        }
        if (i <= 0) {
            throw new IllegalArgumentException("number can not below zero");
        }
        byte[] bArr = new byte[i];
        new SecureRandom().nextBytes(bArr);
        return bArr;
    }
}
