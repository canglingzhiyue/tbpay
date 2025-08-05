package com.taobao.android.searchbaseframe.util;

import android.util.SparseArray;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import tb.kge;

/* loaded from: classes6.dex */
public final class v<E> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ReferenceQueue<E> f15024a = new ReferenceQueue<>();
    private final SparseArray<a<E>> b = new SparseArray<>();

    /* loaded from: classes6.dex */
    public static class a<E> extends WeakReference<E> {

        /* renamed from: a  reason: collision with root package name */
        public final int f15025a;

        static {
            kge.a(801255058);
        }

        public a(E e, ReferenceQueue<? super E> referenceQueue, int i) {
            super(e, referenceQueue);
            this.f15025a = i;
        }
    }

    static {
        kge.a(1343837506);
    }

    public void a(int i, E e) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d36ff2b7", new Object[]{this, new Integer(i), e});
            return;
        }
        a();
        this.b.append(i, new a<>(e, this.f15024a, i));
    }

    public E a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (E) ipChange.ipc$dispatch("9da1ccf7", new Object[]{this, new Integer(i)});
        }
        a();
        a<E> aVar = this.b.get(i);
        if (aVar == null) {
            return null;
        }
        return (E) aVar.get();
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        while (true) {
            Reference<? extends E> poll = this.f15024a.poll();
            if (poll == null) {
                return;
            }
            this.b.remove(((a) poll).f15025a);
        }
    }
}
