package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.e;
import io.reactivex.ac;

/* loaded from: classes6.dex */
public final class jro extends ac {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final e f29739a;
    private static final jro b;

    static {
        kge.a(-1957572808);
        b = new jro();
        f29739a = new jrp("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())));
    }

    public static jro a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jro) ipChange.ipc$dispatch("f068dd7", new Object[0]) : b;
    }

    private jro() {
    }

    public ac.b createWorker() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ac.b) ipChange.ipc$dispatch("113cb2d9", new Object[]{this}) : new jrn(f29739a);
    }
}
