package com.taobao.search.musie;

import android.os.Handler;
import android.os.Looper;
import android.util.LruCache;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.SoftReference;
import tb.kge;

/* loaded from: classes7.dex */
public final class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final long f19238a = 1000;
    private final Handler b = new Handler(Looper.getMainLooper());
    private final LruCache<String, SoftReference<b>> c = new LruCache<>(30);

    /* loaded from: classes7.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f19239a;

        public a(b bVar) {
            this.f19239a = bVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f19239a.b();
            }
        }
    }

    static {
        kge.a(1058439633);
    }

    public final b a(String key) {
        b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("512aad1d", new Object[]{this, key});
        }
        kotlin.jvm.internal.q.c(key, "key");
        SoftReference<b> softReference = this.c.get(key);
        if (softReference == null || (bVar = softReference.get()) == null) {
            return null;
        }
        if (bVar.a()) {
            this.c.remove(key);
            return null;
        }
        bVar.c();
        return bVar;
    }

    public final void a(String key, b drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b18d4749", new Object[]{this, key, drawable});
            return;
        }
        kotlin.jvm.internal.q.c(key, "key");
        kotlin.jvm.internal.q.c(drawable, "drawable");
        this.c.put(key, new SoftReference<>(drawable));
    }

    public final void a(b proxy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a10ab553", new Object[]{this, proxy});
            return;
        }
        kotlin.jvm.internal.q.c(proxy, "proxy");
        this.b.postDelayed(new a(proxy), this.f19238a);
    }
}
