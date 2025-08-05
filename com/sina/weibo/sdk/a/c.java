package com.sina.weibo.sdk.a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import tb.kge;

/* loaded from: classes4.dex */
public abstract class c<Params, Progress, Result> {
    Params[] P;
    volatile int L = b.U;
    int O = 5;
    Handler x = new Handler(Looper.getMainLooper()) { // from class: com.sina.weibo.sdk.a.c.1
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            a aVar = (a) message.obj;
            if (message.what != 1) {
                return;
            }
            c.a(aVar.S, aVar.T[0]);
            message.obj = null;
        }
    };
    final d<Params, Result> M = new d<Params, Result>() { // from class: com.sina.weibo.sdk.a.c.2
        @Override // java.util.concurrent.Callable
        public final Result call() {
            Process.setThreadPriority(c.this.O);
            return (Result) c.this.l();
        }
    };
    final FutureTask<Result> N = new c<Params, Progress, Result>.AbstractC0306c(this.M) { // from class: com.sina.weibo.sdk.a.c.3
        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return 0;
        }

        @Override // java.util.concurrent.FutureTask
        protected final void done() {
            Message obtainMessage;
            try {
                obtainMessage = c.this.x.obtainMessage(1, new a(c.this, get()));
            } catch (InterruptedException unused) {
                throw new RuntimeException("An error occur while execute doInBackground().");
            } catch (CancellationException unused2) {
                obtainMessage = c.this.x.obtainMessage(3, new a(c.this, null));
            } catch (ExecutionException unused3) {
                throw new RuntimeException("An error occur while execute doInBackground().");
            }
            obtainMessage.sendToTarget();
        }
    };

    /* renamed from: com.sina.weibo.sdk.a.c$4  reason: invalid class name */
    /* loaded from: classes4.dex */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] R = new int[b.m().length];

        static {
            try {
                R[b.V - 1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                R[b.W - 1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes4.dex */
    static class a<Data> {
        final c S;
        final Data[] T;

        static {
            kge.a(-1057128578);
        }

        a(c cVar, Data... dataArr) {
            this.S = cVar;
            this.T = dataArr;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* loaded from: classes4.dex */
    public static final class b extends Enum<b> {
        public static final int U;
        public static final int V;
        public static final int W;
        private static final /* synthetic */ int[] X;

        static {
            kge.a(-1057128577);
            U = 1;
            V = 2;
            W = 3;
            X = new int[]{U, V, W};
        }

        public static int[] m() {
            return (int[]) X.clone();
        }
    }

    /* renamed from: com.sina.weibo.sdk.a.c$c  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    abstract class AbstractC0306c extends FutureTask<Result> implements Comparable<Object> {
        int priority;

        static {
            kge.a(-1057128576);
            kge.a(415966670);
        }

        public AbstractC0306c(d dVar) {
            super(dVar);
            this.priority = dVar.priority;
        }
    }

    /* loaded from: classes4.dex */
    static abstract class d<Params, Result> implements Callable<Result> {
        Params[] Y;
        int priority;

        static {
            kge.a(-1057128575);
            kge.a(-119797776);
        }

        private d() {
            this.priority = 10;
        }

        /* synthetic */ d(byte b) {
            this();
        }
    }

    static {
        kge.a(-1100031);
    }

    static /* synthetic */ void a(c cVar, Object obj) {
        cVar.onPostExecute(obj);
        cVar.L = b.W;
    }

    protected abstract Result l();

    protected void onPostExecute(Result result) {
    }
}
