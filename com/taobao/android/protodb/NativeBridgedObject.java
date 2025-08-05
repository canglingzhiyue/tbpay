package com.taobao.android.protodb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class NativeBridgedObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final long mNativePointer;

    private native void freeNativeObject(long j);

    public NativeBridgedObject(long j) {
        this.mNativePointer = j;
    }

    public long getNativePointer() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a8116eb", new Object[]{this})).longValue() : this.mNativePointer;
    }

    public Object clone() throws CloneNotSupportedException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("78b3604e", new Object[]{this}) : super.clone();
    }

    public void finalize() throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35321a5", new Object[]{this});
            return;
        }
        super.finalize();
        if (!i.b()) {
            return;
        }
        freeNativeObject(getNativePointer());
    }
}
