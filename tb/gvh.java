package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.job.core.task.d;
import com.taobao.android.launcher.common.h;
import java.util.Map;
import tb.gvb;
import tb.gvf;

/* loaded from: classes.dex */
public class gvh {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "Startups";

    public static void a(String str, d dVar, Map<String, d> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6b92809", new Object[]{str, dVar, map});
        } else {
            gvf.a.f28508a.a(str, dVar, map);
        }
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else {
            gvf gvfVar = gvf.a.f28508a;
        }
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : h.a(".report_startup_data");
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else {
            gvf.a.f28508a.a(context);
        }
    }

    public static void b(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{context});
            return;
        }
        gsl.b(TAG, "[Startup][commit] submit", new Object[0]);
        gvb.b.f28506a.submit(new Runnable() { // from class: tb.gvh.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                gvf.a.f28508a.b(context);
                gvf.a.f28508a.b();
            }
        });
    }
}
