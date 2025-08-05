package com.alibaba.android.bindingx.core.internal;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import tb.kge;

/* loaded from: classes2.dex */
public abstract class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes2.dex */
    interface a {
        void g_();
    }

    static {
        kge.a(1197392486);
    }

    public abstract void a(a aVar);

    public abstract void b();

    public abstract void c();

    public static b a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("39d739f8", new Object[0]);
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return new Choreographer$FrameCallbackC0070b();
        }
        return new c();
    }

    /* renamed from: com.alibaba.android.bindingx.core.internal.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class Choreographer$FrameCallbackC0070b extends b implements Choreographer.FrameCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private Choreographer f2235a;
        private a b;
        private boolean c;

        static {
            kge.a(621898260);
            kge.a(-569788179);
        }

        public static /* synthetic */ Choreographer a(Choreographer$FrameCallbackC0070b choreographer$FrameCallbackC0070b, Choreographer choreographer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Choreographer) ipChange.ipc$dispatch("422578a2", new Object[]{choreographer$FrameCallbackC0070b, choreographer});
            }
            choreographer$FrameCallbackC0070b.f2235a = choreographer;
            return choreographer;
        }

        public Choreographer$FrameCallbackC0070b() {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.alibaba.android.bindingx.core.internal.b.b.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange = $ipChange;
                        if (ipChange instanceof IpChange) {
                            ipChange.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        Choreographer$FrameCallbackC0070b.a(Choreographer$FrameCallbackC0070b.this, Choreographer.getInstance());
                        countDownLatch.countDown();
                    }
                });
                try {
                    if (countDownLatch.await(500L, TimeUnit.MILLISECONDS)) {
                        return;
                    }
                    this.f2235a = Choreographer.getInstance();
                    return;
                } catch (InterruptedException unused) {
                    return;
                }
            }
            this.f2235a = Choreographer.getInstance();
        }

        @Override // com.alibaba.android.bindingx.core.internal.b
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            Choreographer choreographer = this.f2235a;
            if (choreographer != null) {
                choreographer.removeFrameCallback(this);
            }
            this.c = false;
        }

        @Override // com.alibaba.android.bindingx.core.internal.b
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
                return;
            }
            b();
            this.f2235a = null;
        }

        @Override // com.alibaba.android.bindingx.core.internal.b
        public void a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b3f13f15", new Object[]{this, aVar});
                return;
            }
            this.b = aVar;
            this.c = true;
            Choreographer choreographer = this.f2235a;
            if (choreographer == null) {
                return;
            }
            choreographer.postFrameCallback(this);
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f46aacbb", new Object[]{this, new Long(j)});
                return;
            }
            a aVar = this.b;
            if (aVar != null) {
                aVar.g_();
            }
            Choreographer choreographer = this.f2235a;
            if (choreographer == null || !this.c) {
                return;
            }
            choreographer.postFrameCallback(this);
        }
    }

    /* loaded from: classes2.dex */
    public static class c extends b implements Handler.Callback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private Handler f2237a = new Handler(Looper.getMainLooper(), this);
        private a b;
        private boolean c;

        static {
            kge.a(-560509419);
            kge.a(-1043440182);
        }

        @Override // com.alibaba.android.bindingx.core.internal.b
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            Handler handler = this.f2237a;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            this.c = false;
        }

        @Override // com.alibaba.android.bindingx.core.internal.b
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
                return;
            }
            b();
            this.f2237a = null;
        }

        @Override // com.alibaba.android.bindingx.core.internal.b
        public void a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b3f13f15", new Object[]{this, aVar});
                return;
            }
            this.b = aVar;
            this.c = true;
            Handler handler = this.f2237a;
            if (handler == null) {
                return;
            }
            handler.sendEmptyMessage(100);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
            }
            if (message == null || message.what != 100 || this.f2237a == null) {
                return false;
            }
            a aVar = this.b;
            if (aVar != null) {
                aVar.g_();
            }
            if (this.c) {
                this.f2237a.sendEmptyMessageDelayed(100, 16L);
            }
            return true;
        }
    }
}
