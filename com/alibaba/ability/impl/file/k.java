package com.alibaba.ability.impl.file;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes2.dex */
public final class k {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final k INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, ReentrantReadWriteLock> f1892a;

    static {
        kge.a(-21748078);
        INSTANCE = new k();
        f1892a = new LinkedHashMap();
    }

    private k() {
    }

    public final ReentrantReadWriteLock.ReadLock a(String filePath) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ReentrantReadWriteLock.ReadLock) ipChange.ipc$dispatch("9239b434", new Object[]{this, filePath});
        }
        q.d(filePath, "filePath");
        ReentrantReadWriteLock.ReadLock readLock = d(filePath).readLock();
        q.b(readLock, "getReadWriteLock(filePath).readLock()");
        return readLock;
    }

    public final ReentrantReadWriteLock.WriteLock b(String filePath) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ReentrantReadWriteLock.WriteLock) ipChange.ipc$dispatch("5f8fed18", new Object[]{this, filePath});
        }
        q.d(filePath, "filePath");
        ReentrantReadWriteLock.WriteLock writeLock = d(filePath).writeLock();
        q.b(writeLock, "getReadWriteLock(filePath).writeLock()");
        return writeLock;
    }

    private final ReentrantReadWriteLock d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ReentrantReadWriteLock) ipChange.ipc$dispatch("724c2800", new Object[]{this, str});
        }
        Map<String, ReentrantReadWriteLock> map = f1892a;
        ReentrantReadWriteLock reentrantReadWriteLock = map.get(str);
        if (reentrantReadWriteLock == null) {
            reentrantReadWriteLock = new ReentrantReadWriteLock();
            map.put(str, reentrantReadWriteLock);
        }
        return reentrantReadWriteLock;
    }

    public final void c(String filePath) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, filePath});
            return;
        }
        q.d(filePath, "filePath");
        ReentrantReadWriteLock reentrantReadWriteLock = f1892a.get(filePath);
        if (reentrantReadWriteLock == null || reentrantReadWriteLock.isWriteLocked() || reentrantReadWriteLock.getReadLockCount() != 0) {
            return;
        }
        f1892a.remove(filePath);
    }
}
