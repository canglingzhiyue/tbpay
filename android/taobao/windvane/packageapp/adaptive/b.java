package android.taobao.windvane.packageapp.adaptive;

import com.android.alibaba.ip.runtime.IpChange;
import tb.aea;
import tb.kge;
import tb.rkn;

/* loaded from: classes2.dex */
public class b implements rkn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1580243906);
        kge.a(837805889);
    }

    @Override // tb.rkn
    public void firstUpdateCount(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b76ba426", new Object[]{this, new Integer(i)});
        } else if (aea.getInstance().getUpdateFinishCallback() == null) {
        } else {
            aea.getInstance().getUpdateFinishCallback().updateCount("3", i);
        }
    }
}
