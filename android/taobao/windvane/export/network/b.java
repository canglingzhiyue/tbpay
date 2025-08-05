package android.taobao.windvane.export.network;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import tb.kge;

/* loaded from: classes2.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private HandlerThread f1593a;
    private boolean b;

    /* loaded from: classes2.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final b f1594a;

        static {
            kge.a(-431814451);
            f1594a = new b();
        }

        public static /* synthetic */ b a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("c1521ef3", new Object[0]) : f1594a;
        }
    }

    static {
        kge.a(-1090800445);
    }

    public static b a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("c1521ef3", new Object[0]) : a.a();
    }

    private b() {
        this.b = false;
        try {
            this.f1593a = new HandlerThread("wvRequestPrefetch");
            this.f1593a.start();
            this.b = true;
        } catch (Exception unused) {
        }
    }

    public Handler b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("ac18683d", new Object[]{this});
        }
        HandlerThread handlerThread = this.f1593a;
        if (handlerThread == null || !this.b) {
            return null;
        }
        Looper looper = handlerThread.getLooper();
        if (looper != null) {
            return new Handler(looper);
        }
        com.taobao.android.riverlogger.e.a(RVLLevel.Error, Constants.TAG, "looper is null");
        return null;
    }
}
