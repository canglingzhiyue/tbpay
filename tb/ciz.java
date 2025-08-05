package tb;

import android.content.pm.PackageManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.taobao.safeclean.m;

/* loaded from: classes.dex */
public class ciz implements cix {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1021572951);
        kge.a(961378442);
    }

    @Override // tb.cix
    public String a(String str, ciu ciuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("654f2b8d", new Object[]{this, str, ciuVar});
        }
        if (str.indexOf("$UPDATE_TIME_ms") >= 0) {
            str = str.replace("$UPDATE_TIME_ms", String.valueOf(a()));
        }
        if (str.indexOf("$UPDATE_TIME_s") >= 0) {
            str = str.replace("$UPDATE_TIME_s", String.valueOf(a() / 1000));
        }
        return ciuVar.a(str);
    }

    private long a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[]{this})).longValue();
        }
        try {
            return m.f6406a.getPackageManager().getPackageInfo(m.f6406a.getPackageName(), 0).lastUpdateTime;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return 0L;
        }
    }
}
