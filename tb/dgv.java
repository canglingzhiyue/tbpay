package tb;

import android.os.Handler;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes4.dex */
public class dgv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1491487739);
    }

    public static void a(final Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e91c09e", new Object[]{runnable, new Long(j)});
        } else {
            new Handler(dgu.a()).postDelayed(new Runnable() { // from class: tb.dgv.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        runnable.run();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }, j);
        }
    }
}
