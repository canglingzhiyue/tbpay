package tb;

import android.os.Process;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.downloader.a;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes7.dex */
public class knd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicInteger f30179a = new AtomicInteger();

    public static void a(final Runnable runnable, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e91fcae", new Object[]{runnable, new Boolean(z)});
        } else if (a.f != null) {
            a.f.a(runnable, z);
        } else {
            Runnable runnable2 = new Runnable() { // from class: tb.knd.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Process.setThreadPriority(10);
                    runnable.run();
                }
            };
            new Thread(runnable2, "download thread " + f30179a.getAndIncrement()).start();
        }
    }

    public static void a(final Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e91c09e", new Object[]{runnable, new Long(j)});
        } else if (a.f != null) {
            a.f.a(runnable, j);
        } else {
            new Timer("download-sdk").schedule(new TimerTask() { // from class: tb.knd.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        runnable.run();
                    }
                }
            }, j);
        }
    }
}
