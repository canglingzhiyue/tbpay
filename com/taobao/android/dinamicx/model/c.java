package com.taobao.android.dinamicx.model;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import tb.kge;

/* loaded from: classes5.dex */
public class c<E> extends b<E> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ReentrantReadWriteLock f11889a = new ReentrantReadWriteLock();
    private final ReentrantReadWriteLock.ReadLock b = this.f11889a.readLock();
    private final ReentrantReadWriteLock.WriteLock c = this.f11889a.writeLock();

    static {
        kge.a(-539532287);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2057317520:
                super.a((b) objArr[0]);
                return null;
            case -1560388469:
                return super.get(((Number) objArr[0]).longValue());
            case -850521654:
                super.put(((Number) objArr[0]).longValue(), objArr[1]);
                return null;
            case 1416190959:
                return super.get(((Number) objArr[0]).longValue(), objArr[1]);
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public c() {
    }

    public c(b<E> bVar) {
        a(bVar);
    }

    @Override // com.taobao.android.dinamicx.model.b
    public void a(b<E> bVar) {
        IpChange ipChange = $ipChange;
        try {
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("855fd370", new Object[]{this, bVar});
                return;
            }
            this.c.lock();
            super.a(bVar);
        } catch (Exception e) {
            com.taobao.android.dinamicx.exception.a.b(e);
        } finally {
            this.c.unlock();
        }
    }

    @Override // android.support.v4.util.LongSparseArray
    public void put(long j, E e) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd4e11ca", new Object[]{this, new Long(j), e});
            return;
        }
        try {
            this.c.lock();
            super.put(j, e);
        } catch (Exception e2) {
            com.taobao.android.dinamicx.exception.a.b(e2);
        } finally {
            this.c.unlock();
        }
    }

    @Override // android.support.v4.util.LongSparseArray
    public E get(long j, E e) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (E) ipChange.ipc$dispatch("54695bef", new Object[]{this, new Long(j), e});
        }
        try {
            this.b.lock();
            return (E) super.get(j, e);
        } catch (Exception e2) {
            com.taobao.android.dinamicx.exception.a.b(e2);
            return null;
        } finally {
            this.b.unlock();
        }
    }

    @Override // android.support.v4.util.LongSparseArray
    public E get(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (E) ipChange.ipc$dispatch("a2fe5c8b", new Object[]{this, new Long(j)});
        }
        try {
            this.b.lock();
            return (E) super.get(j);
        } catch (Exception e) {
            com.taobao.android.dinamicx.exception.a.b(e);
            return null;
        } finally {
            this.b.unlock();
        }
    }
}
