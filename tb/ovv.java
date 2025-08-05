package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes8.dex */
public class ovv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Context f32471a;
    private static rge b;

    static {
        kge.a(-1356780829);
        b = rgf.getLog(ovv.class, (rge) null);
    }

    public static synchronized ovv getInstance(Context context) {
        synchronized (ovv.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ovv) ipChange.ipc$dispatch("2ad64941", new Object[]{context});
            }
            b.d(">>>> getInstance");
            if (f32471a == null) {
                b.d(">>>> new UpdateInitializer().initTaoUpdate()");
                f32471a = context;
            }
            return new ovv();
        }
    }

    public void triggerDynamicDeployment(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d857cba7", new Object[]{this, str, str2});
        } else {
            triggerBundleDownload(str2);
        }
    }

    @Deprecated
    public void triggerBundleDownload(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("179aa813", new Object[]{this, str});
        } else {
            rfy.getInstance().addUpdateInfo(str);
        }
    }

    public void update(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dafc9c04", new Object[]{this, new Boolean(z)});
        } else if (z) {
        } else {
            rfy.getInstance().startUpdate(z, false);
        }
    }
}
