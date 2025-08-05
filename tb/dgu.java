package tb;

import android.os.HandlerThread;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* loaded from: classes4.dex */
public final class dgu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final HashMap<String, HandlerThread> f26741a;

    public static Looper a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Looper) ipChange.ipc$dispatch("d8782f3d", new Object[0]) : a("tanx_exposer_sdk").getLooper();
    }

    static {
        kge.a(-1491487885);
        f26741a = new HashMap<>();
    }

    private static HandlerThread a(String str) {
        HandlerThread handlerThread;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HandlerThread) ipChange.ipc$dispatch("578e15aa", new Object[]{str});
        }
        synchronized (f26741a) {
            handlerThread = f26741a.get(str);
            if (handlerThread != null && handlerThread.getLooper() == null) {
                f26741a.remove(str);
                handlerThread = null;
            }
            if (handlerThread == null) {
                handlerThread = new HandlerThread(str);
                handlerThread.start();
                f26741a.put(str, handlerThread);
            }
        }
        return handlerThread;
    }
}
