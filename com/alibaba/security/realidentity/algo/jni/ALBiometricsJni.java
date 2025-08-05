package com.alibaba.security.realidentity.algo.jni;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class ALBiometricsJni {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public native int changeDetectTypeJni(int i, boolean z);

    public native int doDetectContinueJni(byte[] bArr, float[] fArr, int[] iArr, byte[][] bArr2, String str, String str2);

    public native int doDetectJni(byte[] bArr, boolean[] zArr, float[] fArr, int[] iArr, long[] jArr, byte[][] bArr2, byte[][] bArr3, String str, String str2);

    public native int init(int i, int i2, int i3, String str, String str2, String str3, String str4, String str5, int i4);

    public native boolean isEnabled();

    public native int release();

    public native int reset(boolean z);

    public native int setParameter(int i, float f);
}
