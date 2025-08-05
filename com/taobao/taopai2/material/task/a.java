package com.taobao.taopai2.material.task;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.kge;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static a b;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, List<WeakReference<Object>>> f22095a = new ConcurrentHashMap();

    /* renamed from: com.taobao.taopai2.material.task.a$a  reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    public static class C0916a {

        /* renamed from: a  reason: collision with root package name */
        public static a f22096a;

        static {
            kge.a(-66470217);
            f22096a = new a();
        }
    }

    static {
        kge.a(962009625);
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("cbcdb864", new Object[0]);
        }
        if (b == null) {
            b = C0916a.f22096a;
        }
        return b;
    }

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue() : this.f22095a.containsKey(str);
    }

    public void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb6538e", new Object[]{this, str, obj});
        } else if (!this.f22095a.containsKey(str)) {
            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
            if (obj != null) {
                copyOnWriteArrayList.add(new WeakReference(obj));
            }
            this.f22095a.put(str, copyOnWriteArrayList);
        } else if (obj != null) {
            for (WeakReference<Object> weakReference : this.f22095a.get(str)) {
                if (weakReference.get() == obj) {
                    return;
                }
            }
            this.f22095a.get(str).add(new WeakReference<>(obj));
        }
    }

    public List<WeakReference<Object>> b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("89cdf874", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str)) {
            return this.f22095a.get(str);
        }
        return null;
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else {
            this.f22095a.remove(str);
        }
    }
}
