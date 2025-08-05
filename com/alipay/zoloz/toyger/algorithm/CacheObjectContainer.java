package com.alipay.zoloz.toyger.algorithm;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class CacheObjectContainer<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private List<CacheObject> f6268a = new ArrayList();
    private Class<T> b;

    public CacheObjectContainer(Class<T> cls) {
        this.b = cls;
    }

    public List<CacheObject> getCacheObjectList() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("a03668d7", new Object[]{this}) : this.f6268a;
    }

    public void setCacheObjectList(List<CacheObject> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1301fd5", new Object[]{this, list});
        } else {
            this.f6268a = list;
        }
    }

    public void release(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ae8596a", new Object[]{this, t});
            return;
        }
        for (CacheObject cacheObject : this.f6268a) {
            if (cacheObject.getCacheObject() == t) {
                cacheObject.setUsing(false);
                return;
            }
        }
    }

    public void destory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0306f9b", new Object[]{this});
        } else {
            this.f6268a.clear();
        }
    }

    public T getObject() {
        synchronized (this) {
            for (CacheObject cacheObject : this.f6268a) {
                if (!cacheObject.isUsing()) {
                    return (T) cacheObject.getCacheObject();
                }
            }
            try {
                T newInstance = this.b.newInstance();
                CacheObject cacheObject2 = new CacheObject();
                cacheObject2.setUsing(true);
                cacheObject2.setCacheObject(newInstance);
                this.f6268a.add(cacheObject2);
                return newInstance;
            } catch (Exception e) {
                Log.e(e.getMessage(), e.getMessage());
                return null;
            }
        }
    }
}
