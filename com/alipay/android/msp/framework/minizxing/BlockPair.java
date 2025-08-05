package com.alipay.android.msp.framework.minizxing;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public final class BlockPair {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f4798a;
    private final byte[] b;

    public BlockPair(byte[] bArr, byte[] bArr2) {
        this.b = bArr;
        this.f4798a = bArr2;
    }

    public final byte[] getDataBytes() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("370463eb", new Object[]{this}) : this.b;
    }

    public final byte[] getErrorCorrectionBytes() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("6e39051b", new Object[]{this}) : this.f4798a;
    }
}
