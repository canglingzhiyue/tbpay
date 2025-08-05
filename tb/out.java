package tb;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes8.dex */
public class out {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f32443a;
    private static final HandlerThread b;
    private static final Handler c;

    static {
        kge.a(1872730736);
        f32443a = true;
        HandlerThread handlerThread = new HandlerThread("ShopRouterWorkerThread");
        b = handlerThread;
        handlerThread.start();
        c = new a(b.getLooper());
    }

    public static void a(Runnable runnable, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6098f30", new Object[]{runnable, str});
        } else if (runnable == null) {
        } else {
            b bVar = new b();
            bVar.f32444a = str;
            bVar.b = runnable;
            Message obtain = Message.obtain(c);
            obtain.obj = bVar;
            obtain.sendToTarget();
        }
    }

    public static void b(Runnable runnable, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb4afdf1", new Object[]{runnable, str});
            return;
        }
        if (f32443a) {
            a(runnable, str);
        } else {
            AsyncTask.execute(runnable);
        }
        f32443a = com.taobao.tao.shop.fetcher.adapter.b.a().k();
    }

    /* loaded from: classes8.dex */
    public static class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1788456953);
        }

        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            b bVar;
            Runnable runnable;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            Object obj = message.obj;
            if (!(obj instanceof b) || (runnable = (bVar = (b) obj).b) == null) {
                return;
            }
            String str = bVar.f32444a;
            ouu.a("shop router start task : " + str);
            long currentTimeMillis = System.currentTimeMillis();
            runnable.run();
            long currentTimeMillis2 = System.currentTimeMillis();
            ouu.a("shop router task : " + str + " , cost : " + (currentTimeMillis2 - currentTimeMillis));
        }
    }

    /* loaded from: classes8.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public String f32444a;
        public Runnable b;

        static {
            kge.a(122839897);
        }

        private b() {
        }
    }
}
