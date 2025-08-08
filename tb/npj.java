package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.q;

/* loaded from: classes7.dex */
public class npj implements iud<Throwable> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f31625a;

    static {
        kge.a(-1934085284);
        kge.a(743585806);
    }

    public npj(String str) {
        this.f31625a = StringUtils.isEmpty(str) ? "empty" : str;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.iud
    public void a(Throwable th) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb9ad88d", new Object[]{this, th});
            return;
        }
        AppMonitor.Alarm.commitFail("SearchRxSubscriber", "exception", this.f31625a, th.toString());
        q.b("SearchBaseSubscriber", "search rx error: " + ("bizName=" + this.f31625a + ",throwable=" + th.toString()));
        th.printStackTrace();
    }
}
