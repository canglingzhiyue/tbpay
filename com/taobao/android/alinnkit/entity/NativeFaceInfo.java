package com.taobao.android.alinnkit.entity;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes4.dex */
public class NativeFaceInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final long[] f9023a;

    static {
        kge.a(-2067620694);
    }

    private static native long nativeCopyBuffer(long j, int i);

    private static native boolean nativeCopyBufferRelease(long j, int i);

    private native boolean nativeRelease(long j, int i);

    public long[] a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (long[]) ipChange.ipc$dispatch("a821217d", new Object[]{this}) : this.f9023a;
    }
}
