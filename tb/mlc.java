package tb;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class mlc extends mkh<mlb> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Context f31084a;
    private final int b;

    @Override // tb.mkh
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        }
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, tb.mlb] */
    @Override // tb.mkh
    public /* synthetic */ mlb a(int i, Map map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("8d357de8", new Object[]{this, new Integer(i), map}) : c(i, map);
    }

    public mlc(Context context, int i) {
        this.f31084a = context;
        this.b = i;
    }

    public mlb c(int i, Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mlb) ipChange.ipc$dispatch("d984c537", new Object[]{this, new Integer(i), map});
        }
        ActivityManager activityManager = (ActivityManager) this.f31084a.getSystemService("activity");
        if (activityManager == null || this.b == 0) {
            return mlb.f31083a;
        }
        try {
            Iterator<ApplicationExitInfo> it = activityManager.getHistoricalProcessExitReasons(this.f31084a.getPackageName(), this.b, 1).iterator();
            if (it.hasNext()) {
                return new mlb(it.next());
            }
            return mlb.f31083a;
        } catch (RuntimeException unused) {
            return mlb.f31083a;
        }
    }
}
