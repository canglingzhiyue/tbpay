package com.taobao.themis.kernel;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import tb.kge;

@Deprecated
/* loaded from: classes9.dex */
public class TMSTBOpenStart {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile boolean f22482a;
    private static final ReentrantReadWriteLock b;
    private static final ReentrantReadWriteLock.WriteLock c;
    private static final ReentrantReadWriteLock.ReadLock d;

    static {
        kge.a(-426568980);
        f22482a = false;
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        b = reentrantReadWriteLock;
        c = reentrantReadWriteLock.writeLock();
        d = b.readLock();
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        d.lock();
        try {
            return f22482a;
        } finally {
            d.unlock();
        }
    }

    public static void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z)});
            return;
        }
        c.lock();
        try {
            f22482a = z;
        } finally {
            c.unlock();
        }
    }
}
