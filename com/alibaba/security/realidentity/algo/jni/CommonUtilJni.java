package com.alibaba.security.realidentity.algo.jni;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class CommonUtilJni {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public native void bh(int i, String str);

    public native String dp(byte[] bArr, int i);

    public native byte[] dumpBh(boolean z);

    public native byte[] genKeyToken(String str);

    public native byte[] genVersionTag(String str, String str2, String str3);

    public native void initToken(String str);

    public native byte[] makeResult(byte[] bArr, String str, String str2);

    public native byte[] makeStrResult(String str);
}
