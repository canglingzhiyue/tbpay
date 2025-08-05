package com.taobao.android.dinamicx.model;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class e<E> extends b<E> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-540490603);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -1560388469) {
            if (hashCode == -850521654) {
                super.put(((Number) objArr[0]).longValue(), objArr[1]);
                return null;
            } else if (hashCode != 1416190959) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                return super.get(((Number) objArr[0]).longValue(), objArr[1]);
            }
        }
        return super.get(((Number) objArr[0]).longValue());
    }

    public e() {
    }

    public e(b<E> bVar) {
        a(bVar);
    }

    @Override // android.support.v4.util.LongSparseArray
    public synchronized void put(long j, E e) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd4e11ca", new Object[]{this, new Long(j), e});
        } else {
            super.put(j, e);
        }
    }

    @Override // android.support.v4.util.LongSparseArray
    public synchronized E get(long j, E e) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (E) ipChange.ipc$dispatch("54695bef", new Object[]{this, new Long(j), e});
        }
        return (E) super.get(j, e);
    }

    @Override // android.support.v4.util.LongSparseArray
    public synchronized E get(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (E) ipChange.ipc$dispatch("a2fe5c8b", new Object[]{this, new Long(j)});
        }
        return (E) super.get(j);
    }
}
