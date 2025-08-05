package com.taobao.search.common.util;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedList;
import tb.kge;

/* loaded from: classes7.dex */
public final class LimitedLinkedList<T> extends LinkedList<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final int maxSize;

    static {
        kge.a(-2716204);
    }

    public static /* synthetic */ Object ipc$super(LimitedLinkedList limitedLinkedList, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -475350822) {
            if (hashCode == 195222152) {
                return new Boolean(super.add(objArr[0]));
            }
            if (hashCode != 845773819) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            return new Integer(super.size());
        }
        return super.remove(((Number) objArr[0]).intValue());
    }

    public LimitedLinkedList(int i) {
        this.maxSize = i;
    }

    public int getSize() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ae43b971", new Object[]{this})).intValue() : super.size();
    }

    @Override // java.util.LinkedList, java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final T remove(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("e3aab8da", new Object[]{this, new Integer(i)}) : (T) removeAt(i);
    }

    public Object removeAt(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("19801fed", new Object[]{this, new Integer(i)}) : super.remove(i);
    }

    @Override // java.util.LinkedList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque
    public final int size() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("32697bfb", new Object[]{this})).intValue() : getSize();
    }

    @Override // java.util.LinkedList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque, java.util.Queue
    public boolean add(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ba2da88", new Object[]{this, t})).booleanValue();
        }
        boolean add = super.add(t);
        if (size() > this.maxSize) {
            removeFirst();
        }
        return add;
    }
}
