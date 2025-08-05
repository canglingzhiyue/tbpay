package com.taobao.android.diagnose.common;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.diagnose.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import tb.kge;

/* loaded from: classes.dex */
public class CircularList<E> extends LinkedList<E> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int maxSize;

    static {
        kge.a(-1939156957);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object ipc$super(CircularList circularList, String str, Object... objArr) {
        if (str.hashCode() == 195222152) {
            return new Boolean(super.add(objArr[0]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public CircularList(int i) {
        this.maxSize = i;
    }

    private CircularList() {
    }

    @Override // java.util.LinkedList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque, java.util.Queue
    public boolean add(E e) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ba2da88", new Object[]{this, e})).booleanValue();
        }
        if (size() == this.maxSize) {
            pollFirst();
        }
        return super.add(e);
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List, java.util.Deque
    public Iterator<E> iterator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Iterator) ipChange.ipc$dispatch("8f345362", new Object[]{this});
        }
        synchronized (this) {
            try {
                try {
                    if (!isEmpty()) {
                        return new ArrayList(this).iterator();
                    }
                } catch (Exception e) {
                    v.a("CircularList", com.taobao.android.weex_framework.util.a.ATOM_EXT_iterator, e);
                }
                return new Iterator<E>() { // from class: com.taobao.android.diagnose.common.CircularList.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.util.Iterator
                    public boolean hasNext() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ((Boolean) ipChange2.ipc$dispatch("291ab8", new Object[]{this})).booleanValue();
                        }
                        return false;
                    }

                    @Override // java.util.Iterator
                    public E next() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return (E) ipChange2.ipc$dispatch("b9bf2c78", new Object[]{this});
                        }
                        return null;
                    }
                };
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
