package com.etao.feimagesearch.album.thumbnail;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.android.virtual_thread.face.h;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes3.dex */
public final class c implements com.etao.feimagesearch.album.thumbnail.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ExecutorService f6503a;
    private final Handler b;
    private volatile boolean c;

    /* loaded from: classes3.dex */
    public static final class a implements h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f6504a;

        public a(String str) {
            this.f6504a = str;
        }

        @Override // com.taobao.android.virtual_thread.face.h
        public final String newThreadName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("57dab4a4", new Object[]{this});
            }
            return "plt_" + this.f6504a + "_thumbnail";
        }
    }

    /* loaded from: classes3.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ e b;

        public b(e eVar) {
            this.b = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            final Bitmap a2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (c.a(c.this, this.b) || (a2 = com.etao.feimagesearch.util.d.a(this.b.b())) == null || c.a(c.this, this.b)) {
            } else {
                c.a(c.this).post(new Runnable() { // from class: com.etao.feimagesearch.album.thumbnail.c.b.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public final void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (c.a(c.this, b.this.b)) {
                        } else {
                            b.this.b.c().setImageBitmap(a2);
                        }
                    }
                });
            }
        }
    }

    static {
        kge.a(-697718679);
        kge.a(-80911844);
    }

    public c(String type) {
        q.c(type, "type");
        ExecutorService newCachedThreadPool = VExecutors.newCachedThreadPool(new a(type));
        q.a((Object) newCachedThreadPool, "VExecutors.newCachedThre…\"plt_${type}_thumbnail\" }");
        this.f6503a = newCachedThreadPool;
        this.b = new Handler(Looper.getMainLooper());
    }

    public static final /* synthetic */ Handler a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("ec07b4e0", new Object[]{cVar}) : cVar.b;
    }

    public static final /* synthetic */ boolean a(c cVar, e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d2ca8726", new Object[]{cVar, eVar})).booleanValue() : cVar.c(eVar);
    }

    @Override // com.etao.feimagesearch.album.thumbnail.a
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.c = true;
        this.b.removeCallbacksAndMessages(null);
        this.f6503a.shutdownNow();
    }

    @Override // com.etao.feimagesearch.album.thumbnail.a
    public void a(e task) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2eb734e4", new Object[]{this, task});
            return;
        }
        q.c(task, "task");
        this.f6503a.execute(new b(task));
    }

    @Override // com.etao.feimagesearch.album.thumbnail.a
    public void b(e task) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4315b25", new Object[]{this, task});
            return;
        }
        q.c(task, "task");
        task.a(true);
    }

    private final boolean c(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("19ab816a", new Object[]{this, eVar})).booleanValue();
        }
        Thread currentThread = VExecutors.currentThread();
        q.a((Object) currentThread, "VExecutors.currentThread()");
        return currentThread.isInterrupted() || this.c || eVar.a();
    }
}
