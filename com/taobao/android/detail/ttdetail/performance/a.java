package com.taobao.android.detail.ttdetail.performance;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.support.v4.util.Pools;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.utils.i;
import java.util.concurrent.ArrayBlockingQueue;
import tb.kge;

/* loaded from: classes5.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public LayoutInflater f10771a;
    private Handler.Callback c = new Handler.Callback() { // from class: com.taobao.android.detail.ttdetail.performance.a.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
            }
            b bVar = (b) message.obj;
            bVar.e.a(bVar.d, bVar.c, bVar.b);
            a.this.b.a(bVar);
            return true;
        }
    };
    public c b = c.a();

    /* loaded from: classes5.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public a f10774a;
        public ViewGroup b;
        public int c;
        public View d;
        public d e;

        static {
            kge.a(-1791662419);
        }
    }

    /* loaded from: classes5.dex */
    public interface d {
        void a(View view, int i, ViewGroup viewGroup);
    }

    static {
        kge.a(-575683777);
    }

    public static /* synthetic */ Handler.Callback a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler.Callback) ipChange.ipc$dispatch("6402748f", new Object[]{aVar}) : aVar.c;
    }

    public a(Context context) {
        this.f10771a = new C0426a(new e(context));
    }

    public void a(int i, ViewGroup viewGroup, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6cb6a9a", new Object[]{this, new Integer(i), viewGroup, dVar});
        } else if (dVar == null) {
            throw new NullPointerException("callback argument may not be null!");
        } else {
            b c2 = this.b.c();
            c2.f10774a = this;
            c2.c = i;
            c2.b = viewGroup;
            c2.e = dVar;
            this.b.b(c2);
        }
    }

    /* renamed from: com.taobao.android.detail.ttdetail.performance.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C0426a extends LayoutInflater {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final String[] f10773a;

        public static /* synthetic */ Object ipc$super(C0426a c0426a, String str, Object... objArr) {
            if (str.hashCode() == -424637217) {
                return super.onCreateView((String) objArr[0], (AttributeSet) objArr[1]);
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        static {
            kge.a(-1555477292);
            f10773a = new String[]{"android.widget.", "android.webkit.", "android.app."};
        }

        public C0426a(Context context) {
            super(context);
        }

        @Override // android.view.LayoutInflater
        public LayoutInflater cloneInContext(Context context) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (LayoutInflater) ipChange.ipc$dispatch("9e726fa6", new Object[]{this, context}) : new C0426a(context);
        }

        @Override // android.view.LayoutInflater
        public View onCreateView(String str, AttributeSet attributeSet) throws ClassNotFoundException {
            View createView;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("e6b08cdf", new Object[]{this, str, attributeSet});
            }
            for (String str2 : f10773a) {
                try {
                    createView = createView(str, str2, attributeSet);
                } catch (ClassNotFoundException e) {
                    i.a("AsyncLayoutInflater", "createView() failed", e);
                }
                if (createView != null) {
                    return createView;
                }
            }
            return super.onCreateView(str, attributeSet);
        }
    }

    /* loaded from: classes5.dex */
    public static class c extends Thread {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final c f10775a;
        private ArrayBlockingQueue<b> b = new ArrayBlockingQueue<>(30);
        private Pools.SynchronizedPool<b> c = new Pools.SynchronizedPool<>(30);

        private c() {
        }

        static {
            kge.a(694984236);
            c cVar = new c();
            f10775a = cVar;
            cVar.setName("TTDetail_AsyncLayoutInflater");
            f10775a.start();
        }

        public static c a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("f3e46cf", new Object[0]) : f10775a;
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            try {
                b take = this.b.take();
                try {
                    take.d = take.f10774a.f10771a.inflate(take.c, take.b, false);
                } catch (RuntimeException e) {
                    i.a("AsyncLayoutInflater", "Failed to inflate resource in the background! Retrying on the UI thread", e);
                }
                Message obtain = Message.obtain();
                obtain.what = 0;
                obtain.obj = take;
                a.a(take.f10774a).handleMessage(obtain);
            } catch (InterruptedException e2) {
                i.a("AsyncLayoutInflater", "mQueue.take() failed", e2);
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            while (true) {
                b();
            }
        }

        public b c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("11aaec6e", new Object[]{this});
            }
            b acquire = this.c.acquire();
            return acquire == null ? new b() : acquire;
        }

        public void a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2d61046a", new Object[]{this, bVar});
                return;
            }
            bVar.e = null;
            bVar.f10774a = null;
            bVar.b = null;
            bVar.c = 0;
            bVar.d = null;
            this.c.release(bVar);
        }

        public void b(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("52f50d6b", new Object[]{this, bVar});
                return;
            }
            try {
                this.b.put(bVar);
            } catch (InterruptedException e) {
                throw new RuntimeException("Failed to enqueue async inflate request", e);
            }
        }
    }
}
