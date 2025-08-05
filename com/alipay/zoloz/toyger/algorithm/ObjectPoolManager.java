package com.alipay.zoloz.toyger.algorithm;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class ObjectPoolManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final ObjectPoolManager f6269a = new ObjectPoolManager();
    private HashMap<String, CacheObjectContainer> b = new HashMap<>();

    public static ObjectPoolManager getDefault() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ObjectPoolManager) ipChange.ipc$dispatch("cc5d9e06", new Object[0]) : f6269a;
    }

    public <T> T getObject(Class<T> cls) {
        T t;
        synchronized (this) {
            try {
                try {
                    t = cls.newInstance();
                    try {
                        String name = t.getClass().getName();
                        if (this.b.containsKey(name)) {
                            return (T) this.b.get(name).getObject();
                        }
                        CacheObjectContainer cacheObjectContainer = new CacheObjectContainer(cls);
                        this.b.put(name, cacheObjectContainer);
                        return (T) cacheObjectContainer.getObject();
                    } catch (Exception e) {
                        e = e;
                        System.out.println(e.getMessage());
                        return t;
                    }
                } catch (Exception e2) {
                    e = e2;
                    t = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public <T> void release(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ae8596a", new Object[]{this, t});
            return;
        }
        String name = t.getClass().getName();
        if (!this.b.containsKey(name)) {
            return;
        }
        this.b.get(name).release(t);
    }

    public void destory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0306f9b", new Object[]{this});
            return;
        }
        for (String str : this.b.keySet()) {
            this.b.get(str).destory();
        }
    }

    public <T> void destory(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfffceb7", new Object[]{this, t});
            return;
        }
        String name = t.getClass().getName();
        if (!this.b.containsKey(name)) {
            return;
        }
        this.b.get(name).destory();
    }

    public static void main(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2272e75f", new Object[]{strArr});
            return;
        }
        getDefault().release(getDefault().getObject(ObjectPoolManager.class));
        getDefault().release(getDefault().getObject(ObjectPoolManager.class));
    }
}
