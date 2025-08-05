package org.webrtc;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes9.dex */
public class Histogram {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final long handle;

    static {
        kge.a(-1354870771);
    }

    private static native void nativeAddSample(long j, int i);

    private static native long nativeCreateCounts(String str, int i, int i2, int i3);

    private static native long nativeCreateEnumeration(String str, int i);

    private Histogram(long j) {
        this.handle = j;
    }

    public static Histogram createCounts(String str, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Histogram) ipChange.ipc$dispatch("5bf9fdc6", new Object[]{str, new Integer(i), new Integer(i2), new Integer(i3)}) : new Histogram(nativeCreateCounts(str, i, i2, i3));
    }

    public static Histogram createEnumeration(String str, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Histogram) ipChange.ipc$dispatch("5763d371", new Object[]{str, new Integer(i)}) : new Histogram(nativeCreateEnumeration(str, i));
    }

    public void addSample(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b533491", new Object[]{this, new Integer(i)});
        } else {
            nativeAddSample(this.handle, i);
        }
    }
}
