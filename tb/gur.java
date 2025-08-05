package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.job.core.e;
import com.taobao.android.job.core.task.d;

/* loaded from: classes.dex */
public class gur {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(Context context, e<String, Void> eVar, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("677eb111", new Object[]{context, eVar, dVar});
        } else if (!gvu.a()) {
        } else {
            gva.a(context, eVar, dVar);
        }
    }
}
