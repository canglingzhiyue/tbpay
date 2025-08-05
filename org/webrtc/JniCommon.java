package org.webrtc;

import com.android.alibaba.ip.runtime.IpChange;
import java.nio.ByteBuffer;
import tb.kge;

/* loaded from: classes9.dex */
public class JniCommon {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2056515737);
    }

    public static native void nativeAddRef(long j);

    public static native ByteBuffer nativeAllocateByteBuffer(int i);

    public static native void nativeFreeByteBuffer(ByteBuffer byteBuffer);

    public static native void nativeReleaseRef(long j);
}
