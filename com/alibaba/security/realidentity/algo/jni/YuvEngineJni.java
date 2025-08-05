package com.alibaba.security.realidentity.algo.jni;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class YuvEngineJni {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public native void Nv21ToI420(long j, byte[] bArr, byte[] bArr2, int i, int i2);

    public native void Nv21ToNv12(long j, byte[] bArr, byte[] bArr2, int i, int i2);

    public native void Nv21ToYV12(long j, byte[] bArr, byte[] bArr2, int i, int i2);

    public native long startYuvEngine();

    public native void stopYuvEngine(long j);
}
