package com.taobao.android.searchbaseframe.util;

import android.support.v4.util.LongSparseArray;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import tb.kge;

/* loaded from: classes6.dex */
public final class u<E> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ReferenceQueue<E> f15022a = new ReferenceQueue<>();
    private final LongSparseArray<a<E>> b = new LongSparseArray<>();

    /* loaded from: classes6.dex */
    public static class a<E> extends WeakReference<E> {

        /* renamed from: a  reason: collision with root package name */
        public final long f15023a;

        static {
            kge.a(1734153206);
        }

        public a(E e, ReferenceQueue<? super E> referenceQueue, long j) {
            super(e, referenceQueue);
            this.f15023a = j;
        }
    }

    static {
        kge.a(1646908582);
    }

    public void a(long j, E e) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e008e838", new Object[]{this, new Long(j), e});
            return;
        }
        a();
        this.b.append(j, new a<>(e, this.f15022a, j));
    }

    public E a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (E) ipChange.ipc$dispatch("8543a356", new Object[]{this, new Long(j)});
        }
        a();
        a<E> aVar = this.b.get(j);
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
            Reference<? extends E> poll = this.f15022a.poll();
            if (poll == null) {
                return;
            }
            this.b.remove(((a) poll).f15023a);
        }
    }
}
