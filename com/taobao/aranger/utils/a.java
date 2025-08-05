package com.taobao.aranger.utils;

import android.net.Uri;
import android.os.IBinder;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.aranger.exception.IPCException;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import tb.kac;
import tb.kak;
import tb.kam;
import tb.kge;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private static final String f16371a;
    private static volatile a b;
    private final ReferenceQueue<Object> c = new ReferenceQueue<>();
    private final ReferenceQueue<Object> e = new ReferenceQueue<>();
    private final ReferenceQueue<Object> f = new ReferenceQueue<>();
    private final ConcurrentHashMap<PhantomReference<Object>, String> d = new ConcurrentHashMap<>();

    public static /* synthetic */ void lambda$14E6sOwUEVVQQr9db6MMKjueEzk(a aVar, Object obj) {
        aVar.c(obj);
    }

    static {
        kge.a(-1050356031);
        f16371a = a.class.getSimpleName();
        b = null;
    }

    private a() {
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("59a45aa6", new Object[0]);
        }
        if (b == null) {
            synchronized (a.class) {
                if (b == null) {
                    b = new a();
                }
            }
        }
        return b;
    }

    private ReferenceQueue<Object> b(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ReferenceQueue) ipChange.ipc$dispatch("98fe0eea", new Object[]{this, obj}) : obj instanceof Uri ? this.e : this.f;
    }

    private void a(Object obj) {
        ReferenceQueue<Object> referenceQueue;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
            return;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        if (kam.c()) {
            referenceQueue = b(obj);
        } else {
            referenceQueue = this.c;
        }
        synchronized (this.c) {
            while (true) {
                PhantomReference phantomReference = (PhantomReference) referenceQueue.poll();
                if (phantomReference != null) {
                    String remove = this.d.remove(phantomReference);
                    if (remove != null) {
                        arrayList.add(remove);
                    }
                    if (arrayList.size() > 100) {
                        a(obj, arrayList);
                        arrayList.clear();
                    }
                }
            }
        }
        a(obj, arrayList);
    }

    private void a(Object obj, ArrayList<String> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e2c59e6", new Object[]{this, obj, arrayList});
        } else if (arrayList == null || arrayList.isEmpty()) {
        } else {
            try {
                if (obj instanceof IBinder) {
                    kac.a((IBinder) obj).a(arrayList);
                } else if (!(obj instanceof Uri)) {
                } else {
                    kac.a((Uri) obj).a(arrayList);
                }
            } catch (IPCException e) {
                kak.a(f16371a, "[recycle][recycleClient]", e, new Object[0]);
            }
        }
    }

    public void a(final Object obj, String str, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ffa3b6a", new Object[]{this, obj, str, obj2});
            return;
        }
        if (kam.c()) {
            this.d.put(new PhantomReference<>(obj2, b(obj)), str);
        } else {
            this.d.put(new PhantomReference<>(obj2, this.c), str);
        }
        b.a(false, false, new Runnable() { // from class: com.taobao.aranger.utils.-$$Lambda$a$14E6sOwUEVVQQr9db6MMKjueEzk
            {
                a.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                a.lambda$14E6sOwUEVVQQr9db6MMKjueEzk(a.this, obj);
            }
        });
    }

    public /* synthetic */ void c(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a8844c6", new Object[]{this, obj});
        } else {
            a(obj);
        }
    }
}
