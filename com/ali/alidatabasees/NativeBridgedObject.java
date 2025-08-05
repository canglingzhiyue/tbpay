package com.ali.alidatabasees;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public abstract class NativeBridgedObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f1801a;
    private long mNativePointer;

    private native void freeNativeObject();

    static {
        try {
            System.loadLibrary("sqlite3");
            System.loadLibrary("AliDatabaseES");
            f1801a = true;
        } catch (Throwable unused) {
            f1801a = false;
        }
    }

    public NativeBridgedObject(long j) {
        this.mNativePointer = j;
    }

    public synchronized void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        freeNativeObject();
        this.mNativePointer = 0L;
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
        if (!f1801a || this.mNativePointer == 0) {
            return;
        }
        c();
    }
}
