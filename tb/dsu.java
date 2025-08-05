package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.ak;
import tb.dtc;

/* loaded from: classes4.dex */
public abstract class dsu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes4.dex */
    public interface a {
        boolean a(long j, ak akVar);

        boolean a(long j, fut futVar);
    }

    static {
        kge.a(919175748);
    }

    public abstract dtc.a a();

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84b3b6f5", new Object[]{this, aVar});
        }
    }
}
