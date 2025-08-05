package tb;

import android.os.Handler;
import android.os.HandlerThread;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.utils.bf;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes5.dex */
public class tae {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Handler f33983a;
    private static Handler b;
    private static ThreadPoolExecutor c;

    static {
        kge.a(-1248524538);
        c = bf.mExecutor;
        HandlerThread handlerThread = new HandlerThread("DetailPreloadReqThread");
        handlerThread.start();
        b = new Handler(handlerThread.getLooper());
        HandlerThread handlerThread2 = new HandlerThread("DetailReqThread");
        handlerThread2.start();
        f33983a = new Handler(handlerThread2.getLooper());
    }

    public static Handler a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("b016d95e", new Object[0]) : b;
    }

    public static Handler b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("ac18683d", new Object[0]) : f33983a;
    }

    public static void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{runnable});
        } else {
            c.execute(runnable);
        }
    }
}
