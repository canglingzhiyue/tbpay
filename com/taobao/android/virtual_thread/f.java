package com.taobao.android.virtual_thread;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.WeakHashMap;
import tb.kge;

/* loaded from: classes6.dex */
public class f<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final WeakHashMap<Thread, HashMap<f<?>, Object>> f15807a;

    public T a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("bd3407ca", new Object[]{this});
        }
        return null;
    }

    static {
        kge.a(-981570796);
        f15807a = new WeakHashMap<>();
    }

    public T b() {
        HashMap<f<?>, Object> hashMap;
        T t;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("43b9c269", new Object[]{this});
        }
        Thread currentVirtualThread = VThread.currentVirtualThread();
        synchronized (f15807a) {
            hashMap = f15807a.get(currentVirtualThread);
        }
        return (hashMap == null || (t = (T) hashMap.get(this)) == null) ? d() : t;
    }

    private T d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("50c537a7", new Object[]{this});
        }
        T a2 = a();
        a(a2);
        return a2;
    }

    public void a(T t) {
        HashMap<f<?>, Object> hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, t});
            return;
        }
        Thread currentVirtualThread = VThread.currentVirtualThread();
        synchronized (f15807a) {
            hashMap = f15807a.get(currentVirtualThread);
            if (hashMap == null) {
                hashMap = new HashMap<>();
                f15807a.put(currentVirtualThread, hashMap);
            }
        }
        hashMap.put(this, t);
    }

    public void c() {
        HashMap<f<?>, Object> hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        Thread currentVirtualThread = VThread.currentVirtualThread();
        synchronized (f15807a) {
            hashMap = f15807a.get(currentVirtualThread);
        }
        if (hashMap == null) {
            return;
        }
        hashMap.remove(this);
    }
}
