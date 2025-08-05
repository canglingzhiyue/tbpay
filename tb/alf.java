package tb;

import android.app.Application;
import android.os.Handler;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class alf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "DeviceEvaluator";

    /* renamed from: a  reason: collision with root package name */
    public static Application f25418a = null;
    public static Handler b = null;
    public static boolean c = true;

    public static long a(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a8219750", new Object[]{new Long(j)})).longValue() : j * 60 * 60 * 1000;
    }
}
