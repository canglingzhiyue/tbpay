package com.taobao.metrickit.utils;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;

/* loaded from: classes7.dex */
public class e<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final int f18099a;
    private final LinkedList<T> b = new LinkedList<>();

    public e(int i) {
        this.f18099a = i;
    }

    public void a(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, t});
            return;
        }
        this.b.remove(t);
        g();
        this.b.addFirst(t);
    }

    public void b(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f056ab85", new Object[]{this, t});
            return;
        }
        this.b.remove(t);
        g();
        this.b.addLast(t);
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (d() <= this.f18099a - 1) {
        } else {
            this.b.removeLast();
        }
    }

    public T a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("bd3407ca", new Object[]{this});
        }
        try {
            return this.b.getFirst();
        } catch (NoSuchElementException unused) {
            return null;
        }
    }

    public T b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("43b9c269", new Object[]{this});
        }
        try {
            return this.b.getLast();
        } catch (NoSuchElementException unused) {
            return null;
        }
    }

    public T a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("9da1ccf7", new Object[]{this, new Integer(i)});
        }
        if (i >= 0 && i < d()) {
            return this.b.get(i);
        }
        return null;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.b.clear();
        }
    }

    public int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : this.b.size();
    }

    public int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue() : this.f18099a;
    }

    public Iterator<T> f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Iterator) ipChange.ipc$dispatch("74ace46a", new Object[]{this}) : this.b.iterator();
    }
}
