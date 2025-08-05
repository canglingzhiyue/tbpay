package tb;

import android.app.Application;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class ihg implements igy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ihh f29024a;
    private final nof b;

    public ihg(ihh ihhVar, nof nofVar) {
        this.f29024a = ihhVar;
        this.b = nofVar;
    }

    private static boolean a() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        boolean equalsIgnoreCase = Build.BOARD.equalsIgnoreCase("OnePlus");
        if (Build.VERSION.SDK_INT == 33) {
            z = true;
        }
        return equalsIgnoreCase & z;
    }

    @Override // tb.igy
    public void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c56f77", new Object[]{this, application});
        } else if (!a() || !this.f29024a.a("FixedOppoException", true)) {
        } else {
            application.registerActivityLifecycleCallbacks(new igs());
        }
    }
}
