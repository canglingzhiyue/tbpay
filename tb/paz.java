package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.FlowCenter;

/* loaded from: classes8.dex */
public class paz implements chb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1963609793);
        kge.a(-611350053);
    }

    @Override // tb.chb
    public void a(Context context, String str, String str2, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5c834f4", new Object[]{this, context, str, str2, new Long(j), new Long(j2)});
        } else {
            FlowCenter.getInstance().commitFlow(context, str, str2, j, j2);
        }
    }
}
