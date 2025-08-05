package tb;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class fgq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile fgq f27931a;
    private HandlerThread b;
    private Handler c;
    private Handler d;

    static {
        kge.a(-146450312);
    }

    private fgq() {
        emu.a("com.taobao.android.detail.wrapper.utils.DetailThreadMgr");
    }

    public static fgq a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fgq) ipChange.ipc$dispatch("f04934e", new Object[0]);
        }
        if (f27931a == null) {
            synchronized (fgq.class) {
                if (f27931a == null) {
                    f27931a = new fgq();
                }
            }
        }
        return f27931a;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.b != null) {
        } else {
            try {
                this.b = jbg.a("DetailReqThread");
                this.b.start();
                this.c = new Handler(this.b.getLooper());
                this.d = new Handler(Looper.getMainLooper());
            } catch (Throwable unused) {
                this.b = null;
            }
        }
    }

    public Handler c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("a819f71c", new Object[]{this}) : this.c;
    }
}
