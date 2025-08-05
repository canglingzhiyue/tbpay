package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pha.core.p;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* renamed from: tb.new  reason: invalid class name */
/* loaded from: classes7.dex */
public class Cnew {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-244583870);
    }

    public static Future<?> a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Future) ipChange.ipc$dispatch("f9227d7c", new Object[]{runnable}) : a().a(runnable);
    }

    public static <T> Future<T> a(Callable<T> callable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Future) ipChange.ipc$dispatch("3135d2bf", new Object[]{callable}) : a().a(callable);
    }

    private static nev a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nev) ipChange.ipc$dispatch("f082f5f", new Object[0]);
        }
        if (p.b() != null && p.b().c() != null) {
            return p.b().c();
        }
        return neu.a();
    }
}
