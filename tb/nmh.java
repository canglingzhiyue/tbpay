package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class nmh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1195500025);
    }

    public static void a(Activity activity, long j, long j2, String str, String str2, nma nmaVar, nmc nmcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21ac07e8", new Object[]{activity, new Long(j), new Long(j2), str, str2, nmaVar, nmcVar});
        }
    }
}
