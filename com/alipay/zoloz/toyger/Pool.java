package com.alipay.zoloz.toyger;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayDeque;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class Pool<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayDeque<T> f6263a;
    public final int max;
    public int peak;

    /* loaded from: classes3.dex */
    public interface Poolable {
        void reset();
    }

    public abstract T a();

    public Pool() {
        this(16, Integer.MAX_VALUE);
    }

    public Pool(int i) {
        this(i, Integer.MAX_VALUE);
    }

    public Pool(int i, int i2) {
        this.f6263a = new ArrayDeque<>(i);
        this.max = i2;
    }

    public T obtain() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("f2287a06", new Object[]{this}) : this.f6263a.size() == 0 ? a() : this.f6263a.pop();
    }

    public void free(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5a23e0f", new Object[]{this, t});
        } else if (t == null) {
            throw new IllegalArgumentException("object cannot be null.");
        } else {
            if (this.f6263a.size() < this.max) {
                this.f6263a.add(t);
                this.peak = Math.max(this.peak, this.f6263a.size());
            }
            if (!(t instanceof Poolable)) {
                return;
            }
            ((Poolable) t).reset();
        }
    }

    public void freeAll(List<T> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2559ca8d", new Object[]{this, list});
        } else if (list == null) {
            throw new IllegalArgumentException("object cannot be null.");
        } else {
            ArrayDeque<T> arrayDeque = this.f6263a;
            int i = this.max;
            for (int i2 = 0; i2 < list.size(); i2++) {
                T t = list.get(i2);
                if (t != null) {
                    if (arrayDeque.size() < i) {
                        arrayDeque.add(t);
                    }
                    if (t instanceof Poolable) {
                        ((Poolable) t).reset();
                    }
                }
            }
            this.peak = Math.max(this.peak, arrayDeque.size());
        }
    }

    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
        } else {
            this.f6263a.clear();
        }
    }

    public int getFree() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2016c25c", new Object[]{this})).intValue() : this.f6263a.size();
    }
}
