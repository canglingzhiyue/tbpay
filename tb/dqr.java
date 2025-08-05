package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.action.a;
import com.taobao.android.behavir.action.b;
import com.taobao.android.behavir.config.BHRTaskConfigBase;
import com.taobao.android.behavir.event.BHREvent;

/* loaded from: classes4.dex */
public class dqr extends dqz {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TYPE = "action";

    static {
        kge.a(-46234714);
    }

    public dqr(BHRTaskConfigBase bHRTaskConfigBase, BHREvent bHREvent) {
        super(bHRTaskConfigBase, bHREvent);
    }

    @Override // tb.dqz
    public void a() {
        a a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.d == null || (a2 = b.a(this.d.getString("taskActionName"))) == null) {
        } else {
            a2.a(g(), this.d);
        }
    }
}
