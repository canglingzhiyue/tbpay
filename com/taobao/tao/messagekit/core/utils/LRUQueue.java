package com.taobao.tao.messagekit.core.utils;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.Comparable;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;
import tb.kge;

/* loaded from: classes8.dex */
public class LRUQueue<T extends Comparable<T>> extends LinkedBlockingQueue<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1939332016);
    }

    public LRUQueue(int i) {
        super(i);
    }

    public static /* synthetic */ Object ipc$super(LRUQueue lRUQueue, String str, Object... objArr) {
        if (str.hashCode() == 195222152) {
            return new Boolean(super.add((LRUQueue) objArr[0]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public synchronized boolean add(T t) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2a2ba58d", new Object[]{this, t})).booleanValue();
        } else if (t == null) {
            return false;
        } else {
            Iterator<T> it = iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                Comparable comparable = (Comparable) it.next();
                if (comparable.compareTo(t) == 0) {
                    remove(comparable);
                    break;
                }
            }
            if (remainingCapacity() <= 0) {
                remove();
            }
            super.add((LRUQueue<T>) t);
            return z;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue, java.util.concurrent.BlockingQueue
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return add((LRUQueue<T>) ((Comparable) obj));
    }
}
